/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 01:52:59 GMT 2016
 */

package org.objectweb.cjdbc.controller.scheduler.raidb1;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AbstractWriteRequest;
import org.objectweb.cjdbc.common.sql.CreateRequest;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.StoredProcedure;
import org.objectweb.cjdbc.controller.requestmanager.TransactionMarkerMetaData;
import org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RAIDb1OptimisticQueryLevelScheduler_ESTest extends RAIDb1OptimisticQueryLevelScheduler_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.scheduleNonSuspendedWriteRequest(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      // Undeclared exception!
      try { 
        rAIDb1OptimisticQueryLevelScheduler0.scheduleNonSuspendedWriteRequest((AbstractWriteRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.commitTransaction(J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      rAIDb1OptimisticQueryLevelScheduler0.commitTransaction(1L);
      assertEquals(0, rAIDb1OptimisticQueryLevelScheduler0.getPendingWrites());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.setSavepointTransaction(JLjava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      TransactionMarkerMetaData transactionMarkerMetaData0 = new TransactionMarkerMetaData(1L, 1L, "Connection.setHoldability(int) unsupported");
      int int0 = rAIDb1OptimisticQueryLevelScheduler0.setSavepoint(transactionMarkerMetaData0);
      assertEquals(1, int0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.rollbackTransaction(J)V: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      rAIDb1OptimisticQueryLevelScheduler0.rollbackTransaction(0L);
      assertFalse(rAIDb1OptimisticQueryLevelScheduler0.isSuspendedTransactions());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.readCompletedNotify(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      SelectRequest selectRequest0 = new SelectRequest((String) null, true, (-2024), (String) null);
      rAIDb1OptimisticQueryLevelScheduler0.readCompletedNotify(selectRequest0);
      assertEquals(-2024, selectRequest0.getTimeout());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.releaseSavepointTransaction(JLjava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      rAIDb1OptimisticQueryLevelScheduler0.releaseSavepointTransaction(0L, (String) null);
      assertFalse(rAIDb1OptimisticQueryLevelScheduler0.isSuspendedWrites());
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.scheduleNonSuspendedStoredProcedure(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      StoredProcedure storedProcedure0 = new StoredProcedure("X{Ee_:", true, (-1372), "X{Ee_:", true);
      rAIDb1OptimisticQueryLevelScheduler0.scheduleNonSuspendedStoredProcedure(storedProcedure0);
      assertEquals(0L, storedProcedure0.getId());
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.getXmlImpl()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      String string0 = rAIDb1OptimisticQueryLevelScheduler0.getXmlImpl();
      assertEquals("<RAIDb-1Scheduler level=\"optimisticQuery\"/>", string0);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.rollbackTransaction(JLjava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      rAIDb1OptimisticQueryLevelScheduler0.rollbackTransaction(110L, "");
      assertEquals(0, rAIDb1OptimisticQueryLevelScheduler0.getParsingGranularity());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.scheduleReadRequest(Lorg/objectweb/cjdbc/common/sql/SelectRequest;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      SelectRequest selectRequest0 = new SelectRequest("Q m(]YvYM=\"?kG", true, 235, "Q m(]YvYM=\"?kG");
      rAIDb1OptimisticQueryLevelScheduler0.scheduleReadRequest(selectRequest0);
      assertEquals(0L, selectRequest0.getId());
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.notifyWriteCompleted(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 1 IFNE L125 - true
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      CreateRequest createRequest0 = new CreateRequest("supportsNonNullableColumns", true, 273, "");
      createRequest0.setIsAutoCommit(true);
      rAIDb1OptimisticQueryLevelScheduler0.notifyWriteCompleted(createRequest0);
      assertEquals("<RAIDb-1Scheduler level=\"optimisticQuery\"/>", rAIDb1OptimisticQueryLevelScheduler0.getXmlImpl());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.notifyWriteCompleted(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: I4 Branch 1 IFNE L125 - false
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      CreateRequest createRequest0 = new CreateRequest("supportsNonNullableColumns", true, 268, "");
      rAIDb1OptimisticQueryLevelScheduler0.notifyWriteCompleted(createRequest0);
      assertEquals(0, rAIDb1OptimisticQueryLevelScheduler0.getParsingGranularity());
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.notifyStoredProcedureCompleted(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;)V: I4 Branch 2 IFNE L145 - true
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      StoredProcedure storedProcedure0 = new StoredProcedure("", true, 268, "", true);
      storedProcedure0.setIsAutoCommit(true);
      rAIDb1OptimisticQueryLevelScheduler0.notifyStoredProcedureCompleted(storedProcedure0);
      assertNull(storedProcedure0.getLogin());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler.notifyStoredProcedureCompleted(Lorg/objectweb/cjdbc/common/sql/StoredProcedure;)V: I4 Branch 2 IFNE L145 - false
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      RAIDb1OptimisticQueryLevelScheduler rAIDb1OptimisticQueryLevelScheduler0 = new RAIDb1OptimisticQueryLevelScheduler();
      StoredProcedure storedProcedure0 = new StoredProcedure("", true, 268, "", true);
      rAIDb1OptimisticQueryLevelScheduler0.notifyStoredProcedureCompleted(storedProcedure0);
      assertNull(storedProcedure0.getLogin());
  }
}