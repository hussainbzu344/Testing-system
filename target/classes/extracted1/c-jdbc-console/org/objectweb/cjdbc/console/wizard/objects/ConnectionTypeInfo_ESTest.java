/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 09:11:09 GMT 2016
 */

package org.objectweb.cjdbc.console.wizard.objects;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ConnectionTypeInfo_ESTest extends ConnectionTypeInfo_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.toString()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      String string0 = connectionTypeInfo0.toString();
      assertEquals("SimpleConnectionManager", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getValues()Ljava/util/ArrayList;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      connectionTypeInfo0.getValues();
      assertEquals("SimpleConnectionManager", connectionTypeInfo0.toString());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getType()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      String string0 = connectionTypeInfo0.getType();
      assertEquals("SimpleConnectionManager", string0);
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I7 Branch 1 IF_ACMPNE L53 - true
   * Goal 3. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I20 Branch 2 IF_ACMPNE L55 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I38 Branch 3 IF_ACMPNE L57 - false
   * Goal 5. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I61 Branch 4 IF_ACMPNE L60 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      connectionTypeInfo0.type = "RandomWaitPoolConnectionManager";
      String[] stringArray0 = connectionTypeInfo0.getAttributes();
      assertNull(stringArray0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I7 Branch 1 IF_ACMPNE L53 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      String[] stringArray0 = connectionTypeInfo0.getAttributes();
      assertNotNull(stringArray0);
      assertEquals("SimpleConnectionManager", connectionTypeInfo0.toString());
  }

  //Test case number: 5
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.setType(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I7 Branch 1 IF_ACMPNE L53 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I20 Branch 2 IF_ACMPNE L55 - false
   * Goal 5. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I38 Branch 3 IF_ACMPNE L57 - true
   * Goal 6. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I61 Branch 4 IF_ACMPNE L60 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      assertEquals("SimpleConnectionManager", connectionTypeInfo0.getType());
      
      connectionTypeInfo0.setType("FailFastPoolConnectionManager");
      connectionTypeInfo0.getAttributes();
      assertEquals("FailFastPoolConnectionManager", connectionTypeInfo0.toString());
  }

  //Test case number: 6
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.setType(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I7 Branch 1 IF_ACMPNE L53 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I20 Branch 2 IF_ACMPNE L55 - true
   * Goal 5. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I38 Branch 3 IF_ACMPNE L57 - true
   * Goal 6. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getAttributes()[Ljava/lang/String;: I61 Branch 4 IF_ACMPNE L60 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      connectionTypeInfo0.setType("VariablePoolConnectionManager");
      connectionTypeInfo0.getAttributes();
      assertEquals("VariablePoolConnectionManager", connectionTypeInfo0.toString());
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.setValues(Ljava/util/ArrayList;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getValue(I)I: I11 Branch 5 IFEQ L91 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getValue(I)I: I23 Branch 6 IFEQ L93 - true
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      arrayList0.add((Object) connectionTypeInfo0);
      connectionTypeInfo0.setValues(arrayList0);
      int int0 = connectionTypeInfo0.getValue(0);
      assertEquals(0, int0);
      assertEquals("SimpleConnectionManager", connectionTypeInfo0.toString());
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.setValues(Ljava/util/ArrayList;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getValue(I)I: I11 Branch 5 IFEQ L91 - false
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("FieldCannotBeNull");
      connectionTypeInfo0.setValues(arrayList0);
      int int0 = connectionTypeInfo0.getValue(0);
      assertEquals("SimpleConnectionManager", connectionTypeInfo0.getType());
      assertEquals(0, int0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.setValues(Ljava/util/ArrayList;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getValue(I)I: I11 Branch 5 IFEQ L91 - true
   * Goal 4. org.objectweb.cjdbc.console.wizard.objects.ConnectionTypeInfo.getValue(I)I: I23 Branch 6 IFEQ L93 - false
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      ConnectionTypeInfo connectionTypeInfo0 = new ConnectionTypeInfo();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>();
      Integer integer0 = new Integer((-262));
      arrayList0.add(integer0);
      connectionTypeInfo0.setValues(arrayList0);
      int int0 = connectionTypeInfo0.getValue(0);
      assertEquals((-262), int0);
      assertEquals("SimpleConnectionManager", connectionTypeInfo0.getType());
  }
}