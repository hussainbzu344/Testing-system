/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:44:30 GMT 2016
 */

package org.objectweb.cjdbc.common.net;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocketFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetAddress;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AuthenticatedSocketFactory_ESTest extends AuthenticatedSocketFactory_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.createSocket(Ljava/lang/String;I)Ljava/net/Socket;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.createSocket("Xnw", 1878);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.getSupportedCipherSuites()[Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.getSupportedCipherSuites();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.createSocket((InetAddress) inet4Address0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.createSocket(Ljava/net/InetAddress;ILjava/net/InetAddress;I)Ljava/net/Socket;: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.anyLocalAddress();
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.createSocket((InetAddress) inet4Address0, 1175, (InetAddress) inet4Address0, 1175);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.createSocket(Ljava/net/Socket;Ljava/lang/String;IZ)Ljava/net/Socket;: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.createSocket((Socket) null, "{mYPwZ", 0, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.createSocket(Ljava/lang/String;ILjava/net/InetAddress;I)Ljava/net/Socket;: root-Branch
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      Inet4Address inet4Address0 = (Inet4Address)MockInetAddress.getLoopbackAddress();
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.createSocket("", (-1141), (InetAddress) inet4Address0, (-1141));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.<init>(Ljavax/net/ssl/SSLSocketFactory;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory.getDefaultCipherSuites()[Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      AuthenticatedSocketFactory authenticatedSocketFactory0 = new AuthenticatedSocketFactory((SSLSocketFactory) null);
      // Undeclared exception!
      try { 
        authenticatedSocketFactory0.getDefaultCipherSuites();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.net.AuthenticatedSocketFactory", e);
      }
  }
}