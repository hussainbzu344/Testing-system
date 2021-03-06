/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:33:39 GMT 2016
 */

package org.objectweb.cjdbc.console.views;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.views.BackendViewer;
import org.objectweb.cjdbc.console.views.CacheViewer;
import org.objectweb.cjdbc.console.views.ClientsViewer;
import org.objectweb.cjdbc.console.views.ControllerLoadViewer;
import org.objectweb.cjdbc.console.views.InfoViewer;
import org.objectweb.cjdbc.console.views.RecoveryLogViewer;
import org.objectweb.cjdbc.console.views.SQLStatViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class InfoViewer_ESTest extends InfoViewer_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer$1.<init>(Lorg/objectweb/cjdbc/console/views/InfoViewer;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.display()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - true
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      ClientsViewer clientsViewer0 = new ClientsViewer((Object[][]) null);
      clientsViewer0.display();
      assertNull(clientsViewer0.getFrameTitle());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer$ExportAction.<init>(Lorg/objectweb/cjdbc/console/views/InfoViewer;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][7];
      CacheViewer cacheViewer0 = new CacheViewer(objectArray0);
      InfoViewer.ExportAction infoViewer_ExportAction0 = cacheViewer0.new ExportAction();
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.getFrameTitle()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - true
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      RecoveryLogViewer recoveryLogViewer0 = new RecoveryLogViewer((Object[][]) null);
      String string0 = recoveryLogViewer0.getFrameTitle();
      assertNull(string0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.getTraceableColumns()[I: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][1];
      CacheViewer cacheViewer0 = new CacheViewer(objectArray0);
      int[] intArray0 = cacheViewer0.getTraceableColumns();
      assertArrayEquals(new int[] {}, intArray0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/Object;)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - true
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      ControllerLoadViewer controllerLoadViewer0 = new ControllerLoadViewer((Object[][]) null);
      // Undeclared exception!
      try { 
        controllerLoadViewer0.displayText((Object[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.views.ControllerLoadViewer", e);
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.getData()[[Ljava/lang/Object;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - true
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      ControllerLoadViewer controllerLoadViewer0 = new ControllerLoadViewer((Object[][]) null);
      Object[][] objectArray0 = controllerLoadViewer0.getData();
      assertNull(objectArray0);
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.setData([[Ljava/lang/Object;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.<init>(Lorg/objectweb/cjdbc/console/views/InfoViewer;[[Ljava/lang/Object;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - true
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      RecoveryLogViewer recoveryLogViewer0 = new RecoveryLogViewer((Object[][]) null);
      InfoViewer.InfoTableModel infoViewer_InfoTableModel0 = recoveryLogViewer0.new InfoTableModel((Object[][]) null);
      infoViewer_InfoTableModel0.setData((Object[][]) null);
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.<init>(Lorg/objectweb/cjdbc/console/views/InfoViewer;[[Ljava/lang/Object;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.getValueAt(II)Ljava/lang/Object;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.getColumnClass(I)Ljava/lang/Class;: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][5];
      SQLStatViewer sQLStatViewer0 = new SQLStatViewer(objectArray0);
      InfoViewer.InfoTableModel infoViewer_InfoTableModel0 = sQLStatViewer0.new InfoTableModel(objectArray0);
      // Undeclared exception!
      try { 
        infoViewer_InfoTableModel0.getColumnClass(2606);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         assertThrownBy("org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel", e);
      }
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.<init>(Lorg/objectweb/cjdbc/console/views/InfoViewer;[[Ljava/lang/Object;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.isCellEditable(II)Z: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][8];
      RecoveryLogViewer recoveryLogViewer0 = new RecoveryLogViewer(objectArray0);
      Object[][] objectArray1 = recoveryLogViewer0.getDataTypes(objectArray0);
      ControllerLoadViewer controllerLoadViewer0 = new ControllerLoadViewer(objectArray1);
      InfoViewer.InfoTableModel infoViewer_InfoTableModel0 = controllerLoadViewer0.new InfoTableModel(objectArray1);
      boolean boolean0 = infoViewer_InfoTableModel0.isCellEditable(9, 64);
      assertFalse(boolean0);
  }

  //Test case number: 9
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.<init>(Lorg/objectweb/cjdbc/console/views/InfoViewer;[[Ljava/lang/Object;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.getColumnName(I)Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.getColumnCount()I: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel.getRowCount()I: root-Branch
   * Goal 5. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   * Goal 6. org.objectweb.cjdbc.console.views.InfoViewer.updateData([[Ljava/lang/Object;)V: I11 Branch 6 IFNULL L130 - true
   * Goal 7. org.objectweb.cjdbc.console.views.InfoViewer.createAndShowGUI()V: I71 Branch 7 IF_ICMPGE L157 - true
   * Goal 8. org.objectweb.cjdbc.console.views.InfoViewer.createAndShowGUI()V: I71 Branch 7 IF_ICMPGE L157 - false
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][9];
      SQLStatViewer sQLStatViewer0 = new SQLStatViewer(objectArray0);
      // Undeclared exception!
      try { 
        sQLStatViewer0.updateData(objectArray0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I3 Branch 8 IFNONNULL L203 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][7];
      CacheViewer cacheViewer0 = new CacheViewer(objectArray0);
      String string0 = cacheViewer0.displayText((String[][]) null);
      assertEquals("", string0);
  }

  //Test case number: 11
  /*
   * 16 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - true
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I3 Branch 8 IFNONNULL L203 - true
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I33 Branch 9 IF_ICMPGE L220 - true
   * Goal 4. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I33 Branch 9 IF_ICMPGE L220 - false
   * Goal 5. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 10 IF_ICMPGE L228 - true
   * Goal 6. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 10 IF_ICMPGE L228 - false
   * Goal 7. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I70 Branch 11 IF_ICMPGE L230 - true
   * Goal 8. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I70 Branch 11 IF_ICMPGE L230 - false
   * Goal 9. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I113 Branch 12 IF_ICMPGE L243 - true
   * Goal 10. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I113 Branch 12 IF_ICMPGE L243 - false
   * Goal 11. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I147 Branch 13 IF_ICMPGE L251 - true
   * Goal 12. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I147 Branch 13 IF_ICMPGE L251 - false
   * Goal 13. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I164 Branch 14 IF_ICMPGE L254 - true
   * Goal 14. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I164 Branch 14 IF_ICMPGE L254 - false
   * Goal 15. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I183 Branch 15 IF_ICMPGE L259 - true
   * Goal 16. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I247 Branch 16 IF_ICMPNE L271 - false
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      ControllerLoadViewer controllerLoadViewer0 = new ControllerLoadViewer((Object[][]) null);
      String[][] stringArray0 = new String[1][4];
      String[] stringArray1 = new String[4];
      stringArray1[0] = "";
      stringArray1[1] = "";
      stringArray1[2] = "v ET= oz";
      stringArray1[3] = "y}Xqbyed8X*";
      stringArray0[0] = stringArray1;
      String string0 = controllerLoadViewer0.displayText(stringArray0);
      assertEquals("--------------------------------------------------\n    console.infoviewer.load.column.0:  \n    console.infoviewer.load.column.1:  \n    console.infoviewer.load.column.2:  v ET= oz\n    console.infoviewer.load.column.3:  y}Xqbyed8X*\n--------------------------------------------------\n", string0);
  }

  //Test case number: 12
  /*
   * 18 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.InfoViewer.<init>([[Ljava/lang/Object;)V: I7 Branch 5 IFNULL L83 - false
   * Goal 2. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I3 Branch 8 IFNONNULL L203 - true
   * Goal 3. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I33 Branch 9 IF_ICMPGE L220 - true
   * Goal 4. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I33 Branch 9 IF_ICMPGE L220 - false
   * Goal 5. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 10 IF_ICMPGE L228 - true
   * Goal 6. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I59 Branch 10 IF_ICMPGE L228 - false
   * Goal 7. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I70 Branch 11 IF_ICMPGE L230 - true
   * Goal 8. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I70 Branch 11 IF_ICMPGE L230 - false
   * Goal 9. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I113 Branch 12 IF_ICMPGE L243 - true
   * Goal 10. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I113 Branch 12 IF_ICMPGE L243 - false
   * Goal 11. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I147 Branch 13 IF_ICMPGE L251 - true
   * Goal 12. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I147 Branch 13 IF_ICMPGE L251 - false
   * Goal 13. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I164 Branch 14 IF_ICMPGE L254 - true
   * Goal 14. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I164 Branch 14 IF_ICMPGE L254 - false
   * Goal 15. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I183 Branch 15 IF_ICMPGE L259 - true
   * Goal 16. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I183 Branch 15 IF_ICMPGE L259 - false
   * Goal 17. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I247 Branch 16 IF_ICMPNE L271 - true
   * Goal 18. org.objectweb.cjdbc.console.views.InfoViewer.displayText([[Ljava/lang/String;)Ljava/lang/String;: I247 Branch 16 IF_ICMPNE L271 - false
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][7];
      BackendViewer backendViewer0 = new BackendViewer(objectArray0);
      String[][] stringArray0 = new String[6][6];
      String[] stringArray1 = new String[9];
      stringArray1[0] = "org.objectweb.cjdbc.console.views.InfoViewer$InfoTableModel";
      stringArray1[1] = "JDBCCategoryDataset: cannot connect to the database.";
      stringArray1[2] = "V2DruiB^GHWq+2";
      stringArray1[3] = "";
      stringArray1[4] = " F|Z3v3";
      stringArray1[5] = "\n";
      stringArray1[6] = "3uMq+{e";
      stringArray1[7] = "64U";
      stringArray1[8] = "q/KD6J2";
      stringArray0[0] = stringArray1;
      stringArray0[1] = stringArray0[0];
      stringArray0[2] = stringArray0[0];
      stringArray0[3] = stringArray1;
      stringArray0[4] = stringArray0[0];
      stringArray0[5] = stringArray0[1];
      String string0 = backendViewer0.displayText(stringArray0);
      assertNotNull(string0);
  }
}
