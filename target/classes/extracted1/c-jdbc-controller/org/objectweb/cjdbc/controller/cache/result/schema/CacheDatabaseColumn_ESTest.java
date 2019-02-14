/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 17:55:28 GMT 2016
 */

package org.objectweb.cjdbc.controller.cache.result.schema;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheColumnUnique;
import org.objectweb.cjdbc.controller.cache.result.entries.AbstractResultCacheEntry;
import org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed;
import org.objectweb.cjdbc.controller.cache.result.rules.RelaxedCaching;
import org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn;
import org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CacheDatabaseColumn_ESTest extends CacheDatabaseColumn_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.getInformation()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("Failed to rebuild object from stream ");
      String string0 = cacheDatabaseColumn0.getInformation();
      assertEquals("Failed to rebuild object from stream ", string0);
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUnique()V: I9 Branch 6 IF_ICMPGE L136 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUnique()V: I9 Branch 6 IF_ICMPGE L136 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUnique()V: I24 Branch 7 IF_ICMPEQ L140 - false
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(false, (long) 1);
      SelectRequest selectRequest0 = new SelectRequest("", false, 1, "");
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = (ResultCacheEntryRelaxed)relaxedCaching0.getCacheEntry(selectRequest0, (ControllerResultSet) null, resultCacheColumnUnique0);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.invalidateAllNonUnique();
      assertEquals("", cacheDatabaseColumn0.getName());
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.getName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.equals(Ljava/lang/Object;)Z: I4 Branch 1 IFNE L80 - true
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("Sa(5bDT SN");
      boolean boolean0 = cacheDatabaseColumn0.equals(cacheDatabaseColumn0);
      assertTrue(boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.equals(Ljava/lang/Object;)Z: I4 Branch 1 IFNE L80 - false
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("FailedHtrebuild object from stream ");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(true, 1016L);
      boolean boolean0 = cacheDatabaseColumn0.equals(relaxedCaching0);
      assertFalse(boolean0);
  }

  //Test case number: 4
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I9 Branch 2 IF_ICMPGE L105 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I9 Branch 2 IF_ICMPGE L105 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I24 Branch 3 IF_ICMPEQ L109 - true
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("FailedHtrebuild object from stream ");
      SelectRequest selectRequest0 = new SelectRequest("FailedHtrebuild object from stream ", true, 31, "FailedHtrebuild object from stream ");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, 1016L, true);
      selectRequest0.setCacheAbility(2);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.markDirtyAllNonUnique();
      assertEquals("FailedHtrebuild object from stream ", cacheDatabaseColumn0.getInformation());
  }

  //Test case number: 5
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I9 Branch 2 IF_ICMPGE L105 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I9 Branch 2 IF_ICMPGE L105 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I24 Branch 3 IF_ICMPEQ L109 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I27 Branch 4 IFEQ L109 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I27 Branch 4 IFEQ L109 - false
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("Failed to rebuild object from stream ");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(false, 0L);
      SelectRequest selectRequest0 = new SelectRequest((String) null, false, 0, "Failed to rebuild object from stream ");
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = (ResultCacheEntryRelaxed)relaxedCaching0.getCacheEntry(selectRequest0, (ControllerResultSet) null, resultCacheColumnUnique0);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.markDirtyAllNonUnique();
      cacheDatabaseColumn0.markDirtyAllNonUnique();
      assertEquals("Failed to rebuild object from stream ", cacheDatabaseColumn0.getName());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAll()V: I9 Branch 5 IFEQ L120 - true
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("FailedHtrebuild object from stream ");
      cacheDatabaseColumn0.invalidateAll();
      assertEquals("FailedHtrebuild object from stream ", cacheDatabaseColumn0.getInformation());
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAll()V: I9 Branch 5 IFEQ L120 - false
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("Sa(5bDT SN");
      cacheDatabaseColumn0.addCacheEntry((AbstractResultCacheEntry) null);
      // Undeclared exception!
      try { 
        cacheDatabaseColumn0.invalidateAll();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn", e);
      }
  }

  //Test case number: 8
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUnique()V: I9 Branch 6 IF_ICMPGE L136 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUnique()V: I9 Branch 6 IF_ICMPGE L136 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUnique()V: I24 Branch 7 IF_ICMPEQ L140 - true
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(false, (long) 1);
      SelectRequest selectRequest0 = new SelectRequest("", false, 1, "");
      selectRequest0.setCacheAbility(2);
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = (ResultCacheEntryRelaxed)relaxedCaching0.getCacheEntry(selectRequest0, (ControllerResultSet) null, resultCacheColumnUnique0);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.invalidateAllNonUnique();
      assertEquals("", cacheDatabaseColumn0.getName());
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllUniqueWithValuesAndAllNonUnique(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V: I9 Branch 8 IF_ICMPGE L167 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllUniqueWithValuesAndAllNonUnique(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V: I9 Branch 8 IF_ICMPGE L167 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllUniqueWithValuesAndAllNonUnique(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V: I24 Branch 9 IF_ICMPNE L171 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(false, (long) 1);
      SelectRequest selectRequest0 = new SelectRequest("", false, 1, "");
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = (ResultCacheEntryRelaxed)relaxedCaching0.getCacheEntry(selectRequest0, (ControllerResultSet) null, resultCacheColumnUnique0);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.invalidateAllUniqueWithValuesAndAllNonUnique("", (ArrayList) null, (ArrayList) null);
      assertEquals("", cacheDatabaseColumn0.getName());
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllUniqueWithValuesAndAllNonUnique(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V: I9 Branch 8 IF_ICMPGE L167 - false
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllUniqueWithValuesAndAllNonUnique(Ljava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;)V: I24 Branch 9 IF_ICMPNE L171 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(false, (long) 1);
      SelectRequest selectRequest0 = new SelectRequest("", false, 1, "");
      selectRequest0.setCacheAbility(2);
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = (ResultCacheEntryRelaxed)relaxedCaching0.getCacheEntry(selectRequest0, (ControllerResultSet) null, resultCacheColumnUnique0);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      // Undeclared exception!
      try { 
        cacheDatabaseColumn0.invalidateAllUniqueWithValuesAndAllNonUnique("", (ArrayList) null, (ArrayList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn", e);
      }
  }

  //Test case number: 11
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I9 Branch 15 IF_ICMPGE L234 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I9 Branch 15 IF_ICMPGE L234 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I24 Branch 16 IF_ICMPEQ L238 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I27 Branch 17 IFEQ L238 - false
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("FailedHtrebuild object from stream ");
      SelectRequest selectRequest0 = new SelectRequest("FailedHtrebuild object from stream ", true, 31, "FailedHtrebuild object from stream ");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, 1016L, true);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.invalidateAllNonUniqueAndMarkDirtyUnique();
      assertEquals("FailedHtrebuild object from stream ", cacheDatabaseColumn0.getInformation());
  }

  //Test case number: 12
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I9 Branch 15 IF_ICMPGE L234 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I9 Branch 15 IF_ICMPGE L234 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I24 Branch 16 IF_ICMPEQ L238 - true
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("FailedHtrebuild object from stream ");
      SelectRequest selectRequest0 = new SelectRequest("FailedHtrebuild object from stream ", true, 31, "FailedHtrebuild object from stream ");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, 1016L, true);
      selectRequest0.setCacheAbility(2);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.invalidateAllNonUniqueAndMarkDirtyUnique();
      assertEquals("FailedHtrebuild object from stream ", cacheDatabaseColumn0.getInformation());
  }

  //Test case number: 13
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.addCacheEntry(Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I9 Branch 2 IF_ICMPGE L105 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I9 Branch 2 IF_ICMPGE L105 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I24 Branch 3 IF_ICMPEQ L109 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.markDirtyAllNonUnique()V: I27 Branch 4 IFEQ L109 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I9 Branch 15 IF_ICMPGE L234 - true
   * Goal 8. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I9 Branch 15 IF_ICMPGE L234 - false
   * Goal 9. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I24 Branch 16 IF_ICMPEQ L238 - false
   * Goal 10. org.objectweb.cjdbc.controller.cache.result.schema.CacheDatabaseColumn.invalidateAllNonUniqueAndMarkDirtyUnique()V: I27 Branch 17 IFEQ L238 - true
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      CacheDatabaseColumn cacheDatabaseColumn0 = new CacheDatabaseColumn("Failed to rebuild object from stream ");
      RelaxedCaching relaxedCaching0 = new RelaxedCaching(false, 0L);
      SelectRequest selectRequest0 = new SelectRequest((String) null, false, 0, "Failed to rebuild object from stream ");
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = (ResultCacheEntryRelaxed)relaxedCaching0.getCacheEntry(selectRequest0, (ControllerResultSet) null, resultCacheColumnUnique0);
      cacheDatabaseColumn0.addCacheEntry(resultCacheEntryRelaxed0);
      cacheDatabaseColumn0.markDirtyAllNonUnique();
      cacheDatabaseColumn0.invalidateAllNonUniqueAndMarkDirtyUnique();
      assertEquals("Failed to rebuild object from stream ", cacheDatabaseColumn0.getInformation());
  }
}
