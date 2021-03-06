/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:52:31 GMT 2016
 */

package org.objectweb.cjdbc.common.i18n;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.i18n.MonitorTranslate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MonitorTranslate_ESTest extends MonitorTranslate_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.get(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      String string0 = MonitorTranslate.get("");
      assertEquals("", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      MonitorTranslate monitorTranslate0 = new MonitorTranslate();
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.get(Ljava/lang/String;J)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      String string0 = MonitorTranslate.get("c-jdbc-monitoring-language", 713L);
      assertEquals("c-jdbc-monitoring-language", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.get(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      String string0 = MonitorTranslate.get("F<L", objectArray0);
      assertEquals("F<L", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.get(Ljava/lang/String;Z)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String string0 = MonitorTranslate.get("c-jdbc-monitoring-language", true);
      assertEquals("c-jdbc-monitoring-language", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.get(Ljava/lang/String;I)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      String string0 = MonitorTranslate.get("org.objectweb.cjdbc.common.i18n.MonitorTranslate", 1);
      assertEquals("org.objectweb.cjdbc.common.i18n.MonitorTranslate", string0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.i18n.MonitorTranslate.get(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      String string0 = MonitorTranslate.get("F<L", (Object) "F<L");
      assertEquals("F<L", string0);
  }
}
