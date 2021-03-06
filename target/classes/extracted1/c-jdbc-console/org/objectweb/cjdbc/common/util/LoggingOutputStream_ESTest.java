/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:16:36 GMT 2016
 */

package org.objectweb.cjdbc.common.util;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.IOException;
import org.apache.log4j.Category;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;
import org.apache.log4j.spi.RootCategory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.util.LoggingOutputStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LoggingOutputStream_ESTest extends LoggingOutputStream_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.close()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - true
   * Goal 3. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I36 Branch 2 IFNONNULL L99 - true
   * Goal 4. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I4 Branch 3 IFEQ L134 - false
   * Goal 5. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I4 Branch 6 IFNE L166 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Logger logger0 = Logger.getLogger("{MzZ_*\"dRhlGL");
      RootCategory rootCategory0 = (RootCategory)logger0.getParent();
      Level level0 = (Level)Priority.WARN;
      LoggingOutputStream loggingOutputStream0 = new LoggingOutputStream((Category) rootCategory0, (Priority) level0);
      loggingOutputStream0.close();
      try { 
        loggingOutputStream0.write(2723);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // The stream has been closed.
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.LoggingOutputStream", e);
      }
  }

  //Test case number: 1
  /*
   * 11 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.reset()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - true
   * Goal 3. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I36 Branch 2 IFNONNULL L99 - true
   * Goal 4. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I4 Branch 3 IFEQ L134 - true
   * Goal 5. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I28 Branch 4 IFNE L139 - true
   * Goal 6. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I28 Branch 4 IFNE L139 - false
   * Goal 7. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I38 Branch 5 IF_ICMPNE L144 - true
   * Goal 8. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I4 Branch 6 IFNE L166 - true
   * Goal 9. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I14 Branch 7 IF_ICMPNE L171 - false
   * Goal 10. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I25 Branch 8 IF_ICMPNE L173 - true
   * Goal 11. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I86 Branch 12 IF_ICMPEQ L191 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Logger logger0 = Category.exists("");
      Level level0 = Level.ALL;
      LoggingOutputStream loggingOutputStream0 = null;
      try {
        loggingOutputStream0 = new LoggingOutputStream((Category) logger0, (Priority) level0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cat == null
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.LoggingOutputStream", e);
      }
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Level level0 = (Level)Priority.FATAL;
      LoggingOutputStream loggingOutputStream0 = null;
      try {
        loggingOutputStream0 = new LoggingOutputStream((Category) null, (Priority) level0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cat == null
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.LoggingOutputStream", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - true
   * Goal 2. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I36 Branch 2 IFNONNULL L99 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Logger logger0 = (Logger)Category.getInstance("");
      LoggingOutputStream loggingOutputStream0 = null;
      try {
        loggingOutputStream0 = new LoggingOutputStream((Category) logger0, (Priority) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // priority == null
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.LoggingOutputStream", e);
      }
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - true
   * Goal 2. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I36 Branch 2 IFNONNULL L99 - true
   * Goal 3. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I4 Branch 3 IFEQ L134 - true
   * Goal 4. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I28 Branch 4 IFNE L139 - true
   * Goal 5. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I38 Branch 5 IF_ICMPNE L144 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      RootCategory rootCategory0 = (RootCategory)Category.getRoot();
      Level level0 = Level.FATAL;
      LoggingOutputStream loggingOutputStream0 = new LoggingOutputStream((Category) rootCategory0, (Priority) level0);
      loggingOutputStream0.count = 2048;
      loggingOutputStream0.write(1030);
      assertEquals(2048, LoggingOutputStream.DEFAULT_BUFFER_LENGTH);
  }

  //Test case number: 5
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.reset()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - true
   * Goal 3. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I36 Branch 2 IFNONNULL L99 - true
   * Goal 4. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I4 Branch 3 IFEQ L134 - true
   * Goal 5. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I28 Branch 4 IFNE L139 - true
   * Goal 6. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I38 Branch 5 IF_ICMPNE L144 - true
   * Goal 7. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I4 Branch 6 IFNE L166 - true
   * Goal 8. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I14 Branch 7 IF_ICMPNE L171 - false
   * Goal 9. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I25 Branch 8 IF_ICMPNE L173 - false
   * Goal 10. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I29 Branch 9 IF_ICMPEQ L173 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      RootCategory rootCategory0 = (RootCategory)Logger.getRootLogger();
      Level level0 = Level.WARN;
      LoggingOutputStream loggingOutputStream0 = new LoggingOutputStream((Category) rootCategory0, (Priority) level0);
      loggingOutputStream0.write((int) (byte)10);
      loggingOutputStream0.flush();
      assertEquals(2048, LoggingOutputStream.DEFAULT_BUFFER_LENGTH);
  }

  //Test case number: 6
  /*
   * 11 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.LoggingOutputStream.reset()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I12 Branch 1 IFNONNULL L95 - true
   * Goal 3. org.objectweb.cjdbc.common.util.LoggingOutputStream.<init>(Lorg/apache/log4j/Category;Lorg/apache/log4j/Priority;)V: I36 Branch 2 IFNONNULL L99 - true
   * Goal 4. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I4 Branch 3 IFEQ L134 - true
   * Goal 5. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I28 Branch 4 IFNE L139 - true
   * Goal 6. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I28 Branch 4 IFNE L139 - false
   * Goal 7. org.objectweb.cjdbc.common.util.LoggingOutputStream.write(I)V: I38 Branch 5 IF_ICMPNE L144 - true
   * Goal 8. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I4 Branch 6 IFNE L166 - true
   * Goal 9. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I14 Branch 7 IF_ICMPNE L171 - true
   * Goal 10. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I86 Branch 12 IF_ICMPEQ L191 - true
   * Goal 11. org.objectweb.cjdbc.common.util.LoggingOutputStream.flush()V: I86 Branch 12 IF_ICMPEQ L191 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      Logger logger0 = Category.exists("");
      Level level0 = Level.ALL;
      LoggingOutputStream loggingOutputStream0 = null;
      try {
        loggingOutputStream0 = new LoggingOutputStream((Category) logger0, (Priority) level0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cat == null
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.LoggingOutputStream", e);
      }
  }
}
