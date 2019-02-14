/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:01:38 GMT 2016
 */

package org.objectweb.cjdbc.console.wizard;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.wizard.WizardTabs;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WizardTabs_ESTest extends WizardTabs_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.isDistributedDatabase()Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 5. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I14 Branch 1 IFLE L121 - false
   * Goal 6. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I68 Branch 4 IFEQ L139 - true
   * Goal 7. org.objectweb.cjdbc.console.wizard.WizardTabs.distributionChanged()V: I16 Branch 6 IF_ICMPGE L191 - true
   * Goal 8. org.objectweb.cjdbc.console.wizard.WizardTabs.distributionChanged()V: I16 Branch 6 IF_ICMPGE L191 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      wizardTabs0.distributionChanged();
      assertFalse(wizardTabs0.getIgnoreRepaint());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.getBackends()Ljava/util/ArrayList;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      ArrayList arrayList0 = wizardTabs0.getBackends();
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I14 Branch 1 IFLE L121 - true
   * Goal 5. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I31 Branch 2 IFLE L126 - false
   * Goal 6. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I68 Branch 4 IFEQ L139 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      wizardTabs0.setTabEnabled("tab.caching", true);
      assertFalse(wizardTabs0.isFocusCycleRoot());
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I14 Branch 1 IFLE L121 - true
   * Goal 5. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I31 Branch 2 IFLE L126 - true
   * Goal 6. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I49 Branch 3 IFLE L131 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      wizardTabs0.setTabEnabled("*", false);
      assertFalse(wizardTabs0.getIgnoreRepaint());
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I14 Branch 1 IFLE L121 - true
   * Goal 5. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I31 Branch 2 IFLE L126 - true
   * Goal 6. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I49 Branch 3 IFLE L131 - false
   * Goal 7. org.objectweb.cjdbc.console.wizard.WizardTabs.setTabEnabled(Ljava/lang/String;Z)V: I68 Branch 4 IFEQ L139 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      wizardTabs0.setTabEnabled("tab.recovery", false);
      assertTrue(wizardTabs0.getFocusTraversalKeysEnabled());
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.backendListChanged()V: I9 Branch 5 IF_ICMPGE L180 - true
   * Goal 5. org.objectweb.cjdbc.console.wizard.WizardTabs.backendListChanged()V: I9 Branch 5 IF_ICMPGE L180 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      wizardTabs0.backendListChanged();
      assertTrue(wizardTabs0.getFocusTraversalKeysEnabled());
  }

  //Test case number: 6
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.WizardTabs.getUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.WizardTabs.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.WizardTabs.addTab(Lorg/objectweb/cjdbc/console/wizard/WizardTab;)Lorg/objectweb/cjdbc/console/wizard/WizardTab;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.wizard.WizardTabs.usersChanged()V: I9 Branch 7 IF_ICMPGE L200 - true
   * Goal 5. org.objectweb.cjdbc.console.wizard.WizardTabs.usersChanged()V: I9 Branch 7 IF_ICMPGE L200 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      wizardTabs0.usersChanged();
      assertFalse(wizardTabs0.getIgnoreRepaint());
  }
}
