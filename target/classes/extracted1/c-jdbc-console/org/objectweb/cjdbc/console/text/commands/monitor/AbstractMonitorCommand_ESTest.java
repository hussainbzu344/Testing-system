/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 06:03:45 GMT 2016
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
import org.objectweb.cjdbc.console.text.commands.monitor.ShowController;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractMonitorCommand_ESTest extends AbstractMonitorCommand_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.monitor.AbstractMonitorCommand.<init>(Lorg/objectweb/cjdbc/console/text/module/MonitorConsole;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.monitor.AbstractMonitorCommand.setCurrentTarget(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, false);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          ShowController showController0 = new ShowController(monitorConsole0);
          showController0.setCurrentTarget((String) null);
          assertEquals("showController", showController0.getCommandName());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}