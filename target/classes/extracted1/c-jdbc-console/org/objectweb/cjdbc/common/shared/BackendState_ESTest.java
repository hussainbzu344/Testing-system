/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:52:55 GMT 2016
 */

package org.objectweb.cjdbc.common.shared;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.shared.BackendState;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BackendState_ESTest extends BackendState_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.shared.BackendState.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      BackendState backendState0 = new BackendState();
      assertEquals(0, BackendState.READ_ENABLED_WRITE_DISABLED);
  }
}
