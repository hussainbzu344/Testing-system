/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 20:18:39 GMT 2016
 */

package org.objectweb.cjdbc.controller.recoverylog.events;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.recoverylog.events.LogEntry;
import org.objectweb.cjdbc.controller.recoverylog.events.LogRollbackEvent;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class LogRollbackEvent_ESTest extends LogRollbackEvent_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.controller.recoverylog.events.LogRollbackEvent.<init>(Lorg/objectweb/cjdbc/controller/recoverylog/events/LogEntry;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      LogEntry logEntry0 = new LogEntry(486L, (String) null, (String) null, 486L, true);
      LogRollbackEvent logRollbackEvent0 = new LogRollbackEvent(logEntry0);
  }
}
