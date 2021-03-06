/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:10:27 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.scheduler;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NumberReadCollector_ESTest extends NumberReadCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector.getDescription()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      NumberReadCollector numberReadCollector0 = new NumberReadCollector("");
      String string0 = numberReadCollector0.getDescription();
      assertEquals("monitoring.scheduler.number.read", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector.getValue(Ljava/lang/Object;)J: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      NumberReadCollector numberReadCollector0 = new NumberReadCollector("");
      // Undeclared exception!
      try { 
        numberReadCollector0.getValue("monitoring.scheduler.number.read");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.objectweb.cjdbc.controller.scheduler.AbstractScheduler
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector", e);
      }
  }
}
