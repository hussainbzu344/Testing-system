/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 09:24:15 GMT 2016
 */

package org.objectweb.cjdbc.console.wizard.tab;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.wizard.WizardTabs;
import org.objectweb.cjdbc.console.wizard.tab.DistributionTab;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DistributionTab_ESTest extends DistributionTab_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.wizard.tab.DistributionTab.<init>(Lorg/objectweb/cjdbc/console/wizard/WizardTabs;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      DistributionTab distributionTab0 = new DistributionTab((WizardTabs) null);
      assertFalse(distributionTab0.isFocusCycleRoot());
  }
}
