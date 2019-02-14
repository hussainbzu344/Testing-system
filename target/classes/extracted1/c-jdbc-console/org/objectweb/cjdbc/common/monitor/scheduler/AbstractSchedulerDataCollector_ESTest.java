/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:10:10 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.scheduler;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.scheduler.NumberRequestsCollector;
import org.objectweb.cjdbc.common.monitor.scheduler.PendingTransactionsCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractSchedulerDataCollector_ESTest extends AbstractSchedulerDataCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.scheduler.AbstractSchedulerDataCollector.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.scheduler.AbstractSchedulerDataCollector.collectValue()J: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      NumberRequestsCollector numberRequestsCollector0 = new NumberRequestsCollector("Series ");
      // Undeclared exception!
      try { 
        numberRequestsCollector0.collectValue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.scheduler.AbstractSchedulerDataCollector", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.scheduler.AbstractSchedulerDataCollector.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.scheduler.AbstractSchedulerDataCollector.getTargetName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      PendingTransactionsCollector pendingTransactionsCollector0 = new PendingTransactionsCollector("\"(0yL(@P$qPtC9Rr`");
      String string0 = pendingTransactionsCollector0.getTargetName();
      assertEquals("\"(0yL(@P$qPtC9Rr`", string0);
  }
}
