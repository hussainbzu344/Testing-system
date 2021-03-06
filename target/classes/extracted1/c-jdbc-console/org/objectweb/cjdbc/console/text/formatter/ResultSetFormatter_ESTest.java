/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:51:40 GMT 2016
 */

package org.objectweb.cjdbc.console.text.formatter;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.InputStream;
import java.io.PushbackInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter;
import org.objectweb.cjdbc.driver.DriverResultSet;
import org.objectweb.cjdbc.driver.Field;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ResultSetFormatter_ESTest extends ResultSetFormatter_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ResultSetFormatter resultSetFormatter0 = new ResultSetFormatter();
  }

  //Test case number: 1
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - false
   * Goal 2. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I54 Branch 2 IFGT L74 - false
   * Goal 3. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I58 Branch 3 IFNULL L76 - true
   * Goal 4. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - true
   * Goal 5. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - false
   * Goal 6. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I24 Branch 12 IF_ICMPLE L140 - true
   * Goal 7. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I42 Branch 13 IF_ICMPGE L143 - true
   * Goal 8. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Field[] fieldArray0 = new Field[4];
          Field field0 = new Field("LL&q'23:", "LL&q'23:", (-3462), (-3462), "LL&q'23:", "LL&q'23:");
          fieldArray0[0] = field0;
          fieldArray0[1] = field0;
          fieldArray0[2] = field0;
          fieldArray0[3] = field0;
          ArrayList<Method> arrayList0 = new ArrayList<Method>();
          DriverResultSet driverResultSet0 = new DriverResultSet(fieldArray0, (ArrayList) arrayList0);
          field0.setFieldName((String) null);
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, false, false);
          // Undeclared exception!
          try { 
            ResultSetFormatter.formatAndDisplay(driverResultSet0, (-3924), console0);
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 2
  /*
   * 19 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - true
   * Goal 2. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - false
   * Goal 3. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I54 Branch 2 IFGT L74 - false
   * Goal 4. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I58 Branch 3 IFNULL L76 - false
   * Goal 5. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I103 Branch 4 IFEQ L91 - false
   * Goal 6. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I117 Branch 5 IF_ICMPGT L94 - true
   * Goal 7. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I117 Branch 5 IF_ICMPGT L94 - false
   * Goal 8. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I132 Branch 6 IFNULL L98 - true
   * Goal 9. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I159 Branch 7 IFGT L101 - false
   * Goal 10. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I163 Branch 8 IFNULL L103 - false
   * Goal 11. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I200 Branch 9 IFEQ L113 - false
   * Goal 12. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I206 Branch 10 IFNE L115 - false
   * Goal 13. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - true
   * Goal 14. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - false
   * Goal 15. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I24 Branch 12 IF_ICMPLE L140 - true
   * Goal 16. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I42 Branch 13 IF_ICMPGE L143 - true
   * Goal 17. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - true
   * Goal 18. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I14 Branch 15 IF_ICMPGE L154 - true
   * Goal 19. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I55 Branch 16 IF_ICMPGE L161 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Field[] fieldArray0 = new Field[4];
          Field field0 = new Field("L&q'23:", "L&q'23:", (-3440), (-3440), "L&q'23:", "L&q'23:");
          fieldArray0[0] = field0;
          fieldArray0[1] = field0;
          fieldArray0[2] = field0;
          fieldArray0[3] = field0;
          ArrayList<Method> arrayList0 = new ArrayList<Method>();
          arrayList0.add((Method) null);
          DriverResultSet driverResultSet0 = new DriverResultSet(fieldArray0, (ArrayList) arrayList0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, true, true);
          // Undeclared exception!
          try { 
            ResultSetFormatter.formatAndDisplay(driverResultSet0, (-1), console0);
            fail("Expecting exception: NullPointerException");
          
          } catch(NullPointerException e) {
             //
             // no message in exception (getMessage() returned null)
             //
             assertThrownBy("jline.ConsoleReader", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 3
  /*
   * 26 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - true
   * Goal 2. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - false
   * Goal 3. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I54 Branch 2 IFGT L74 - true
   * Goal 4. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I54 Branch 2 IFGT L74 - false
   * Goal 5. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I58 Branch 3 IFNULL L76 - false
   * Goal 6. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I103 Branch 4 IFEQ L91 - true
   * Goal 7. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I103 Branch 4 IFEQ L91 - false
   * Goal 8. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I117 Branch 5 IF_ICMPGT L94 - true
   * Goal 9. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I117 Branch 5 IF_ICMPGT L94 - false
   * Goal 10. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I132 Branch 6 IFNULL L98 - true
   * Goal 11. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I159 Branch 7 IFGT L101 - true
   * Goal 12. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I159 Branch 7 IFGT L101 - false
   * Goal 13. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I163 Branch 8 IFNULL L103 - false
   * Goal 14. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I200 Branch 9 IFEQ L113 - false
   * Goal 15. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I206 Branch 10 IFNE L115 - true
   * Goal 16. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - true
   * Goal 17. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - false
   * Goal 18. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I24 Branch 12 IF_ICMPLE L140 - true
   * Goal 19. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I24 Branch 12 IF_ICMPLE L140 - false
   * Goal 20. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I42 Branch 13 IF_ICMPGE L143 - true
   * Goal 21. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I42 Branch 13 IF_ICMPGE L143 - false
   * Goal 22. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - true
   * Goal 23. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - false
   * Goal 24. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I14 Branch 15 IF_ICMPGE L154 - true
   * Goal 25. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I55 Branch 16 IF_ICMPGE L161 - true
   * Goal 26. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I55 Branch 16 IF_ICMPGE L161 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Field[] fieldArray0 = new Field[4];
          Field field0 = new Field("LL&q'23:", "LL&q'23:", (-3462), (-3462), "LL&q'23:", "LL&q'23:", false, false, false, (-3462), false, false, false, false, false, (-3462), (-3462));
          fieldArray0[0] = field0;
          fieldArray0[1] = field0;
          fieldArray0[2] = field0;
          Field field1 = new Field("ofi", "", 2447, 2447, "ofi", "ofi", false, false, false, (-3924), false, false, false, false, false, 2447, (-3924));
          fieldArray0[3] = field1;
          ArrayList<Method> arrayList0 = new ArrayList<Method>();
          arrayList0.add((Method) null);
          DriverResultSet driverResultSet0 = new DriverResultSet(fieldArray0, (ArrayList) arrayList0);
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, false, false);
          ResultSetFormatter.formatAndDisplay(driverResultSet0, (-3924), console0);
          assertTrue(driverResultSet0.wasNull());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 4
  /*
   * 19 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - true
   * Goal 2. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - false
   * Goal 3. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I54 Branch 2 IFGT L74 - false
   * Goal 4. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I58 Branch 3 IFNULL L76 - false
   * Goal 5. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I103 Branch 4 IFEQ L91 - true
   * Goal 6. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I103 Branch 4 IFEQ L91 - false
   * Goal 7. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I117 Branch 5 IF_ICMPGT L94 - true
   * Goal 8. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I117 Branch 5 IF_ICMPGT L94 - false
   * Goal 9. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I132 Branch 6 IFNULL L98 - true
   * Goal 10. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I159 Branch 7 IFGT L101 - false
   * Goal 11. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I163 Branch 8 IFNULL L103 - false
   * Goal 12. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I200 Branch 9 IFEQ L113 - true
   * Goal 13. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - true
   * Goal 14. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - false
   * Goal 15. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I24 Branch 12 IF_ICMPLE L140 - true
   * Goal 16. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I42 Branch 13 IF_ICMPGE L143 - true
   * Goal 17. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - true
   * Goal 18. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I14 Branch 15 IF_ICMPGE L154 - true
   * Goal 19. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I55 Branch 16 IF_ICMPGE L161 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Boolean boolean0 = new Boolean("L0&q'23:");
          Field[] fieldArray0 = new Field[4];
          Field field0 = new Field("L0&q'23:", "L0&q'23:", (-3462), (-3462), "L0&q'23:", "L0&q'23:");
          fieldArray0[0] = field0;
          fieldArray0[1] = field0;
          fieldArray0[2] = field0;
          fieldArray0[3] = field0;
          ArrayList<Method> arrayList0 = new ArrayList<Method>();
          arrayList0.add((Method) null);
          DriverResultSet driverResultSet0 = new DriverResultSet(fieldArray0, (ArrayList) arrayList0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) null, (boolean) boolean0, true);
          ResultSetFormatter.formatAndDisplay(driverResultSet0, 0, console0);
          assertTrue(driverResultSet0.wasNull());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 5
  /*
   * 14 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - true
   * Goal 2. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I33 Branch 1 IF_ICMPGT L68 - false
   * Goal 3. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I54 Branch 2 IFGT L74 - false
   * Goal 4. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I58 Branch 3 IFNULL L76 - false
   * Goal 5. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.formatAndDisplay(Ljava/sql/ResultSet;ILorg/objectweb/cjdbc/console/text/Console;)V: I103 Branch 4 IFEQ L91 - true
   * Goal 6. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - true
   * Goal 7. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I13 Branch 11 IF_ICMPGT L137 - false
   * Goal 8. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I24 Branch 12 IF_ICMPLE L140 - true
   * Goal 9. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendSeparatorLine(ILjava/sql/ResultSetMetaData;Lorg/objectweb/cjdbc/console/text/Console;)V: I42 Branch 13 IF_ICMPGE L143 - true
   * Goal 10. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - true
   * Goal 11. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I4 Branch 14 IF_ICMPLE L152 - false
   * Goal 12. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I14 Branch 15 IF_ICMPGE L154 - true
   * Goal 13. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I14 Branch 15 IF_ICMPGE L154 - false
   * Goal 14. org.objectweb.cjdbc.console.text.formatter.ResultSetFormatter.appendPad(Ljava/lang/String;ILorg/objectweb/cjdbc/console/text/Console;)V: I55 Branch 16 IF_ICMPGE L161 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          Field[] fieldArray0 = new Field[4];
          Field field0 = new Field("LL&q'23:", "LL&q'23:", (-3445), (-3445), "LL&q'23:", "LL&q'23:");
          fieldArray0[0] = field0;
          fieldArray0[1] = fieldArray0[0];
          Field field1 = new Field("", "Constructor's parameter n. ", (-3445), (-3445), "", "");
          fieldArray0[2] = field1;
          fieldArray0[3] = fieldArray0[0];
          ArrayList<Method> arrayList0 = new ArrayList<Method>();
          DriverResultSet driverResultSet0 = new DriverResultSet(fieldArray0, (ArrayList) arrayList0);
          PushbackInputStream pushbackInputStream0 = new PushbackInputStream((InputStream) null);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) pushbackInputStream0, false, false);
          ResultSetFormatter.formatAndDisplay(driverResultSet0, (-3924), console0);
          assertEquals(1000, driverResultSet0.getFetchDirection());
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}
