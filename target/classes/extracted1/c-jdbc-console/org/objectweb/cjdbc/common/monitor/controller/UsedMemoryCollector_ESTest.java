/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:04:06 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.controller.UsedMemoryCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class UsedMemoryCollector_ESTest extends UsedMemoryCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.monitor.controller.UsedMemoryCollector.<init>(Ljava/lang/Object;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      UsedMemoryCollector usedMemoryCollector0 = null;
      try {
        usedMemoryCollector0 = new UsedMemoryCollector((Object) "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.objectweb.cjdbc.controller.core.Controller
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.controller.AbstractControllerDataCollector", e);
      }
  }
}
