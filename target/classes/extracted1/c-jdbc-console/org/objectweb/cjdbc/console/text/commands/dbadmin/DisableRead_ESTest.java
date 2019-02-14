/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 07:29:55 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.dbadmin;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DisableRead_ESTest extends DisableRead_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.parse(Ljava/lang/String;)V: I5 Branch 1 IFNE L55 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
          PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0, 268);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = new VirtualDatabaseAdmin(console0);
          DisableRead disableRead0 = new DisableRead(virtualDatabaseAdmin0);
          try { 
            disableRead0.parse("disable read");
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead", e);
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
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.getCommandParameters()Ljava/lang/String;: root-Branch
   * Goal 5. org.objectweb.cjdbc.console.text.commands.dbadmin.DisableRead.parse(Ljava/lang/String;)V: I5 Branch 1 IFNE L55 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          byte[] byteArray0 = new byte[1];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 0, (int) (byte) (-25));
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, true, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          DisableRead disableRead0 = new DisableRead(virtualDatabaseAdmin0);
          disableRead0.parse("");
          assertEquals("disable read", disableRead0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}