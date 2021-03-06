/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 06:04:11 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.monitor;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PushbackInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.monitor.ShowStats;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ShowStats_ESTest extends ShowStats_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.ShowStats.parse(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.ShowStats.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.monitor.ShowStats.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, true, true);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          ShowStats showStats0 = new ShowStats(monitorConsole0);
          try { 
            showStats0.parse("qsj");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.monitor.ShowStats", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.ShowStats.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.ShowStats.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.monitor.ShowStats.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, true, true);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          ShowStats showStats0 = new ShowStats(monitorConsole0);
          String string0 = showStats0.getCommandDescription();
          assertEquals("monitor.command.stats", string0);
          assertEquals("showStats", showStats0.getCommandName());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
