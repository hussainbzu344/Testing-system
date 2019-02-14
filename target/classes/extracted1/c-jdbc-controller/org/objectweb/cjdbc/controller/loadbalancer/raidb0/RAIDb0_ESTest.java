/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 21:37:15 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.raidb0;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AlterRequest;
import org.objectweb.cjdbc.common.sql.CreateRequest;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.StoredProcedure;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.Base64Filter;
import org.objectweb.cjdbc.common.sql.filters.BlobEscapedFilter;
import org.objectweb.cjdbc.common.sql.filters.HexaBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.NoneBlobFilter;
import org.objectweb.cjdbc.controller.backend.DatabaseBackend;
import org.objectweb.cjdbc.controller.cache.metadata.MetadataCache;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0;
import org.objectweb.cjdbc.controller.requestmanager.TransactionMarkerMetaData;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RAIDb0_ESTest extends RAIDb0_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.execReadStoredProcedure(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      NoneBlobFilter noneBlobFilter0 = (NoneBlobFilter)AbstractBlobFilter.getBlobFilterInstance("4N@l@&1zP'ue/HbEu");
      VirtualDatabase virtualDatabase0 = new VirtualDatabase((Controller) null, "4N@l@&1zP'ue/HbEu", 0, false, 0, 0, (long) 0, 0, (AbstractBlobFilter) noneBlobFilter0);
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, (CreateTablePolicy) null);
      StoredProcedure storedProcedure0 = new StoredProcedure((String) null, false, 2, "loadbalancer.from.not.found", true);
      MetadataCache metadataCache0 = new MetadataCache(1664, 366);
      try { 
        rAIDb0_0.execReadStoredProcedure(storedProcedure0, metadataCache0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Stored procedure calls are not supported with RAIDb-0 load balancers.
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.getNumberOfEnabledBackends()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      Controller controller0 = new Controller("supportsExpressionsInOrderBy", 0, 0);
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "", (-2321), false, 0, (-2321), (long) (-2321), 2, (AbstractBlobFilter) noneBlobFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      int int0 = rAIDb0_0.getNumberOfEnabledBackends();
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.execReadOnlyReadStoredProcedure(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      Controller controller0 = new Controller("cjdbc.virtualdatabase.backend.enable.write", 0, 4);
      Base64Filter base64Filter0 = new Base64Filter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, (String) null, 4, true, 0, (-3046), (long) 0, 0, (AbstractBlobFilter) base64Filter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      try { 
        rAIDb0_0.execReadOnlyReadStoredProcedure((StoredProcedure) null, (MetadataCache) null);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Stored procedure calls are not supported with RAIDb-0 load balancers.
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.execWriteStoredProcedure(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;)I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      Controller controller0 = new Controller("DY", 95, 95);
      HexaBlobFilter hexaBlobFilter0 = new HexaBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "DY", 95, true, 95, 0, 9223372036854775807L, 0, (AbstractBlobFilter) hexaBlobFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      StoredProcedure storedProcedure0 = new StoredProcedure("DY", true, (-316), "Y-?x2-ktqj(aGy", true);
      try { 
        rAIDb0_0.execWriteStoredProcedure(storedProcedure0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Stored procedure calls are not supported with RAIDb-0 load balancers.
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.getInformation()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      VirtualDatabase virtualDatabase0 = new VirtualDatabase((Controller) null, "xFSDBxP}[U>2W|18E", (-2169), true, 4, 221, (long) 221, 49, (AbstractBlobFilter) null);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      String string0 = rAIDb0_0.getInformation();
      assertEquals("RAIDb-0 Request load balancer\n", string0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.begin(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData(3142L, (long) 52, "controller.backup.recovery.failed");
      Controller controller0 = new Controller("w$;rxcT8l^-n%tXp", 1925, 415);
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "{1D^I", 2723, true, 1925, 415, (long) 2, (-63), (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      rAIDb0_0.begin(transactionMarkerMetaData0);
      assertEquals("loadbalancer", rAIDb0_0.getAssociatedString());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.getXmlImpl()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      Controller controller0 = new Controller((String) null, 1332, 1332);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, (String) null, 1332, true, 1332, 0, (long) 1332, 1332, (AbstractBlobFilter) blobEscapedFilter0);
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, (CreateTablePolicy) null);
      // Undeclared exception!
      try { 
        rAIDb0_0.getXmlImpl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.setWeight(Ljava/lang/String;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      Controller controller0 = new Controller("", 0, 0);
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "", 0, true, 0, 184, 1L, 0, (AbstractBlobFilter) null);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      try { 
        rAIDb0_0.setWeight("loadbalancer.rollbacksavepoint.failed.stack", 0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Weight is not supported with this load balancer
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.execReadRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: I41 Branch 1 IFNONNULL L150 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      Controller controller0 = new Controller("J", 10, 10);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "J", 10, true, 10, 10, (long) 10, 10, (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      SelectRequest selectRequest0 = new SelectRequest("J", true, 10, "J");
      MetadataCache metadataCache0 = new MetadataCache(10, 10);
      try { 
        rAIDb0_0.execReadRequest(selectRequest0, metadataCache0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // loadbalancer.from.not.found
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.execWriteRequest(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)I: I46 Branch 11 IFNONNULL L257 - false
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      Controller controller0 = new Controller("controller.backup.reovery.aied", 637, 637);
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "controller.backup.reovery.aied", 637, false, 637, 637, (long) 637, 637, (AbstractBlobFilter) blobEscapedFilter0);
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      AlterRequest alterRequest0 = new AlterRequest("controller.backup.reovery.aied", false, 637, "controller.backup.reovery.aied");
      try { 
        rAIDb0_0.execWriteRequest(alterRequest0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // loadbalancer.request.target.table.not.found
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.execWriteRequestWithKeys(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: I46 Branch 27 IFNONNULL L465 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      Controller controller0 = new Controller("A36qYQ&[~|", (-1363), (-1363));
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "A36qYQ&[~|", (-1363), false, (-1363), (-1363), (long) (-1363), (-1363), (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      CreateRequest createRequest0 = new CreateRequest("A36qYQ&[~|", false, (-1363), "A36qYQ&[~|");
      // Undeclared exception!
      try { 
        rAIDb0_0.execWriteRequestWithKeys(createRequest0, (MetadataCache) null);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1363
         //
         assertThrownBy("java.lang.String", e);
      }
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.executeRequestOnBackend(Lorg/objectweb/cjdbc/common/sql/SelectRequest;Lorg/objectweb/cjdbc/controller/backend/DatabaseBackend;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: I15 Branch 44 IFNONNULL L672 - false
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      Controller controller0 = new Controller("hc_T1gjM5QP%y]", 34, 34);
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "hc_T1gjM5QP%y]", 34, false, 34, 34, (long) 34, 34, (AbstractBlobFilter) noneBlobFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      DatabaseBackend databaseBackend0 = new DatabaseBackend("hc_T1gjM5QP%y]", "hc_T1gjM5QP%y]", "hc_T1gjM5QP%y]", "hc_T1gjM5QP%y]", "hc_T1gjM5QP%y]", false, "hc_T1gjM5QP%y]");
      SelectRequest selectRequest0 = new SelectRequest("hc_T1gjM5QP%y]", false, 34, "hc_T1gjM5QP%y]");
      MetadataCache metadataCache0 = new MetadataCache(34, 0);
      try { 
        rAIDb0_0.executeRequestOnBackend(selectRequest0, databaseBackend0, metadataCache0);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // loadbalancer.connectionmanager.not.found
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.commit(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;)V: I60 Branch 51 IF_ICMPGE L867 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.commit(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;)V: I94 Branch 53 IFNE L875 - false
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData(3142L, (long) 52, "controller.backup.recovery.failed");
      Controller controller0 = new Controller("w$;rxcT8l^-n%tXp", 1925, 415);
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "{1D^I", 2723, true, 1925, 415, (long) 2, (-63), (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      rAIDb0_0.commit(transactionMarkerMetaData0);
      assertEquals(1, rAIDb0_0.getParsingGranularity());
  }

  //Test case number: 13
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.rollback(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;)V: I60 Branch 62 IF_ICMPGE L991 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.rollback(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;)V: I94 Branch 64 IFNE L999 - false
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      Controller controller0 = new Controller("J", 10, 10);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "J", 10, true, 10, 10, (long) 10, 10, (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData((long) 10, (long) 10, "J");
      rAIDb0_0.rollback(transactionMarkerMetaData0);
      assertEquals(10L, transactionMarkerMetaData0.getTimeout());
  }

  //Test case number: 14
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.rollback(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;Ljava/lang/String;)V: I60 Branch 73 IF_ICMPGE L1118 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.rollback(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;Ljava/lang/String;)V: I94 Branch 75 IFNE L1126 - false
   */

	@Test(timeout=300000)
  public void test14()  throws Throwable  {
      Controller controller0 = new Controller("J", 10, 10);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "J", 10, true, 10, 10, (long) 10, 10, (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData((long) 10, (long) 10, "J");
      rAIDb0_0.rollback(transactionMarkerMetaData0, "J");
      assertEquals("RAIDb-0 Request load balancer\n", rAIDb0_0.getInformation());
  }

  //Test case number: 15
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.releaseSavepoint(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;Ljava/lang/String;)V: I60 Branch 84 IF_ICMPGE L1250 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.releaseSavepoint(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;Ljava/lang/String;)V: I94 Branch 86 IFNE L1258 - false
   */

	@Test(timeout=300000)
  public void test15()  throws Throwable  {
      Controller controller0 = new Controller("<RAD$-0>", 1574, 1574);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "<RAD$-0>", 1574, false, 1574, 1574, (long) 1574, 1574, (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData((long) 1574, (long) 1574, "<RAD$-0>");
      rAIDb0_0.releaseSavepoint(transactionMarkerMetaData0, "<RAD$-0>");
      assertEquals(0, rAIDb0_0.getRAIDbLevel());
  }

  //Test case number: 16
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.setSavepoint(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;Ljava/lang/String;)V: I60 Branch 95 IF_ICMPGE L1381 - true
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.setSavepoint(Lorg/objectweb/cjdbc/controller/requestmanager/TransactionMarkerMetaData;Ljava/lang/String;)V: I94 Branch 97 IFNE L1389 - false
   */

	@Test(timeout=300000)
  public void test16()  throws Throwable  {
      Controller controller0 = new Controller("J", 10, 10);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "J", 10, true, 10, 10, (long) 10, 10, (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData((long) 10, (long) 10, "J");
      rAIDb0_0.setSavepoint(transactionMarkerMetaData0, "J");
      assertEquals(10L, transactionMarkerMetaData0.getTimeout());
  }

  //Test case number: 17
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTablePolicy;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0.disableBackend(Lorg/objectweb/cjdbc/controller/backend/DatabaseBackend;)V: I13 Branch 108 IF_ICMPGE L1543 - true
   */

	@Test(timeout=300000)
  public void test17()  throws Throwable  {
      Controller controller0 = new Controller("<RAD$-0>", 1574, 1574);
      BlobEscapedFilter blobEscapedFilter0 = new BlobEscapedFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "<RAD$-0>", 1574, false, 1574, 1574, (long) 1574, 1574, (AbstractBlobFilter) blobEscapedFilter0);
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      RAIDb0 rAIDb0_0 = new RAIDb0(virtualDatabase0, createTablePolicy0);
      // Undeclared exception!
      try { 
        rAIDb0_0.disableBackend((DatabaseBackend) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0", e);
      }
  }
}
