/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 16:03:34 GMT 2016
 */

package org.objectweb.cjdbc.common.xml;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.xml.XmlTools;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XmlTools_ESTest extends XmlTools_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.prettyXml(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I9 Branch 1 IFNONNULL L87 - true
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I9 Branch 1 IFNONNULL L87 - false
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I19 Branch 2 IFNONNULL L89 - true
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I118 Branch 4 IFEQ L103 - true
   * Goal 6. org.objectweb.cjdbc.common.xml.XmlTools.internationalizeXsl(Ljava/io/File;)Ljava/io/File;: I56 Branch 5 IFNE L124 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      XmlTools.prettyXml("");
      String string0 = XmlTools.applyXsl("", "");
      assertEquals("controller.xml.transformation.failed", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      XmlTools xmlTools0 = new XmlTools();
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I9 Branch 1 IFNONNULL L87 - false
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I19 Branch 2 IFNONNULL L89 - true
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I67 Branch 3 IFEQ L91 - true
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlTools.applyXsl(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I118 Branch 4 IFEQ L103 - true
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlTools.internationalizeXsl(Ljava/io/File;)Ljava/io/File;: I56 Branch 5 IFNE L124 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/li/Projects/phd/corpus-x/data/qualitas_corpus_20130901/c_jdbc-2.0.2/_en.xcorpus/build/main/c-jdbc-console");
      FileSystemHandling.createFolder(evoSuiteFile0);
      String string0 = XmlTools.applyXsl("", "");
      assertEquals("controller.xml.transformation.failed", string0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.insertCjdbcDoctype(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 8 IFGE L183 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        XmlTools.insertCjdbcDoctype("?>");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.insertCjdbcDoctype(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 8 IFGE L183 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String string0 = XmlTools.insertCjdbcDoctype("E9zF");
      assertEquals("E9zF", string0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.insertCjdbcControllerDoctype(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 9 IFGE L215 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        XmlTools.insertCjdbcControllerDoctype("?>");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlTools.insertCjdbcControllerDoctype(Ljava/lang/String;)Ljava/lang/String;: I9 Branch 9 IFGE L215 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      String string0 = XmlTools.insertCjdbcControllerDoctype("zbx9$e#^o#Z$Mt9~b");
      assertEquals("zbx9$e#^o#Z$Mt9~b", string0);
  }
}
