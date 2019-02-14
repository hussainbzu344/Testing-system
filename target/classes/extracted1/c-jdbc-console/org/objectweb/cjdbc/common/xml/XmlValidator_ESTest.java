/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:58:18 GMT 2016
 */

package org.objectweb.cjdbc.common.xml;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.xml.XmlValidator;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;
import org.xml.sax.ext.Locator2Impl;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class XmlValidator_ESTest extends XmlValidator_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.error(Lorg/xml/sax/SAXParseException;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("", ">.ca2WB'D");
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException(">.ca2WB'D", (Locator) locator2Impl0);
      xmlValidator0.error(sAXParseException0);
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.fatalError(Lorg/xml/sax/SAXParseException;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("^R", "^R");
      SAXParseException sAXParseException0 = new SAXParseException("#getXMLSchemaType() :", "^R", "_m%~f70:5X3x(_UuERc", 0, 0);
      xmlValidator0.fatalError(sAXParseException0);
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 2
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.setXmlValid(Z)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlValidator.isValid()Z: I4 Branch 17 IFEQ L290 - false
   * Goal 6. org.objectweb.cjdbc.common.xml.XmlValidator.isValid()Z: I7 Branch 18 IFEQ L290 - true
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "wchUc~a9>l'Uuo`$e");
      assertFalse(xmlValidator0.isXmlValid());
      
      xmlValidator0.setXmlValid(true);
      boolean boolean0 = xmlValidator0.isValid();
      assertTrue(xmlValidator0.isXmlValid());
      assertFalse(boolean0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.startDTD(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "wchUc~a9>l'Uuo`$e");
      xmlValidator0.startDTD("%Y-%M-%DT%h:%m:%s%z", (String) null, "wchUc~a9>l'Uuo`$e");
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.comment([CII)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("r$,vzGLM>s;L\"'{r$B", "r$,vzGLM>s;L\"'{r$B");
      xmlValidator0.comment((char[]) null, (-1702), (-300));
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }

  //Test case number: 5
  /*
   * 18 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.getExceptions()Ljava/util/ArrayList;: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.isDtdValid()Z: root-Branch
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I5 Branch 1 IF_ICMPLT L74 - false
   * Goal 6. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I9 Branch 2 IF_ICMPLE L74 - true
   * Goal 7. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I42 Branch 3 IF_ICMPNE L82 - false
   * Goal 8. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I153 Branch 4 IFNE L99 - true
   * Goal 9. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I175 Branch 5 IFNE L104 - true
   * Goal 10. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I240 Branch 6 IFNE L118 - false
   * Goal 11. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I272 Branch 9 IFNULL L125 - false
   * Goal 12. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I286 Branch 10 IF_ICMPGE L128 - true
   * Goal 13. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I286 Branch 10 IF_ICMPGE L128 - false
   * Goal 14. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/io/FileReader;)V: I35 Branch 11 IFNULL L157 - true
   * Goal 15. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/io/FileReader;)V: I35 Branch 11 IFNULL L157 - false
   * Goal 16. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/io/FileReader;)V: I46 Branch 12 IFNONNULL L160 - true
   * Goal 17. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/io/FileReader;)V: I46 Branch 12 IFNONNULL L160 - false
   * Goal 18. org.objectweb.cjdbc.common.xml.XmlValidator.getLastException()Ljava/lang/Exception;: I5 Branch 19 IFNE L300 - true
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/li/Projects/phd/corpus-x/data/qualitas_corpus_20130901/c_jdbc-2.0.2/.xcorpus/build/main/c-jdbc-console");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = "";
      stringArray0[1] = "";
      XmlValidator.main(stringArray0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.endCDATA()V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("Cannot find specified dtd", "");
      xmlValidator0.endCDATA();
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.startEntity(Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "wchUc~a9>l'Uuo`$e");
      xmlValidator0.startEntity("3");
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.getWarnings()Ljava/util/ArrayList;: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "wchUc~a9>l'Uuo`$e");
      xmlValidator0.getWarnings();
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.endEntity(Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("", "");
      xmlValidator0.endEntity("FieldCannotBeNull");
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.startCDATA()V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "wchUc~a9>l'Uuo`$e");
      xmlValidator0.startCDATA();
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 11
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.setXmlValid(Z)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.setDtdValid(Z)V: root-Branch
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 6. org.objectweb.cjdbc.common.xml.XmlValidator.isValid()Z: I4 Branch 17 IFEQ L290 - false
   * Goal 7. org.objectweb.cjdbc.common.xml.XmlValidator.isValid()Z: I7 Branch 18 IFEQ L290 - false
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "WU%");
      xmlValidator0.setDtdValid(true);
      xmlValidator0.setXmlValid(true);
      boolean boolean0 = xmlValidator0.isValid();
      assertTrue(boolean0);
  }

  //Test case number: 12
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.getXmlContent()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "wchUc~a9>l'Uuo`$e");
      xmlValidator0.getXmlContent();
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }

  //Test case number: 13
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.warning(Lorg/xml/sax/SAXParseException;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("", "I-'V");
      Locator2Impl locator2Impl0 = new Locator2Impl();
      SAXParseException sAXParseException0 = new SAXParseException("", (Locator) locator2Impl0, (Exception) null);
      xmlValidator0.warning(sAXParseException0);
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 14
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.isXmlValid()Z: root-Branch
   */

	@Test(timeout=300000)
  public void test14()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("", "");
      boolean boolean0 = xmlValidator0.isXmlValid();
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I5 Branch 1 IF_ICMPLT L74 - true
   */

	@Test(timeout=300000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[0];
      // Undeclared exception!
      try { 
        XmlValidator.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I5 Branch 1 IF_ICMPLT L74 - false
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I9 Branch 2 IF_ICMPLE L74 - false
   */

	@Test(timeout=300000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        XmlValidator.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  //Test case number: 17
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I5 Branch 1 IF_ICMPLT L74 - false
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I9 Branch 2 IF_ICMPLE L74 - true
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I42 Branch 3 IF_ICMPNE L82 - true
   */

	@Test(timeout=300000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      try { 
        XmlValidator.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I5 Branch 1 IF_ICMPLT L74 - false
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I9 Branch 2 IF_ICMPLE L74 - true
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I42 Branch 3 IF_ICMPNE L82 - false
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I153 Branch 4 IFNE L99 - false
   */

	@Test(timeout=300000)
  public void test18()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "^R";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        XmlValidator.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  //Test case number: 19
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I5 Branch 1 IF_ICMPLT L74 - false
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I9 Branch 2 IF_ICMPLE L74 - true
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I42 Branch 3 IF_ICMPNE L82 - false
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I153 Branch 4 IFNE L99 - true
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlValidator.main([Ljava/lang/String;)V: I175 Branch 5 IFNE L104 - false
   */

	@Test(timeout=300000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[2];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/li/Projects/phd/corpus-x/data/qualitas_corpus_20130901/c_jdbc-2.0.2/.xcorpus/build/main/c-jdbc-console");
      byte[] byteArray0 = new byte[3];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      stringArray0[0] = " with dtd:";
      stringArray0[1] = "";
      // Undeclared exception!
      try { 
        XmlValidator.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.evosuite.runtime.System", e);
      }
  }

  //Test case number: 20
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I25 Branch 13 IFEQ L227 - true
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I60 Branch 14 IFNONNULL L239 - false
   * Goal 6. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I83 Branch 15 IFNONNULL L241 - false
   */

	@Test(timeout=300000)
  public void test20()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("?>", "?>");
      try { 
        xmlValidator0.resolveEntity((String) null, "");
        fail("Expecting exception: SAXException");
      
      } catch(SAXException e) {
         //
         // virtualdatabase.xml.dtd.not.found
         //
         assertThrownBy("org.objectweb.cjdbc.common.xml.XmlValidator", e);
      }
  }

  //Test case number: 21
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I25 Branch 13 IFEQ L227 - false
   * Goal 5. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I60 Branch 14 IFNONNULL L239 - true
   * Goal 6. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I60 Branch 14 IFNONNULL L239 - false
   * Goal 7. org.objectweb.cjdbc.common.xml.XmlValidator.resolveEntity(Ljava/lang/String;Ljava/lang/String;)Lorg/xml/sax/InputSource;: I83 Branch 15 IFNONNULL L241 - true
   */

	@Test(timeout=300000)
  public void test21()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("", "");
      xmlValidator0.resolveEntity("FieldCannotBeNull", "");
      xmlValidator0.resolveEntity("", "FieldCannotBeNull");
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(xmlValidator0.isXmlValid());
  }

  //Test case number: 22
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.endDocument()V: I5 Branch 16 IFNE L281 - true
   */

	@Test(timeout=300000)
  public void test22()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("r$,vzGLM>s;L\"'{r$B", "r$,vzGLM>s;L\"'{r$B");
      xmlValidator0.endDocument();
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }

  //Test case number: 23
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.isValid()Z: I4 Branch 17 IFEQ L290 - true
   */

	@Test(timeout=300000)
  public void test23()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("", ">.ca2WB'D");
      boolean boolean0 = xmlValidator0.isValid();
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
      assertFalse(boolean0);
  }

  //Test case number: 24
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.xml.XmlValidator.addError(Ljava/lang/Exception;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.xml.XmlValidator.validate(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.xml.XmlValidator.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.xml.XmlValidator.endDTD()V: I5 Branch 20 IFNE L335 - true
   */

	@Test(timeout=300000)
  public void test24()  throws Throwable  {
      XmlValidator xmlValidator0 = new XmlValidator("KM~~%du=yzss", "WU%");
      xmlValidator0.endDTD();
      assertFalse(xmlValidator0.isXmlValid());
      assertFalse(xmlValidator0.isDtdValid());
  }
}
