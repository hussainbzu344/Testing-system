/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:59:35 GMT 2016
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
import org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR;
import org.objectweb.cjdbc.controller.recoverylog.RecoveryLog;
import org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb2DistributedRequestManager;
import org.objectweb.cjdbc.controller.scheduler.AbstractScheduler;
import org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PassThroughScheduler;
import org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ReleaseSavepoint_ESTest extends ReleaseSavepoint_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.toString()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ReleaseSavepoint releaseSavepoint0 = new ReleaseSavepoint((-1L), "current_time");
      String string0 = releaseSavepoint0.toString();
      assertEquals("Release savepoint current_time from transaction -1", string0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.getSavepointName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.equals(Ljava/lang/Object;)Z: I5 Branch 14 IFEQ L219 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ReleaseSavepoint releaseSavepoint0 = new ReleaseSavepoint((-1L), "current_time");
      boolean boolean0 = releaseSavepoint0.equals(releaseSavepoint0);
      assertTrue(boolean0);
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I4 Branch 3 IFNE L119 - false
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I75 Branch 7 IFNULL L141 - true
   * Goal 4. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.executeCommand(Lorg/objectweb/cjdbc/controller/requestmanager/distributed/DistributedRequestManager;)Ljava/lang/Object;: I243 Branch 13 IFEQ L192 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Controller controller0 = new Controller((String) null, (-1609), (-1609));
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      DistributedVirtualDatabase distributedVirtualDatabase0 = new DistributedVirtualDatabase(controller0, (String) null, (String) null, (-1609), true, (-1609), (-1609), (long) (-1609), (-1609), (AbstractBlobFilter) noneBlobFilter0);
      RAIDb2PassThroughScheduler rAIDb2PassThroughScheduler0 = new RAIDb2PassThroughScheduler((VirtualDatabase) distributedVirtualDatabase0);
      ResultCacheDatabase resultCacheDatabase0 = new ResultCacheDatabase((-1609), (-1609));
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_WRR rAIDb2_WRR0 = new RAIDb2_WRR((VirtualDatabase) distributedVirtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      RAIDb2DistributedRequestManager rAIDb2DistributedRequestManager0 = new RAIDb2DistributedRequestManager(distributedVirtualDatabase0, (AbstractScheduler) rAIDb2PassThroughScheduler0, (AbstractResultCache) resultCacheDatabase0, (AbstractLoadBalancer) rAIDb2_WRR0, (RecoveryLog) null, (long) (-1609), (long) (-1609), (long) (-1609));
      ReleaseSavepoint releaseSavepoint0 = new ReleaseSavepoint((long) (-1609), (String) null);
      try { 
        releaseSavepoint0.executeCommand(rAIDb2DistributedRequestManager0);
        fail("Expecting exception: NoMoreBackendException");
      
      } catch(NoMoreBackendException e) {
         //
         // No backend enabled on this controller
         //
         assertThrownBy("org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.<init>(JLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint.equals(Ljava/lang/Object;)Z: I5 Branch 14 IFEQ L219 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ReleaseSavepoint releaseSavepoint0 = new ReleaseSavepoint(0L, "H=(Bo-( b");
      boolean boolean0 = releaseSavepoint0.equals("H=(Bo-( b");
      assertFalse(boolean0);
  }
}
