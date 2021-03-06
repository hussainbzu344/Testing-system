/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 06:41:33 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.dbadmin;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.io.ByteArrayInputStream;
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
import org.objectweb.cjdbc.console.text.commands.dbadmin.Restore;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Restore_ESTest extends Restore_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          byte[] byteArray0 = new byte[1];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Restore restore0 = new Restore(virtualDatabaseAdmin0);
          String string0 = restore0.getCommandParameters();
          assertEquals("restore backend", restore0.getCommandName());
          assertEquals("admin.command.restore.params", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PipedInputStream pipedInputStream0 = new PipedInputStream(2992);
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) pipedInputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          Restore restore0 = new Restore(virtualDatabaseAdmin0);
          String string0 = restore0.getCommandDescription();
          assertEquals("restore backend", restore0.getCommandName());
          assertEquals("admin.command.restore.description", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I34 Branch 1 IFEQ L69 - true
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I65 Branch 3 IFNONNULL L80 - true
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I80 Branch 4 IFNONNULL L85 - true
   * Goal 6. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I131 Branch 5 IFNONNULL L96 - true
   * Goal 7. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I142 Branch 6 IFNONNULL L101 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          byte[] byteArray0 = new byte[1];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Restore restore0 = new Restore(virtualDatabaseAdmin0);
          restore0.parse("CneEYonprzpareal(rin,iiu) <nGporN");
          assertEquals("restore backend", restore0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 3
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I34 Branch 1 IFEQ L69 - false
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I45 Branch 2 IFEQ L72 - true
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I45 Branch 2 IFEQ L72 - false
   * Goal 6. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I131 Branch 5 IFNONNULL L96 - true
   * Goal 7. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I142 Branch 6 IFNONNULL L101 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Restore restore0 = new Restore(virtualDatabaseAdmin0);
          restore0.parse("Problem with streaming of data");
          assertEquals("restore backend", restore0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I131 Branch 5 IFNONNULL L96 - false
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.Restore.parse(Ljava/lang/String;)V: I142 Branch 6 IFNONNULL L101 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedInputStream pipedInputStream0 = new PipedInputStream(2992);
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) pipedInputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          Restore restore0 = new Restore(virtualDatabaseAdmin0);
          restore0.parse("");
          assertEquals("restore backend", restore0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
