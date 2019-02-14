/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:27:19 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.popups;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.dnd.listeners.BackendTransferListener;
import org.objectweb.cjdbc.console.gui.objects.BackendObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BackendPopUpMenu_ESTest extends BackendPopUpMenu_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.BackendPopUpMenu.buildMonitorMenu()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.BackendPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/BackendObject;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.BackendPopUpMenu.addToMonitorMenu(I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      BackendObject backendObject0 = null;
      try {
        backendObject0 = new BackendObject((CjdbcGui) null, backendTransferListener0, "graph", "", "graph");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.objects.BackendObject", e);
      }
  }
}