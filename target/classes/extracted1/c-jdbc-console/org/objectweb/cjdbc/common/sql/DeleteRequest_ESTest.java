/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:48:25 GMT 2016
 */

package org.objectweb.cjdbc.common.sql;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.DeleteRequest;
import org.objectweb.cjdbc.common.sql.schema.DatabaseProcedure;
import org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter;
import org.objectweb.cjdbc.common.sql.schema.DatabaseSchema;
import org.objectweb.cjdbc.common.stream.CJDBCInputStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DeleteRequest_ESTest extends DeleteRequest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Lorg/objectweb/cjdbc/common/stream/CJDBCInputStream;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      DeleteRequest deleteRequest0 = null;
      try {
        deleteRequest0 = new DeleteRequest((CJDBCInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.sql.AbstractRequest", e);
      }
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I21 Branch 31 IFNULL L423 - true
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I45 Branch 32 IFNULL L428 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I60 Branch 33 IF_ICMPGE L431 - true
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest((String) null, false, 32, "F4");
      DatabaseProcedure databaseProcedure0 = new DatabaseProcedure((String) null, "where ", 32);
      ArrayList arrayList0 = databaseProcedure0.getParameters();
      deleteRequest0.columns = arrayList0;
      deleteRequest0.debug();
      assertFalse(deleteRequest0.isUnique());
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.returnsResultSet()Z: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - false
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("", false, 0, "", (DatabaseSchema) null, 0, false);
      boolean boolean0 = deleteRequest0.returnsResultSet();
      assertFalse(boolean0);
      assertFalse(deleteRequest0.isUnique());
      assertTrue(deleteRequest0.isParsed());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.needsMacroProcessing()Z: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("P>;", false, (-3049), "");
      boolean boolean0 = deleteRequest0.needsMacroProcessing();
      assertFalse(deleteRequest0.isUnique());
      assertTrue(boolean0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.isUnique()Z: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - false
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("", false, 0, "", (DatabaseSchema) null, 0, false);
      boolean boolean0 = deleteRequest0.isUnique();
      assertTrue(deleteRequest0.isParsed());
      assertFalse(boolean0);
  }

  //Test case number: 5
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.getValues()Ljava/util/ArrayList;: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - false
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("y[r#BwvcOlRA", false, 95, "]u", (DatabaseSchema) null, 0, false);
      deleteRequest0.getValues();
      assertFalse(deleteRequest0.isUnique());
      assertTrue(deleteRequest0.isParsed());
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - true
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I15 Branch 2 IFNONNULL L162 - false
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      DeleteRequest deleteRequest0 = null;
      try {
        deleteRequest0 = new DeleteRequest("rl[FO5zi", true, 95, "rl[FO5zi", (DatabaseSchema) null, 95, true);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Unable to parse request with an undefined database schema
         //
         assertThrownBy("org.objectweb.cjdbc.common.sql.DeleteRequest", e);
      }
  }

  //Test case number: 7
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.cloneParsing(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)V: I4 Branch 19 IFNE L278 - true
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("", false, 0, "", (DatabaseSchema) null, 0, false);
      deleteRequest0.cloneParsing(deleteRequest0);
      assertFalse(deleteRequest0.isUnique());
      assertTrue(deleteRequest0.isParsed());
  }

  //Test case number: 8
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.cloneParsing(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)V: I4 Branch 19 IFNE L278 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("", false, 0, "", (DatabaseSchema) null, 0, false);
      DeleteRequest deleteRequest1 = new DeleteRequest("", true, 0, "");
      deleteRequest0.cloneParsing(deleteRequest1);
      assertFalse(deleteRequest1.isUnique());
      assertTrue(deleteRequest0.isParsed());
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.parse(Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: I3 Branch 1 IFNE L155 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I21 Branch 31 IFNULL L423 - false
   * Goal 5. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I45 Branch 32 IFNULL L428 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest("y[r#BwvcOlRA", false, 95, "]u", (DatabaseSchema) null, 0, false);
      deleteRequest0.tableName = "Columns columns:";
      deleteRequest0.debug();
      assertFalse(deleteRequest0.isUnique());
      assertTrue(deleteRequest0.isParsed());
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.DeleteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I21 Branch 31 IFNULL L423 - true
   * Goal 3. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I45 Branch 32 IFNULL L428 - false
   * Goal 4. org.objectweb.cjdbc.common.sql.DeleteRequest.debug()V: I60 Branch 33 IF_ICMPGE L431 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      DeleteRequest deleteRequest0 = new DeleteRequest((String) null, false, 32, "F4");
      DatabaseProcedure databaseProcedure0 = new DatabaseProcedure((String) null, "where ", 32);
      DatabaseProcedureParameter databaseProcedureParameter0 = new DatabaseProcedureParameter("F4", 32, (-1883), "Deleted table: ", 1.0F, (-1883), 2364, 2364, 131, "where ");
      databaseProcedure0.addParameter(databaseProcedureParameter0);
      ArrayList arrayList0 = databaseProcedure0.getParameters();
      deleteRequest0.columns = arrayList0;
      // Undeclared exception!
      try { 
        deleteRequest0.debug();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter cannot be cast to org.objectweb.cjdbc.common.sql.schema.TableColumn
         //
         assertThrownBy("org.objectweb.cjdbc.common.sql.DeleteRequest", e);
      }
  }
}
