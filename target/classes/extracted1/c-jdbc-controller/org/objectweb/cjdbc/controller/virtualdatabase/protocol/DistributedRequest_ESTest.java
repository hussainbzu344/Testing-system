/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:32:38 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase.protocol;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AbstractRequest;
import org.objectweb.cjdbc.common.sql.StoredProcedure;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.ExecWriteStoredProcedure;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DistributedRequest_ESTest extends DistributedRequest_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.DistributedRequest.getRequest()Lorg/objectweb/cjdbc/common/sql/AbstractRequest;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.DistributedRequest.<init>(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ExecWriteStoredProcedure execWriteStoredProcedure0 = new ExecWriteStoredProcedure((StoredProcedure) null);
      AbstractRequest abstractRequest0 = execWriteStoredProcedure0.getRequest();
      assertNull(abstractRequest0);
  }
}
