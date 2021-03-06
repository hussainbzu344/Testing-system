/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:48:24 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.virtualdatabase;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PendingDatabaseConnectionCollector_ESTest extends PendingDatabaseConnectionCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector.getDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      PendingDatabaseConnectionCollector pendingDatabaseConnectionCollector0 = new PendingDatabaseConnectionCollector("5g&");
      String string0 = pendingDatabaseConnectionCollector0.getDescription();
      assertEquals("monitoring.virtualdatabase.pending.connections", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector.getValue(Ljava/lang/Object;)J: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      PendingDatabaseConnectionCollector pendingDatabaseConnectionCollector0 = new PendingDatabaseConnectionCollector("5g&");
      // Undeclared exception!
      try { 
        pendingDatabaseConnectionCollector0.getValue(pendingDatabaseConnectionCollector0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector cannot be cast to org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector", e);
      }
  }
}
