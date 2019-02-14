/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 21:20:58 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.schema.DatabaseTable;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ErrorCheckingRandom_ESTest extends ErrorCheckingRandom_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.getInformation()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.<init>(I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ErrorCheckingRandom errorCheckingRandom0 = new ErrorCheckingRandom(100);
      String string0 = errorCheckingRandom0.getInformation();
      assertEquals("Error checking using 100 nodes choosen randomly", string0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I10 Branch 1 IF_ICMPNE L60 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I20 Branch 2 IF_ICMPLE L62 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ErrorCheckingRandom errorCheckingRandom0 = new ErrorCheckingRandom(100);
      DatabaseTable databaseTable0 = new DatabaseTable(" Fodes choosen randomly");
      ArrayList arrayList0 = databaseTable0.getUniqueColumns();
      try { 
        errorCheckingRandom0.getBackends(arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Asking for more backends (100) than available (0)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I10 Branch 1 IF_ICMPNE L60 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ErrorCheckingRandom errorCheckingRandom0 = new ErrorCheckingRandom(100);
      errorCheckingRandom0.nbOfNodes = 0;
      DatabaseTable databaseTable0 = new DatabaseTable(" Fodes choosen randomly");
      ArrayList arrayList0 = databaseTable0.getUniqueColumns();
      ArrayList arrayList1 = errorCheckingRandom0.getBackends(arrayList0);
      assertTrue(arrayList1.isEmpty());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I10 Branch 1 IF_ICMPNE L60 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I20 Branch 2 IF_ICMPLE L62 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ErrorCheckingRandom errorCheckingRandom0 = new ErrorCheckingRandom(100);
      errorCheckingRandom0.nbOfNodes = (-18);
      DatabaseTable databaseTable0 = new DatabaseTable(" Fodes choosen randomly");
      ArrayList arrayList0 = databaseTable0.getUniqueColumns();
      // Undeclared exception!
      try { 
        errorCheckingRandom0.getBackends(arrayList0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal Capacity: -18
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }
}