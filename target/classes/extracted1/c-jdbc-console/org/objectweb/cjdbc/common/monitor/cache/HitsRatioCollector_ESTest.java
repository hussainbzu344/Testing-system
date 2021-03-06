/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:29:00 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.cache;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class HitsRatioCollector_ESTest extends HitsRatioCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector.getValue(Ljava/lang/Object;)J: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      HitsRatioCollector hitsRatioCollector0 = new HitsRatioCollector("");
      // Undeclared exception!
      try { 
        hitsRatioCollector0.getValue("monitoring.cache.hits.ratio");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.objectweb.cjdbc.controller.cache.result.AbstractResultCache
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector.getDescription()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      HitsRatioCollector hitsRatioCollector0 = new HitsRatioCollector("");
      String string0 = hitsRatioCollector0.getDescription();
      assertEquals("monitoring.cache.hits.ratio", string0);
  }
}
