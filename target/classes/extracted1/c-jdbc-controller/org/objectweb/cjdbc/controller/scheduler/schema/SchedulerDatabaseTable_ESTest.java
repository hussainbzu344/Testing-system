/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 02:38:25 GMT 2016
 */

package org.objectweb.cjdbc.controller.scheduler.schema;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.schema.DatabaseTable;
import org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable;
import org.objectweb.cjdbc.controller.scheduler.schema.TransactionExclusiveLock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class SchedulerDatabaseTable_ESTest extends SchedulerDatabaseTable_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.getLock()Lorg/objectweb/cjdbc/controller/scheduler/schema/TransactionExclusiveLock;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("", 30);
      SchedulerDatabaseTable schedulerDatabaseTable0 = new SchedulerDatabaseTable(databaseTable0);
      TransactionExclusiveLock transactionExclusiveLock0 = schedulerDatabaseTable0.getLock();
      assertFalse(transactionExclusiveLock0.isLocked());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.getName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 1 IFNULL L90 - false
   * Goal 4. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 2 IFNE L90 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("", 30);
      SchedulerDatabaseTable schedulerDatabaseTable0 = new SchedulerDatabaseTable(databaseTable0);
      boolean boolean0 = schedulerDatabaseTable0.equals(schedulerDatabaseTable0);
      assertTrue(boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.getInformation(Z)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("", 30);
      SchedulerDatabaseTable schedulerDatabaseTable0 = new SchedulerDatabaseTable(databaseTable0);
      String string0 = schedulerDatabaseTable0.getInformation(true);
      assertEquals("Table : ", string0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 1 IFNULL L90 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("", 30);
      SchedulerDatabaseTable schedulerDatabaseTable0 = new SchedulerDatabaseTable(databaseTable0);
      boolean boolean0 = schedulerDatabaseTable0.equals((Object) null);
      assertFalse(boolean0);
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 1 IFNULL L90 - false
   * Goal 3. org.objectweb.cjdbc.controller.scheduler.schema.SchedulerDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 2 IFNE L90 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("", 30);
      SchedulerDatabaseTable schedulerDatabaseTable0 = new SchedulerDatabaseTable(databaseTable0);
      boolean boolean0 = schedulerDatabaseTable0.equals("Table : ");
      assertFalse(boolean0);
  }
}