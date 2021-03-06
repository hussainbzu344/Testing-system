/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:08:27 GMT 2016
 */

package org.objectweb.cjdbc.console.monitoring;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.HeadlessException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.jmx.mbeans.DataCollectorMBean;
import org.objectweb.cjdbc.common.monitor.AbstractDataCollector;
import org.objectweb.cjdbc.common.monitor.cache.CacheEntriesCollector;
import org.objectweb.cjdbc.console.monitoring.MonitoringGraph;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MonitoringGraph_ESTest extends MonitoringGraph_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.monitoring.MonitoringGraph.<init>(Lorg/objectweb/cjdbc/common/monitor/AbstractDataCollector;Lorg/objectweb/cjdbc/common/jmx/mbeans/DataCollectorMBean;)V: I189 Branch 1 IFEQ L113 - false
   * Goal 2. org.objectweb.cjdbc.console.monitoring.MonitoringGraph.display()V: I16 Branch 2 IFEQ L124 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      CacheEntriesCollector cacheEntriesCollector0 = new CacheEntriesCollector("7-8\"'/k)ggIr2Ikh");
      MonitoringGraph monitoringGraph0 = null;
      try {
        monitoringGraph0 = new MonitoringGraph((AbstractDataCollector) cacheEntriesCollector0, (DataCollectorMBean) null);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.awt.GraphicsEnvironment", e);
      }
  }
}
