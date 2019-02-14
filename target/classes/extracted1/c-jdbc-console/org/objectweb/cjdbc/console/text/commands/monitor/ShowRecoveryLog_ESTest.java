/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 06:03:04 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.monitor;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ShowRecoveryLog_ESTest extends ShowRecoveryLog_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog.getCommandName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, false);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          ShowRecoveryLog showRecoveryLog0 = new ShowRecoveryLog(monitorConsole0);
          String string0 = showRecoveryLog0.getUsage();
          assertEquals("command.usage\n   monitor.command.recovery", string0);
          assertEquals("showRecovery", showRecoveryLog0.getCommandName());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog.parse(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, false);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          ShowRecoveryLog showRecoveryLog0 = new ShowRecoveryLog(monitorConsole0);
          try { 
            showRecoveryLog0.parse("CWK}N\"X");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
