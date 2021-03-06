/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:36:41 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.backend;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.monitor.backend.RequestsCollector;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RequestsCollector_ESTest extends RequestsCollector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.backend.RequestsCollector.getValue(Ljava/lang/Object;)J: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.backend.RequestsCollector.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      RequestsCollector requestsCollector0 = new RequestsCollector("?LPN_$!LZoSpeqs~J:-", "!&U$");
      // Undeclared exception!
      try { 
        requestsCollector0.getValue("!&U$");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to org.objectweb.cjdbc.controller.backend.DatabaseBackend
         //
         assertThrownBy("org.objectweb.cjdbc.common.monitor.backend.RequestsCollector", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.monitor.backend.RequestsCollector.<init>(Ljava/lang/String;Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.monitor.backend.RequestsCollector.getDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      RequestsCollector requestsCollector0 = new RequestsCollector("?LPN_$!LZoSpeqs~J:-", "!&U$");
      String string0 = requestsCollector0.getDescription();
      assertEquals("monitoring.backend.total.requests", string0);
  }
}
