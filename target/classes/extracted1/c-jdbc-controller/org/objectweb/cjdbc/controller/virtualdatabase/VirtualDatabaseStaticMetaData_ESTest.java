/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 00:29:13 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.NoneBlobFilter;
import org.objectweb.cjdbc.common.sql.metadata.MetadataContainer;
import org.objectweb.cjdbc.controller.backend.DatabaseBackend;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VirtualDatabaseStaticMetaData_ESTest extends VirtualDatabaseStaticMetaData_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData.getMetadataContainer()Lorg/objectweb/cjdbc/common/sql/metadata/MetadataContainer;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Controller controller0 = new Controller("", 789, 789);
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "", 789, true, 789, 4202, (long) 4202, 0, (AbstractBlobFilter) null);
      VirtualDatabaseStaticMetaData virtualDatabaseStaticMetaData0 = virtualDatabase0.getStaticMetaData();
      MetadataContainer metadataContainer0 = virtualDatabaseStaticMetaData0.getMetadataContainer();
      assertNull(metadataContainer0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData.<init>(Lorg/objectweb/cjdbc/controller/virtualdatabase/VirtualDatabase;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData.gatherStaticMetadata(Lorg/objectweb/cjdbc/controller/backend/DatabaseBackend;)V: I10 Branch 1 IFEQ L69 - true
   * Goal 3. org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData.gatherStaticMetadata(Lorg/objectweb/cjdbc/controller/backend/DatabaseBackend;)V: I29 Branch 2 IFNONNULL L71 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Controller controller0 = new Controller("me-Btd6tgTa", 866, 866);
      NoneBlobFilter noneBlobFilter0 = new NoneBlobFilter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "me-Btd6tgTa", 866, true, 866, 866, (long) 866, 866, (AbstractBlobFilter) noneBlobFilter0);
      VirtualDatabaseStaticMetaData virtualDatabaseStaticMetaData0 = new VirtualDatabaseStaticMetaData(virtualDatabase0);
      DatabaseBackend databaseBackend0 = new DatabaseBackend("me-Btd6tgTa", "me-Btd6tgTa", "me-Btd6tgTa", "me-Btd6tgTa", "me-Btd6tgTa", true, "me-Btd6tgTa");
      virtualDatabaseStaticMetaData0.gatherStaticMetadata(databaseBackend0);
      assertEquals("C-JDBC", databaseBackend0.getDatabaseProductName());
  }
}
