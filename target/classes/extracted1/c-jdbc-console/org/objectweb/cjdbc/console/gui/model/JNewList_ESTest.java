/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:05:37 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.model;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.model.JNewList;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JNewList_ESTest extends JNewList_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.JNewList.clearSelection()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.JNewList.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      JNewList jNewList0 = new JNewList();
      jNewList0.clearSelection();
      assertFalse(jNewList0.isFocusTraversalPolicyProvider());
  }
}
