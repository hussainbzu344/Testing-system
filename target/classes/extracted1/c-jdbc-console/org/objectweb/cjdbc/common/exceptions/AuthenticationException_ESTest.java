/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:44:48 GMT 2016
 */

package org.objectweb.cjdbc.common.exceptions;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.AuthenticationException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AuthenticationException_ESTest extends AuthenticationException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.AuthenticationException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.AuthenticationException.<init>(Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      AuthenticationException authenticationException0 = new AuthenticationException(")J7/l6/zL^Z\"&^3(E");
      AuthenticationException authenticationException1 = new AuthenticationException((Throwable) authenticationException0);
      assertFalse(authenticationException1.equals((Object)authenticationException0));
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.AuthenticationException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.AuthenticationException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      AuthenticationException authenticationException0 = new AuthenticationException(")J7/l6/zL^Z\"&^3(E");
      AuthenticationException authenticationException1 = new AuthenticationException("", (Throwable) authenticationException0);
      assertFalse(authenticationException1.equals((Object)authenticationException0));
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.AuthenticationException.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      AuthenticationException authenticationException0 = new AuthenticationException();
  }
}
