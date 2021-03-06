/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:36:24 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.backend;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.backend.WriteRequestsCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractBackendDataCollector_ESTest extends AbstractBackendDataCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.backend.AbstractBackendDataCollector.collectValue()J: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.backend.AbstractBackendDataCollector.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      WriteRequestsCollector writeRequestsCollector0 = new WriteRequestsCollector("", "j>BK9V*>[S");
      try { 
        writeRequestsCollector0.collectValue();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot reach backend
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.backend.AbstractBackendDataCollector", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.backend.AbstractBackendDataCollector.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.backend.AbstractBackendDataCollector.getTargetName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      WriteRequestsCollector writeRequestsCollector0 = new WriteRequestsCollector("", "j>BK9V*>[S");
      String string0 = writeRequestsCollector0.getTargetName();
      assertEquals("", string0);
  }
}
