/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:28:56 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.popups;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.event.ActionEvent;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.popups.LoggingPopUpMenu;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LoggingPopUpMenu_ESTest extends LoggingPopUpMenu_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.LoggingPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.LoggingPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L62 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      LoggingPopUpMenu loggingPopUpMenu0 = new LoggingPopUpMenu((CjdbcGui) null);
      ActionEvent actionEvent0 = new ActionEvent((Object) "or}.jfree.dataotimeeW4xk", 1148, "command.clean.logging.pane");
      // Undeclared exception!
      try { 
        loggingPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.LoggingPopUpMenu", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.LoggingPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.LoggingPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L62 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      ActionEvent actionEvent0 = new ActionEvent((Object) integer0, 1148, "or}.jfree.dataotimeeW4xk");
      LoggingPopUpMenu loggingPopUpMenu0 = new LoggingPopUpMenu((CjdbcGui) null);
      loggingPopUpMenu0.actionPerformed(actionEvent0);
      assertFalse(loggingPopUpMenu0.isFocusTraversalPolicyProvider());
  }
}