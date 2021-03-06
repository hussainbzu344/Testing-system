/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:16:54 GMT 2016
 */

package org.objectweb.cjdbc.common.exceptions;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.SecurityException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SecurityException_ESTest extends SecurityException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.SecurityException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.SecurityException.<init>(Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      SecurityException securityException0 = new SecurityException("d{|-");
      SecurityException securityException1 = new SecurityException((Throwable) securityException0);
      assertFalse(securityException1.equals((Object)securityException0));
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.SecurityException.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      SecurityException securityException0 = new SecurityException();
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.SecurityException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.SecurityException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      SecurityException securityException0 = new SecurityException("d{|-");
      SecurityException securityException1 = new SecurityException("d{|-", (Throwable) securityException0);
      assertFalse(securityException1.equals((Object)securityException0));
  }
}
