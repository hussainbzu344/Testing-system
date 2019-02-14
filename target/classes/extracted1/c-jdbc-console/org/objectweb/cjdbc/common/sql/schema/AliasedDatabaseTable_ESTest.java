/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:53:46 GMT 2016
 */

package org.objectweb.cjdbc.common.sql.schema;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable;
import org.objectweb.cjdbc.common.sql.schema.DatabaseTable;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AliasedDatabaseTable_ESTest extends AliasedDatabaseTable_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getTable()Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getAlias()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 5. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - true
   * Goal 6. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I20 Branch 4 IFNONNULL L103 - false
   * Goal 7. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I25 Branch 5 IFNONNULL L104 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I31 Branch 6 IFEQ L104 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("InvalidFieldValue", 0);
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, (String) null);
      boolean boolean0 = aliasedDatabaseTable0.equals(aliasedDatabaseTable0);
      assertTrue(boolean0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      AliasedDatabaseTable aliasedDatabaseTable0 = null;
      try {
        aliasedDatabaseTable0 = new AliasedDatabaseTable((DatabaseTable) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal null database table in AliasedDatabaseTable constructor
         //
         assertThrownBy("org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("InvalidFieldValue", 0);
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, (String) null);
      boolean boolean0 = aliasedDatabaseTable0.equals((Object) null);
      assertFalse(boolean0);
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("InvalidFieldValue", 0);
      Object object0 = new Object();
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, (String) null);
      boolean boolean0 = aliasedDatabaseTable0.equals(object0);
      assertFalse(boolean0);
  }

  //Test case number: 4
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getTable()Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getAlias()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 5. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - true
   * Goal 6. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I20 Branch 4 IFNONNULL L103 - true
   * Goal 7. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I45 Branch 7 IFLE L106 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I51 Branch 8 IFEQ L106 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("Tx'r", 0);
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, "Tx'r");
      boolean boolean0 = aliasedDatabaseTable0.equals(aliasedDatabaseTable0);
      assertTrue(boolean0);
  }

  //Test case number: 5
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getAlias()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I20 Branch 4 IFNONNULL L103 - false
   * Goal 6. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I25 Branch 5 IFNONNULL L104 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("org.objectweb.cjdbc.common.sql.schema.DatabaseTable");
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, "org.objectweb.cjdbc.common.sql.schema.DatabaseTable");
      AliasedDatabaseTable aliasedDatabaseTable1 = new AliasedDatabaseTable(databaseTable0, (String) null);
      boolean boolean0 = aliasedDatabaseTable1.equals(aliasedDatabaseTable0);
      assertFalse(boolean0);
  }

  //Test case number: 6
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getTable()Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getAlias()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 5. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - true
   * Goal 6. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I20 Branch 4 IFNONNULL L103 - false
   * Goal 7. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I25 Branch 5 IFNONNULL L104 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I31 Branch 6 IFEQ L104 - true
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("InvalidFieldValue", 0);
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, (String) null);
      DatabaseTable databaseTable1 = new DatabaseTable("^rJZT");
      AliasedDatabaseTable aliasedDatabaseTable1 = new AliasedDatabaseTable(databaseTable1, (String) null);
      boolean boolean0 = aliasedDatabaseTable0.equals(aliasedDatabaseTable1);
      assertFalse(boolean0);
  }

  //Test case number: 7
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getAlias()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - true
   * Goal 5. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I20 Branch 4 IFNONNULL L103 - true
   * Goal 6. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I45 Branch 7 IFLE L106 - true
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("Tx'r", 0);
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, "Sv0x5?.");
      AliasedDatabaseTable aliasedDatabaseTable1 = new AliasedDatabaseTable(databaseTable0, "Tx'r");
      boolean boolean0 = aliasedDatabaseTable0.equals(aliasedDatabaseTable1);
      assertFalse(boolean0);
  }

  //Test case number: 8
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getTable()Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.getAlias()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.<init>(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseTable;Ljava/lang/String;)V: I7 Branch 1 IFNONNULL L61 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I3 Branch 2 IFNULL L99 - false
   * Goal 5. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I6 Branch 3 IFNE L99 - true
   * Goal 6. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I20 Branch 4 IFNONNULL L103 - true
   * Goal 7. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I45 Branch 7 IFLE L106 - false
   * Goal 8. org.objectweb.cjdbc.common.sql.schema.AliasedDatabaseTable.equals(Ljava/lang/Object;)Z: I51 Branch 8 IFEQ L106 - true
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      DatabaseTable databaseTable0 = new DatabaseTable("Tx'r", 0);
      AliasedDatabaseTable aliasedDatabaseTable0 = new AliasedDatabaseTable(databaseTable0, "Tx'r");
      DatabaseTable databaseTable1 = new DatabaseTable("");
      AliasedDatabaseTable aliasedDatabaseTable1 = new AliasedDatabaseTable(databaseTable1, "Tx'r");
      boolean boolean0 = aliasedDatabaseTable1.equals(aliasedDatabaseTable0);
      assertFalse(boolean0);
  }
}
