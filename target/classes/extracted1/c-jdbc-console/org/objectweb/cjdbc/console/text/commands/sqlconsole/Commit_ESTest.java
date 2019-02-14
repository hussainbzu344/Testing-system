/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:10:57 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.sqlconsole;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.io.ByteArrayInputStream;
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
import org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Commit_ESTest extends Commit_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit.getCommandDescription()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseConsole;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          byte[] byteArray0 = new byte[4];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)51, (int) (byte)47);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, true, true);
          VirtualDatabaseConsole virtualDatabaseConsole0 = new VirtualDatabaseConsole(console0);
          Commit commit0 = new Commit(virtualDatabaseConsole0);
          String string0 = commit0.getUsage();
          assertEquals("commit", commit0.getCommandName());
          assertEquals("command.usage\n   sql.command.commit", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseConsole;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit.parse(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          byte[] byteArray0 = new byte[4];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (int) (byte)51, (int) (byte)47);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, true, true);
          VirtualDatabaseConsole virtualDatabaseConsole0 = new VirtualDatabaseConsole(console0);
          Commit commit0 = new Commit(virtualDatabaseConsole0);
          commit0.parse("");
          assertEquals("commit", commit0.getCommandName());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
