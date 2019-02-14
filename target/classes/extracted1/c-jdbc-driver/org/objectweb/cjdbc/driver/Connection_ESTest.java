/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 03:38:11 GMT 2016
 */

package org.objectweb.cjdbc.driver;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.Proxy;
import java.net.Socket;
import javax.sql.rowset.serial.SerialBlob;
import javax.swing.DebugGraphics;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockSocket;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.stream.CJDBCInputStream;
import org.objectweb.cjdbc.common.stream.CJDBCOutputStream;
import org.objectweb.cjdbc.driver.CjdbcUrl;
import org.objectweb.cjdbc.driver.Connection;
import org.objectweb.cjdbc.driver.ControllerInfo;
import org.objectweb.cjdbc.driver.Driver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Connection_ESTest extends Connection_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.driver.Connection.<init>(Lorg/objectweb/cjdbc/driver/Driver;Ljava/net/Socket;Lorg/objectweb/cjdbc/common/stream/CJDBCInputStream;Lorg/objectweb/cjdbc/common/stream/CJDBCOutputStream;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;Ljava/lang/String;Ljava/lang/String;)V: I153 Branch 1 IFNE L190 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Driver driver0 = new Driver();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ControllerInfo controllerInfo0 = CjdbcUrl.parseController("4MS");
      PrintStream printStream0 = DebugGraphics.logStream();
      CJDBCOutputStream cJDBCOutputStream0 = new CJDBCOutputStream((OutputStream) printStream0);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-122);
      SerialBlob serialBlob0 = new SerialBlob(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)serialBlob0.getBinaryStream();
      CJDBCInputStream cJDBCInputStream0 = new CJDBCInputStream((InputStream) byteArrayInputStream0);
      Connection connection0 = null;
      try {
        connection0 = new Connection(driver0, (Socket) mockSocket0, cJDBCInputStream0, cJDBCOutputStream0, (CjdbcUrl) null, controllerInfo0, "4MS", "4MS");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.DataInputStream", e);
      }
  }

  //Test case number: 1
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.driver.Connection.<init>(Lorg/objectweb/cjdbc/driver/Driver;Ljava/net/Socket;Lorg/objectweb/cjdbc/common/stream/CJDBCInputStream;Lorg/objectweb/cjdbc/common/stream/CJDBCOutputStream;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;Ljava/lang/String;Ljava/lang/String;)V: I153 Branch 1 IFNE L190 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Driver driver0 = new Driver();
      Proxy proxy0 = Proxy.NO_PROXY;
      MockSocket mockSocket0 = new MockSocket(proxy0);
      ControllerInfo controllerInfo0 = CjdbcUrl.parseController("4MCS");
      PrintStream printStream0 = DebugGraphics.logStream();
      CJDBCOutputStream cJDBCOutputStream0 = new CJDBCOutputStream((OutputStream) printStream0);
      byte[] byteArray0 = new byte[1];
      SerialBlob serialBlob0 = new SerialBlob(byteArray0);
      ByteArrayInputStream byteArrayInputStream0 = (ByteArrayInputStream)serialBlob0.getBinaryStream();
      CJDBCInputStream cJDBCInputStream0 = new CJDBCInputStream((InputStream) byteArrayInputStream0);
      Connection connection0 = null;
      try {
        connection0 = new Connection(driver0, (Socket) mockSocket0, cJDBCInputStream0, cJDBCOutputStream0, (CjdbcUrl) null, controllerInfo0, "4MCS", "4MCS");
        fail("Expecting exception: EOFException");
      
      } catch(EOFException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("java.io.DataInputStream", e);
      }
  }
}
