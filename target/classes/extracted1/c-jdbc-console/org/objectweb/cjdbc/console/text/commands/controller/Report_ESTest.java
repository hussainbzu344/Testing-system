/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:46:20 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.SequenceInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.controller.Report;
import org.objectweb.cjdbc.console.text.module.AbstractConsoleModule;
import org.objectweb.cjdbc.console.text.module.ControllerConsole;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Report_ESTest extends Report_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Report.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Report.parse(Ljava/lang/String;)V: I3 Branch 1 IFNULL L59 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, false);
          ControllerConsole controllerConsole0 = console0.getControllerModule();
          Report report0 = new Report((AbstractConsoleModule) controllerConsole0);
          try { 
            report0.parse((String) null);
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.Report", e);
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
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Report.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Report.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          byte[] byteArray0 = new byte[8];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Report report0 = new Report((AbstractConsoleModule) virtualDatabaseAdmin0);
          String string0 = report0.getCommandDescription();
          assertEquals("controller.command.generateReport", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Report.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Report.getCommandName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          byte[] byteArray0 = new byte[7];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) sequenceInputStream0, false, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Report report0 = new Report((AbstractConsoleModule) virtualDatabaseAdmin0);
          String string0 = report0.getCommandName();
          assertEquals("generateReport", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Report.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Report.parse(Ljava/lang/String;)V: I3 Branch 1 IFNULL L59 - false
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Report.parse(Ljava/lang/String;)V: I7 Branch 2 IFLE L59 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          byte[] byteArray0 = new byte[7];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) byteArrayInputStream0, (InputStream) byteArrayInputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) sequenceInputStream0, false, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Report report0 = new Report((AbstractConsoleModule) virtualDatabaseAdmin0);
          try { 
            report0.parse("generateReport");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.Report", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Report.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Report.parse(Ljava/lang/String;)V: I3 Branch 1 IFNULL L59 - false
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Report.parse(Ljava/lang/String;)V: I7 Branch 2 IFLE L59 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, true);
          ControllerConsole controllerConsole0 = console0.getControllerModule();
          Report report0 = new Report((AbstractConsoleModule) controllerConsole0);
          try { 
            report0.parse("");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.Report", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}