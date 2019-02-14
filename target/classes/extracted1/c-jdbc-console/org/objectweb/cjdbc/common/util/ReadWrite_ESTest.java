/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:27:07 GMT 2016
 */

package org.objectweb.cjdbc.common.util;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.util.ArrayList;
import java.util.Hashtable;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.util.ReadWrite;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ReadWrite_ESTest extends ReadWrite_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadWrite.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ReadWrite readWrite0 = new ReadWrite();
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/Hashtable;Z)Ljava/lang/String;: I3 Branch 1 IFNONNULL L49 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      String string0 = ReadWrite.write((Hashtable) null, false);
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/Hashtable;Z)Ljava/lang/String;: I3 Branch 1 IFNONNULL L49 - true
   * Goal 2. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/Hashtable;Z)Ljava/lang/String;: I23 Branch 2 IFEQ L54 - true
   * Goal 3. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/Hashtable;Z)Ljava/lang/String;: I23 Branch 2 IFEQ L54 - false
   * Goal 4. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/Hashtable;Z)Ljava/lang/String;: I44 Branch 3 IF_ICMPEQ L57 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Hashtable<Object, String> hashtable0 = new Hashtable<Object, String>();
      hashtable0.put(hashtable0, "javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field).items.count=0\n");
      String string0 = ReadWrite.write(hashtable0, true);
      assertEquals("{(this Map)=javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field).items.count=0\n} = null\n", string0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I3 Branch 7 IFNONNULL L98 - true
   * Goal 2. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I22 Branch 8 IFEQ L102 - false
   * Goal 3. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I48 Branch 9 IF_ICMPGE L105 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      String string0 = ReadWrite.write(arrayList0, "javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field)", true);
      assertEquals("javax.xml.datatype.Duration#(getSet(DatatypeConstants.Field field).items.count=0\n", string0);
  }

  //Test case number: 4
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I3 Branch 7 IFNONNULL L98 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String string0 = ReadWrite.write((ArrayList) null, "BB!9J=3", false);
      assertEquals("", string0);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I3 Branch 7 IFNONNULL L98 - true
   * Goal 2. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I22 Branch 8 IFEQ L102 - true
   * Goal 3. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I48 Branch 9 IF_ICMPGE L105 - true
   * Goal 4. org.objectweb.cjdbc.common.util.ReadWrite.write(Ljava/util/ArrayList;Ljava/lang/String;Z)Ljava/lang/String;: I48 Branch 9 IF_ICMPGE L105 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ArrayList<String> arrayList0 = new ArrayList<String>();
      arrayList0.add("O=CQPUh DAi.5G2F");
      String string0 = ReadWrite.write(arrayList0, "Millisecond", false);
      assertEquals("Millisecond.0=O=CQPUh DAi.5G2F\n", string0);
  }
}
