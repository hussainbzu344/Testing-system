/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 22:52:29 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.raidb2;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.NotImplementedException;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.StoredProcedure;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter;
import org.objectweb.cjdbc.common.sql.filters.NoneBlobFilter;
import org.objectweb.cjdbc.controller.cache.metadata.MetadataCache;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RAIDb2_WRR_ESTest extends RAIDb2_WRR_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.execReadOnlyReadStoredProcedure(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Controller controller0 = new Controller("64", (-527), (-527));
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "", (-527), true, 12, (-3746), (long) (-3746), 12, (AbstractBlobFilter) blobEscapedFilter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_WRR rAIDb2_WRR0 = new RAIDb2_WRR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      StoredProcedure storedProcedure0 = new StoredProcedure("@OO(Wt", true, 0, "64", true);
      MetadataCache metadataCache0 = new MetadataCache(504, 0);
      try { 
        rAIDb2_WRR0.execReadOnlyReadStoredProcedure(storedProcedure0, metadataCache0);
        fail("Expecting exception: NotImplementedException");
      
      } catch(NotImplementedException e) {
         //
         // org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR:execReadStoredProcedure not implemented
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.getRaidb2Xml()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      NoneBlobFilter noneBlobFilter0 = (NoneBlobFilter)AbstractBlobFilter.getBlobFilterInstance("");
      VirtualDatabase virtualDatabase0 = new VirtualDatabase((Controller) null, "", 0, false, 0, 0, (long) 0, 0, (AbstractBlobFilter) noneBlobFilter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      RAIDb2_WRR rAIDb2_WRR0 = new RAIDb2_WRR(virtualDatabase0, waitForCompletionPolicy0, (CreateTablePolicy) null);
      String string0 = rAIDb2_WRR0.getRaidb2Xml();
      assertEquals("<RAIDb-2-WeightedRoundRobin></RAIDb-2-WeightedRoundRobin>", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.execReadRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Controller controller0 = new Controller("java.lang.Double", (-73), (-1415));
      NoneBlobFilter noneBlobFilter0 = (NoneBlobFilter)AbstractBlobFilter.getBlobFilterInstance("");
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "java.lang.Double", 103, true, (-1415), 0, (long) (-73), 103, (AbstractBlobFilter) noneBlobFilter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_WRR rAIDb2_WRR0 = new RAIDb2_WRR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      SelectRequest selectRequest0 = new SelectRequest("java.lang.Double", true, 103, "");
      MetadataCache metadataCache0 = new MetadataCache(0, 103);
      try { 
        rAIDb2_WRR0.execReadRequest(selectRequest0, metadataCache0);
        fail("Expecting exception: NotImplementedException");
      
      } catch(NotImplementedException e) {
         //
         // org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR:execReadRequest not implemented
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.setWeight(Ljava/lang/String;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Controller controller0 = new Controller("jdQ92qtk&JVj", (-1338), (-1338));
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "jdQ92qtk&JVj", (-2048), true, (-1338), (-1338), (long) (-2048), (-2048), (AbstractBlobFilter) noneBlobFilter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_WRR rAIDb2_WRR0 = new RAIDb2_WRR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      try { 
        rAIDb2_WRR0.setWeight("jdQ92qtk&JVj", (-2048));
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Weight is not supported with this load balancer
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR", e);
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR.getInformation()Ljava/lang/String;: I4 Branch 1 IFNONNULL L143 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      Controller controller0 = new Controller("return when a majority of nodes pomp|etes", (-1017), (-1017));
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "return when a majority of nodes pomp|etes", (-1017), false, (-1017), (-1017), (long) (-1017), (-1017), (AbstractBlobFilter) noneBlobFilter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2_WRR rAIDb2_WRR0 = new RAIDb2_WRR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0);
      String string0 = rAIDb2_WRR0.getInformation();
      assertEquals("RAIDb-2 Weighted Round Robin Request load balancer: !!!Warning!!! No backend nodes found\n", string0);
  }
}
