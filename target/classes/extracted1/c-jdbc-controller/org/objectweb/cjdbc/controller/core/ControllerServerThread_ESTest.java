/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 17:05:21 GMT 2016
 */

package org.objectweb.cjdbc.controller.core;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.evosuite.runtime.testdata.EvoSuiteLocalAddress;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.net.SSLConfiguration;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.core.ControllerServerThread;
import org.objectweb.cjdbc.controller.core.security.ControllerSecurityManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ControllerServerThread_ESTest extends ControllerServerThread_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.isShuttingDown()Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      Controller controller0 = new Controller(")vQpP!a(:l", 304, 304);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      boolean boolean0 = controllerServerThread0.isShuttingDown();
      assertFalse(boolean0);
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.getIdleWorkerThreads()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      Controller controller0 = new Controller("org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableException", 2, 2);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      int int0 = controllerServerThread0.getIdleWorkerThreads();
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.getControllerServerThreadPendingQueueSize()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      Controller controller0 = new Controller("microsoft", 1321, 1842);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      int int0 = controllerServerThread0.getControllerServerThreadPendingQueueSize();
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - true
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I128 Branch 4 IFEQ L116 - true
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      Controller controller0 = new Controller("192.168.1.42", 68, 68);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      assertEquals(0, controllerServerThread0.countStackFrames());
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I73 Branch 3 IFEQ L98 - false
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      Controller controller0 = new Controller("q<./*x", 68, 68);
      ControllerSecurityManager controllerSecurityManager0 = new ControllerSecurityManager();
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      controllerSecurityManager0.setSslConfig(sSLConfiguration0);
      controller0.setSecurity(controllerSecurityManager0);
      ControllerServerThread controllerServerThread0 = null;
      try {
        controllerServerThread0 = new ControllerServerThread(controller0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.core.Controller", e);
      }
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - true
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I128 Branch 4 IFEQ L116 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I132 Branch 5 IFEQ L116 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      Controller controller0 = new Controller("192.168.1.42", 68, 68);
      ControllerSecurityManager controllerSecurityManager0 = new ControllerSecurityManager();
      controller0.setSecurity(controllerSecurityManager0);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      assertFalse(controllerServerThread0.isDaemon());
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - true
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I128 Branch 4 IFEQ L116 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I132 Branch 5 IFEQ L116 - false
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      Controller controller0 = new Controller("192.168.1.42", 68, 68);
      ControllerSecurityManager controllerSecurityManager0 = new ControllerSecurityManager();
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      controllerSecurityManager0.setSslConfig(sSLConfiguration0);
      controller0.setSecurity(controllerSecurityManager0);
      ControllerServerThread controllerServerThread0 = null;
      try {
        controllerServerThread0 = new ControllerServerThread(controller0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.core.Controller", e);
      }
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - true
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I4 Branch 7 IFNONNULL L166 - false
   * Goal 5. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I24 Branch 8 IFNE L173 - true
   * Goal 6. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I228 Branch 18 IFEQ L236 - true
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      Controller controller0 = new Controller("q<./*x", 68, 68);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      controllerServerThread0.controller = null;
      controllerServerThread0.run();
      assertEquals(0, controllerServerThread0.getControllerServerThreadPendingQueueSize());
  }

  //Test case number: 8
  /*
   * 15 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I73 Branch 3 IFEQ L98 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   * Goal 5. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I4 Branch 7 IFNONNULL L166 - true
   * Goal 6. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I24 Branch 8 IFNE L173 - false
   * Goal 7. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I35 Branch 9 IFEQ L178 - true
   * Goal 8. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I44 Branch 10 IFEQ L180 - false
   * Goal 9. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I50 Branch 11 IFNE L180 - true
   * Goal 10. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I104 Branch 12 IFEQ L196 - true
   * Goal 11. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I130 Branch 13 IFEQ L202 - true
   * Goal 12. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I152 Branch 14 IFNE L210 - false
   * Goal 13. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I179 Branch 15 IFEQ L219 - false
   * Goal 14. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I195 Branch 16 IFEQ L223 - true
   * Goal 15. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I212 Branch 17 IFNE L229 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("200.42.42.0", 2);
      NetworkHandling.sendMessageOnTcp(evoSuiteLocalAddress0, "Xcm5LhO@/k");
      Controller controller0 = new Controller("Xcm5LhO@/k", 2, 2);
      ControllerSecurityManager controllerSecurityManager0 = new ControllerSecurityManager();
      controller0.setSecurity(controllerSecurityManager0);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      // Undeclared exception!
      try { 
        controllerServerThread0.run();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  //Test case number: 9
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - false
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I73 Branch 3 IFEQ L98 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   * Goal 5. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I4 Branch 7 IFNONNULL L166 - true
   * Goal 6. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I24 Branch 8 IFNE L173 - false
   * Goal 7. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I35 Branch 9 IFEQ L178 - true
   * Goal 8. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I44 Branch 10 IFEQ L180 - false
   * Goal 9. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I50 Branch 11 IFNE L180 - false
   * Goal 10. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I212 Branch 17 IFNE L229 - false
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("200.42.42.0", 2);
      NetworkHandling.sendMessageOnTcp(evoSuiteLocalAddress0, "Xcm5LhO@/k");
      Controller controller0 = new Controller("Xcm5LhO@/k", 2, 2);
      ControllerSecurityManager controllerSecurityManager0 = new ControllerSecurityManager();
      controllerSecurityManager0.setDefaultConnect(false);
      controller0.setSecurity(controllerSecurityManager0);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      // Undeclared exception!
      try { 
        controllerServerThread0.run();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  //Test case number: 10
  /*
   * 12 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - true
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I4 Branch 7 IFNONNULL L166 - true
   * Goal 5. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I24 Branch 8 IFNE L173 - false
   * Goal 6. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I35 Branch 9 IFEQ L178 - true
   * Goal 7. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I44 Branch 10 IFEQ L180 - true
   * Goal 8. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I104 Branch 12 IFEQ L196 - true
   * Goal 9. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I130 Branch 13 IFEQ L202 - true
   * Goal 10. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I152 Branch 14 IFNE L210 - true
   * Goal 11. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I179 Branch 15 IFEQ L219 - true
   * Goal 12. org.objectweb.cjdbc.controller.core.ControllerServerThread.run()V: I212 Branch 17 IFNE L229 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      EvoSuiteLocalAddress evoSuiteLocalAddress0 = new EvoSuiteLocalAddress("200.42.42.0", 2);
      NetworkHandling.sendMessageOnTcp(evoSuiteLocalAddress0, "G;dp_]");
      Controller controller0 = new Controller("G;dp_]", 2, 2);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      controllerServerThread0.idleWorkerThreads = 2;
      // Undeclared exception!
      try { 
        controllerServerThread0.run();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I64 Branch 1 IFGT L88 - false
   * Goal 2. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I69 Branch 2 IFEQ L98 - true
   * Goal 3. org.objectweb.cjdbc.controller.core.ControllerServerThread.<init>(Lorg/objectweb/cjdbc/controller/core/Controller;)V: I263 Branch 6 IFEQ L150 - true
   * Goal 4. org.objectweb.cjdbc.controller.core.ControllerServerThread.shutdown()V: I51 Branch 19 IF_ICMPGE L267 - true
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      Controller controller0 = new Controller("q<./*x", 68, 68);
      ControllerServerThread controllerServerThread0 = new ControllerServerThread(controller0);
      controllerServerThread0.shutdown();
      assertTrue(controllerServerThread0.isShuttingDown());
  }
}