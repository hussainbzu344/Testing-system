/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 16:03:39 GMT 2016
 */

package org.objectweb.cjdbc.common.stream;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.stream.CJDBCStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CJDBCStream_ESTest extends CJDBCStream_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.stream.CJDBCStream.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      CJDBCStream cJDBCStream0 = new CJDBCStream();
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.stream.CJDBCStream.countBytes(Ljava/lang/Object;)I: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      int int0 = CJDBCStream.countBytes("");
      assertEquals(7, int0);
  }
}
