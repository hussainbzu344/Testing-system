/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:54:02 GMT 2016
 */

package org.objectweb.cjdbc.console.text;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.File;
import java.io.PrintStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.text.ColorPrinter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ColorPrinter_ESTest extends ColorPrinter_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ColorPrinter colorPrinter0 = new ColorPrinter();
      assertEquals(0, ColorPrinter.STD);
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.printMessage(Ljava/lang/String;Ljava/io/PrintStream;IZ)V: I9 Branch 1 IFEQ L136 - true
   * Goal 2. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 2 TABLESWITCH L153 Case 0 - false
   * Goal 3. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 3 TABLESWITCH L153 Case 1 - false
   * Goal 4. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 4 TABLESWITCH L153 Case 2 - false
   * Goal 5. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 5 TABLESWITCH L153 Case 3 - false
   * Goal 6. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 6 TABLESWITCH L153 Case 4 - false
   * Goal 7. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 7 TABLESWITCH L153 Default-Case - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        ColorPrinter.printMessage("0.", (PrintStream) null, (-354), false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.text.ColorPrinter", e);
      }
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.printMessage(Ljava/lang/String;Ljava/io/PrintStream;IZ)V: I9 Branch 1 IFEQ L136 - false
   * Goal 2. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 2 TABLESWITCH L153 Case 0 - false
   * Goal 3. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 3 TABLESWITCH L153 Case 1 - false
   * Goal 4. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 4 TABLESWITCH L153 Case 2 - false
   * Goal 5. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 5 TABLESWITCH L153 Case 3 - true
   * Goal 6. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 6 TABLESWITCH L153 Case 4 - false
   * Goal 7. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 7 TABLESWITCH L153 Default-Case - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      MockFile mockFile0 = new MockFile("N|e/q')/:P8X&");
      MockPrintStream mockPrintStream0 = new MockPrintStream((File) mockFile0);
      ColorPrinter.printMessage("N|e/q')/:P8X&", (PrintStream) mockPrintStream0, 3, true);
      assertEquals(25L, mockFile0.length());
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 2 TABLESWITCH L153 Case 0 - true
   * Goal 2. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 3 TABLESWITCH L153 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 4 TABLESWITCH L153 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 5 TABLESWITCH L153 Case 3 - false
   * Goal 5. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 6 TABLESWITCH L153 Case 4 - false
   * Goal 6. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 7 TABLESWITCH L153 Default-Case - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      String string0 = ColorPrinter.getColoredMessage("", 0);
      assertEquals("\u001B[2;30m\u001B[m", string0);
  }

  //Test case number: 4
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 2 TABLESWITCH L153 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 3 TABLESWITCH L153 Case 1 - true
   * Goal 3. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 4 TABLESWITCH L153 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 5 TABLESWITCH L153 Case 3 - false
   * Goal 5. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 6 TABLESWITCH L153 Case 4 - false
   * Goal 6. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 7 TABLESWITCH L153 Default-Case - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String string0 = ColorPrinter.getColoredMessage("m", 1);
      assertEquals("\u001B[1;31mm\u001B[m", string0);
  }

  //Test case number: 5
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 2 TABLESWITCH L153 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 3 TABLESWITCH L153 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 4 TABLESWITCH L153 Case 2 - true
   * Goal 4. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 5 TABLESWITCH L153 Case 3 - false
   * Goal 5. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 6 TABLESWITCH L153 Case 4 - false
   * Goal 6. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 7 TABLESWITCH L153 Default-Case - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      String string0 = ColorPrinter.getColoredMessage("A6l%d!=w1Mn=K", 2);
      assertEquals("\u001B[1;32mA6l%d!=w1Mn=K\u001B[m", string0);
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 2 TABLESWITCH L153 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 3 TABLESWITCH L153 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 4 TABLESWITCH L153 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 5 TABLESWITCH L153 Case 3 - false
   * Goal 5. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 6 TABLESWITCH L153 Case 4 - true
   * Goal 6. org.objectweb.cjdbc.console.text.ColorPrinter.getColoredMessage(Ljava/lang/String;I)Ljava/lang/String;: I10 Branch 7 TABLESWITCH L153 Default-Case - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      String string0 = ColorPrinter.getColoredMessage("|B", 4);
      assertEquals("\u001B[1;34m|B\u001B[m", string0);
  }
}