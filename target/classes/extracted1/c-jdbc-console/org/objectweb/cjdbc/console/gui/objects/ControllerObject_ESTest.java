/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:07:32 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.objects;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.objects.ControllerObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ControllerObject_ESTest extends ControllerObject_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.ControllerObject.getState()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.ControllerObject.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("");
      String string0 = controllerObject0.getState();
      assertNull(string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.ControllerObject.getPort()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.ControllerObject.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject(") is too great. Blobs greater than ");
      String string0 = controllerObject0.getPort();
      assertEquals(") is too great. Blobs greater than ", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.ControllerObject.getIpAdress()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.ControllerObject.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("Malformed Alter Request. Should start with [ALTER TABLE]");
      // Undeclared exception!
      try { 
        controllerObject0.getIpAdress();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.ControllerObject.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.ControllerObject.setState(Ljava/lang/String;)V: I5 Branch 1 IFLE L92 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject(") is too great. Blobs greater than ");
      controllerObject0.setState(") is too great. Blobs greater than ");
      assertEquals(") is too great. Blobs greater than ", controllerObject0.getState());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.ControllerObject.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.ControllerObject.setState(Ljava/lang/String;)V: I5 Branch 1 IFLE L92 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("Controller_UP");
      controllerObject0.setState("Controller_UP");
      assertEquals("Controller_UP", controllerObject0.getState());
  }
}
