/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 11:47:16 GMT 2016
 */

package org.objectweb.cjdbc.console.gui;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.CjdbcGuiLoader;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CjdbcGuiLoader_ESTest extends CjdbcGuiLoader_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.CjdbcGuiLoader.getProgress(I)I: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.CjdbcGuiLoader.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.CjdbcGuiLoader.run()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      CjdbcGuiLoader cjdbcGuiLoader0 = new CjdbcGuiLoader((CjdbcGui) null);
      // Undeclared exception!
      try { 
        cjdbcGuiLoader0.run();
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }
}
