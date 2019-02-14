/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 00:17:41 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase.protocol;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ReplicateLogEntries_ESTest extends ReplicateLogEntries_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries.<init>(Ljava/lang/String;Ljava/lang/String;J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries.getDumpCheckpointName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ReplicateLogEntries replicateLogEntries0 = new ReplicateLogEntries("aTy$#`~P:Enu]", "", 4L);
      String string0 = replicateLogEntries0.getDumpCheckpointName();
      assertEquals("", string0);
      assertEquals("aTy$#`~P:Enu]", replicateLogEntries0.getCheckpointName());
      assertEquals(4L, replicateLogEntries0.getCheckpointId());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries.<init>(Ljava/lang/String;Ljava/lang/String;J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries.getCheckpointName()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ReplicateLogEntries replicateLogEntries0 = new ReplicateLogEntries("aTy$#`~P:Enu]", "", 4L);
      String string0 = replicateLogEntries0.getCheckpointName();
      assertEquals(4L, replicateLogEntries0.getCheckpointId());
      assertEquals("aTy$#`~P:Enu]", string0);
      assertEquals("", replicateLogEntries0.getDumpCheckpointName());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries.<init>(Ljava/lang/String;Ljava/lang/String;J)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries.getCheckpointId()J: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ReplicateLogEntries replicateLogEntries0 = new ReplicateLogEntries("aTy$#`~P:Enu]", "", 4L);
      long long0 = replicateLogEntries0.getCheckpointId();
      assertEquals("aTy$#`~P:Enu]", replicateLogEntries0.getCheckpointName());
      assertEquals("", replicateLogEntries0.getDumpCheckpointName());
      assertEquals(4L, long0);
  }
}
