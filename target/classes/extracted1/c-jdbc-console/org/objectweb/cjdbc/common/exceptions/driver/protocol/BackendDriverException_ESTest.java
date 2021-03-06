/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 15:22:23 GMT 2016
 */

package org.objectweb.cjdbc.common.exceptions.driver.protocol;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException;
import org.objectweb.cjdbc.common.stream.CJDBCInputStream;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class BackendDriverException_ESTest extends BackendDriverException_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.<init>(Lorg/objectweb/cjdbc/common/stream/CJDBCInputStream;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      BackendDriverException backendDriverException0 = null;
      try {
        backendDriverException0 = new BackendDriverException((CJDBCInputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.common.exceptions.driver.protocol.SerializableException", e);
      }
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I9 Branch 2 IF_ACMPEQ L91 - true
   * Goal 2. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I21 Branch 3 IFEQ L95 - false
   * Goal 3. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I32 Branch 4 IF_ACMPEQ L98 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      SQLException sQLException0 = new SQLException();
      BackendDriverException backendDriverException0 = null;
      try {
        backendDriverException0 = new BackendDriverException((Throwable) sQLException0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I9 Branch 2 IF_ACMPEQ L91 - true
   * Goal 2. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I9 Branch 2 IF_ACMPEQ L91 - false
   * Goal 3. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I21 Branch 3 IFEQ L95 - false
   * Goal 4. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I32 Branch 4 IF_ACMPEQ L98 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      SQLException sQLException0 = new SQLException();
      SQLException sQLException1 = new SQLException("", (Throwable) sQLException0);
      sQLException0.setNextException(sQLException1);
      BackendDriverException backendDriverException0 = null;
      try {
        backendDriverException0 = new BackendDriverException((Throwable) sQLException0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I9 Branch 2 IF_ACMPEQ L91 - true
   * Goal 2. org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException.convertNext(Ljava/lang/Throwable;)Lorg/objectweb/cjdbc/common/exceptions/driver/protocol/SerializableException;: I21 Branch 3 IFEQ L95 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      BackendDriverException backendDriverException0 = null;
      try {
        backendDriverException0 = new BackendDriverException((Throwable) mockThrowable0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
