/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 11:30:52 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.session;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.util.ArrayList;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.session.GuiSession;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GuiSession_ESTest extends GuiSession_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.getDatabaseItems()Ljava/util/Hashtable;: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      Hashtable hashtable0 = guiSession0.getDatabaseItems();
      assertTrue(hashtable0.isEmpty());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.getAuthenticatedDatabasePassword(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      String string0 = guiSession0.getAuthenticatedDatabasePassword("");
      assertNull(string0);
  }

  //Test case number: 2
  /*
   * 14 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.getConfigurationFiles()Ljava/util/ArrayList;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.saveSessionToFile(Ljava/io/File;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I4 Branch 1 IFEQ L94 - false
   * Goal 5. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - false
   * Goal 7. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I61 Branch 3 IFLE L105 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I61 Branch 3 IFLE L105 - false
   * Goal 9. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I76 Branch 4 IFLE L107 - true
   * Goal 10. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I92 Branch 5 IFLE L109 - false
   * Goal 11. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I6 Branch 6 IFLE L146 - true
   * Goal 12. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I12 Branch 7 IFNE L146 - false
   * Goal 13. org.objectweb.cjdbc.console.gui.session.GuiSession.addFileToConfigurationFiles(Ljava/io/File;)V: I6 Branch 9 IFLE L179 - true
   * Goal 14. org.objectweb.cjdbc.console.gui.session.GuiSession.addFileToConfigurationFiles(Ljava/io/File;)V: I12 Branch 10 IFNE L179 - false
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      ArrayList arrayList0 = guiSession0.getConfigurationFiles();
      guiSession0.controllerItems = arrayList0;
      guiSession0.addControllerToList("");
      MockFile mockFile0 = new MockFile("database");
      guiSession0.saveSessionToFile(mockFile0);
      guiSession0.loadSessionFromFile(mockFile0);
      assertEquals(115L, mockFile0.length());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.getAuthenticatedDatabaseLogin(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      String string0 = guiSession0.getAuthenticatedDatabaseLogin("### DATABASES           ###");
      assertNull(string0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.isAuthenticatedDatabase(Ljava/lang/String;)Z: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      boolean boolean0 = guiSession0.isAuthenticatedDatabase("javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ");
      assertFalse(boolean0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.getControllerItems()Ljava/util/ArrayList;: root-Branch
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      ArrayList arrayList0 = guiSession0.getControllerItems();
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I4 Branch 1 IFEQ L94 - true
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      MockFile mockFile0 = new MockFile("1");
      guiSession0.loadSessionFromFile(mockFile0);
      assertFalse(mockFile0.isDirectory());
  }

  //Test case number: 7
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.saveSessionToFile(Ljava/io/File;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I4 Branch 1 IFEQ L94 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - false
   * Goal 6. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I61 Branch 3 IFLE L105 - false
   * Goal 7. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I6 Branch 6 IFLE L146 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I12 Branch 7 IFNE L146 - false
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      guiSession0.addControllerToList("");
      MockFile mockFile0 = new MockFile("database");
      guiSession0.saveSessionToFile(mockFile0);
      guiSession0.loadSessionFromFile(mockFile0);
      assertEquals(98L, mockFile0.length());
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.addDatabaseToSession(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.saveSessionToFile(Ljava/io/File;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I4 Branch 1 IFEQ L94 - false
   * Goal 5. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - false
   * Goal 7. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I61 Branch 3 IFLE L105 - true
   * Goal 8. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I76 Branch 4 IFLE L107 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      MockFile mockFile0 = new MockFile("database.");
      guiSession0.addDatabaseToSession("", "database.", "");
      guiSession0.saveSessionToFile(mockFile0);
      guiSession0.loadSessionFromFile(mockFile0);
      assertEquals(134L, mockFile0.length());
  }

  //Test case number: 9
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I4 Branch 1 IFEQ L94 - false
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I41 Branch 2 IFEQ L101 - false
   * Goal 5. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I61 Branch 3 IFLE L105 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I76 Branch 4 IFLE L107 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.session.GuiSession.loadSessionFromFile(Ljava/io/File;)V: I92 Branch 5 IFLE L109 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      MockFile mockFile0 = new MockFile("database");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/li/Projects/phd/corpus-x/data/qualitas_corpus_20130901/c_jdbc-2.0.2/.xcorpus/database");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "javax.xml.datatype.Duration#isSet(DatatypeConstants.Field field) ");
      guiSession0.loadSessionFromFile(mockFile0);
      assertTrue(mockFile0.canExecute());
  }

  //Test case number: 10
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I6 Branch 6 IFLE L146 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I6 Branch 6 IFLE L146 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I12 Branch 7 IFNE L146 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I12 Branch 7 IFNE L146 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      guiSession0.addControllerToList("--%M--%z");
      guiSession0.addControllerToList("--%M--%z");
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.checkControllerInSession(Ljava/lang/String;)Z: I6 Branch 8 IFLE L158 - true
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      boolean boolean0 = guiSession0.checkControllerInSession("");
      assertFalse(boolean0);
  }

  //Test case number: 12
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I6 Branch 6 IFLE L146 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.addControllerToList(Ljava/lang/String;)V: I12 Branch 7 IFNE L146 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.checkControllerInSession(Ljava/lang/String;)Z: I6 Branch 8 IFLE L158 - false
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      guiSession0.addControllerToList("");
      boolean boolean0 = guiSession0.checkControllerInSession("");
      assertTrue(boolean0);
  }

  //Test case number: 13
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.session.GuiSession.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.session.GuiSession.addFileToConfigurationFiles(Ljava/io/File;)V: I6 Branch 9 IFLE L179 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.session.GuiSession.addFileToConfigurationFiles(Ljava/io/File;)V: I6 Branch 9 IFLE L179 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.session.GuiSession.addFileToConfigurationFiles(Ljava/io/File;)V: I12 Branch 10 IFNE L179 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.session.GuiSession.addFileToConfigurationFiles(Ljava/io/File;)V: I12 Branch 10 IFNE L179 - false
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      GuiSession guiSession0 = new GuiSession();
      MockFile mockFile0 = new MockFile("p=t", "\"q+&Q");
      guiSession0.addFileToConfigurationFiles(mockFile0);
      guiSession0.addFileToConfigurationFiles(mockFile0);
      assertTrue(mockFile0.isFile());
  }
}
