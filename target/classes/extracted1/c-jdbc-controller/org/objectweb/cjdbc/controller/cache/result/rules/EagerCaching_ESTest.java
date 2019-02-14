/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 17:33:05 GMT 2016
 */

package org.objectweb.cjdbc.controller.cache.result.rules;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheDatabase;
import org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryEager;
import org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching;
import org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class EagerCaching_ESTest extends EagerCaching_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching.<init>(J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching.getCacheEntry(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;Lorg/objectweb/cjdbc/controller/cache/result/AbstractResultCache;)Lorg/objectweb/cjdbc/controller/cache/result/entries/AbstractResultCacheEntry;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      EagerCaching eagerCaching0 = new EagerCaching(464L);
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(236, 236);
      ResultCacheEntryEager resultCacheEntryEager0 = (ResultCacheEntryEager)eagerCaching0.getCacheEntry((SelectRequest) null, (ControllerResultSet) null, resultCacheDatabase0);
      assertEquals(1392409281784L, resultCacheEntryEager0.getDeadline());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching.<init>(J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching.getXml()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      EagerCaching eagerCaching0 = new EagerCaching(464L);
      String string0 = eagerCaching0.getXml();
      assertEquals("<EagerCaching/>", string0);
  }
}
