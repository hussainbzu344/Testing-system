/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:34:54 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.DataCollection;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DataCollection_ESTest extends DataCollection_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.monitor.DataCollection.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      DataCollection dataCollection0 = new DataCollection();
      assertEquals(60, DataCollection.SCHEDULER_NUMBER_READ);
  }
}