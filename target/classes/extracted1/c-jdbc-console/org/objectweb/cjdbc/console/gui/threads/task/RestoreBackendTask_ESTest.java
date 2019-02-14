/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 11:59:11 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.threads.task;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.objects.BackendObject;
import org.objectweb.cjdbc.console.gui.threads.task.RestoreBackendTask;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RestoreBackendTask_ESTest extends RestoreBackendTask_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.threads.task.RestoreBackendTask.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/common/jmx/mbeans/VirtualDatabaseMBean;Lorg/objectweb/cjdbc/console/gui/objects/BackendObject;Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.threads.task.RestoreBackendTask.run()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      RestoreBackendTask restoreBackendTask0 = new RestoreBackendTask((CjdbcGui) null, (VirtualDatabaseMBean) null, (BackendObject) null, "}O0wi[DB4K");
      // Undeclared exception!
      try { 
        restoreBackendTask0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.threads.task.RestoreBackendTask", e);
      }
  }
}
