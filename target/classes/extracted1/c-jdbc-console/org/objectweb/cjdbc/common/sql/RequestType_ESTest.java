/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:43:11 GMT 2016
 */

package org.objectweb.cjdbc.common.sql;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.RequestType;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.UnknownRequest;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RequestType_ESTest extends RequestType_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.getRequestType(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)I: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      UnknownRequest unknownRequest0 = new UnknownRequest("S<G7", false, 719, "S<G7");
      int int0 = RequestType.getRequestType(unknownRequest0);
      assertEquals(0, int0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.setRequestType(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      UnknownRequest unknownRequest0 = new UnknownRequest("S<G7", false, 719, "S<G7");
      RequestType.setRequestType(unknownRequest0, 719);
      assertTrue(unknownRequest0.isDDL());
      assertFalse(unknownRequest0.isDrop());
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      RequestType requestType0 = new RequestType();
      assertEquals(1, RequestType.UNCACHEABLE);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDDL(I)Z: I4 Branch 1 IF_ICMPGT L94 - true
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      boolean boolean0 = RequestType.isDDL(0);
      assertFalse(boolean0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDDL(I)Z: I4 Branch 1 IF_ICMPGT L94 - false
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      boolean boolean0 = RequestType.isDDL(2699);
      assertTrue(boolean0);
  }

  //Test case number: 5
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDML(I)Z: I4 Branch 2 IF_ICMPLT L110 - true
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      boolean boolean0 = RequestType.isDML(334);
      assertFalse(boolean0);
  }

  //Test case number: 6
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDML(I)Z: I4 Branch 2 IF_ICMPLT L110 - false
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      boolean boolean0 = RequestType.isDML(0);
      assertTrue(boolean0);
  }

  //Test case number: 7
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDelete(I)Z: I4 Branch 3 IF_ICMPNE L122 - true
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      boolean boolean0 = RequestType.isDelete(10);
      assertFalse(boolean0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDelete(I)Z: I4 Branch 3 IF_ICMPNE L122 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      boolean boolean0 = RequestType.isDelete(1);
      assertTrue(boolean0);
  }

  //Test case number: 9
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isInsert(I)Z: I4 Branch 4 IF_ICMPNE L134 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      boolean boolean0 = RequestType.isInsert(0);
      assertFalse(boolean0);
  }

  //Test case number: 10
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isInsert(I)Z: I4 Branch 4 IF_ICMPNE L134 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      boolean boolean0 = RequestType.isInsert(2);
      assertTrue(boolean0);
  }

  //Test case number: 11
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isUpdate(I)Z: I4 Branch 5 IF_ICMPNE L146 - true
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      boolean boolean0 = RequestType.isUpdate(334);
      assertFalse(boolean0);
  }

  //Test case number: 12
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isUpdate(I)Z: I4 Branch 5 IF_ICMPNE L146 - false
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      boolean boolean0 = RequestType.isUpdate(3);
      assertTrue(boolean0);
  }

  //Test case number: 13
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDrop(I)Z: I4 Branch 6 IF_ICMPNE L158 - true
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      boolean boolean0 = RequestType.isDrop(0);
      assertFalse(boolean0);
  }

  //Test case number: 14
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isDrop(I)Z: I4 Branch 6 IF_ICMPNE L158 - false
   */

	@Test(timeout=300000)
  public void test14()  throws Throwable  {
      boolean boolean0 = RequestType.isDrop(22);
      assertTrue(boolean0);
  }

  //Test case number: 15
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isCreate(I)Z: I4 Branch 7 IF_ICMPNE L170 - true
   */

	@Test(timeout=300000)
  public void test15()  throws Throwable  {
      boolean boolean0 = RequestType.isCreate(14);
      assertFalse(boolean0);
  }

  //Test case number: 16
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isCreate(I)Z: I4 Branch 7 IF_ICMPNE L170 - false
   */

	@Test(timeout=300000)
  public void test16()  throws Throwable  {
      boolean boolean0 = RequestType.isCreate(20);
      assertTrue(boolean0);
  }

  //Test case number: 17
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isAlter(I)Z: I4 Branch 8 IF_ICMPNE L182 - true
   */

	@Test(timeout=300000)
  public void test17()  throws Throwable  {
      boolean boolean0 = RequestType.isAlter(22);
      assertFalse(boolean0);
  }

  //Test case number: 18
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isAlter(I)Z: I4 Branch 8 IF_ICMPNE L182 - false
   */

	@Test(timeout=300000)
  public void test18()  throws Throwable  {
      boolean boolean0 = RequestType.isAlter(21);
      assertTrue(boolean0);
  }

  //Test case number: 19
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isSelect(I)Z: I4 Branch 9 IF_ICMPNE L194 - true
   */

	@Test(timeout=300000)
  public void test19()  throws Throwable  {
      boolean boolean0 = RequestType.isSelect(192);
      assertFalse(boolean0);
  }

  //Test case number: 20
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isSelect(I)Z: I4 Branch 9 IF_ICMPNE L194 - false
   */

	@Test(timeout=300000)
  public void test20()  throws Throwable  {
      boolean boolean0 = RequestType.isSelect(4);
      assertTrue(boolean0);
  }

  //Test case number: 21
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isStoredProcedure(I)Z: I4 Branch 10 IF_ICMPNE L206 - true
   */

	@Test(timeout=300000)
  public void test21()  throws Throwable  {
      boolean boolean0 = RequestType.isStoredProcedure(0);
      assertFalse(boolean0);
  }

  //Test case number: 22
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.isStoredProcedure(I)Z: I4 Branch 10 IF_ICMPNE L206 - false
   */

	@Test(timeout=300000)
  public void test22()  throws Throwable  {
      boolean boolean0 = RequestType.isStoredProcedure(10);
      assertTrue(boolean0);
  }

  //Test case number: 23
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L238 Case 0 - true
   * Goal 2. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L238 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L238 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L238 Default-Case - false
   */

	@Test(timeout=300000)
  public void test23()  throws Throwable  {
      String string0 = RequestType.getInformation(0);
      assertEquals("CACHEABLE", string0);
  }

  //Test case number: 24
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L238 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L238 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L238 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L238 Default-Case - true
   */

	@Test(timeout=300000)
  public void test24()  throws Throwable  {
      String string0 = RequestType.getInformation((-1296));
      assertEquals("Illegal request type", string0);
  }

  //Test case number: 25
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L238 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L238 Case 1 - true
   * Goal 3. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L238 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L238 Default-Case - false
   */

	@Test(timeout=300000)
  public void test25()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("S<G7", false, 719, (String) null);
      selectRequest0.debug();
      assertEquals(0, selectRequest0.getTransactionIsolation());
  }

  //Test case number: 26
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 11 TABLESWITCH L238 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 12 TABLESWITCH L238 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 13 TABLESWITCH L238 Case 2 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.RequestType.getInformation(I)Ljava/lang/String;: I3 Branch 14 TABLESWITCH L238 Default-Case - false
   */

	@Test(timeout=300000)
  public void test26()  throws Throwable  {
      String string0 = RequestType.getInformation(2);
      assertEquals("UNIQUE_CACHEABLE", string0);
  }
}
