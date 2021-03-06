/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:35:23 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.controller;

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
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.controller.DropDB;
import org.objectweb.cjdbc.console.text.module.AbstractConsoleModule;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DropDB_ESTest extends DropDB_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.DropDB.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.DropDB.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.DropDB.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.text.commands.controller.DropDB.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          VirtualDatabaseConsole virtualDatabaseConsole0 = new VirtualDatabaseConsole(console0);
          DropDB dropDB0 = new DropDB((AbstractConsoleModule) virtualDatabaseConsole0);
          String string0 = dropDB0.getUsage();
          assertEquals("drop virtualdatabase", dropDB0.getCommandName());
          assertEquals("command.usage\n   controller.command.drop.database.description", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.DropDB.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.DropDB.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.DropDB.parse(Ljava/lang/String;)V: I8 Branch 1 IFNULL L57 - false
   * Goal 4. org.objectweb.cjdbc.console.text.commands.controller.DropDB.parse(Ljava/lang/String;)V: I12 Branch 2 IFLE L57 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, true);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          DropDB dropDB0 = new DropDB((AbstractConsoleModule) monitorConsole0);
          try { 
            dropDB0.parse("");
            fail("Expecting exception: Exception");
          
          } catch(Exception e) {
             //
             // controller.command.drop.database.null
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.DropDB", e);
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
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.DropDB.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.DropDB.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.DropDB.parse(Ljava/lang/String;)V: I8 Branch 1 IFNULL L57 - false
   * Goal 4. org.objectweb.cjdbc.console.text.commands.controller.DropDB.parse(Ljava/lang/String;)V: I12 Branch 2 IFLE L57 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          DropDB dropDB0 = new DropDB((AbstractConsoleModule) monitorConsole0);
          try { 
            dropDB0.parse("]30");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.DropDB", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
