/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:53:48 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.controller.TotalMemoryCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class TotalMemoryCollector_ESTest extends TotalMemoryCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.monitor.controller.TotalMemoryCollector.<init>(Ljava/lang/Object;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      TotalMemoryCollector totalMemoryCollector0 = null;
      try {
        totalMemoryCollector0 = new TotalMemoryCollector(object0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to org.objectweb.cjdbc.controller.core.Controller
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.controller.AbstractControllerDataCollector", e);
      }
  }
}
