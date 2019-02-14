/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:19:22 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.popups;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.event.ActionEvent;
import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.objects.DumpFileObject;
import org.objectweb.cjdbc.console.gui.popups.DumpPopUpMenu;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpPopUpMenu_ESTest extends DumpPopUpMenu_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.DumpPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Ljava/lang/String;Lorg/objectweb/cjdbc/console/gui/objects/DumpFileObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.DumpPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L71 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("command.delete.dump");
      DumpFileObject dumpFileObject0 = new DumpFileObject((File) mockFile0);
      DumpPopUpMenu dumpPopUpMenu0 = new DumpPopUpMenu((CjdbcGui) null, "command.delete.dump", dumpFileObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) mockFile0, (-2040109463), "command.delete.dump");
      // Undeclared exception!
      try { 
        dumpPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.DumpPopUpMenu", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.DumpPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Ljava/lang/String;Lorg/objectweb/cjdbc/console/gui/objects/DumpFileObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.DumpPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L71 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Batch faiged @or requ3st ");
      DumpFileObject dumpFileObject0 = new DumpFileObject((File) mockFile0);
      DumpPopUpMenu dumpPopUpMenu0 = new DumpPopUpMenu((CjdbcGui) null, "Batch faiged @or requ3st ", dumpFileObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) mockFile0, (-2014021361), "+?D{HmWXlpCEEQE$U", (-746));
      dumpPopUpMenu0.actionPerformed(actionEvent0);
      assertFalse(dumpPopUpMenu0.isFocusTraversalPolicyProvider());
  }
}