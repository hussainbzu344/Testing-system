/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:22:05 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.popups;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.event.ActionEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockHijrahDate;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.objects.ControllerObject;
import org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ControllerPopUpMenu_ESTest extends ControllerPopUpMenu_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 9 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I66 Branch 5 IFLE L109 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I80 Branch 6 IFLE L113 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I94 Branch 7 IFLE L117 - true
   * Goal 9. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I108 Branch 8 IFLE L121 - false
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("command.remove.controller");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) "command.remove.controller", 3127, "command.remove.controller", (long) 3127, 3127);
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.getController()Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("command.shutdow\"'contoller");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ControllerObject controllerObject1 = controllerPopUpMenu0.getController();
      assertTrue(controllerObject1.getFocusTraversalKeysEnabled());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - false
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("3=W>m<leyU<)OJ");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      MockHijrahDate mockHijrahDate0 = new MockHijrahDate();
      ActionEvent actionEvent0 = new ActionEvent((Object) mockHijrahDate0, 0, "command.add.driver", (-227L), 326);
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - false
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ActionEvent actionEvent0 = new ActionEvent((Object) mockMinguoDate0, 938, "command.refresh.logs", 938);
      ControllerObject controllerObject0 = new ControllerObject("k:$x,A0%y7 6Zh(pu");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - false
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("visibleRowCount");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) controllerPopUpMenu0, (-2487), "command.display.controller.xml", (long) (-2487), (-2487));
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - false
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("command.get.info");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) controllerPopUpMenu0, (-1), "command.get.info", (long) (-1), (-1));
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I66 Branch 5 IFLE L109 - false
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("command.shutdown.controller");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) controllerPopUpMenu0, (-2487), "command.shutdown.controller", (long) (-2487), (-2487));
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I66 Branch 5 IFLE L109 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I80 Branch 6 IFLE L113 - false
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("E.");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) controllerObject0, 0, "command.controller.report");
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I66 Branch 5 IFLE L109 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I80 Branch 6 IFLE L113 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I94 Branch 7 IFLE L117 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject((String) null);
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) "command.shutdowf.cotrller", (-2), "command.view.controller.log.configuration", 0L, 1661);
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 9
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I66 Branch 5 IFLE L109 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I80 Branch 6 IFLE L113 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I94 Branch 7 IFLE L117 - true
   * Goal 9. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I108 Branch 8 IFLE L121 - true
   * Goal 10. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I122 Branch 9 IFLE L125 - false
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("command.shutdow\"'contoller");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) controllerObject0, 1037, "command.monitor.controller", (-1846652119));
      // Undeclared exception!
      try { 
        controllerPopUpMenu0.actionPerformed(actionEvent0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu", e);
      }
  }

  //Test case number: 10
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;Lorg/objectweb/cjdbc/console/gui/objects/ControllerObject;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I10 Branch 1 IFLE L93 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I24 Branch 2 IFLE L97 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I38 Branch 3 IFLE L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I52 Branch 4 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I66 Branch 5 IFLE L109 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I80 Branch 6 IFLE L113 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I94 Branch 7 IFLE L117 - true
   * Goal 9. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I108 Branch 8 IFLE L121 - true
   * Goal 10. org.objectweb.cjdbc.console.gui.popups.ControllerPopUpMenu.actionPerformed(Ljava/awt/event/ActionEvent;)V: I122 Branch 9 IFLE L125 - true
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      ControllerObject controllerObject0 = new ControllerObject("command.shuqpo+c.cotrller");
      ControllerPopUpMenu controllerPopUpMenu0 = new ControllerPopUpMenu((CjdbcGui) null, controllerObject0);
      ActionEvent actionEvent0 = new ActionEvent((Object) "command.shuqpo+c.cotrller", 3140, "command.shuqpo+c.cotrller", (long) 3140, 3140);
      controllerPopUpMenu0.actionPerformed(actionEvent0);
      assertFalse(controllerPopUpMenu0.isFocusTraversalPolicySet());
  }
}
