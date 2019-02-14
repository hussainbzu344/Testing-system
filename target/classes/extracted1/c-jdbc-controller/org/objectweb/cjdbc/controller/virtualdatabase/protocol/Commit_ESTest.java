/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:49:02 GMT 2016
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
import org.objectweb.cjdbc.controller.cache.result.ResultCacheColumn;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer;
import org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_WRR;
import org.objectweb.cjdbc.controller.recoverylog.RecoveryLog;
import org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager;
import org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb1DistributedRequestManager;
import org.objectweb.cjdbc.controller.scheduler.AbstractScheduler;
import org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1PassThroughScheduler;
import org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Commit_ESTest extends Commit_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.toString()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.<init>(Ljava/lang/String;J)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Commit commit0 = new Commit((String) null, (-752L));
      String string0 = commit0.toString();
      assertEquals("Commit transaction -752", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.scheduleCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.<init>(Ljava/lang/String;J)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Commit commit0 = new Commit("=L", 0L);
      // Undeclared exception!
      try { 
        commit0.scheduleCommand((DistributedRequestManager) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit", e);
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.<init>(Ljava/lang/String;J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I16 Branch 1 IFNE L126 - false
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I90 Branch 6 IFNULL L148 - true
   * Goal 4. org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I249 Branch 14 IFEQ L193 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Boolean boolean0 = Boolean.valueOf("");
      Controller controller0 = new Controller("", 544, 544);
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      DistributedVirtualDatabase distributedVirtualDatabase0 = new DistributedVirtualDatabase(controller0, "", "", 544, (boolean) boolean0, 544, 544, (long) 544, 544, (AbstractBlobFilter) noneBlobFilter0);
      RAIDb1PassThroughScheduler rAIDb1PassThroughScheduler0 = new RAIDb1PassThroughScheduler((VirtualDatabase) distributedVirtualDatabase0);
      ResultCacheColumn resultCacheColumn0 = new ResultCacheColumn(544, 544);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      RAIDb1_WRR rAIDb1_WRR0 = new RAIDb1_WRR((VirtualDatabase) distributedVirtualDatabase0, waitForCompletionPolicy0);
      RAIDb1DistributedRequestManager rAIDb1DistributedRequestManager0 = new RAIDb1DistributedRequestManager(distributedVirtualDatabase0, (AbstractScheduler) rAIDb1PassThroughScheduler0, (AbstractResultCache) resultCacheColumn0, (AbstractLoadBalancer) rAIDb1_WRR0, (RecoveryLog) null, (long) 544, (long) 544, (long) 544);
      Commit commit0 = new Commit("", (long) 544);
      try { 
        commit0.executeCommand(rAIDb1DistributedRequestManager0);
        fail("Expecting exception: NoMoreBackendException");
      
      } catch(NoMoreBackendException e) {
         //
         // No backend enabled on this controller
         //
         assertThrownBy("org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit", e);
      }
  }
}
