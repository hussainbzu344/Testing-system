/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:28:27 GMT 2016
 */

package org.objectweb.cjdbc.common.users;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.users.AdminUser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AdminUser_ESTest extends AdminUser_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.users.AdminUser.getXml()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.users.AdminUser.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      AdminUser adminUser0 = new AdminUser("|s:XvCuATgUy6M?", "FieldCannotBeNull");
      String string0 = adminUser0.getXml();
      assertEquals("<User username=\"|s:XvCuATgUy6M?\" password=\"FieldCannotBeNull\" />", string0);
  }
}
