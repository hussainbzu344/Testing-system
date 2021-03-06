/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:44:55 GMT 2016
 */

package org.objectweb.cjdbc.common.exceptions;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.PrintWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.CJDBCException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CJDBCException_ESTest extends CJDBCException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 4. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException("IEi9t3f", (Throwable) cJDBCException0);
      CJDBCException cJDBCException2 = (CJDBCException)cJDBCException1.fillInStackTrace();
      assertNotSame(cJDBCException1, cJDBCException2);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException((Throwable) cJDBCException0);
      assertFalse(cJDBCException1.equals((Object)cJDBCException0));
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.printStackTrace()V: I4 Branch 4 IFNULL L143 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException("60");
      MockThrowable mockThrowable0 = new MockThrowable(",g?QU> \"", (Throwable) cJDBCException0);
      cJDBCException0.cause = (Throwable) mockThrowable0;
      cJDBCException0.printStackTrace();
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.getCause()Ljava/lang/Throwable;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = (CJDBCException)cJDBCException0.getCause();
      assertNull(cJDBCException1);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 4. org.objectweb.cjdbc.common.exceptions.CJDBCException.getStackTrace()[Ljava/lang/StackTraceElement;: I4 Branch 2 IFNULL L113 - true
   * Goal 5. org.objectweb.cjdbc.common.exceptions.CJDBCException.getStackTrace()[Ljava/lang/StackTraceElement;: I4 Branch 2 IFNULL L113 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException("IEi9t3f", (Throwable) cJDBCException0);
      StackTraceElement[] stackTraceElementArray0 = cJDBCException1.getStackTrace();
      assertNotNull(stackTraceElementArray0);
  }

  //Test case number: 5
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 4. org.objectweb.cjdbc.common.exceptions.CJDBCException.getMessage()Ljava/lang/String;: I4 Branch 3 IFNULL L128 - true
   * Goal 5. org.objectweb.cjdbc.common.exceptions.CJDBCException.getMessage()Ljava/lang/String;: I4 Branch 3 IFNULL L128 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException("IEi9t3f", (Throwable) cJDBCException0);
      String string0 = cJDBCException1.getMessage();
      assertNull(string0);
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.printStackTrace()V: I4 Branch 4 IFNULL L143 - true
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      cJDBCException0.printStackTrace();
  }

  //Test case number: 7
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 4. org.objectweb.cjdbc.common.exceptions.CJDBCException.printStackTrace(Ljava/io/PrintStream;)V: I4 Branch 5 IFNULL L158 - true
   * Goal 5. org.objectweb.cjdbc.common.exceptions.CJDBCException.printStackTrace(Ljava/io/PrintStream;)V: I4 Branch 5 IFNULL L158 - false
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException("IEi9t3f", (Throwable) cJDBCException0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("0.");
      cJDBCException1.printStackTrace((PrintStream) mockPrintStream0);
      assertNotSame(cJDBCException0, cJDBCException1);
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 4. org.objectweb.cjdbc.common.exceptions.CJDBCException.printStackTrace(Ljava/io/PrintWriter;)V: I4 Branch 6 IFNULL L173 - true
   * Goal 5. org.objectweb.cjdbc.common.exceptions.CJDBCException.printStackTrace(Ljava/io/PrintWriter;)V: I4 Branch 6 IFNULL L173 - false
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException("IEi9t3f", (Throwable) cJDBCException0);
      MockPrintStream mockPrintStream0 = new MockPrintStream("0.");
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter((OutputStream) mockPrintStream0);
      cJDBCException1.printStackTrace((PrintWriter) mockPrintWriter0);
      assertNotSame(cJDBCException0, cJDBCException1);
  }

  //Test case number: 9
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.exceptions.CJDBCException.<init>(Ljava/lang/String;Ljava/lang/Throwable;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.exceptions.CJDBCException.fillInStackTrace()Ljava/lang/Throwable;: I4 Branch 1 IFNULL L98 - true
   * Goal 4. org.objectweb.cjdbc.common.exceptions.CJDBCException.getStackTrace()[Ljava/lang/StackTraceElement;: I4 Branch 2 IFNULL L113 - true
   * Goal 5. org.objectweb.cjdbc.common.exceptions.CJDBCException.setStackTrace([Ljava/lang/StackTraceElement;)V: I4 Branch 7 IFNULL L188 - true
   * Goal 6. org.objectweb.cjdbc.common.exceptions.CJDBCException.setStackTrace([Ljava/lang/StackTraceElement;)V: I4 Branch 7 IFNULL L188 - false
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      CJDBCException cJDBCException0 = new CJDBCException();
      CJDBCException cJDBCException1 = new CJDBCException("IEi9t3f", (Throwable) cJDBCException0);
      StackTraceElement[] stackTraceElementArray0 = cJDBCException0.getStackTrace();
      cJDBCException1.setStackTrace(stackTraceElementArray0);
      assertNotSame(cJDBCException1, cJDBCException0);
  }
}
