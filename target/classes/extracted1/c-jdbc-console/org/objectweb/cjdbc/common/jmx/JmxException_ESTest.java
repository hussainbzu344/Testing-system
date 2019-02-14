/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:50:51 GMT 2016
 */

package org.objectweb.cjdbc.common.jmx;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.jmx.JmxException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JmxException_ESTest extends JmxException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxException.<init>(Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      JmxException jmxException0 = new JmxException("");
      JmxException jmxException1 = new JmxException((Throwable) jmxException0);
      assertFalse(jmxException1.equals((Object)jmxException0));
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxException.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      JmxException jmxException0 = new JmxException();
  }
}