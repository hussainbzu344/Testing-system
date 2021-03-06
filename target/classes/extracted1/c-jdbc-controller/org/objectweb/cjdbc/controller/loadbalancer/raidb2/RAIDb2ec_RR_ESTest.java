/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 22:47:08 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.raidb2;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.NotImplementedException;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.StoredProcedure;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.Base64Filter;
import org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter;
import org.objectweb.cjdbc.common.sql.filters.NoneBlobFilter;
import org.objectweb.cjdbc.controller.cache.metadata.MetadataCache;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingAll;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin;
import org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RAIDb2ec_RR_ESTest extends RAIDb2ec_RR_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.getRaidb2Xml()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/errorchecking/ErrorCheckingPolicy;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Controller controller0 = new Controller((String) null, 398, 398);
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "", 398, false, 594, 398, (long) 594, 398, (AbstractBlobFilter) null);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      ErrorCheckingRoundRobin errorCheckingRoundRobin0 = new ErrorCheckingRoundRobin(421);
      RAIDb2ec_RR rAIDb2ec_RR0 = new RAIDb2ec_RR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0, (ErrorCheckingPolicy) errorCheckingRoundRobin0, 594);
      String string0 = rAIDb2ec_RR0.getRaidb2Xml();
      assertEquals("<RAIDb-2ec-RoundRobin/>", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.execReadOnlyReadStoredProcedure(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/errorchecking/ErrorCheckingPolicy;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Controller controller0 = new Controller("y>(mi.g{Ja3", (-128), (-128));
      NoneBlobFilter noneBlobFilter0 = (NoneBlobFilter)AbstractBlobFilter.getBlobFilterInstance("y>(mi.g{Ja3");
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "y>(mi.g{Ja3", (-1348), true, (-790), 1024, 0L, Integer.MIN_VALUE, (AbstractBlobFilter) noneBlobFilter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb2ec_RR rAIDb2ec_RR0 = new RAIDb2ec_RR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0, (ErrorCheckingPolicy) null, (-128));
      StoredProcedure storedProcedure0 = new StoredProcedure(":execReadRequest", false, (-1366), "y>(mi.g{Ja3", false);
      MetadataCache metadataCache0 = new MetadataCache(150, 1);
      try { 
        rAIDb2ec_RR0.execReadOnlyReadStoredProcedure(storedProcedure0, metadataCache0);
        fail("Expecting exception: NotImplementedException");
      
      } catch(NotImplementedException e) {
         //
         // org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR:execReadStoredProcedure not implemented
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/errorchecking/ErrorCheckingPolicy;I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.execReadRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Controller controller0 = new Controller("DATABASE INFO", 1, 93);
      Base64Filter base64Filter0 = new Base64Filter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "DATABASE INFO", 93, true, 93, 42, 287L, 29, (AbstractBlobFilter) base64Filter0);
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      ErrorCheckingAll errorCheckingAll0 = new ErrorCheckingAll();
      RAIDb2ec_RR rAIDb2ec_RR0 = new RAIDb2ec_RR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0, (ErrorCheckingPolicy) errorCheckingAll0, 42);
      SelectRequest selectRequest0 = new SelectRequest("DATABASE INFO", false, 42, "h,_O#KC$3Kw[M");
      MetadataCache metadataCache0 = new MetadataCache(29, 93);
      try { 
        rAIDb2ec_RR0.execReadRequest(selectRequest0, metadataCache0);
        fail("Expecting exception: NotImplementedException");
      
      } catch(NotImplementedException e) {
         //
         // org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR:execReadRequest not implemented
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/WaitForCompletionPolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/errorchecking/ErrorCheckingPolicy;I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR.getInformation()Ljava/lang/String;: I4 Branch 1 IFNONNULL L134 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Controller controller0 = new Controller((String) null, 13, 13);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, (String) null, 13, true, 13, 13, (long) 13, 13, (AbstractBlobFilter) blobEscapedFilter0);
      ErrorCheckingAll errorCheckingAll0 = new ErrorCheckingAll();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      WaitForCompletionPolicy waitForCompletionPolicy0 = new WaitForCompletionPolicy();
      RAIDb2ec_RR rAIDb2ec_RR0 = new RAIDb2ec_RR(virtualDatabase0, waitForCompletionPolicy0, createTablePolicy0, (ErrorCheckingPolicy) errorCheckingAll0, 13);
      String string0 = rAIDb2ec_RR0.getInformation();
      assertEquals("RAIDb-2 Error Checking with Round Robin Request load balancer: !!!Warning!!! No backend nodes found\n", string0);
  }
}
