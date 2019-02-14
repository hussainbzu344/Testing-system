/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:48:14 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.controller.GetInfo;
import org.objectweb.cjdbc.console.text.module.AbstractConsoleModule;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GetInfo_ESTest extends GetInfo_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.GetInfo.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.GetInfo.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          GetInfo getInfo0 = new GetInfo((AbstractConsoleModule) monitorConsole0);
          String string0 = getInfo0.getCommandName();
          assertEquals("getInfo", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.GetInfo.parse(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.GetInfo.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          GetInfo getInfo0 = new GetInfo((AbstractConsoleModule) virtualDatabaseAdmin0);
          try { 
            getInfo0.parse("?yH0,");
            fail("Expecting exception: Exception");
          
          } catch(Exception e) {
             //
             // controller.command.getInfo.failed
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.GetInfo", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.GetInfo.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.GetInfo.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          FileDescriptor fileDescriptor0 = new FileDescriptor();
          MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) mockFileInputStream0, false, true);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          GetInfo getInfo0 = new GetInfo((AbstractConsoleModule) monitorConsole0);
          String string0 = getInfo0.getCommandDescription();
          assertEquals("controller.command.getInfo", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}