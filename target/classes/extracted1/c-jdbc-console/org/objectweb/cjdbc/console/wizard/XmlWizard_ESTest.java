/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 09:21:57 GMT 2016
 */

package org.objectweb.cjdbc.console.wizard;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.wizard.XmlWizard;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XmlWizard_ESTest extends XmlWizard_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.wizard.XmlWizard.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      XmlWizard xmlWizard0 = null;
      try {
        xmlWizard0 = new XmlWizard();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.wizard.XmlWizard.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      XmlWizard xmlWizard0 = null;
      try {
        xmlWizard0 = new XmlWizard("l .`@jd;TjV:fq6YmSy");
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.wizard.XmlWizard.main([Ljava/lang/String;)V: I3 Branch 23 IFNULL L350 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        XmlWizard.main((String[]) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.XmlWizard.main([Ljava/lang/String;)V: I3 Branch 23 IFNULL L350 - false
   * Goal 2. org.objectweb.cjdbc.console.wizard.XmlWizard.main([Ljava/lang/String;)V: I6 Branch 24 IFNE L350 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        XmlWizard.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.XmlWizard.main([Ljava/lang/String;)V: I3 Branch 23 IFNULL L350 - false
   * Goal 2. org.objectweb.cjdbc.console.wizard.XmlWizard.main([Ljava/lang/String;)V: I6 Branch 24 IFNE L350 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        XmlWizard.main(stringArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }
}
