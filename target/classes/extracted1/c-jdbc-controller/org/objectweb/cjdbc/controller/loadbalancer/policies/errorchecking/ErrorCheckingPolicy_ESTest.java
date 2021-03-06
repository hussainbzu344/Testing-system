/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 21:26:32 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingAll;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ErrorCheckingPolicy_ESTest extends ErrorCheckingPolicy_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getPolicy()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setPolicy(I)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.<init>(II)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setNumberOfNodes(I)V: I4 Branch 1 IF_ICMPGE L84 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ErrorCheckingAll errorCheckingAll0 = new ErrorCheckingAll();
      int int0 = errorCheckingAll0.getPolicy();
      assertEquals(2, int0);
      assertEquals(3, errorCheckingAll0.getNumberOfNodes());
  }

  //Test case number: 1
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setPolicy(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.<init>(II)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getNumberOfNodes()I: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setNumberOfNodes(I)V: I4 Branch 1 IF_ICMPGE L84 - true
   * Goal 5. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 2 TABLESWITCH L143 Case 0 - false
   * Goal 6. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 3 TABLESWITCH L143 Case 1 - false
   * Goal 7. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 4 TABLESWITCH L143 Case 2 - true
   * Goal 8. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 5 TABLESWITCH L143 Default-Case - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ErrorCheckingAll errorCheckingAll0 = new ErrorCheckingAll();
      String string0 = errorCheckingAll0.getXml();
      assertEquals("<ErrorChecking />numberOfNodes=\"3\" policy=\"all\"/>", string0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setPolicy(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.<init>(II)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setNumberOfNodes(I)V: I4 Branch 1 IF_ICMPGE L84 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ErrorCheckingRandom errorCheckingRandom0 = null;
      try {
        errorCheckingRandom0 = new ErrorCheckingRandom(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // You must use at least 3 nodes for error checking (0 is not acceptable)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy", e);
      }
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setPolicy(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.<init>(II)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getNumberOfNodes()I: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setNumberOfNodes(I)V: I4 Branch 1 IF_ICMPGE L84 - true
   * Goal 5. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 2 TABLESWITCH L143 Case 0 - true
   * Goal 6. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 3 TABLESWITCH L143 Case 1 - false
   * Goal 7. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 4 TABLESWITCH L143 Case 2 - false
   * Goal 8. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 5 TABLESWITCH L143 Default-Case - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ErrorCheckingAll errorCheckingAll0 = new ErrorCheckingAll();
      assertEquals(2, errorCheckingAll0.getPolicy());
      
      errorCheckingAll0.setPolicy(0);
      String string0 = errorCheckingAll0.getXml();
      assertEquals("<ErrorChecking />numberOfNodes=\"3\" policy=\"random\"/>", string0);
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setPolicy(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.<init>(II)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getNumberOfNodes()I: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setNumberOfNodes(I)V: I4 Branch 1 IF_ICMPGE L84 - true
   * Goal 5. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 2 TABLESWITCH L143 Case 0 - false
   * Goal 6. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 3 TABLESWITCH L143 Case 1 - true
   * Goal 7. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 4 TABLESWITCH L143 Case 2 - false
   * Goal 8. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 5 TABLESWITCH L143 Default-Case - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(60);
      String string0 = errorCheckingRoundRobin0.getXml();
      assertEquals("<ErrorChecking />numberOfNodes=\"60\" policy=\"roundRobin\"/>", string0);
  }

  //Test case number: 5
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setPolicy(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.<init>(II)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getNumberOfNodes()I: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.setNumberOfNodes(I)V: I4 Branch 1 IF_ICMPGE L84 - true
   * Goal 5. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 2 TABLESWITCH L143 Case 0 - false
   * Goal 6. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 3 TABLESWITCH L143 Case 1 - false
   * Goal 7. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 4 TABLESWITCH L143 Case 2 - false
   * Goal 8. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy.getXml()Ljava/lang/String;: I30 Branch 5 TABLESWITCH L143 Default-Case - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ErrorCheckingAll errorCheckingAll0 = new ErrorCheckingAll();
      assertEquals(2, errorCheckingAll0.getPolicy());
      
      errorCheckingAll0.policy = 0;
      errorCheckingAll0.policy = (-1082);
      String string0 = errorCheckingAll0.getXml();
      assertEquals("<ErrorChecking />numberOfNodes=\"3\" policy=\"\"/>", string0);
  }
}
