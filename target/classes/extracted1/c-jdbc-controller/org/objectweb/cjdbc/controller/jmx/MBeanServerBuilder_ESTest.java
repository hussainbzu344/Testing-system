/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 01:29:51 GMT 2016
 */

package org.objectweb.cjdbc.controller.jmx;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import javax.management.MBeanServer;
import javax.management.MBeanServerDelegate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer;
import org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class MBeanServerBuilder_ESTest extends MBeanServerBuilder_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder.newMBeanServer(Ljava/lang/String;Ljavax/management/MBeanServer;Ljavax/management/MBeanServerDelegate;)Ljavax/management/MBeanServer;: I12 Branch 1 IFNONNULL L55 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      MBeanServerBuilder mBeanServerBuilder0 = new MBeanServerBuilder();
      mx4j.server.ChainedMBeanServer chainedMBeanServer0 = new mx4j.server.ChainedMBeanServer();
      MBeanServerDelegate mBeanServerDelegate0 = new MBeanServerDelegate();
      AuthenticatingMBeanServer authenticatingMBeanServer0 = (AuthenticatingMBeanServer)mBeanServerBuilder0.newMBeanServer("MBean is not standard nor dynamic", chainedMBeanServer0, mBeanServerDelegate0);
      assertNotNull(authenticatingMBeanServer0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder.newMBeanServer(Ljava/lang/String;Ljavax/management/MBeanServer;Ljavax/management/MBeanServerDelegate;)Ljavax/management/MBeanServer;: I12 Branch 1 IFNONNULL L55 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      MBeanServerBuilder mBeanServerBuilder0 = new MBeanServerBuilder();
      MBeanServerDelegate mBeanServerDelegate0 = new MBeanServerDelegate();
      AuthenticatingMBeanServer authenticatingMBeanServer0 = (AuthenticatingMBeanServer)mBeanServerBuilder0.newMBeanServer("`T(w[R]ahdVX", (MBeanServer) null, mBeanServerDelegate0);
      assertNotNull(authenticatingMBeanServer0);
  }
}