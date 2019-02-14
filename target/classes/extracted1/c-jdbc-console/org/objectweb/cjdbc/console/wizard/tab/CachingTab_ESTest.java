/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 09:40:21 GMT 2016
 */

package org.objectweb.cjdbc.console.wizard.tab;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.awt.ItemSelectable;
import java.awt.event.ItemEvent;
import javax.swing.JCheckBox;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockMinguoDate;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.wizard.WizardTabs;
import org.objectweb.cjdbc.console.wizard.tab.CachingTab;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CachingTab_ESTest extends CachingTab_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.CachingTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I10 Branch 1 IF_ACMPNE L254 - true
   * Goal 3. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I48 Branch 3 IF_ACMPNE L261 - false
   * Goal 4. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I54 Branch 4 IFNULL L263 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      CachingTab cachingTab0 = new CachingTab(wizardTabs0);
      CachingTab cachingTab1 = new CachingTab(wizardTabs0);
      cachingTab1.backgroundParsing = cachingTab0.parsingenable;
      cachingTab1.backgroundParsing.doClick(0);
      assertTrue(cachingTab1.getFocusTraversalKeysEnabled());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.CachingTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I10 Branch 1 IF_ACMPNE L254 - false
   * Goal 3. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I16 Branch 2 IFNULL L256 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      CachingTab cachingTab0 = new CachingTab(wizardTabs0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ItemEvent itemEvent0 = new ItemEvent((ItemSelectable) cachingTab0.resultenable, 0, (Object) mockMinguoDate0, 0);
      cachingTab0.itemStateChanged(itemEvent0);
      assertEquals(0, itemEvent0.getID());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.CachingTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I10 Branch 1 IF_ACMPNE L254 - false
   * Goal 3. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I16 Branch 2 IFNULL L256 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      CachingTab cachingTab0 = new CachingTab(wizardTabs0);
      JCheckBox jCheckBox0 = new JCheckBox("'| 4J#D", true);
      cachingTab0.resultenable = jCheckBox0;
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ItemEvent itemEvent0 = new ItemEvent((ItemSelectable) cachingTab0.resultenable, 0, (Object) mockMinguoDate0, 0);
      cachingTab0.itemStateChanged(itemEvent0);
      assertFalse(cachingTab0.getIgnoreRepaint());
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.CachingTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I10 Branch 1 IF_ACMPNE L254 - true
   * Goal 3. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I48 Branch 3 IF_ACMPNE L261 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I80 Branch 5 IF_ACMPNE L267 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      CachingTab cachingTab0 = new CachingTab(wizardTabs0);
      ItemEvent itemEvent0 = new ItemEvent((ItemSelectable) cachingTab0.granularity, 40, (Object) wizardTabs0, 40);
      cachingTab0.itemStateChanged(itemEvent0);
      assertEquals(40, itemEvent0.getStateChange());
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.CachingTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I10 Branch 1 IF_ACMPNE L254 - true
   * Goal 3. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I48 Branch 3 IF_ACMPNE L261 - false
   * Goal 4. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I54 Branch 4 IFNULL L263 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      CachingTab cachingTab0 = new CachingTab(wizardTabs0);
      MockMinguoDate mockMinguoDate0 = new MockMinguoDate();
      ItemEvent itemEvent0 = new ItemEvent((ItemSelectable) cachingTab0.parsingenable, 563, (Object) mockMinguoDate0, 100000);
      cachingTab0.itemStateChanged(itemEvent0);
      assertFalse(cachingTab0.isFocusTraversalPolicyProvider());
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.CachingTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I10 Branch 1 IF_ACMPNE L254 - true
   * Goal 3. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I48 Branch 3 IF_ACMPNE L261 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I80 Branch 5 IF_ACMPNE L267 - false
   * Goal 5. org.objectweb.cjdbc.console.wizard.tab.CachingTab.itemStateChanged(Ljava/awt/event/ItemEvent;)V: I86 Branch 6 IFNULL L269 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      WizardTabs wizardTabs0 = new WizardTabs();
      CachingTab cachingTab0 = new CachingTab(wizardTabs0);
      ItemEvent itemEvent0 = new ItemEvent((ItemSelectable) cachingTab0.metadataenable, (-23), (Object) cachingTab0, (-23));
      cachingTab0.itemStateChanged(itemEvent0);
      assertFalse(cachingTab0.isFocusCycleRoot());
  }
}