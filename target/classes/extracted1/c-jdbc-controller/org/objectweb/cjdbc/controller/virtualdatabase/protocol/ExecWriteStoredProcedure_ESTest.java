/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:38:18 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase.protocol;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.NoMoreBackendException;
import org.objectweb.cjdbc.common.sql.StoredProcedure;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter;
import org.objectweb.cjdbc.controller.cache.result.AbstractResultCache;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheTable;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer;
import org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_LPRF;
import org.objectweb.cjdbc.controller.recoverylog.RecoveryLog;
import org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager;
import org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb1DistributedRequestManager;
import org.objectweb.cjdbc.controller.scheduler.AbstractScheduler;
import org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PassThroughScheduler;
import org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ExecWriteStoredProcedure_ESTest extends ExecWriteStoredProcedure_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure.scheduleRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure.<init>(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      StoredProcedure storedProcedure0 = new StoredProcedure("q", true, 0, "q", true);
      ExecWriteStoredProcedure execWriteStoredProcedure0 = new ExecWriteStoredProcedure(storedProcedure0);
      // Undeclared exception!
      try { 
        execWriteStoredProcedure0.scheduleRequest((DistributedRequestManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure", e);
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure.<init>(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure.executeScheduledRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I14 Branch 1 IFNE L78 - false
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure.executeScheduledRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I87 Branch 3 IFEQ L101 - true
   * Goal 4. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure.executeScheduledRequest(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I105 Branch 4 IFNULL L109 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ExecWriteStoredProcedure execWriteStoredProcedure0 = new ExecWriteStoredProcedure((StoredProcedure) null);
      Controller controller0 = new Controller("virtualdatabase.distributed|write.procedure.sqlexception", 0, 0);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      DistributedVirtualDatabase distributedVirtualDatabase0 = new DistributedVirtualDatabase(controller0, "virtualdatabase.distributed|write.procedure.sqlexception", "virtualdatabase.distributed|write.procedure.sqlexception", 0, false, 0, 0, (long) 0, 0, (AbstractBlobFilter) blobEscapedFilter0);
      RAIDb2PassThroughScheduler rAIDb2PassThroughScheduler0 = new RAIDb2PassThroughScheduler((VirtualDatabase) distributedVirtualDatabase0);
      ResultCacheTable resultCacheTable0 = new ResultCacheTable(0, 0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_LPRF rAIDb2_LPRF0 = new RAIDb2_LPRF((VirtualDatabase) distributedVirtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      RAIDb1DistributedRequestManager rAIDb1DistributedRequestManager0 = new RAIDb1DistributedRequestManager(distributedVirtualDatabase0, (AbstractScheduler) rAIDb2PassThroughScheduler0, (AbstractResultCache) resultCacheTable0, (AbstractLoadBalancer) rAIDb2_LPRF0, (RecoveryLog) null, (long) 0, (long) 0, (long) 0);
      try { 
        execWriteStoredProcedure0.executeScheduledRequest(rAIDb1DistributedRequestManager0);
        fail("Expecting exception: NoMoreBackendException");
      
      } catch(NoMoreBackendException e) {
         //
         // No backend enabled on this controller
         //
         assertThrownBy("org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure", e);
      }
  }
}