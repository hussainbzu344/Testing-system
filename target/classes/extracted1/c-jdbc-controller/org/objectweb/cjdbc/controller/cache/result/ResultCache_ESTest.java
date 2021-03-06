/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 18:15:11 GMT 2016
 */

package org.objectweb.cjdbc.controller.cache.result;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AlterRequest;
import org.objectweb.cjdbc.common.sql.CreateRequest;
import org.objectweb.cjdbc.common.sql.DeleteRequest;
import org.objectweb.cjdbc.common.sql.DropRequest;
import org.objectweb.cjdbc.common.sql.InsertRequest;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.UpdateRequest;
import org.objectweb.cjdbc.common.sql.schema.DatabaseSchema;
import org.objectweb.cjdbc.controller.cache.CacheException;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheColumn;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheColumnUnique;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheDatabase;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheRule;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheTable;
import org.objectweb.cjdbc.controller.cache.result.entries.AbstractResultCacheEntry;
import org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ResultCache_ESTest extends ResultCache_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getRelaxedCache()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(98, (-1954));
      resultCacheDatabase0.getRelaxedCache();
      assertEquals(-1, resultCacheDatabase0.getPendingQueryTimeout());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheSize()J: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn(548, 548);
      long long0 = resultCacheColumn0.getCacheSize();
      assertEquals(0L, long0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheStatistics()Lorg/objectweb/cjdbc/controller/cache/CacheStatistics;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(3457, 3457);
      resultCacheColumnUnique0.getCacheStatistics();
      assertEquals(3, resultCacheColumnUnique0.getPendingQueryTimeout());
  }

  //Test case number: 3
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.rollback(J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I10 Branch 75 IFEQ L848 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I47 Branch 76 IFNE L857 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I147 Branch 79 IFEQ L877 - true
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(0, 10);
      resultCacheTable0.rollback(0L);
      assertEquals("table", resultCacheTable0.getName());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.shutdown()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(20, 3083);
      resultCacheDatabase0.shutdown();
      assertEquals(3, resultCacheDatabase0.getPendingQueryTimeout());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.addCachingRule(Lorg/objectweb/cjdbc/controller/cache/result/ResultCacheRule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique((-3608), (-3608));
      resultCacheColumnUnique0.addCachingRule((ResultCacheRule) null);
      assertEquals(-3, resultCacheColumnUnique0.getPendingQueryTimeout());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getQueries()Ljava/util/HashMap;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, (-2554));
      resultCacheColumnUnique0.getQueries();
      assertEquals(-2, resultCacheColumnUnique0.getPendingQueryTimeout());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getEagerCache()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn(63, 0);
      ArrayList arrayList0 = resultCacheColumn0.getEagerCache();
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.setPendingQueryTimeout(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique((-3608), (-3608));
      resultCacheColumnUnique0.setPendingQueryTimeout((-1663));
      assertEquals(-1663, resultCacheColumnUnique0.getPendingQueryTimeout());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.commit(J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(0, 0);
      resultCacheTable0.commit(0);
      assertEquals(1, resultCacheTable0.getParsingGranularity());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDefaultRule(Lorg/objectweb/cjdbc/controller/cache/result/ResultCacheRule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn((-1627), 0);
      ResultCacheRule resultCacheRule0 = new ResultCacheRule("J@", false, false, 0L);
      resultCacheColumn0.setDefaultRule(resultCacheRule0);
      assertEquals(0, resultCacheColumn0.getPendingQueryTimeout());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getPendingQueryTimeout()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique((-3348), (-986));
      int int0 = resultCacheColumnUnique0.getPendingQueryTimeout();
      assertEquals(0, int0);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.getDefaultRule()Lorg/objectweb/cjdbc/controller/cache/result/ResultCacheRule;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique((-3608), (-3608));
      resultCacheColumnUnique0.getDefaultRule();
      assertEquals(-3, resultCacheColumnUnique0.getPendingQueryTimeout());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.mergeDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn(548, 548);
      resultCacheColumn0.mergeDatabaseSchema((DatabaseSchema) null);
      assertEquals(0, resultCacheColumn0.getPendingQueryTimeout());
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getParsingGranularity()I: root-Branch
   */

	@Test(timeout=300000)
  public void test14()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(3457, 3457);
      int int0 = resultCacheColumnUnique0.getParsingGranularity();
      assertEquals(3, int0);
      assertEquals(3, resultCacheColumnUnique0.getPendingQueryTimeout());
  }

  //Test case number: 15
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: I4 Branch 1 IFNONNULL L201 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: I4 Branch 1 IFNONNULL L201 - false
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: I41 Branch 2 IFNONNULL L211 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: I68 Branch 3 IF_ICMPGE L220 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: I122 Branch 6 IF_ICMPGE L235 - true
   */

	@Test(timeout=300000)
  public void test15()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn(15, 15);
      resultCacheColumn0.setDatabaseSchema((DatabaseSchema) null);
      resultCacheColumn0.setDatabaseSchema((DatabaseSchema) null);
      assertEquals(2, resultCacheColumn0.getParsingGranularity());
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.needInvalidate(Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;Lorg/objectweb/cjdbc/common/sql/UpdateRequest;)[Z: I16 Branch 13 IFNULL L358 - true
   */

	@Test(timeout=300000)
  public void test16()  throws Throwable  {
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(20, 3083);
      UpdateRequest updateRequest0 = new UpdateRequest("", true, 1075, "");
      resultCacheDatabase0.needInvalidate((ControllerResultSet) null, updateRequest0);
      assertEquals(3, resultCacheDatabase0.getPendingQueryTimeout());
  }

  //Test case number: 17
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheKeyFromRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.addToCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;)V: I27 Branch 20 IF_ICMPNE L427 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.addToCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;)V: I40 Branch 21 IFNONNULL L431 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.removeFromPendingQueries(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: I19 Branch 62 IFEQ L755 - true
   */

	@Test(timeout=300000)
  public void test17()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("?|[>62)a+", false, 102, "?|[>62)a+");
      selectRequest0.setCacheAbility(102);
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(0, 102);
      try { 
        resultCacheTable0.addToCache(selectRequest0, (ControllerResultSet) null);
        fail("Expecting exception: CacheException");
      
      } catch(CacheException e) {
         //
         // resultcache.null.result
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCache", e);
      }
  }

  //Test case number: 18
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheKeyFromRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.addToCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;)V: I27 Branch 20 IF_ICMPNE L427 - false
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.removeFromPendingQueries(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: I19 Branch 62 IFEQ L755 - true
   */

	@Test(timeout=300000)
  public void test18()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable((-859), 0);
      SelectRequest selectRequest0 = new SelectRequest("images/Back16.gif", true, (-859), "\">");
      try { 
        resultCacheTable0.addToCache(selectRequest0, (ControllerResultSet) null);
        fail("Expecting exception: CacheException");
      
      } catch(CacheException e) {
         //
         // resultcache.uncacheable.request
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCache", e);
      }
  }

  //Test case number: 19
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheKeyFromRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I10 Branch 39 IF_ICMPNE L569 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I36 Branch 40 IFEQ L580 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I161 Branch 45 IFNONNULL L622 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I165 Branch 46 IFEQ L625 - true
   */

	@Test(timeout=300000)
  public void test19()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable((-859), 0);
      SelectRequest selectRequest0 = new SelectRequest("`]Y#xS_.%{", true, (-3284), (String) null, (DatabaseSchema) null, 0, false);
      AbstractResultCacheEntry abstractResultCacheEntry0 = resultCacheTable0.getFromCache(selectRequest0, false);
      assertNull(abstractResultCacheEntry0);
  }

  //Test case number: 20
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I10 Branch 39 IF_ICMPNE L569 - false
   */

	@Test(timeout=300000)
  public void test20()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(0, 0);
      SelectRequest selectRequest0 = new SelectRequest("?`", false, 0, "?`");
      AbstractResultCacheEntry abstractResultCacheEntry0 = resultCacheTable0.getFromCache(selectRequest0, true);
      assertNull(abstractResultCacheEntry0);
  }

  //Test case number: 21
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheKeyFromRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I10 Branch 39 IF_ICMPNE L569 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I36 Branch 40 IFEQ L580 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I48 Branch 41 IFEQ L586 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I161 Branch 45 IFNONNULL L622 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I165 Branch 46 IFEQ L625 - false
   * Goal 8. org.objectweb.cjdbc.controller.cache.result.ResultCache.getFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Z)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: I177 Branch 47 IFEQ L629 - true
   * Goal 9. org.objectweb.cjdbc.controller.cache.result.ResultCache.removeFromPendingQueries(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: I19 Branch 62 IFEQ L755 - false
   * Goal 10. org.objectweb.cjdbc.controller.cache.result.ResultCache.removeFromPendingQueries(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: I24 Branch 63 IFEQ L757 - true
   */

	@Test(timeout=300000)
  public void test21()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable((-871), 0);
      SelectRequest selectRequest0 = new SelectRequest("images/BacbkS6.giV", false, (-871), "images/BacbkS6.giV", (DatabaseSchema) null, 0, false);
      resultCacheTable0.getFromCache(selectRequest0, true);
      resultCacheTable0.removeFromPendingQueries(selectRequest0);
      assertNull(selectRequest0.getLogin());
  }

  //Test case number: 22
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.removeFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: I9 Branch 57 IFEQ L700 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.removeFromCache(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: I40 Branch 58 IFNONNULL L708 - false
   */

	@Test(timeout=300000)
  public void test22()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable((-3881), (-3881));
      SelectRequest selectRequest0 = new SelectRequest("TimeSeries.getIndex(...) : null not peritted.", true, (-3881), "TimeSeries.getIndex(...) : null not peritted.");
      resultCacheTable0.removeFromCache(selectRequest0);
      assertEquals(-3, resultCacheTable0.getPendingQueryTimeout());
  }

  //Test case number: 23
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I37 Branch 67 IFEQ L791 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I47 Branch 68 IFEQ L795 - true
   */

	@Test(timeout=300000)
  public void test23()  throws Throwable  {
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(20, 3083);
      CreateRequest createRequest0 = new CreateRequest("wH2BC74", true, 20, "wH2BC74", (DatabaseSchema) null, 0, true);
      resultCacheDatabase0.writeNotify(createRequest0);
      assertEquals(3, resultCacheDatabase0.getPendingQueryTimeout());
  }

  //Test case number: 24
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - false
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I125 Branch 74 IFEQ L827 - true
   */

	@Test(timeout=300000)
  public void test24()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique(0, 0);
      InsertRequest insertRequest0 = new InsertRequest("vc[LAYCH6b0S@u\"D", false, 2236, "9[ 8XQL;KE", false);
      // Undeclared exception!
      try { 
        resultCacheColumnUnique0.writeNotify(insertRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCacheColumnUnique", e);
      }
  }

  //Test case number: 25
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - false
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I125 Branch 74 IFEQ L827 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I10 Branch 75 IFEQ L848 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I47 Branch 76 IFNE L857 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I147 Branch 79 IFEQ L877 - true
   */

	@Test(timeout=300000)
  public void test25()  throws Throwable  {
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(10, 0);
      UpdateRequest updateRequest0 = new UpdateRequest("granularity", false, 10, "granularity");
      resultCacheDatabase0.writeNotify(updateRequest0);
      assertNull(updateRequest0.getCursorName());
  }

  //Test case number: 26
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I125 Branch 74 IFEQ L827 - true
   */

	@Test(timeout=300000)
  public void test26()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(0, 0);
      DeleteRequest deleteRequest0 = new DeleteRequest("No information about inserted table", true, (-3906), (String) null);
      // Undeclared exception!
      try { 
        resultCacheTable0.writeNotify(deleteRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCacheTable", e);
      }
  }

  //Test case number: 27
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I37 Branch 67 IFEQ L791 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I78 Branch 71 IFEQ L805 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I125 Branch 74 IFEQ L827 - true
   */

	@Test(timeout=300000)
  public void test27()  throws Throwable  {
      ResultCacheColumnUnique resultCacheColumnUnique0 = new ResultCacheColumnUnique((-3608), (-3608));
      AlterRequest alterRequest0 = new AlterRequest("columnUnique", true, (-3608), "columnUnique");
      // Undeclared exception!
      try { 
        resultCacheColumnUnique0.writeNotify(alterRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCacheColumnUnique", e);
      }
  }

  //Test case number: 28
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I37 Branch 67 IFEQ L791 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I47 Branch 68 IFEQ L795 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I57 Branch 69 IFEQ L798 - false
   * Goal 8. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I60 Branch 70 IFNULL L798 - false
   */

	@Test(timeout=300000)
  public void test28()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(4, 4);
      CreateRequest createRequest0 = new CreateRequest("resultcache.removing.table", true, 20, "FnX8>Ad3(w/P4n[", (DatabaseSchema) null, 4, true);
      // Undeclared exception!
      try { 
        resultCacheTable0.writeNotify(createRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCache", e);
      }
  }

  //Test case number: 29
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I37 Branch 67 IFEQ L791 - false
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I47 Branch 68 IFEQ L795 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I57 Branch 69 IFEQ L798 - false
   * Goal 8. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I60 Branch 70 IFNULL L798 - true
   */

	@Test(timeout=300000)
  public void test29()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(1027, 1027);
      CreateRequest createRequest0 = new CreateRequest((String) null, false, 1027, (String) null);
      resultCacheTable0.writeNotify(createRequest0);
      assertEquals(1, resultCacheTable0.getPendingQueryTimeout());
  }

  //Test case number: 30
  /*
   * 11 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I37 Branch 67 IFEQ L791 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I78 Branch 71 IFEQ L805 - false
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I88 Branch 72 IFEQ L809 - true
   * Goal 8. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I125 Branch 74 IFEQ L827 - true
   * Goal 9. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I10 Branch 75 IFEQ L848 - true
   * Goal 10. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I47 Branch 76 IFNE L857 - true
   * Goal 11. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I147 Branch 79 IFEQ L877 - true
   */

	@Test(timeout=300000)
  public void test30()  throws Throwable  {
      DropRequest dropRequest0 = new DropRequest("\"v^Jw)j.Ylu^@Sd-", true, 60000, "");
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(0, 1);
      resultCacheDatabase0.writeNotify(dropRequest0);
      assertEquals("", dropRequest0.getLineSeparator());
  }

  //Test case number: 31
  /*
   * 13 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.setDatabaseSchema(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;)V: I4 Branch 1 IFNONNULL L201 - false
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 64 IFEQ L785 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I15 Branch 65 IFEQ L787 - true
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I26 Branch 66 IFEQ L789 - true
   * Goal 6. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I37 Branch 67 IFEQ L791 - true
   * Goal 7. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I78 Branch 71 IFEQ L805 - false
   * Goal 8. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I88 Branch 72 IFEQ L809 - false
   * Goal 9. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I100 Branch 73 IFNULL L813 - true
   * Goal 10. org.objectweb.cjdbc.controller.cache.result.ResultCache.writeNotify(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I125 Branch 74 IFEQ L827 - true
   * Goal 11. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I10 Branch 75 IFEQ L848 - true
   * Goal 12. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I47 Branch 76 IFNE L857 - true
   * Goal 13. org.objectweb.cjdbc.controller.cache.result.ResultCache.flushCache()V: I147 Branch 79 IFEQ L877 - true
   */

	@Test(timeout=300000)
  public void test31()  throws Throwable  {
      ResultCacheTable resultCacheTable0 = new ResultCacheTable((-3881), (-3881));
      resultCacheTable0.setDatabaseSchema((DatabaseSchema) null);
      DropRequest dropRequest0 = new DropRequest("TimeSeries.getIndex(...) : null not peritted.", true, (-3881), "TimeSeries.getIndex(...) : null not peritted.");
      resultCacheTable0.writeNotify(dropRequest0);
      assertEquals(-3, resultCacheTable0.getPendingQueryTimeout());
  }

  //Test case number: 32
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheData()[[Ljava/lang/String;: I28 Branch 84 IFEQ L992 - true
   */

	@Test(timeout=300000)
  public void test32()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn((-1627), 0);
      resultCacheColumn0.getCacheData();
      assertEquals(0, resultCacheColumn0.getPendingQueryTimeout());
  }

  //Test case number: 33
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.ResultCache.<init>(II)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheStatsData()[[Ljava/lang/String;: I29 Branch 86 IF_ICMPGE L1018 - true
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.ResultCache.getCacheStatsData()[[Ljava/lang/String;: I29 Branch 86 IF_ICMPGE L1018 - false
   */

	@Test(timeout=300000)
  public void test33()  throws Throwable  {
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(1050, 335);
      resultCacheDatabase0.getCacheStatsData();
      assertEquals(0, resultCacheDatabase0.getPendingQueryTimeout());
  }
}
