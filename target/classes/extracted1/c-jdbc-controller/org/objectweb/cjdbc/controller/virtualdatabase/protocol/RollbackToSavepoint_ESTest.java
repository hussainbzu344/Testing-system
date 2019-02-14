/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:54:20 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase.protocol;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.NoMoreBackendException;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.NoneBlobFilter;
import org.objectweb.cjdbc.controller.cache.result.AbstractResultCache;
import org.objectweb.cjdbc.controller.cache.result.ResultCacheDatabase;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer;
import org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_RR;
import org.objectweb.cjdbc.controller.recoverylog.RecoveryLog;
import org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb1DistributedRequestManager;
import org.objectweb.cjdbc.controller.scheduler.AbstractScheduler;
import org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PassThroughScheduler;
import org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RollbackToSavepoint_ESTest extends RollbackToSavepoint_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.getSavepointName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.equals(Ljava/lang/Object;)Z: I5 Branch 14 IFEQ L218 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      RollbackToSavepoint rollbackToSavepoint0 = new RollbackToSavepoint(0L, "\u0007A9");
      boolean boolean0 = rollbackToSavepoint0.equals(rollbackToSavepoint0);
      assertTrue(boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.toString()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      RollbackToSavepoint rollbackToSavepoint0 = new RollbackToSavepoint(0L, "\u0007A9");
      String string0 = rollbackToSavepoint0.toString();
      assertEquals("Rollback transaction 0 to savepoint \u0007A9", string0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I4 Branch 3 IFNE L119 - false
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I75 Branch 7 IFNULL L141 - true
   * Goal 4. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I243 Branch 13 IFEQ L191 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      RollbackToSavepoint rollbackToSavepoint0 = new RollbackToSavepoint((-2325L), "My9]");
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      DistributedVirtualDatabase distributedVirtualDatabase0 = new DistributedVirtualDatabase((Controller) null, "My9]", "My9]", 3, false, 3, 3, (long) 3, 3, (AbstractBlobFilter) noneBlobFilter0);
      RAIDb2PassThroughScheduler rAIDb2PassThroughScheduler0 = new RAIDb2PassThroughScheduler((VirtualDatabase) distributedVirtualDatabase0);
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase(3, 3);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_RR rAIDb2_RR0 = new RAIDb2_RR((VirtualDatabase) distributedVirtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      RAIDb1DistributedRequestManager rAIDb1DistributedRequestManager0 = new RAIDb1DistributedRequestManager(distributedVirtualDatabase0, (AbstractScheduler) rAIDb2PassThroughScheduler0, (AbstractResultCache) resultCacheDatabase0, (AbstractLoadBalancer) rAIDb2_RR0, (RecoveryLog) null, (long) 3, (long) 3, (long) 3);
      try { 
        rollbackToSavepoint0.executeCommand(rAIDb1DistributedRequestManager0);
        fail("Expecting exception: NoMoreBackendException");
      
      } catch(NoMoreBackendException e) {
         //
         // No backend enabled on this controller
         //
         assertThrownBy("org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint.equals(Ljava/lang/Object;)Z: I5 Branch 14 IFEQ L218 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      RollbackToSavepoint rollbackToSavepoint0 = new RollbackToSavepoint((-2325L), "My9]");
      boolean boolean0 = rollbackToSavepoint0.equals("My9]");
      assertFalse(boolean0);
  }
}
