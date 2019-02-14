/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:32:10 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase.protocol;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AbstractWriteRequest;
import org.objectweb.cjdbc.common.sql.InsertRequest;
import org.objectweb.cjdbc.common.sql.UpdateRequest;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.Base64Filter;
import org.objectweb.cjdbc.controller.cache.result.AbstractResultCache;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheColumn;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer;
import org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_RR;
import org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_RR;
import org.objectweb.cjdbc.controller.recoverylog.RecoveryLog;
import org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager;
import org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb1DistributedRequestManager;
import org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb2DistributedRequestManager;
import org.objectweb.cjdbc.controller.scheduler.AbstractScheduler;
import org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1PassThroughScheduler;
import org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PassThroughScheduler;
import org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CacheInvalidate_ESTest extends CacheInvalidate_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate.scheduleRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate.<init>(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      CacheInvalidate cacheInvalidate0 = new CacheInvalidate((AbstractWriteRequest) null);
      cacheInvalidate0.scheduleRequest((DistributedRequestManager) null);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate.<init>(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate.executeScheduledRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I4 Branch 1 IFNULL L67 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Controller controller0 = new Controller("qn", 755, 755);
      Base64Filter base64Filter0 = new Base64Filter();
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      UpdateRequest updateRequest0 = new UpdateRequest("qn", true, 755, "");
      CacheInvalidate cacheInvalidate0 = new CacheInvalidate((AbstractWriteRequest) updateRequest0);
      DistributedVirtualDatabase distributedVirtualDatabase0 = new DistributedVirtualDatabase(controller0, "", "qn", 755, true, 755, 755, 4800L, 3481, (AbstractBlobFilter) base64Filter0);
      RAIDb2PassThroughScheduler rAIDb2PassThroughScheduler0 = new RAIDb2PassThroughScheduler((VirtualDatabase) distributedVirtualDatabase0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_RR rAIDb2_RR0 = new RAIDb2_RR((VirtualDatabase) distributedVirtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      RAIDb1DistributedRequestManager rAIDb1DistributedRequestManager0 = new RAIDb1DistributedRequestManager(distributedVirtualDatabase0, (AbstractScheduler) rAIDb2PassThroughScheduler0, (AbstractResultCache) null, (AbstractLoadBalancer) rAIDb2_RR0, (RecoveryLog) null, (long) 3481, (long) 3481, 474L);
      Object object0 = cacheInvalidate0.executeScheduledRequest(rAIDb1DistributedRequestManager0);
      assertNull(object0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate.<init>(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.CacheInvalidate.executeScheduledRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I4 Branch 1 IFNULL L67 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      InsertRequest insertRequest0 = new InsertRequest("qn", false, 755, "qn", false);
      CacheInvalidate cacheInvalidate0 = new CacheInvalidate((AbstractWriteRequest) insertRequest0);
      Controller controller0 = new Controller("qn", 755, 755);
      Base64Filter base64Filter0 = new Base64Filter();
      DistributedVirtualDatabase distributedVirtualDatabase0 = new DistributedVirtualDatabase(controller0, "qn", "qn", 755, false, 755, 755, 1610L, 755, (AbstractBlobFilter) base64Filter0);
      RAIDb1PassThroughScheduler rAIDb1PassThroughScheduler0 = new RAIDb1PassThroughScheduler((VirtualDatabase) distributedVirtualDatabase0);
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn(755, 755);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      RAIDb1_RR rAIDb1_RR0 = new RAIDb1_RR((VirtualDatabase) distributedVirtualDatabase0, waitForCompletionPolicy0);
      RAIDb2DistributedRequestManager rAIDb2DistributedRequestManager0 = new RAIDb2DistributedRequestManager(distributedVirtualDatabase0, (AbstractScheduler) rAIDb1PassThroughScheduler0, (AbstractResultCache) resultCacheColumn0, (AbstractLoadBalancer) rAIDb1_RR0, (RecoveryLog) null, 1610L, (long) 755, 1610L);
      // Undeclared exception!
      try { 
        cacheInvalidate0.executeScheduledRequest(rAIDb2DistributedRequestManager0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.cache.result.ResultCacheColumn", e);
      }
  }
}