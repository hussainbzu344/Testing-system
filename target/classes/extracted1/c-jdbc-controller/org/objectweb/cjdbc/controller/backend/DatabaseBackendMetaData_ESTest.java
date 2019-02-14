/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 19:08:23 GMT 2016
 */

package org.objectweb.cjdbc.controller.backend;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.log.Trace;
import org.objectweb.cjdbc.common.sql.schema.DatabaseSchema;
import org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData;
import org.objectweb.cjdbc.controller.connection.AbstractConnectionManager;
import org.objectweb.cjdbc.controller.connection.FailFastPoolConnectionManager;
import org.objectweb.cjdbc.controller.connection.SimpleConnectionManager;
import org.objectweb.cjdbc.controller.connection.VariablePoolConnectionManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DatabaseBackendMetaData_ESTest extends DatabaseBackendMetaData_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.<init>(Lorg/objectweb/cjdbc/controller/connection/AbstractConnectionManager;Lorg/objectweb/cjdbc/common/log/Trace;IZLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I4 Branch 8 IFNULL L194 - true
   * Goal 3. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I23 Branch 9 IFNE L204 - false
   * Goal 4. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I38 Branch 10 IFNONNULL L208 - false
   * Goal 5. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I2058 Branch 12 IFEQ L665 - false
   * Goal 6. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I2086 Branch 14 IFNULL L673 - true
   * Goal 7. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I2096 Branch 15 IFNE L676 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager(", ", "Qp#S@i", "{", "Qp#S@i", "", "", 59);
      DatabaseBackendMetaData databaseBackendMetaData0 = new DatabaseBackendMetaData((AbstractConnectionManager) failFastPoolConnectionManager0, (Trace) null, 59, false, "Qp#S@i");
      // Undeclared exception!
      try { 
        databaseBackendMetaData0.retrieveDatabaseMetadata();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData", e);
      }
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.<init>(Lorg/objectweb/cjdbc/controller/connection/AbstractConnectionManager;Lorg/objectweb/cjdbc/common/log/Trace;IZLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I4 Branch 8 IFNULL L194 - true
   * Goal 3. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I23 Branch 9 IFNE L204 - true
   * Goal 4. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I2058 Branch 12 IFEQ L665 - true
   * Goal 5. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I2086 Branch 14 IFNULL L673 - true
   * Goal 6. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.retrieveDatabaseMetadata()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: I2096 Branch 15 IFNE L676 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      SimpleConnectionManager simpleConnectionManager0 = new SimpleConnectionManager("R++*'H\"q", "R++*'H\"q", "", "", "", "");
      Trace trace0 = Trace.getLogger("");
      simpleConnectionManager0.initializeConnections();
      DatabaseBackendMetaData databaseBackendMetaData0 = new DatabaseBackendMetaData((AbstractConnectionManager) simpleConnectionManager0, trace0, 0, false, "R++*'H\"q");
      try { 
        databaseBackendMetaData0.retrieveDatabaseMetadata();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // backend.meta.failed.get.info
         //
         assertThrownBy("org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData", e);
      }
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.<init>(Lorg/objectweb/cjdbc/controller/connection/AbstractConnectionManager;Lorg/objectweb/cjdbc/common/log/Trace;IZLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I4 Branch 16 IFNE L881 - false
   * Goal 3. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.getDatabaseSchema()Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;: I4 Branch 24 IFNONNULL L935 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      SimpleConnectionManager simpleConnectionManager0 = new SimpleConnectionManager("", "", "", "AE:u@Qns", "", "");
      Trace trace0 = Trace.getLogger("AE:u@Qns");
      DatabaseBackendMetaData databaseBackendMetaData0 = new DatabaseBackendMetaData((AbstractConnectionManager) simpleConnectionManager0, trace0, 0, false, "");
      DatabaseSchema databaseSchema0 = databaseBackendMetaData0.getDatabaseSchema();
      assertNull(databaseSchema0);
  }

  //Test case number: 3
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.<init>(Lorg/objectweb/cjdbc/controller/connection/AbstractConnectionManager;Lorg/objectweb/cjdbc/common/log/Trace;IZLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I4 Branch 16 IFNE L881 - true
   * Goal 3. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I21 Branch 17 IFNE L888 - true
   * Goal 4. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I85 Branch 20 IFEQ L906 - true
   * Goal 5. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I113 Branch 22 IFNULL L912 - true
   * Goal 6. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I123 Branch 23 IFNE L915 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      VariablePoolConnectionManager variablePoolConnectionManager0 = new VariablePoolConnectionManager("", "", "", "&u{lhgJ!5E^[8GJFh~", "m>|a*XsxO&Y.Od@[t9", "", 1338, 1338, 1338, 1338, 1232);
      Trace trace0 = Trace.getLogger("&u{lhgJ!5E^[8GJFh~");
      DatabaseBackendMetaData databaseBackendMetaData0 = new DatabaseBackendMetaData((AbstractConnectionManager) variablePoolConnectionManager0, trace0, 1338, false, "getJDBCMajorVersion");
      variablePoolConnectionManager0.initializeConnections();
      try { 
        databaseBackendMetaData0.createDatabaseSchemaDynamically();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // backend.meta.failed.get.info
         //
         assertThrownBy("org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData", e);
      }
  }

  //Test case number: 4
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.<init>(Lorg/objectweb/cjdbc/controller/connection/AbstractConnectionManager;Lorg/objectweb/cjdbc/common/log/Trace;IZLjava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I4 Branch 16 IFNE L881 - true
   * Goal 3. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I21 Branch 17 IFNE L888 - false
   * Goal 4. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I36 Branch 18 IFNONNULL L892 - false
   * Goal 5. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I85 Branch 20 IFEQ L906 - false
   * Goal 6. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I113 Branch 22 IFNULL L912 - true
   * Goal 7. org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData.createDatabaseSchemaDynamically()V: I123 Branch 23 IFNE L915 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager("getProcedureColumns", "getProcedureColumns", "getProcedureColumns", "", "", "getProcedureColumns", 75);
      DatabaseBackendMetaData databaseBackendMetaData0 = new DatabaseBackendMetaData((AbstractConnectionManager) failFastPoolConnectionManager0, (Trace) null, 75, false, "getCatalogSeparator");
      // Undeclared exception!
      try { 
        databaseBackendMetaData0.createDatabaseSchemaDynamically();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.backend.DatabaseBackendMetaData", e);
      }
  }
}
