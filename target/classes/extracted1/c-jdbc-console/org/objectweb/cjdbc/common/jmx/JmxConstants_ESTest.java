/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:45:20 GMT 2016
 */

package org.objectweb.cjdbc.common.jmx;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import javax.management.ObjectName;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.jmx.JmxConstants;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class JmxConstants_ESTest extends JmxConstants_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getRequestManagerObjectName(Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getRequestManagerObjectName("InHb=P,iADk%");
      assertNull(objectName0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getVirtualDbObjectName(Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getVirtualDbObjectName("type=virtualdatabase,name=A+Y");
      assertNull(objectName0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getCacheObjectName(Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getCacheObjectName("cTw3J?8![g");
      assertNotNull(objectName0);
  }

  //Test case number: 3
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      JmxConstants jmxConstants0 = new JmxConstants();
      assertEquals(8090, JmxConstants.DEFAULT_JMX_HTTP_PORT);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getDatabaseBackendObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getDatabaseBackendObjectName("EhRQVu/[P", "EhRQVu/[P");
      assertNotNull(objectName0);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getRecoveryLogObjectName(Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getRecoveryLogObjectName("");
      assertNotNull(objectName0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getDataCollectorObjectName()Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.jmx.JmxConstants.mbeanNeedAuthentication(Ljavax/management/ObjectName;)Z: I7 Branch 1 IF_ICMPNE L236 - false
   * Goal 4. org.objectweb.cjdbc.common.jmx.JmxConstants.mbeanNeedAuthentication(Ljavax/management/ObjectName;)Z: I13 Branch 2 IF_ICMPNE L236 - true
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getDataCollectorObjectName();
      assertNotNull(objectName0);
      
      boolean boolean0 = JmxConstants.mbeanNeedAuthentication(objectName0);
      assertFalse(boolean0);
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getLoadBalancerObjectName(Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.jmx.JmxConstants.getVirtualDbObjectNameFromBackend(Ljavax/management/ObjectName;)Ljavax/management/ObjectName;: root-Branch
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getLoadBalancerObjectName("A+Y");
      ObjectName objectName1 = JmxConstants.getVirtualDbObjectNameFromBackend(objectName0);
      assertFalse(objectName1.equals((Object)objectName0));
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getControllerObjectName()Ljavax/management/ObjectName;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.jmx.JmxConstants.mbeanNeedAuthentication(Ljavax/management/ObjectName;)Z: I7 Branch 1 IF_ICMPNE L236 - true
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getControllerObjectName();
      boolean boolean0 = JmxConstants.mbeanNeedAuthentication(objectName0);
      assertFalse(boolean0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.jmx.JmxConstants.getLoadBalancerObjectName(Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.jmx.JmxConstants.getJmxObjectName(Ljava/lang/String;Ljava/lang/String;)Ljavax/management/ObjectName;: root-Branch
   * Goal 3. org.objectweb.cjdbc.common.jmx.JmxConstants.mbeanNeedAuthentication(Ljavax/management/ObjectName;)Z: I7 Branch 1 IF_ICMPNE L236 - false
   * Goal 4. org.objectweb.cjdbc.common.jmx.JmxConstants.mbeanNeedAuthentication(Ljavax/management/ObjectName;)Z: I13 Branch 2 IF_ICMPNE L236 - false
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      ObjectName objectName0 = JmxConstants.getLoadBalancerObjectName("A+Y");
      boolean boolean0 = JmxConstants.mbeanNeedAuthentication(objectName0);
      assertTrue(boolean0);
  }
}
