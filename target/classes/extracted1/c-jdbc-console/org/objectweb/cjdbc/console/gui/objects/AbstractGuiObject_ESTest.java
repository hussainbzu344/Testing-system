/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:18:54 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.objects;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.objects.AbstractGuiObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractGuiObject_ESTest extends AbstractGuiObject_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.AbstractGuiObject.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      AbstractGuiObject abstractGuiObject0 = new AbstractGuiObject();
      assertFalse(abstractGuiObject0.isFocusTraversalPolicySet());
  }
}