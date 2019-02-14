/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:13:27 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WeightedBalancer_ESTest extends WeightedBalancer_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getRaidbXml(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getWeightedXml(Ljava/util/HashMap;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L48 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getWeightedXml(Ljava/util/HashMap;)Ljava/lang/String;: I23 Branch 2 IFEQ L52 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      String string0 = WeightedBalancer.getRaidbXml(hashMap0, "");
      assertEquals("<></>", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getWeightedXml(Ljava/util/HashMap;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L48 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      String string0 = WeightedBalancer.getWeightedXml((HashMap) null);
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getRaidbXml(Ljava/util/HashMap;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getWeightedXml(Ljava/util/HashMap;)Ljava/lang/String;: I3 Branch 1 IFNONNULL L48 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer.getWeightedXml(Ljava/util/HashMap;)Ljava/lang/String;: I23 Branch 2 IFEQ L52 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Object object0 = new Object();
      hashMap0.put(hashMap0, object0);
      // Undeclared exception!
      try { 
        WeightedBalancer.getRaidbXml(hashMap0, "");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.HashMap cannot be cast to java.lang.String
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.WeightedBalancer", e);
      }
  }
}