/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 06:46:49 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.dbadmin;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
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
import org.objectweb.cjdbc.console.text.commands.dbadmin.ViewCheckpointNames;
import org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ViewCheckpointNames_ESTest extends ViewCheckpointNames_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.ViewCheckpointNames.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.ViewCheckpointNames.getCommandName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, true);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          ViewCheckpointNames viewCheckpointNames0 = new ViewCheckpointNames(virtualDatabaseAdmin0);
          String string0 = viewCheckpointNames0.getCommandName();
          assertEquals("show checkpoints", string0);
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.dbadmin.ViewCheckpointNames.<init>(Lorg/objectweb/cjdbc/console/text/module/VirtualDatabaseAdmin;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.dbadmin.ViewCheckpointNames.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
          PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pipedInputStream0, false, false);
          VirtualDatabaseAdmin virtualDatabaseAdmin0 = console0.getAdminModule();
          ViewCheckpointNames viewCheckpointNames0 = new ViewCheckpointNames(virtualDatabaseAdmin0);
          String string0 = viewCheckpointNames0.getCommandDescription();
          assertEquals("admin.command.view.checkpoints.description", string0);
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
