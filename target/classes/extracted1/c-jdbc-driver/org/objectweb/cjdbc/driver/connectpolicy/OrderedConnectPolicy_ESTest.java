/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 03:21:42 GMT 2016
 */

package org.objectweb.cjdbc.driver.connectpolicy;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.NoMoreControllerException;
import org.objectweb.cjdbc.driver.ControllerInfo;
import org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OrderedConnectPolicy_ESTest extends OrderedConnectPolicy_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.suspectControllerOfFailure(Lorg/objectweb/cjdbc/driver/ControllerInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - true
   * Goal 3. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - false
   * Goal 4. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.removeControllerFromSuspectList(Lorg/objectweb/cjdbc/driver/ControllerInfo;)V: I19 Branch 2 IF_ICMPGE L77 - true
   * Goal 5. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.removeControllerFromSuspectList(Lorg/objectweb/cjdbc/driver/ControllerInfo;)V: I19 Branch 2 IF_ICMPGE L77 - false
   * Goal 6. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.removeControllerFromSuspectList(Lorg/objectweb/cjdbc/driver/ControllerInfo;)V: I28 Branch 3 IFNE L78 - true
   * Goal 7. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.removeControllerFromSuspectList(Lorg/objectweb/cjdbc/driver/ControllerInfo;)V: I28 Branch 3 IFNE L78 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ControllerInfo[] controllerInfoArray0 = new ControllerInfo[2];
      ControllerInfo controllerInfo0 = new ControllerInfo("#getXMLSchemaType() :", 1);
      controllerInfoArray0[0] = controllerInfo0;
      ControllerInfo controllerInfo1 = new ControllerInfo("|I.F2P@#", 1);
      OrderedConnectPolicy orderedConnectPolicy0 = new OrderedConnectPolicy(controllerInfoArray0, (long) 1, 23);
      orderedConnectPolicy0.suspectControllerOfFailure(controllerInfo0);
      orderedConnectPolicy0.removeControllerFromSuspectList(controllerInfo1);
      assertEquals(1, controllerInfo1.getPort());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - true
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - false
   * Goal 3. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.getController()Lorg/objectweb/cjdbc/driver/ControllerInfo;: I9 Branch 4 IFNE L99 - true
   * Goal 4. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.getController()Lorg/objectweb/cjdbc/driver/ControllerInfo;: I29 Branch 5 IF_ICMPNE L105 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ControllerInfo[] controllerInfoArray0 = new ControllerInfo[1];
      OrderedConnectPolicy orderedConnectPolicy0 = new OrderedConnectPolicy(controllerInfoArray0, 370L, 2);
      ControllerInfo controllerInfo0 = orderedConnectPolicy0.getController();
      assertNull(controllerInfo0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.suspectControllerOfFailure(Lorg/objectweb/cjdbc/driver/ControllerInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - true
   * Goal 3. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - false
   * Goal 4. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.getController()Lorg/objectweb/cjdbc/driver/ControllerInfo;: I9 Branch 4 IFNE L99 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ControllerInfo[] controllerInfoArray0 = new ControllerInfo[1];
      ControllerInfo controllerInfo0 = new ControllerInfo();
      controllerInfoArray0[0] = controllerInfo0;
      OrderedConnectPolicy orderedConnectPolicy0 = new OrderedConnectPolicy(controllerInfoArray0, 1013L, 0);
      controllerInfo0.setHostname("");
      orderedConnectPolicy0.suspectControllerOfFailure(controllerInfoArray0[0]);
      try { 
        orderedConnectPolicy0.getController();
        fail("Expecting exception: NoMoreControllerException");
      
      } catch(NoMoreControllerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy", e);
      }
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - true
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.<init>([Lorg/objectweb/cjdbc/driver/ControllerInfo;JI)V: I24 Branch 1 IF_ICMPGE L64 - false
   * Goal 3. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.getController()Lorg/objectweb/cjdbc/driver/ControllerInfo;: I9 Branch 4 IFNE L99 - true
   * Goal 4. org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy.getController()Lorg/objectweb/cjdbc/driver/ControllerInfo;: I29 Branch 5 IF_ICMPNE L105 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ControllerInfo[] controllerInfoArray0 = new ControllerInfo[4];
      OrderedConnectPolicy orderedConnectPolicy0 = new OrderedConnectPolicy(controllerInfoArray0, (-290L), 319);
      ControllerInfo controllerInfo0 = orderedConnectPolicy0.getController();
      assertNull(controllerInfo0);
  }
}
