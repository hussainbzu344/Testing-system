/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 15 14:56:59 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.frames;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.HeadlessException;
import java.awt.event.ActionListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.frames.GuiNewControllerFrame;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GuiNewControllerFrame_ESTest extends GuiNewControllerFrame_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.gui.frames.GuiNewControllerFrame.<init>(Ljava/awt/event/ActionListener;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      GuiNewControllerFrame guiNewControllerFrame0 = null;
      try {
        guiNewControllerFrame0 = new GuiNewControllerFrame((ActionListener) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }
}
