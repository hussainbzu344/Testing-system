/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:13:31 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.sqlconsole;

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
import org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseConsole;
import org.objectweb.cjdbc.driver.Savepoint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Rollback_ESTest extends Rollback_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseConsole;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.parse(Ljava/lang/String;)V: I17 Branch 1 IFLE L65 - true
   * Goal 4. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.parse(Ljava/lang/String;)V: I41 Branch 2 IFNONNULL L74 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, false);
          VirtualDatabaseConsole virtualDatabaseConsole0 = console0.getConsoleModule();
          Rollback rollback0 = new Rollback(virtualDatabaseConsole0);
          rollback0.parse("editable");
          assertEquals("rollback", rollback0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseConsole;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, true);
          VirtualDatabaseConsole virtualDatabaseConsole0 = console0.getConsoleModule();
          Rollback rollback0 = new Rollback(virtualDatabaseConsole0);
          String string0 = rollback0.getUsage();
          assertEquals("command.usage\n   sql.command.rollback.description", string0);
          assertEquals("rollback", rollback0.getCommandName());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseConsole;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.parse(Ljava/lang/String;)V: I17 Branch 1 IFLE L65 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, true);
          VirtualDatabaseConsole virtualDatabaseConsole0 = console0.getConsoleModule();
          Rollback rollback0 = new Rollback(virtualDatabaseConsole0);
          rollback0.parse("");
          assertEquals("rollback", rollback0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseConsole;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.parse(Ljava/lang/String;)V: I17 Branch 1 IFLE L65 - true
   * Goal 4. org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback.parse(Ljava/lang/String;)V: I41 Branch 2 IFNONNULL L74 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, false, false);
          VirtualDatabaseConsole virtualDatabaseConsole0 = console0.getConsoleModule();
          Savepoint savepoint0 = new Savepoint("editable");
          virtualDatabaseConsole0.addSavePoint(savepoint0);
          Rollback rollback0 = new Rollback(virtualDatabaseConsole0);
          rollback0.parse("editable");
          assertEquals("rollback", rollback0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
