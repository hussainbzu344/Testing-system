/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:47:18 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.client;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.client.ClientActiveTimeCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ClientActiveTimeCollector_ESTest extends ClientActiveTimeCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.monitor.client.ClientActiveTimeCollector.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ClientActiveTimeCollector clientActiveTimeCollector0 = null;
      try {
        clientActiveTimeCollector0 = new ClientActiveTimeCollector((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.client.AbstractClientDataCollector", e);
      }
  }
}
