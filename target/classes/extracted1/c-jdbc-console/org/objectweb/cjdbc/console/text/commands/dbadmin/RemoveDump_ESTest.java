/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 06:10:17 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.dbadmin;

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
import org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RemoveDump_ESTest extends RemoveDump_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.parse(Ljava/lang/String;)V: I10 Branch 1 IFLE L57 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          FileDescriptor fileDescriptor0 = new FileDescriptor();
          MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) mockFileInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          RemoveDump removeDump0 = new RemoveDump(virtualDatabaseAdmin0);
          removeDump0.parse("");
          assertEquals("delete dump", removeDump0.getCommandName());
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
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump.parse(Ljava/lang/String;)V: I10 Branch 1 IFLE L57 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          RemoveDump removeDump0 = new RemoveDump(virtualDatabaseAdmin0);
          try { 
            removeDump0.parse("removeNotiicationListener");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
