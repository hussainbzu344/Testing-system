/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:28:21 GMT 2016
 */

package org.objectweb.cjdbc.common.users;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.users.VirtualDatabaseUser;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class VirtualDatabaseUser_ESTest extends VirtualDatabaseUser_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.users.VirtualDatabaseUser.getXml()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.users.VirtualDatabaseUser.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      VirtualDatabaseUser virtualDatabaseUser0 = new VirtualDatabaseUser("~s'<%DX,LmPZ8/68n", "");
      String string0 = virtualDatabaseUser0.getXml();
      assertEquals("<VirtualLogin vLogin=\"~s'<%DX,LmPZ8/68n\" vPassword=\"\"/>", string0);
  }
}
