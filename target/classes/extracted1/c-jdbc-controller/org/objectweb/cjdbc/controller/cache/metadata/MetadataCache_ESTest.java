/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 17:10:42 GMT 2016
 */

package org.objectweb.cjdbc.controller.cache.metadata;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.DropRequest;
import org.objectweb.cjdbc.common.sql.InsertRequest;
import org.objectweb.cjdbc.common.sql.UpdateRequest;
import org.objectweb.cjdbc.controller.cache.metadata.MetadataCache;
import org.objectweb.cjdbc.driver.Field;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataCache_ESTest extends MetadataCache_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.flushCache()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(30, 30);
      metadataCache0.flushCache();
  }

  //Test case number: 1
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.getField(Ljava/lang/String;)Lorg/objectweb/cjdbc/driver/Field;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(30, 30);
      Field field0 = metadataCache0.getField("cache.memory.error.cache.flushed");
      assertNull(field0);
  }

  //Test case number: 2
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - false
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - false
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.getMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)[Lorg/objectweb/cjdbc/driver/Field;: I8 Branch 7 IFNULL L110 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(0, 0);
      UpdateRequest updateRequest0 = new UpdateRequest("&ZszP4~4C", true, 0, "&ZszP4~4C");
      Field[] fieldArray0 = metadataCache0.getMetadata(updateRequest0);
      assertNull(fieldArray0);
  }

  //Test case number: 3
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - false
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - false
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.getMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)[Lorg/objectweb/cjdbc/driver/Field;: I8 Branch 7 IFNULL L110 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(0, 0);
      UpdateRequest updateRequest0 = new UpdateRequest("&ZszP4~4C", true, 0, "&ZszP4~4C");
      updateRequest0.setSqlSkeleton("&ZszP4~4C");
      Field[] fieldArray0 = metadataCache0.getMetadata(updateRequest0);
      assertNull(fieldArray0);
  }

  //Test case number: 4
  /*
   * 9 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - true
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;[Lorg/objectweb/cjdbc/driver/Field;)V: I7 Branch 8 IF_ICMPLE L128 - true
   * Goal 8. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;[Lorg/objectweb/cjdbc/driver/Field;)V: I7 Branch 8 IF_ICMPLE L128 - false
   * Goal 9. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;[Lorg/objectweb/cjdbc/driver/Field;)V: I58 Branch 9 IFNULL L149 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(2, 2);
      InsertRequest insertRequest0 = new InsertRequest("maxNbOfField", false, 2, "maxNbOfField", false);
      Field[] fieldArray0 = new Field[0];
      metadataCache0.addMetadata(insertRequest0, fieldArray0);
      DropRequest dropRequest0 = new DropRequest("cache.memory.error.cache.flushed", false, 2, "maxNbOfField");
      metadataCache0.addMetadata(dropRequest0, fieldArray0);
      dropRequest0.setSQL("");
      Field[] fieldArray1 = new Field[0];
      metadataCache0.addMetadata(dropRequest0, fieldArray1);
      metadataCache0.addMetadata(insertRequest0, fieldArray0);
      assertFalse(insertRequest0.isAutoCommit());
  }

  //Test case number: 5
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - true
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;[Lorg/objectweb/cjdbc/driver/Field;)V: I7 Branch 8 IF_ICMPLE L128 - true
   * Goal 8. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addMetadata(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;[Lorg/objectweb/cjdbc/driver/Field;)V: I58 Branch 9 IFNULL L149 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(30, 30);
      InsertRequest insertRequest0 = new InsertRequest("maxNbOfField", false, 30, "maxNbOfField", false);
      Field[] fieldArray0 = new Field[0];
      insertRequest0.setSqlSkeleton("maxNbOfField");
      metadataCache0.addMetadata(insertRequest0, fieldArray0);
      assertFalse(insertRequest0.isAutoCommit());
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - false
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addField(Ljava/lang/String;Lorg/objectweb/cjdbc/driver/Field;)V: I7 Branch 10 IF_ICMPLE L189 - true
   * Goal 8. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.addField(Ljava/lang/String;Lorg/objectweb/cjdbc/driver/Field;)V: I7 Branch 10 IF_ICMPLE L189 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(0, 1);
      Field field0 = new Field("cache.metadata.invalid.size", "V}Y6p]\"GK", (-468), 222, "9;zF_^g5$mg+n +y,S", ";sSYH&u1NkI|@");
      metadataCache0.addField("", field0);
      metadataCache0.addField("9;zF_^g5$mg+n +y,S", field0);
      metadataCache0.addField("9;zF_^g5$mg+n +y,S", field0);
      assertFalse(field0.isDefinitelyWritable());
  }

  //Test case number: 7
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - true
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.getXml()Ljava/lang/String;: I19 Branch 11 IF_ICMPNE L226 - true
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(3601, 1713);
      String string0 = metadataCache0.getXml();
      assertEquals("<MetadataCache maxNbOfMetadata=\"3601\" maxNbOfField=\"1713\"/>", string0);
  }

  //Test case number: 8
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I10 Branch 1 IFNE L64 - false
   * Goal 2. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I24 Branch 2 IFNE L67 - false
   * Goal 3. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I35 Branch 3 IFGE L68 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I61 Branch 4 IFNE L71 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I76 Branch 5 IFGE L75 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.<init>(II)V: I102 Branch 6 IFNE L78 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.metadata.MetadataCache.getXml()Ljava/lang/String;: I19 Branch 11 IF_ICMPNE L226 - false
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      MetadataCache metadataCache0 = new MetadataCache(0, 0);
      String string0 = metadataCache0.getXml();
      assertEquals("<MetadataCache maxNbOfMetadata=\"2147483647\" maxNbOfField=\"0\"/>", string0);
  }
}
