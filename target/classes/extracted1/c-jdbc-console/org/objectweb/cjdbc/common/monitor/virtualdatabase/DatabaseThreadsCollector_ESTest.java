/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:48:10 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.virtualdatabase;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DatabaseThreadsCollector_ESTest extends DatabaseThreadsCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector.getValue(Ljava/lang/Object;)J: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      DatabaseThreadsCollector databaseThreadsCollector0 = new DatabaseThreadsCollector((String) null);
      // Undeclared exception!
      try { 
        databaseThreadsCollector0.getValue((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector.getDescription()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector.<init>(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      DatabaseThreadsCollector databaseThreadsCollector0 = new DatabaseThreadsCollector((String) null);
      String string0 = databaseThreadsCollector0.getDescription();
      assertEquals("monitoring.virtualdatabase.threads.count", string0);
  }
}
