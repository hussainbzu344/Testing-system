/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 17:39:33 GMT 2016
 */

package org.objectweb.cjdbc.controller.cache.result.threads;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.TooManyResourcesException;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.cache.result.ResultCache;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheColumn;
import org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RelaxedCacheThread_ESTest extends RelaxedCacheThread_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.getThreadWakeUpTime()J: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.<init>(Lorg/objectweb/cjdbc/controller/cache/result/ResultCache;)V: I27 Branch 1 IFNONNULL L48 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      RelaxedCacheThread relaxedCacheThread0 = new RelaxedCacheThread((ResultCache) null);
      long long0 = relaxedCacheThread0.getThreadWakeUpTime();
      assertEquals(0L, long0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.<init>(Lorg/objectweb/cjdbc/controller/cache/result/ResultCache;I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.<init>(Lorg/objectweb/cjdbc/controller/cache/result/ResultCache;)V: I27 Branch 1 IFNONNULL L48 - false
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.run()V: I10 Branch 2 IFNE L97 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      RelaxedCacheThread relaxedCacheThread0 = new RelaxedCacheThread((ResultCache) null, 10000);
      // Undeclared exception!
      try { 
        relaxedCacheThread0.run();
        fail("Expecting exception: TooManyResourcesException");
      
      } catch(TooManyResourcesException e) {
         //
         // Loop has been executed more times than the allowed 10000
         //
         assertThrownBy("org.evosuite.runtime.LoopCounter", e);
      }
  }

  //Test case number: 2
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.<init>(Lorg/objectweb/cjdbc/controller/cache/result/ResultCache;I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.shutdown()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.<init>(Lorg/objectweb/cjdbc/controller/cache/result/ResultCache;)V: I27 Branch 1 IFNONNULL L48 - true
   * Goal 4. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.<init>(Lorg/objectweb/cjdbc/controller/cache/result/ResultCache;)V: I27 Branch 1 IFNONNULL L48 - false
   * Goal 5. org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread.run()V: I10 Branch 2 IFNE L97 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn((-5003), 3000);
      RelaxedCacheThread relaxedCacheThread0 = new RelaxedCacheThread((ResultCache) resultCacheColumn0, 3000);
      relaxedCacheThread0.shutdown();
      relaxedCacheThread0.run();
      assertEquals(0L, relaxedCacheThread0.getThreadWakeUpTime());
  }
}