/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 18:06:17 GMT 2016
 */

package org.objectweb.cjdbc.controller.cache.result.entries;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed;
import org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ResultCacheEntryRelaxed_ESTest extends ResultCacheEntryRelaxed_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.getType()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.getDeadline()J: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.toStringTable()[Ljava/lang/String;: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.<init>(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;JZ)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("k lP0-", true, 0, "k lP0-");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, (-813L), true);
      resultCacheEntryRelaxed0.toStringTable();
      assertTrue(resultCacheEntryRelaxed0.getKeepIfNotDirty());
      assertEquals("Relaxed", resultCacheEntryRelaxed0.getType());
      assertEquals((-813L), resultCacheEntryRelaxed0.getTimeout());
      assertEquals(1392409280507L, resultCacheEntryRelaxed0.getDeadline());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.setDeadline(J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.<init>(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;JZ)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("k lP0-", true, 0, "k lP0-");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, (-813L), true);
      resultCacheEntryRelaxed0.setDeadline(2516L);
      assertEquals(2516L, resultCacheEntryRelaxed0.getDeadline());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.getTimeout()J: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.<init>(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;JZ)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("k lP0-", true, 0, "k lP0-");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, (-813L), true);
      long long0 = resultCacheEntryRelaxed0.getTimeout();
      assertTrue(resultCacheEntryRelaxed0.getKeepIfNotDirty());
      assertEquals(1392409280507L, resultCacheEntryRelaxed0.getDeadline());
      assertEquals((-813L), long0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.invalidate()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.<init>(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;JZ)V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("k lP0-", true, 0, "k lP0-");
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed(selectRequest0, (ControllerResultSet) null, (-813L), true);
      resultCacheEntryRelaxed0.invalidate();
      assertFalse(resultCacheEntryRelaxed0.isValid());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.getKeepIfNotDirty()Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed.<init>(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;JZ)V: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ResultCacheEntryRelaxed resultCacheEntryRelaxed0 = new ResultCacheEntryRelaxed((SelectRequest) null, (ControllerResultSet) null, (-2146L), true);
      boolean boolean0 = resultCacheEntryRelaxed0.getKeepIfNotDirty();
      assertEquals(1392409279174L, resultCacheEntryRelaxed0.getDeadline());
      assertEquals((-2146L), resultCacheEntryRelaxed0.getTimeout());
      assertTrue(boolean0);
  }
}