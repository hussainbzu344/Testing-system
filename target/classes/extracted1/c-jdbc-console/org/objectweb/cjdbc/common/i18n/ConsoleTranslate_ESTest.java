/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:51:42 GMT 2016
 */

package org.objectweb.cjdbc.common.i18n;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.i18n.ConsoleTranslate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConsoleTranslate_ESTest extends ConsoleTranslate_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.get(Ljava/lang/String;J)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      String string0 = ConsoleTranslate.get("Invalid null URL in connect", 2904L);
      assertEquals("Invalid null URL in connect", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.get(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      String string0 = ConsoleTranslate.get("connectionPooling", objectArray0);
      assertEquals("connectionPooling", string0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.get(Ljava/lang/String;Z)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      String string0 = ConsoleTranslate.get("org.objectweb.cjdbc.common.i18n.ConsoleTranslate", false);
      assertEquals("org.objectweb.cjdbc.common.i18n.ConsoleTranslate", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.get(Ljava/lang/String;I)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      String string0 = ConsoleTranslate.get("NzokD9Ow&CB`!N>nm8", 7);
      assertEquals("NzokD9Ow&CB`!N>nm8", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.get(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String string0 = ConsoleTranslate.get("0", (Object) null);
      assertEquals("0", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ConsoleTranslate consoleTranslate0 = new ConsoleTranslate();
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.ConsoleTranslate.get(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      String string0 = ConsoleTranslate.get("NzokD9Ow&CB`!N>nm8");
      assertEquals("NzokD9Ow&CB`!N>nm8", string0);
  }
}
