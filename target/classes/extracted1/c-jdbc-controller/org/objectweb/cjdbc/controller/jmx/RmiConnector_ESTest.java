/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 01:40:14 GMT 2016
 */

package org.objectweb.cjdbc.controller.jmx;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.Checkbox;
import java.awt.Scrollbar;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import javax.management.remote.JMXAuthenticator;
import javax.sql.rowset.serial.SerialBlob;
import mx4j.tools.remote.PasswordAuthenticator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.net.SSLConfiguration;
import org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter;
import org.objectweb.cjdbc.common.sql.filters.Base64Filter;
import org.objectweb.cjdbc.controller.core.Controller;
import org.objectweb.cjdbc.controller.jmx.AbstractStandardMBean;
import org.objectweb.cjdbc.controller.jmx.RmiConnector;
import org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase;
import org.objectweb.cjdbc.driver.Blob;
import org.objectweb.cjdbc.driver.Clob;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RmiConnector_ESTest extends RmiConnector_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.getHostName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.getPort()I: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.getRmiConnectors()Ljava/util/List;: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      Controller controller0 = new Controller("loadbalancer.rollbacksavepoint.failed", 913, 77);
      Base64Filter base64Filter0 = new Base64Filter();
      VirtualDatabase virtualDatabase0 = new VirtualDatabase(controller0, "tk<;l0}4R3>4", 654, true, 77, 913, 0L, 3392, (AbstractBlobFilter) base64Filter0);
      // Undeclared exception!
      try { 
        virtualDatabase0.viewGroupBackends();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         assertThrownBy("java.util.ArrayList", e);
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.getControllerName()Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      SerialBlob serialBlob0 = new SerialBlob(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)serialBlob0.getBinaryStream();
      PasswordAuthenticator passwordAuthenticator0 = new PasswordAuthenticator((InputStream) byteArrayInputStream0);
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      RmiConnector rmiConnector0 = new RmiConnector("", "java.naming.factory.initial", 538, (JMXAuthenticator) passwordAuthenticator0, sSLConfiguration0);
      String string0 = rmiConnector0.getControllerName();
      assertEquals("java.naming.factory.initial", rmiConnector0.getHostName());
      assertEquals(538, rmiConnector0.getPort());
      assertEquals("", string0);
  }

  //Test case number: 2
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.setSslConfig(Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Blob blob0 = new Blob(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)blob0.getBinaryStream();
      PasswordAuthenticator passwordAuthenticator0 = new PasswordAuthenticator((InputStream) byteArrayInputStream0);
      RmiConnector rmiConnector0 = new RmiConnector("mbeanName", "", 1, (JMXAuthenticator) passwordAuthenticator0, (SSLConfiguration) null);
      rmiConnector0.setSslConfig((SSLConfiguration) null);
      assertEquals("mbeanName", rmiConnector0.getControllerName());
      assertEquals(1, rmiConnector0.getPort());
      assertEquals("", rmiConnector0.getHostName());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.getConnection()Ljavax/management/remote/JMXConnectorServer;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      Blob blob0 = new Blob(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)blob0.getBinaryStream();
      PasswordAuthenticator passwordAuthenticator0 = new PasswordAuthenticator((InputStream) byteArrayInputStream0);
      RmiConnector rmiConnector0 = new RmiConnector("mbeanName", "", 1, (JMXAuthenticator) passwordAuthenticator0, (SSLConfiguration) null);
      rmiConnector0.getConnection();
      assertEquals("mbeanName", rmiConnector0.getControllerName());
      assertEquals("", rmiConnector0.getHostName());
      assertEquals(1, rmiConnector0.getPort());
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.createNamingService()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.start()V: root-Branch
   * Goal 4. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      PasswordAuthenticator passwordAuthenticator0 = new PasswordAuthenticator((InputStream) byteArrayInputStream0);
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      RmiConnector rmiConnector0 = new RmiConnector("Rz+r", "3XENdP*mW", (-1688), (JMXAuthenticator) passwordAuthenticator0, sSLConfiguration0);
      try { 
        rmiConnector0.start();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Port value out of range: -1688
         //
         assertThrownBy("<evosuite>", e);
      }
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.setAuthenticator(Ljavax/management/remote/JMXAuthenticator;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      RmiConnector rmiConnector0 = new RmiConnector("@.apssaa2i", "org.objectweb.cjdbc.controller.jmx.RmiConnector", 654, (JMXAuthenticator) null, (SSLConfiguration) null);
      rmiConnector0.setAuthenticator((JMXAuthenticator) null);
      assertEquals("org.objectweb.cjdbc.controller.jmx.RmiConnector", rmiConnector0.getHostName());
      assertEquals(654, rmiConnector0.getPort());
      assertEquals("@.apssaa2i", rmiConnector0.getControllerName());
  }

  //Test case number: 6
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.setPort(I)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      RmiConnector rmiConnector0 = new RmiConnector(">W*,]rEu%,a^=", ">W*,]rEu%,a^=", 0, (JMXAuthenticator) null, sSLConfiguration0);
      rmiConnector0.setPort((-549));
      assertEquals(-549, rmiConnector0.getPort());
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.getAuthenticator()Ljavax/management/remote/JMXAuthenticator;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      Clob clob0 = new Clob("jmx.create.jrmp.adaptor");
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)clob0.getAsciiStream();
      PasswordAuthenticator passwordAuthenticator0 = new PasswordAuthenticator((InputStream) byteArrayInputStream0);
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      RmiConnector rmiConnector0 = new RmiConnector("')", "')", (-1), (JMXAuthenticator) passwordAuthenticator0, sSLConfiguration0);
      rmiConnector0.getAuthenticator();
      assertEquals("')", rmiConnector0.getHostName());
      assertEquals(-1, rmiConnector0.getPort());
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.getSslConfig()Lorg/objectweb/cjdbc/common/net/SSLConfiguration;: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      RmiConnector rmiConnector0 = new RmiConnector(">W*,]rEu%,a^=", ">W*,]rEu%,a^=", 0, (JMXAuthenticator) null, sSLConfiguration0);
      rmiConnector0.getSslConfig();
      assertEquals(">W*,]rEu%,a^=", rmiConnector0.getHostName());
      assertEquals(0, rmiConnector0.getPort());
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      RmiConnector rmiConnector0 = new RmiConnector((String) null, (String) null, 1074, (JMXAuthenticator) null, (SSLConfiguration) null);
      assertEquals(1074, rmiConnector0.getPort());
      assertEquals("192.168.1.42", rmiConnector0.getHostName());
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.addRmiConnector(Lorg/objectweb/cjdbc/controller/jmx/RmiConnector;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.<init>(Ljava/lang/String;Ljava/lang/String;ILjavax/management/remote/JMXAuthenticator;Lorg/objectweb/cjdbc/common/net/SSLConfiguration;)V: I7 Branch 1 IFNULL L96 - false
   * Goal 3. org.objectweb.cjdbc.controller.jmx.RmiConnector.stop()V: I4 Branch 2 IFNULL L210 - true
   * Goal 4. org.objectweb.cjdbc.controller.jmx.RmiConnector.stop()V: I14 Branch 3 IFNULL L212 - true
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      Clob clob0 = new Clob("jmx.create.jrmp.adaptor");
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)clob0.getAsciiStream();
      PasswordAuthenticator passwordAuthenticator0 = new PasswordAuthenticator((InputStream) byteArrayInputStream0);
      SSLConfiguration sSLConfiguration0 = new SSLConfiguration();
      RmiConnector rmiConnector0 = new RmiConnector("')", "')", (-1), (JMXAuthenticator) passwordAuthenticator0, sSLConfiguration0);
      rmiConnector0.stop();
      assertEquals(-1, rmiConnector0.getPort());
      assertEquals("')", rmiConnector0.getHostName());
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.jmx.RmiConnector.sendNotification(Lorg/objectweb/cjdbc/controller/jmx/AbstractStandardMBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.jmx.RmiConnector.broadcastNotification(Lorg/objectweb/cjdbc/controller/jmx/AbstractStandardMBean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Hashtable;)V: I33 Branch 7 IFEQ L396 - false
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      Hashtable<Scrollbar, Checkbox> hashtable0 = new Hashtable<Scrollbar, Checkbox>();
      RmiConnector.broadcastNotification((AbstractStandardMBean) null, "", "", "", hashtable0);
      assertTrue(hashtable0.isEmpty());
  }
}
