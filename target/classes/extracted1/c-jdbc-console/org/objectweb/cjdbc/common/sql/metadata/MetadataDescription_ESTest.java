/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:42:52 GMT 2016
 */

package org.objectweb.cjdbc.common.sql.metadata;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.metadata.MetadataDescription;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MetadataDescription_ESTest extends MetadataDescription_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.sql.metadata.MetadataDescription.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      MetadataDescription metadataDescription0 = new MetadataDescription();
  }
}
