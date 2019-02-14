/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 03:48:53 GMT 2016
 */

package org.objectweb.cjdbc.driver;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.driver.Savepoint;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Savepoint_ESTest extends Savepoint_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Savepoint.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Savepoint.getSavepointId()I: I4 Branch 1 IFNULL L67 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Savepoint savepoint0 = new Savepoint("This is a named savepoint");
      try { 
        savepoint0.getSavepointId();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // This is a named savepoint
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Savepoint", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Savepoint.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Savepoint.getSavepointId()I: I4 Branch 1 IFNULL L67 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Savepoint savepoint0 = new Savepoint(0);
      int int0 = savepoint0.getSavepointId();
      assertEquals(0, int0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Savepoint.<init>(Ljava/lang/String;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Savepoint.getSavepointName()Ljava/lang/String;: I4 Branch 2 IFNONNULL L78 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Savepoint savepoint0 = new Savepoint("");
      String string0 = savepoint0.getSavepointName();
      assertEquals("", string0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Savepoint.<init>(I)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Savepoint.getSavepointName()Ljava/lang/String;: I4 Branch 2 IFNONNULL L78 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Savepoint savepoint0 = new Savepoint(0);
      try { 
        savepoint0.getSavepointName();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // This is an unnamed savepoint
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Savepoint", e);
      }
  }
}
