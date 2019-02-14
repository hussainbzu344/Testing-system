/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:57:23 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.monitor;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ShowCacheStats_ESTest extends ShowCacheStats_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, false);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          monitorConsole0.help();
          assertEquals("Monitoring", monitorConsole0.getDescriptionString());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats.parse(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
          PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          ShowCacheStats showCacheStats0 = new ShowCacheStats(monitorConsole0);
          try { 
            showCacheStats0.parse(";T<tsbx9TF^h`,$u'");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
