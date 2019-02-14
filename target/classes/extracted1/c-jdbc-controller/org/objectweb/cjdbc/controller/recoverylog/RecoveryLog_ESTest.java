/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 20:29:17 GMT 2016
 */

package org.objectweb.cjdbc.controller.recoverylog;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.recoverylog.RecoveryLog;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RecoveryLog_ESTest extends RecoveryLog_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.invalidateInternalConnection()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V: I53 Branch 1 IF_ICMPGE L200 - false
   * Goal 3. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.getDatabaseConnection()Ljava/sql/Connection;: I4 Branch 2 IFNONNULL L237 - false
   * Goal 4. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.getDatabaseConnection()Ljava/sql/Connection;: I9 Branch 3 IFEQ L239 - true
   * Goal 5. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.getDatabaseConnection()Ljava/sql/Connection;: I93 Branch 5 IFEQ L258 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      RecoveryLog recoveryLog0 = null;
      try {
        recoveryLog0 = new RecoveryLog("8B,3", "8B,3", "", "", "", 0, 0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to connect to the database: java.sql.SQLException: recovery.jdbc.connect.failed
         //
         assertThrownBy("org.objectweb.cjdbc.controller.recoverylog.RecoveryLog", e);
      }
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.invalidateInternalConnection()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V: I53 Branch 1 IF_ICMPGE L200 - true
   * Goal 3. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.getDatabaseConnection()Ljava/sql/Connection;: I4 Branch 2 IFNONNULL L237 - false
   * Goal 4. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.getDatabaseConnection()Ljava/sql/Connection;: I9 Branch 3 IFEQ L239 - true
   * Goal 5. org.objectweb.cjdbc.controller.recoverylog.RecoveryLog.getDatabaseConnection()Ljava/sql/Connection;: I93 Branch 5 IFEQ L258 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      RecoveryLog recoveryLog0 = null;
      try {
        recoveryLog0 = new RecoveryLog((String) null, (String) null, (String) null, (String) null, (String) null, 1328, 1328);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unable to connect to the database: java.sql.SQLException: recovery.jdbc.connect.failed
         //
         assertThrownBy("org.objectweb.cjdbc.controller.recoverylog.RecoveryLog", e);
      }
  }
}