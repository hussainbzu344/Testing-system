/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 20:08:02 GMT 2016
 */

package org.objectweb.cjdbc.controller.recoverylog.events;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.recoverylog.LoggerThread;
import org.objectweb.cjdbc.controller.recoverylog.events.ResetLogEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ResetLogEvent_ESTest extends ResetLogEvent_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.recoverylog.events.ResetLogEvent.belongToTransaction(J)Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.recoverylog.events.ResetLogEvent.<init>(JJLjava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ResetLogEvent resetLogEvent0 = new ResetLogEvent((-1681L), (-1681L), "recovery.jdbc.loggerthread.log.reset.failed");
      boolean boolean0 = resetLogEvent0.belongToTransaction((-1486L));
      assertFalse(boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.recoverylog.events.ResetLogEvent.execute(Lorg/objectweb/cjdbc/controller/recoverylog/LoggerThread;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.recoverylog.events.ResetLogEvent.<init>(JJLjava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ResetLogEvent resetLogEvent0 = new ResetLogEvent((-1681L), (-1681L), "recovery.jdbc.loggerthread.log.reset.failed");
      // Undeclared exception!
      try { 
        resetLogEvent0.execute((LoggerThread) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.recoverylog.events.ResetLogEvent", e);
      }
  }
}
