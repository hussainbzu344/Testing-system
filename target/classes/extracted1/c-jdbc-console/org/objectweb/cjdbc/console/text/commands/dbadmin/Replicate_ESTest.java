/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 07:30:39 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.dbadmin;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.DataInputStream;
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
import org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Replicate_ESTest extends Replicate_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I13 Branch 1 IF_ICMPGE L58 - true
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I56 Branch 2 IFEQ L71 - true
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I56 Branch 2 IFEQ L71 - false
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I71 Branch 3 IF_ICMPNE L74 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) dataInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Replicate replicate0 = new Replicate(virtualDatabaseAdmin0);
          try { 
            replicate0.parse("\" sas already parse=.");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate", e);
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
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I13 Branch 1 IF_ICMPGE L58 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedInputStream pipedInputStream0 = new PipedInputStream();
          DataInputStream dataInputStream0 = new DataInputStream((InputStream) pipedInputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) dataInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          Replicate replicate0 = new Replicate(virtualDatabaseAdmin0);
          replicate0.parse(" sU/\"");
          assertEquals("clone backend config", replicate0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I13 Branch 1 IF_ICMPGE L58 - true
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I56 Branch 2 IFEQ L71 - true
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I56 Branch 2 IFEQ L71 - false
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate.parse(Ljava/lang/String;)V: I71 Branch 3 IF_ICMPNE L74 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          DataInputStream dataInputStream0 = new DataInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) dataInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          Replicate replicate0 = new Replicate(virtualDatabaseAdmin0);
          try { 
            replicate0.parse("\" sas already parsed.");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.dbadmin.Replicate", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
