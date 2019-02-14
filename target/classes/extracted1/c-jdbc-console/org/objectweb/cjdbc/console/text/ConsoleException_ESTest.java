/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:56:52 GMT 2016
 */

package org.objectweb.cjdbc.console.text;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.text.ConsoleException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConsoleException_ESTest extends ConsoleException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ConsoleException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.ConsoleException.<init>(Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ConsoleException consoleException0 = new ConsoleException();
      ConsoleException consoleException1 = new ConsoleException((Throwable) consoleException0);
      assertFalse(consoleException1.equals((Object)consoleException0));
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.text.ConsoleException.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ConsoleException consoleException0 = new ConsoleException("org.evosuite.runtime.mock.java.lang.MockThrowable");
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ConsoleException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.ConsoleException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ConsoleException consoleException0 = new ConsoleException();
      ConsoleException consoleException1 = new ConsoleException("org.evosuite.runtime.mock.java.lang.MockThrowable", (Throwable) consoleException0);
      assertFalse(consoleException1.equals((Object)consoleException0));
  }
}