/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:03:13 GMT 2016
 */

package org.objectweb.cjdbc.console.monitoring;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.event.WindowListener;
import java.util.NoSuchElementException;
import javax.swing.JFrame;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.jmx.mbeans.DataCollectorMBean;
import org.objectweb.cjdbc.console.monitoring.MonitoringConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MonitoringConsole_ESTest extends MonitoringConsole_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.monitoring.MonitoringConsole.getBackendActionCommand(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      String string0 = MonitoringConsole.getBackendActionCommand("", "", ")h b");
      assertEquals("graph   )h b", string0);
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.monitoring.MonitoringConsole.graph(Ljava/lang/String;Lorg/objectweb/cjdbc/common/jmx/mbeans/DataCollectorMBean;IIIILjava/awt/event/WindowListener;)Ljavax/swing/JFrame;: I25 Branch 36 IFLE L883 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      JFrame jFrame0 = MonitoringConsole.graph("[>%/b4", (DataCollectorMBean) null, 1482, 1482, 1482, 1482, (WindowListener) null);
      assertNull(jFrame0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.console.monitoring.MonitoringConsole.graph(Ljava/lang/String;Lorg/objectweb/cjdbc/common/jmx/mbeans/DataCollectorMBean;IIIILjava/awt/event/WindowListener;)Ljavax/swing/JFrame;: I25 Branch 36 IFLE L883 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        MonitoringConsole.graph("graph", (DataCollectorMBean) null, 81, 81, 81, 81, (WindowListener) null);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.util.StringTokenizer", e);
      }
  }
}