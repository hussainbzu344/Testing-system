/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:09:26 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.controller.ThreadsCountCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ThreadsCountCollector_ESTest extends ThreadsCountCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.monitor.controller.ThreadsCountCollector.<init>(Ljava/lang/Object;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ThreadsCountCollector threadsCountCollector0 = null;
      try {
        threadsCountCollector0 = new ThreadsCountCollector(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.objectweb.cjdbc.controller.core.Controller
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.controller.AbstractControllerDataCollector", e);
      }
  }
}
