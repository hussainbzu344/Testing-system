/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:37:35 GMT 2016
 */

package org.objectweb.cjdbc.common.sql.filters;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BlobEscapedFilter_ESTest extends BlobEscapedFilter_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.getXml()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      String string0 = blobEscapedFilter0.getXml();
      assertEquals("escaped", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.encode(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      String string0 = blobEscapedFilter0.encode("PiTpzzG&chkYB~");
      assertEquals("PiTpzzG&chkYB~", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.decode([B)[B: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      byte[] byteArray0 = new byte[5];
      byte[] byteArray1 = blobEscapedFilter0.decode(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0, (byte)0, (byte)0}, byteArray1);
  }

  //Test case number: 3
  /*
   * 15 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.decode(Ljava/lang/String;)[B: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I3 Branch 1 IFNONNULL L90 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - false
   * Goal 6. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I36 Branch 3 IFGE L98 - true
   * Goal 7. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I50 Branch 5 IF_ICMPLE L108 - true
   * Goal 9. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I101 Branch 6 IF_ICMPNE L116 - true
   * Goal 10. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I101 Branch 6 IF_ICMPNE L116 - false
   * Goal 11. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - true
   * Goal 12. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - false
   * Goal 13. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I160 Branch 8 IF_ICMPEQ L136 - false
   * Goal 14. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - true
   * Goal 15. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      byte[] byteArray0 = blobEscapedFilter0.decode("\\000\\331t\\021\\260");
      String string0 = BlobEscapedFilter.toPGString(byteArray0);
      assertEquals("\\\\\\\\000\\\\\\\\331t\\\\\\\\021\\\\\\\\260", string0);
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.encode([B)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I3 Branch 1 IFNONNULL L90 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      String string0 = blobEscapedFilter0.encode((byte[]) null);
      assertNull(string0);
  }

  //Test case number: 5
  /*
   * 15 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.encode([B)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I3 Branch 1 IFNONNULL L90 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - false
   * Goal 6. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I36 Branch 3 IFGE L98 - true
   * Goal 7. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I36 Branch 3 IFGE L98 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - true
   * Goal 9. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - false
   * Goal 10. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I50 Branch 5 IF_ICMPLE L108 - false
   * Goal 11. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - true
   * Goal 12. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - false
   * Goal 13. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I160 Branch 8 IF_ICMPEQ L136 - false
   * Goal 14. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - true
   * Goal 15. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte) (-39);
      String string0 = blobEscapedFilter0.encode(byteArray0);
      assertEquals("\\\\000\\\\331\\\\000\\\\000\\\\000", string0);
  }

  //Test case number: 6
  /*
   * 15 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.encode([B)Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I3 Branch 1 IFNONNULL L90 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - false
   * Goal 6. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I36 Branch 3 IFGE L98 - true
   * Goal 7. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - true
   * Goal 8. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - false
   * Goal 9. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I50 Branch 5 IF_ICMPLE L108 - true
   * Goal 10. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I101 Branch 6 IF_ICMPNE L116 - true
   * Goal 11. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - true
   * Goal 12. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - false
   * Goal 13. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I160 Branch 8 IF_ICMPEQ L136 - false
   * Goal 14. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - true
   * Goal 15. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      byte[] byteArray0 = new byte[5];
      byteArray0[2] = (byte)116;
      String string0 = blobEscapedFilter0.encode(byteArray0);
      assertEquals("\\\\000\\\\000t\\\\000\\\\000", string0);
  }

  //Test case number: 7
  /*
   * 14 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I3 Branch 1 IFNONNULL L90 - true
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - true
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I26 Branch 2 IF_ICMPGE L95 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I36 Branch 3 IFGE L98 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - true
   * Goal 6. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I47 Branch 4 IF_ICMPLT L108 - false
   * Goal 7. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I50 Branch 5 IF_ICMPLE L108 - true
   * Goal 8. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I101 Branch 6 IF_ICMPNE L116 - true
   * Goal 9. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - true
   * Goal 10. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I149 Branch 7 IF_ICMPGE L133 - false
   * Goal 11. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I160 Branch 8 IF_ICMPEQ L136 - true
   * Goal 12. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I160 Branch 8 IF_ICMPEQ L136 - false
   * Goal 13. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - true
   * Goal 14. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toPGString([B)Ljava/lang/String;: I163 Branch 9 IF_ICMPNE L136 - false
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      byteArray0[3] = (byte)39;
      String string0 = BlobEscapedFilter.toPGString(byteArray0);
      assertEquals("\\\\000\\\\000\\\\000\\'", string0);
  }

  //Test case number: 8
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I3 Branch 10 IFNONNULL L153 - false
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      byte[] byteArray0 = BlobEscapedFilter.toBytes((byte[]) null);
      assertNull(byteArray0);
  }

  //Test case number: 9
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.decode(Ljava/lang/String;)[B: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I3 Branch 10 IFNONNULL L153 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I29 Branch 11 IF_ICMPGE L163 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I29 Branch 11 IF_ICMPGE L163 - false
   * Goal 6. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I40 Branch 12 IF_ICMPNE L166 - true
   * Goal 7. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I40 Branch 12 IF_ICMPNE L166 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I52 Branch 13 IF_ICMPNE L169 - true
   * Goal 9. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I89 Branch 14 IF_ICMPLE L177 - true
   * Goal 10. org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter.toBytes([B)[B: I89 Branch 14 IF_ICMPLE L177 - false
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      byte[] byteArray0 = blobEscapedFilter0.decode("\\000\\331t\\021\\260");
      byte[] byteArray1 = BlobEscapedFilter.toBytes(byteArray0);
      assertArrayEquals(new byte[] {(byte)0, (byte) (-39), (byte)116, (byte)17, (byte) (-80)}, byteArray1);
  }
}
