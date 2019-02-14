/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 03:32:15 GMT 2016
 */

package org.objectweb.cjdbc.driver.connectpolicy;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.util.HashSet;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.driver.ControllerInfo;
import org.objectweb.cjdbc.driver.connectpolicy.AbstractControllerConnectPolicy;
import org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread;
import org.objectweb.cjdbc.driver.connectpolicy.RandomConnectPolicy;
import org.objectweb.cjdbc.driver.connectpolicy.RoundRobinConnectPolicy;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ControllerPingThread_ESTest extends ControllerPingThread_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.<init>(Lorg/objectweb/cjdbc/driver/connectpolicy/AbstractControllerConnectPolicy;JI)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.isTerminated()Z: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ControllerPingThread controllerPingThread0 = new ControllerPingThread((AbstractControllerConnectPolicy) null, (-3001L), 2933);
      boolean boolean0 = controllerPingThread0.isTerminated();
      assertFalse(boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.<init>(Lorg/objectweb/cjdbc/driver/connectpolicy/AbstractControllerConnectPolicy;JI)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.run()V: I16 Branch 1 IFNE L74 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ControllerInfo[] controllerInfoArray0 = new ControllerInfo[1];
      ControllerInfo controllerInfo0 = new ControllerInfo();
      controllerInfoArray0[0] = controllerInfo0;
      RandomConnectPolicy randomConnectPolicy0 = new RandomConnectPolicy(controllerInfoArray0, (-1938L), 1);
      ControllerPingThread controllerPingThread0 = new ControllerPingThread((AbstractControllerConnectPolicy) randomConnectPolicy0, (long) 1, 1);
      controllerPingThread0.run();
      assertEquals(0, controllerPingThread0.countStackFrames());
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.<init>(Lorg/objectweb/cjdbc/driver/connectpolicy/AbstractControllerConnectPolicy;JI)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.run()V: I16 Branch 1 IFNE L74 - false
   * Goal 3. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.run()V: I37 Branch 2 IFEQ L86 - false
   * Goal 4. org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread.run()V: I112 Branch 3 IF_ICMPNE L112 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ControllerInfo[] controllerInfoArray0 = new ControllerInfo[27];
      RoundRobinConnectPolicy roundRobinConnectPolicy0 = new RoundRobinConnectPolicy(controllerInfoArray0, (long) (-32), (-32));
      HashSet<Integer> hashSet0 = new HashSet<Integer>();
      roundRobinConnectPolicy0.suspectedControllers = hashSet0;
      Integer integer0 = new Integer((-32));
      hashSet0.add(integer0);
      hashSet0.add((Integer) null);
      ControllerPingThread controllerPingThread0 = new ControllerPingThread((AbstractControllerConnectPolicy) roundRobinConnectPolicy0, (long) (byte)46, 1);
      // Undeclared exception!
      try { 
        controllerPingThread0.run();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to org.objectweb.cjdbc.driver.ControllerInfo
         //
         assertThrownBy("org.objectweb.cjdbc.driver.connectpolicy.ControllerPingThread", e);
      }
  }
}