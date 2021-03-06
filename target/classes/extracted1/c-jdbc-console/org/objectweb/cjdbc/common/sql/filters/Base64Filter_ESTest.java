/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 14:37:41 GMT 2016
 */

package org.objectweb.cjdbc.common.sql.filters;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.filters.Base64Filter;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Base64Filter_ESTest extends Base64Filter_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.Base64Filter.decode(Ljava/lang/String;)[B: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.Base64Filter.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.Base64Filter.decode([B)[B: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Base64Filter base64Filter0 = new Base64Filter();
      byte[] byteArray0 = base64Filter0.decode("");
      assertNull(byteArray0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.Base64Filter.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.Base64Filter.encode([B)Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.sql.filters.Base64Filter.encode(Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Base64Filter base64Filter0 = new Base64Filter();
      String string0 = base64Filter0.encode("1903-07-01T00:00:00Z");
      assertEquals("M7Q0MNY1MNc1MAwxMLACoygA\n", string0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.sql.filters.Base64Filter.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.sql.filters.Base64Filter.getXml()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Base64Filter base64Filter0 = new Base64Filter();
      String string0 = base64Filter0.getXml();
      assertEquals("base64", string0);
  }
}
