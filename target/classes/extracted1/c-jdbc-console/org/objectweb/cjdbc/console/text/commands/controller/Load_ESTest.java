/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:46:04 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.io.PushbackInputStream;
import java.io.SequenceInputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.controller.Load;
import org.objectweb.cjdbc.console.text.module.AbstractConsoleModule;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Load_ESTest extends Load_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Load.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I7 Branch 1 IFNULL L60 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          FileDescriptor fileDescriptor0 = new FileDescriptor();
          MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) mockFileInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          Load load0 = new Load((AbstractConsoleModule) virtualDatabaseAdmin0);
          try { 
            load0.parse((String) null);
            fail("Expecting exception: Exception");
          
          } catch(Exception e) {
             //
             // console.read.command.failed
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.Console", e);
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
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Load.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, true, true);
          VirtualDatabaseConsole virtualDatabaseConsole0 = new VirtualDatabaseConsole(console0);
          Load load0 = new Load((AbstractConsoleModule) virtualDatabaseConsole0);
          String string0 = load0.getCommandParameters();
          assertEquals("controller.command.load.vdb.params", string0);
          assertEquals("load virtualdatabase config", load0.getCommandName());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Load.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, true, true);
          VirtualDatabaseConsole virtualDatabaseConsole0 = new VirtualDatabaseConsole(console0);
          Load load0 = new Load((AbstractConsoleModule) virtualDatabaseConsole0);
          String string0 = load0.getCommandDescription();
          assertEquals("load virtualdatabase config", load0.getCommandName());
          assertEquals("controller.command.load.vdb.description", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Load.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I7 Branch 1 IFNULL L60 - false
   * Goal 4. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I12 Branch 2 IFLE L60 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          Load load0 = new Load((AbstractConsoleModule) monitorConsole0);
          try { 
            load0.parse("");
            fail("Expecting exception: Exception");
          
          } catch(Exception e) {
             //
             // console.read.command.failed
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.Console", e);
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
   * 9 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.Load.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.Load.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I7 Branch 1 IFNULL L60 - false
   * Goal 4. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I12 Branch 2 IFLE L60 - true
   * Goal 5. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I30 Branch 3 IFNONNULL L65 - true
   * Goal 6. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I80 Branch 4 IFNULL L78 - true
   * Goal 7. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I80 Branch 4 IFNULL L78 - false
   * Goal 8. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I90 Branch 5 IFNONNULL L81 - true
   * Goal 9. org.objectweb.cjdbc.console.text.commands.controller.Load.parse(Ljava/lang/String;)V: I90 Branch 5 IFNONNULL L81 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
          PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
          SequenceInputStream sequenceInputStream0 = new SequenceInputStream((InputStream) pipedInputStream0, (InputStream) pipedInputStream0);
          EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/li/Projects/phd/corpus-x/data/qualitas_corpus_20130901/c_jdbc-2.0.2/.xcorpus/43");
          FileSystemHandling.appendStringToFile(evoSuiteFile0, "A7Yp");
          Console console0 = new Console((RmiJmxClient) null, (InputStream) sequenceInputStream0, true, false);
          MonitorConsole monitorConsole0 = console0.getMonitorModule();
          Load load0 = new Load((AbstractConsoleModule) monitorConsole0);
          try { 
            load0.parse("43");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.Load", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
