/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:22:02 GMT 2016
 */

package org.objectweb.cjdbc.common.util;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.EOFException;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.util.Zipper;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Zipper_ESTest extends Zipper_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      Zipper zipper0 = new Zipper();
      assertEquals(1, Zipper.STORE_NAME_ONLY_IN_ZIP);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - true
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      try { 
        Zipper.zip((String) null, ".cFxM", 0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid arguments to create zip file
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.Zipper", e);
      }
  }

  //Test case number: 2
  /*
   * 13 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - false
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I31 Branch 10 IF_ICMPNE L173 - false
   * Goal 5. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - false
   * Goal 6. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I52 Branch 12 IFEQ L180 - true
   * Goal 7. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I70 Branch 13 IFEQ L184 - false
   * Goal 8. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 16 TABLESWITCH L217 Case 0 - false
   * Goal 9. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 17 TABLESWITCH L217 Case 1 - true
   * Goal 10. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 18 TABLESWITCH L217 Case 2 - false
   * Goal 11. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 19 TABLESWITCH L217 Case 3 - false
   * Goal 12. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 20 TABLESWITCH L217 Default-Case - false
   * Goal 13. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I129 Branch 21 IFEQ L242 - true
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      try { 
        Zipper.zip("_", "", 1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         assertThrownBy("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - false
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      try { 
        Zipper.zip("\"gW#2Z!JBB$u!N", (String) null, 2);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Invalid arguments to create zip file
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.Zipper", e);
      }
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I24 Branch 3 IFNE L111 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I34 Branch 4 IFNE L113 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 5 IFNE L117 - false
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      try { 
        Zipper.unzip("F~%.X6VhWRE6NY/l", "org.objectweb.cjdbc.common.util.Zipper");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // zip.invalid.source.file
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.Zipper", e);
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I24 Branch 3 IFNE L111 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I34 Branch 4 IFNE L113 - false
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      try { 
        Zipper.unzip("log4j:WARN ", "log4j:WARN ");
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // zip.invalid.target.directory
         //
         assertThrownBy("org.objectweb.cjdbc.common.util.Zipper", e);
      }
  }

  //Test case number: 6
  /*
   * 21 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I24 Branch 3 IFNE L111 - true
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I34 Branch 4 IFNE L113 - true
   * Goal 5. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 5 IFNE L117 - true
   * Goal 6. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I142 Branch 6 IFNULL L128 - false
   * Goal 7. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I191 Branch 7 IFEQ L135 - true
   * Goal 8. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - false
   * Goal 9. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I31 Branch 10 IF_ICMPNE L173 - false
   * Goal 10. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - true
   * Goal 11. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - false
   * Goal 12. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I52 Branch 12 IFEQ L180 - true
   * Goal 13. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I70 Branch 13 IFEQ L184 - false
   * Goal 14. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 16 TABLESWITCH L217 Case 0 - false
   * Goal 15. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 17 TABLESWITCH L217 Case 1 - false
   * Goal 16. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 18 TABLESWITCH L217 Case 2 - false
   * Goal 17. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 19 TABLESWITCH L217 Case 3 - true
   * Goal 18. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 20 TABLESWITCH L217 Default-Case - false
   * Goal 19. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I129 Branch 21 IFEQ L242 - true
   * Goal 20. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I201 Branch 22 IF_ICMPLE L254 - true
   * Goal 21. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I201 Branch 22 IF_ICMPLE L254 - false
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      Zipper.zip("_U", "", 3);
      try { 
        Zipper.unzip("_U", "");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // Unexpected end of ZLIB input stream
         //
         assertThrownBy("java.util.zip.InflaterInputStream", e);
      }
  }

  //Test case number: 7
  /*
   * 25 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I24 Branch 3 IFNE L111 - false
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I34 Branch 4 IFNE L113 - true
   * Goal 5. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I80 Branch 5 IFNE L117 - true
   * Goal 6. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I142 Branch 6 IFNULL L128 - true
   * Goal 7. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I142 Branch 6 IFNULL L128 - false
   * Goal 8. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I191 Branch 7 IFEQ L135 - true
   * Goal 9. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I249 Branch 8 IF_ICMPEQ L141 - true
   * Goal 10. org.objectweb.cjdbc.common.util.Zipper.unzip(Ljava/lang/String;Ljava/lang/String;)V: I249 Branch 8 IF_ICMPEQ L141 - false
   * Goal 11. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - false
   * Goal 12. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I31 Branch 10 IF_ICMPNE L173 - false
   * Goal 13. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - true
   * Goal 14. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - false
   * Goal 15. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I52 Branch 12 IFEQ L180 - true
   * Goal 16. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I52 Branch 12 IFEQ L180 - false
   * Goal 17. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I70 Branch 13 IFEQ L184 - false
   * Goal 18. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 16 TABLESWITCH L217 Case 0 - true
   * Goal 19. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 17 TABLESWITCH L217 Case 1 - false
   * Goal 20. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 18 TABLESWITCH L217 Case 2 - false
   * Goal 21. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 19 TABLESWITCH L217 Case 3 - false
   * Goal 22. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 20 TABLESWITCH L217 Default-Case - false
   * Goal 23. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I129 Branch 21 IFEQ L242 - true
   * Goal 24. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I201 Branch 22 IF_ICMPLE L254 - true
   * Goal 25. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I201 Branch 22 IF_ICMPLE L254 - false
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      Zipper.zip("F~%.X6VhWRE6NY/l", "", 0);
      Zipper.unzip("F~%.X6VhWRE6NY/l", "org.objectweb.cjdbc.common.util.Zipper");
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - true
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I104 Branch 15 IFEQ L198 - true
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      Zipper.zip("\"gW#2Z!JBB$u!N", ".layout", 2868);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - false
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I31 Branch 10 IF_ICMPNE L173 - true
   * Goal 5. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I91 Branch 14 IFEQ L192 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      Zipper.zip("O!", "O!", 71);
  }

  //Test case number: 10
  /*
   * 16 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - false
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I31 Branch 10 IF_ICMPNE L173 - false
   * Goal 5. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - true
   * Goal 6. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - false
   * Goal 7. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I52 Branch 12 IFEQ L180 - true
   * Goal 8. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I70 Branch 13 IFEQ L184 - false
   * Goal 9. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 16 TABLESWITCH L217 Case 0 - false
   * Goal 10. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 17 TABLESWITCH L217 Case 1 - false
   * Goal 11. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 18 TABLESWITCH L217 Case 2 - true
   * Goal 12. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 19 TABLESWITCH L217 Case 3 - false
   * Goal 13. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 20 TABLESWITCH L217 Default-Case - false
   * Goal 14. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I129 Branch 21 IFEQ L242 - true
   * Goal 15. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I201 Branch 22 IF_ICMPLE L254 - true
   * Goal 16. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I201 Branch 22 IF_ICMPLE L254 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      Zipper.zip("_U", "", 2);
  }

  //Test case number: 11
  /*
   * 13 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I3 Branch 1 IFNULL L80 - false
   * Goal 2. org.objectweb.cjdbc.common.util.Zipper.zip(Ljava/lang/String;Ljava/lang/String;I)V: I5 Branch 2 IFNONNULL L80 - true
   * Goal 3. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I25 Branch 9 IF_ICMPNE L171 - false
   * Goal 4. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I31 Branch 10 IF_ICMPNE L173 - false
   * Goal 5. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I45 Branch 11 IF_ICMPGE L178 - false
   * Goal 6. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I52 Branch 12 IFEQ L180 - true
   * Goal 7. org.objectweb.cjdbc.common.util.Zipper.directoryWalker(Ljava/lang/String;Ljava/lang/String;Ljava/util/zip/ZipOutputStream;I)V: I70 Branch 13 IFEQ L184 - false
   * Goal 8. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 16 TABLESWITCH L217 Case 0 - false
   * Goal 9. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 17 TABLESWITCH L217 Case 1 - false
   * Goal 10. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 18 TABLESWITCH L217 Case 2 - false
   * Goal 11. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 19 TABLESWITCH L217 Case 3 - false
   * Goal 12. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I27 Branch 20 TABLESWITCH L217 Default-Case - true
   * Goal 13. org.objectweb.cjdbc.common.util.Zipper.zipFile(Ljava/lang/String;Ljava/util/zip/ZipOutputStream;ILjava/lang/String;)V: I129 Branch 21 IFEQ L242 - true
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      try { 
        Zipper.zip("1", "", (-1298));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Error in writing to file
         //
         assertThrownBy("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }
}
