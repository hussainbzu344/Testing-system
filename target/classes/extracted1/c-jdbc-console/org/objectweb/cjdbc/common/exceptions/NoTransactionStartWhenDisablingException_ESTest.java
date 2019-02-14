/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:44:30 GMT 2016
 */

package org.objectweb.cjdbc.common.exceptions;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class NoTransactionStartWhenDisablingException_ESTest extends NoTransactionStartWhenDisablingException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException.<init>(Ljava/lang/String;Ljava/lang/String;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      NoTransactionStartWhenDisablingException noTransactionStartWhenDisablingException0 = new NoTransactionStartWhenDisablingException("fWv%O9O{o{rt", "xLK=++%k0bFb3m|K Dn", 0);
      assertEquals(0, noTransactionStartWhenDisablingException0.getErrorCode());
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      NoTransactionStartWhenDisablingException noTransactionStartWhenDisablingException0 = new NoTransactionStartWhenDisablingException();
      assertNull(noTransactionStartWhenDisablingException0.getSQLState());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      NoTransactionStartWhenDisablingException noTransactionStartWhenDisablingException0 = new NoTransactionStartWhenDisablingException("jvUl~KRuD/\",CcUAi");
      assertNull(noTransactionStartWhenDisablingException0.getSQLState());
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      NoTransactionStartWhenDisablingException noTransactionStartWhenDisablingException0 = new NoTransactionStartWhenDisablingException("jvUl~KRuD/\",CcUAi", "jvUl~KRuD/\",CcUAi");
      assertEquals("jvUl~KRuD/\",CcUAi", noTransactionStartWhenDisablingException0.getSQLState());
  }
}
