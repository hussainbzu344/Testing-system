/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 22:30:01 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.tasks;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AbstractWriteRequest;
import org.objectweb.cjdbc.common.sql.AlterRequest;
import org.objectweb.cjdbc.common.sql.InsertRequest;
import org.objectweb.cjdbc.controller.cache.metadata.MetadataCache;
import org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask;
import org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class WriteRequestWithKeysTask_ESTest extends WriteRequestWithKeysTask_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask.getResult()Lorg/objectweb/cjdbc/controller/virtualdatabase/ControllerResultSet;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask.<init>(IILorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      InsertRequest insertRequest0 = new InsertRequest((String) null, false, 2553, (String) null, false);
      MetadataCache metadataCache0 = new MetadataCache(0, 0);
      WriteRequestWithKeysTask writeRequestWithKeysTask0 = new WriteRequestWithKeysTask(0, 0, (AbstractWriteRequest) insertRequest0, metadataCache0);
      ControllerResultSet controllerResultSet0 = writeRequestWithKeysTask0.getResult();
      assertNull(controllerResultSet0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask.<init>(IILorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask.toString()Ljava/lang/String;: I5 Branch 12 IFEQ L333 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      AlterRequest alterRequest0 = new AlterRequest("", true, (-18), "");
      WriteRequestWithKeysTask writeRequestWithKeysTask0 = new WriteRequestWithKeysTask((-18), (-18), (AbstractWriteRequest) alterRequest0, (MetadataCache) null);
      String string0 = writeRequestWithKeysTask0.toString();
      assertEquals("WriteWithKeys Task from transaction:0()", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask.<init>(IILorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;Lorg/objectweb/cjdbc/controller/cache/metadata/MetadataCache;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask.toString()Ljava/lang/String;: I5 Branch 12 IFEQ L333 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      InsertRequest insertRequest0 = new InsertRequest((String) null, false, 2553, (String) null, false);
      insertRequest0.setIsAutoCommit(true);
      MetadataCache metadataCache0 = new MetadataCache(0, 0);
      WriteRequestWithKeysTask writeRequestWithKeysTask0 = new WriteRequestWithKeysTask(0, 0, (AbstractWriteRequest) insertRequest0, metadataCache0);
      String string0 = writeRequestWithKeysTask0.toString();
      assertEquals("WriteWithKeys  Autocommit Task (null)", string0);
  }
}