/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:05:16 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.model;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import javax.management.MBeanOperationInfo;
import javax.management.MBeanParameterInfo;
import javax.swing.JTable;
import javax.swing.table.TableColumnModel;
import javax.swing.table.TableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.model.OperationModel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class OperationModel_ESTest extends OperationModel_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.isCellEditable(II)Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[0];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      boolean boolean0 = operationModel0.isCellEditable(66, 66);
      assertFalse(boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.getRowCount()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[0];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      int int0 = operationModel0.getRowCount();
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnCount()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 9 LOOKUPSWITCH L120 Case 0 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 9 LOOKUPSWITCH L120 Case 0 - false
   * Goal 5. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 10 LOOKUPSWITCH L120 Case 1 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 10 LOOKUPSWITCH L120 Case 1 - false
   * Goal 7. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 11 LOOKUPSWITCH L120 Default-Case - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[0];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      JTable jTable0 = new JTable((TableModel) operationModel0, (TableColumnModel) null);
      assertEquals(2, operationModel0.getColumnCount());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.getInfo()[Ljavax/management/MBeanOperationInfo;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[0];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      MBeanOperationInfo[] mBeanOperationInfoArray1 = operationModel0.getInfo();
      assertSame(mBeanOperationInfoArray0, mBeanOperationInfoArray1);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I3 Branch 1 IFLT L92 - true
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I14 Branch 3 IFNE L92 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      OperationModel operationModel0 = new OperationModel((MBeanOperationInfo[]) null);
      Object object0 = operationModel0.getValueAt((-1788), (-1788));
      assertNull(object0);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I3 Branch 1 IFLT L92 - false
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I8 Branch 2 IF_ICMPGE L92 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I14 Branch 3 IFNE L92 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[5];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      String string0 = (String)operationModel0.getValueAt(72, 72);
      assertNull(string0);
  }

  //Test case number: 6
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I3 Branch 1 IFLT L92 - false
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I8 Branch 2 IF_ICMPGE L92 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I14 Branch 3 IFNE L92 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 4 LOOKUPSWITCH L94 Case 0 - false
   * Goal 6. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 5 LOOKUPSWITCH L94 Case 1 - false
   * Goal 7. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 6 LOOKUPSWITCH L94 Default-Case - true
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[3];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      Object object0 = operationModel0.getValueAt(0, 54);
      assertNull(object0);
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I3 Branch 1 IFLT L92 - false
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I8 Branch 2 IF_ICMPGE L92 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I14 Branch 3 IFNE L92 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 4 LOOKUPSWITCH L94 Case 0 - false
   * Goal 6. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 5 LOOKUPSWITCH L94 Case 1 - true
   * Goal 7. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 6 LOOKUPSWITCH L94 Default-Case - false
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[5];
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      // Undeclared exception!
      try { 
        operationModel0.getValueAt(0, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.model.OperationModel", e);
      }
  }

  //Test case number: 8
  /*
   * 11 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I3 Branch 1 IFLT L92 - false
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I8 Branch 2 IF_ICMPGE L92 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I14 Branch 3 IFNE L92 - true
   * Goal 5. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 4 LOOKUPSWITCH L94 Case 0 - true
   * Goal 6. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 5 LOOKUPSWITCH L94 Case 1 - false
   * Goal 7. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I22 Branch 6 LOOKUPSWITCH L94 Default-Case - false
   * Goal 8. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I56 Branch 7 IF_ICMPGE L100 - true
   * Goal 9. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I56 Branch 7 IF_ICMPGE L100 - false
   * Goal 10. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I60 Branch 8 IFEQ L102 - true
   * Goal 11. org.objectweb.cjdbc.console.gui.model.OperationModel.getValueAt(II)Ljava/lang/Object;: I60 Branch 8 IFEQ L102 - false
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      MBeanOperationInfo[] mBeanOperationInfoArray0 = new MBeanOperationInfo[1];
      MBeanParameterInfo[] mBeanParameterInfoArray0 = new MBeanParameterInfo[5];
      MBeanParameterInfo mBeanParameterInfo0 = new MBeanParameterInfo((String) null, "8m", "8m");
      mBeanParameterInfoArray0[0] = mBeanParameterInfo0;
      mBeanParameterInfoArray0[1] = mBeanParameterInfo0;
      mBeanParameterInfoArray0[2] = mBeanParameterInfo0;
      mBeanParameterInfoArray0[3] = mBeanParameterInfo0;
      mBeanParameterInfoArray0[4] = mBeanParameterInfo0;
      MBeanOperationInfo mBeanOperationInfo0 = new MBeanOperationInfo("inCt<D_KlY-`fS+U", "inCt<D_KlY-`fS+U", mBeanParameterInfoArray0, "set ", 2564);
      mBeanOperationInfoArray0[0] = mBeanOperationInfo0;
      OperationModel operationModel0 = new OperationModel(mBeanOperationInfoArray0);
      String string0 = (String)operationModel0.getValueAt(0, 0);
      assertEquals("inCt<D_KlY-`fS+U(8m,8m,8m,8m,8m)", string0);
      assertNotNull(string0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.model.OperationModel.<init>([Ljavax/management/MBeanOperationInfo;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 9 LOOKUPSWITCH L120 Case 0 - false
   * Goal 3. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 10 LOOKUPSWITCH L120 Case 1 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.model.OperationModel.getColumnName(I)Ljava/lang/String;: I3 Branch 11 LOOKUPSWITCH L120 Default-Case - true
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      OperationModel operationModel0 = new OperationModel((MBeanOperationInfo[]) null);
      String string0 = operationModel0.getColumnName(2);
      assertNull(string0);
  }
}
