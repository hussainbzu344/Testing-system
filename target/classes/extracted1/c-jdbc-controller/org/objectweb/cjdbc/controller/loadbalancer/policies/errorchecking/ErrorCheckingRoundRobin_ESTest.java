/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 21:26:25 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.Panel;
import java.awt.TextArea;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.schema.DatabaseProcedure;
import org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ErrorCheckingRoundRobin_ESTest extends ErrorCheckingRoundRobin_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getInformation()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.<init>(I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(3);
      String string0 = errorCheckingRoundRobin0.getInformation();
      assertEquals("Error checking using 3 nodes choosen using a round-robin algorithm", string0);
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I9 Branch 1 IFNE L61 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I19 Branch 2 IF_ICMPNE L63 - true
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I46 Branch 3 IF_ICMPGE L68 - true
   * Goal 5. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I82 Branch 6 IF_ICMPNE L77 - true
   * Goal 6. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I92 Branch 7 IF_ICMPLE L79 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(3);
      ArrayList<Panel> arrayList0 = new ArrayList<Panel>();
      try { 
        errorCheckingRoundRobin0.getBackends(arrayList0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Asking for more backends (3) than available (0)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I9 Branch 1 IFNE L61 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(76);
      ArrayList<TextArea> arrayList0 = new ArrayList<TextArea>();
      errorCheckingRoundRobin0.nbOfNodes = 0;
      ArrayList arrayList1 = errorCheckingRoundRobin0.getBackends(arrayList0);
      assertNull(arrayList1);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I9 Branch 1 IFNE L61 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I19 Branch 2 IF_ICMPNE L63 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(3);
      ArrayList<Panel> arrayList0 = new ArrayList<Panel>();
      Panel panel0 = new Panel();
      arrayList0.add(panel0);
      arrayList0.add(panel0);
      arrayList0.add(panel0);
      ArrayList arrayList1 = errorCheckingRoundRobin0.getBackends(arrayList0);
      assertEquals(3, arrayList1.size());
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I9 Branch 1 IFNE L61 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I19 Branch 2 IF_ICMPNE L63 - true
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin.getBackends(Ljava/util/ArrayList;)Ljava/util/ArrayList;: I46 Branch 3 IF_ICMPGE L68 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(1336);
      DatabaseProcedure databaseProcedure0 = new DatabaseProcedure("Asking for more backends (", "Asking for more backends (", 1302);
      DatabaseProcedureParameter databaseProcedureParameter0 = new DatabaseProcedureParameter("\"f0n`]JYX?#}xgtZ=h", 1336, 1336, " nodes choosen using a round-robin algorithm", 0.0F, 1336, 1302, 1336, 2538, "Asking for more backends (");
      databaseProcedure0.addParameter(databaseProcedureParameter0);
      ArrayList arrayList0 = databaseProcedure0.getParameters();
      // Undeclared exception!
      try { 
        errorCheckingRoundRobin0.getBackends(arrayList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter cannot be cast to org.objectweb.cjdbc.controller.backend.DatabaseBackend
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin", e);
      }
  }
}