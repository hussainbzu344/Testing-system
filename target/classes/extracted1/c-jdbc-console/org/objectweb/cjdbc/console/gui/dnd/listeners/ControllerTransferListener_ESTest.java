/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:11:16 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.dnd.listeners;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.dnd.listeners.ControllerTransferListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ControllerTransferListener_ESTest extends ControllerTransferListener_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.ControllerTransferListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
  }
}
