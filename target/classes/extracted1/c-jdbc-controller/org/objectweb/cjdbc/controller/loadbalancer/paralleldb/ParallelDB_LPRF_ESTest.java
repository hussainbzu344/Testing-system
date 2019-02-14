/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 22:41:45 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.paralleldb;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AlterRequest;
import org.objectweb.cjdbc.common.sql.InsertRequest;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.NoneBlobFilter;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParallelDB_LPRF_ESTest extends ParallelDB_LPRF_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.getParallelDBXml()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Controller controller0 = new Controller("ce9mvYsKa<st9;", 91, 305);
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "ce9mvYsKa<st9;", 305, true, 91, 305, (long) 91, 305, (AbstractBlobFilter) noneBlobFilter0);
      ParallelDB_LPRF parallelDB_LPRF0 = new ParallelDB_LPRF(virtualDatabase0);
      String string0 = parallelDB_LPRF0.getParallelDBXml();
      assertEquals("<ParallelDB-LeastPendingRequestsFirst/>", string0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.chooseBackendForReadRequest(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)Lorg/objectweb/cjdbc/controller/backend/DatabaseBackend;: I47 Branch 1 IFNE L87 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Controller controller0 = new Controller(")", (-5198), (-5198));
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, ")", (-5198), false, (-5198), (-5198), (long) (-5198), (-5198), (AbstractBlobFilter) noneBlobFilter0);
      ParallelDB_LPRF parallelDB_LPRF0 = new ParallelDB_LPRF(virtualDatabase0);
      InsertRequest insertRequest0 = new InsertRequest("ParallelDB Least Pending Request First Request load balancer: !!!Warning!!! No backend nodes found\n", false, (-5198), ")", false);
      try { 
        parallelDB_LPRF0.chooseBackendForReadRequest(insertRequest0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // loadbalancer.execute.no.backend.available
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.chooseBackendForWriteRequest(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)Lorg/objectweb/cjdbc/controller/backend/DatabaseBackend;: I47 Branch 8 IFNE L158 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Controller controller0 = new Controller("EQ", 676, 676);
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "EQ", 676, true, 676, 676, (long) 676, 676, (AbstractBlobFilter) noneBlobFilter0);
      ParallelDB_LPRF parallelDB_LPRF0 = new ParallelDB_LPRF(virtualDatabase0);
      AlterRequest alterRequest0 = new AlterRequest("EQ", true, 676, "EQ");
      try { 
        parallelDB_LPRF0.chooseBackendForWriteRequest(alterRequest0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // loadbalancer.execute.no.backend.available
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF.getInformation()Ljava/lang/String;: I10 Branch 16 IFNE L211 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Controller controller0 = new Controller(")", (-5198), (-5198));
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, ")", (-5198), false, (-5198), (-5198), (long) (-5198), (-5198), (AbstractBlobFilter) noneBlobFilter0);
      ParallelDB_LPRF parallelDB_LPRF0 = new ParallelDB_LPRF(virtualDatabase0);
      String string0 = parallelDB_LPRF0.getInformation();
      assertEquals("ParallelDB Least Pending Request First Request load balancer: !!!Warning!!! No backend nodes found\n", string0);
  }
}