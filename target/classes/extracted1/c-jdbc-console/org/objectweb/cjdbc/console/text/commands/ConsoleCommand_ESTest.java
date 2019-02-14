/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:04:30 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.InputStream;
import java.io.PipedInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.Help;
import org.objectweb.cjdbc.console.text.commands.Quit;
import org.objectweb.cjdbc.console.text.module.AbstractConsoleModule;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConsoleCommand_ESTest extends ConsoleCommand_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.getUsage()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.compareTo(Ljava/lang/Object;)I: I4 Branch 1 IFEQ L63 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Help help0 = new Help((AbstractConsoleModule) virtualDatabaseAdmin0);
          String string0 = help0.getUsage();
          assertEquals("command.usage\n   console.command.help", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.compareTo(Ljava/lang/Object;)I: I4 Branch 1 IFEQ L63 - true
   * Goal 3. org.objectweb.cjdbc.console.text.commands.ConsoleCommand.compareTo(Ljava/lang/Object;)I: I4 Branch 1 IFEQ L63 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, true, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Quit quit0 = new Quit((AbstractConsoleModule) virtualDatabaseAdmin0);
          MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
          // Undeclared exception!
          try { 
            quit0.compareTo(mockHijrahDate0);
            fail("Expecting exception: IllegalArgumentException");
          
          } catch(IllegalArgumentException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.ConsoleCommand", e);
          }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
