/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:31:56 GMT 2016
 */

package org.objectweb.cjdbc.common.sql;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AlterRequest;
import org.objectweb.cjdbc.common.sql.DropRequest;
import org.objectweb.cjdbc.common.sql.UpdateRequest;
import org.objectweb.cjdbc.common.sql.schema.DatabaseSchema;
import org.objectweb.cjdbc.common.stream.CJDBCInputStream;
import org.objectweb.cjdbc.driver.Blob;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractWriteRequest_ESTest extends AbstractWriteRequest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.<init>(Lorg/objectweb/cjdbc/common/stream/CJDBCInputStream;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      Blob blob0 = new Blob(byteArray0);
      blob0.setBytes(881L, byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)blob0.getBinaryStream();
      CJDBCInputStream cJDBCInputStream0 = new CJDBCInputStream((InputStream) byteArrayInputStream0);
      AlterRequest alterRequest0 = new AlterRequest(cJDBCInputStream0);
      assertTrue(alterRequest0.mightBlock());
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.getTableName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;I)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.getPk()Ljava/lang/String;: root-Branch
   * Goal 4. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.getColumns()Ljava/util/ArrayList;: root-Branch
   * Goal 5. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.cloneTableNameAndColumns(Lorg/objectweb/cjdbc/common/sql/AbstractWriteRequest;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      AlterRequest alterRequest0 = new AlterRequest(";&r.sStn.Ghj>&G", false, (-1957), ";&r.sStn.Ghj>&G");
      UpdateRequest updateRequest0 = new UpdateRequest(";&r.sStn.Ghj>&G", false, 0, ";&r.sStn.Ghj>&G", (DatabaseSchema) null, 0, false);
      alterRequest0.cloneTableNameAndColumns(updateRequest0);
      assertTrue(updateRequest0.mightBlock());
      assertTrue(alterRequest0.mightBlock());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.mightBlock()Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;I)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      UpdateRequest updateRequest0 = new UpdateRequest((String) null, false, 0, "");
      boolean boolean0 = updateRequest0.mightBlock();
      assertTrue(boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.<init>(Ljava/lang/String;ZILjava/lang/String;I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.AbstractWriteRequest.setBlocking(Z)V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      DropRequest dropRequest0 = new DropRequest((String) null, false, (-756), (String) null);
      dropRequest0.setBlocking(true);
      assertTrue(dropRequest0.mightBlock());
  }
}
