/*
 * This file was automatically generated by EvoSuite
 * Tue Jul 19 03:43:27 GMT 2016
 */

package org.objectweb.cjdbc.driver;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.driver.Driver;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class Driver_ESTest extends Driver_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.jdbcCompliant()Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Driver driver0 = new Driver();
      boolean boolean0 = driver0.jdbcCompliant();
      assertFalse(boolean0);
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.getMajorVersion()I: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      Driver driver0 = new Driver();
      int int0 = driver0.getMajorVersion();
      assertEquals(2, int0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.getMinorVersion()I: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      Driver driver0 = new Driver();
      int int0 = driver0.getMinorVersion();
      assertEquals(0, int0);
  }

  //Test case number: 3
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I3 Branch 1 IFNONNULL L277 - true
   * Goal 3. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I17 Branch 2 IFGT L285 - true
   * Goal 4. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I33 Branch 3 IFNONNULL L290 - false
   * Goal 5. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I51 Branch 4 IFNONNULL L297 - false
   * Goal 6. org.objectweb.cjdbc.driver.Driver.connectToController(Ljava/util/Properties;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;)Ljava/sql/Connection;: I7 Branch 6 IFNULL L361 - true
   * Goal 7. org.objectweb.cjdbc.driver.Driver.connectToController(Ljava/util/Properties;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;)Ljava/sql/Connection;: I17 Branch 7 IFNONNULL L363 - false
   * Goal 8. org.objectweb.cjdbc.driver.Driver.connectToController(Ljava/util/Properties;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;)Ljava/sql/Connection;: I29 Branch 8 IFNULL L365 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      Driver driver0 = new Driver();
      try { 
        driver0.connect("jdbc:cjdbc://ui-n/", (Properties) null);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Invalid user name in connect
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Driver", e);
      }
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I3 Branch 1 IFNONNULL L277 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      Driver driver0 = new Driver();
      try { 
        driver0.connect((String) null, (Properties) null);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Invalid null URL in connect
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Driver", e);
      }
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I3 Branch 1 IFNONNULL L277 - true
   * Goal 3. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I17 Branch 2 IFGT L285 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      Driver driver0 = new Driver();
      java.sql.Connection connection0 = driver0.connect("Trying to reconnect to another controller: ", (Properties) null);
      assertNull(connection0);
  }

  //Test case number: 6
  /*
   * 15 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I3 Branch 1 IFNONNULL L277 - true
   * Goal 3. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I17 Branch 2 IFGT L285 - true
   * Goal 4. org.objectweb.cjdbc.driver.Driver.connect(Ljava/lang/String;Ljava/util/Properties;)Ljava/sql/Connection;: I33 Branch 3 IFNONNULL L290 - true
   * Goal 5. org.objectweb.cjdbc.driver.Driver.connectToController(Ljava/util/Properties;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;)Ljava/sql/Connection;: I7 Branch 6 IFNULL L361 - true
   * Goal 6. org.objectweb.cjdbc.driver.Driver.connectToController(Ljava/util/Properties;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;)Ljava/sql/Connection;: I17 Branch 7 IFNONNULL L363 - false
   * Goal 7. org.objectweb.cjdbc.driver.Driver.connectToController(Ljava/util/Properties;Lorg/objectweb/cjdbc/driver/CjdbcUrl;Lorg/objectweb/cjdbc/driver/ControllerInfo;)Ljava/sql/Connection;: I29 Branch 8 IFNULL L365 - true
   * Goal 8. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I11 Branch 25 IFNONNULL L536 - false
   * Goal 9. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I29 Branch 26 IFNONNULL L543 - false
   * Goal 10. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I23 Branch 36 IFNONNULL L627 - false
   * Goal 11. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I51 Branch 37 IF_ICMPGE L633 - true
   * Goal 12. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I51 Branch 37 IF_ICMPGE L633 - false
   * Goal 13. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I55 Branch 38 IFNE L635 - false
   * Goal 14. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I107 Branch 39 IFNULL L642 - false
   * Goal 15. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I122 Branch 40 IFEQ L646 - true
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      Driver driver0 = new Driver();
      driver0.changeDatabaseName("jdbc:cjdbc://ui-n/", "jdbc:cjdbc://ui-n/");
      try { 
        driver0.connect("jdbc:cjdbc://ui-n/", (Properties) null);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Invalid user name in connect
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Driver", e);
      }
  }

  //Test case number: 7
  /*
   * 13 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I11 Branch 25 IFNONNULL L536 - true
   * Goal 3. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I11 Branch 25 IFNONNULL L536 - false
   * Goal 4. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I29 Branch 26 IFNONNULL L543 - false
   * Goal 5. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I23 Branch 36 IFNONNULL L627 - false
   * Goal 6. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I51 Branch 37 IF_ICMPGE L633 - true
   * Goal 7. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I51 Branch 37 IF_ICMPGE L633 - false
   * Goal 8. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I55 Branch 38 IFNE L635 - true
   * Goal 9. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I55 Branch 38 IFNE L635 - false
   * Goal 10. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I107 Branch 39 IFNULL L642 - false
   * Goal 11. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I122 Branch 40 IFEQ L646 - true
   * Goal 12. org.objectweb.cjdbc.driver.Driver.getPropertyInfo(Ljava/lang/String;Ljava/util/Properties;)[Ljava/sql/DriverPropertyInfo;: I5 Branch 42 IFNE L695 - true
   * Goal 13. org.objectweb.cjdbc.driver.Driver.getPropertyInfo(Ljava/lang/String;Ljava/util/Properties;)[Ljava/sql/DriverPropertyInfo;: I37 Branch 43 IFNONNULL L702 - true
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      Driver driver0 = new Driver();
      driver0.changeDatabaseName("jdbc:cjdbc://_ui,n/", "jdbc:cjdbc://_ui,n/");
      // Undeclared exception!
      try { 
        driver0.getPropertyInfo("jdbc:cjdbc://_ui,n/", (Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Driver", e);
      }
  }

  //Test case number: 8
  /*
   * 10 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I11 Branch 25 IFNONNULL L536 - false
   * Goal 3. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I29 Branch 26 IFNONNULL L543 - false
   * Goal 4. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I23 Branch 36 IFNONNULL L627 - true
   * Goal 5. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I23 Branch 36 IFNONNULL L627 - false
   * Goal 6. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I51 Branch 37 IF_ICMPGE L633 - true
   * Goal 7. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I51 Branch 37 IF_ICMPGE L633 - false
   * Goal 8. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I55 Branch 38 IFNE L635 - false
   * Goal 9. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I107 Branch 39 IFNULL L642 - false
   * Goal 10. org.objectweb.cjdbc.driver.Driver.changeDatabaseName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;: I122 Branch 40 IFEQ L646 - true
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      Driver driver0 = new Driver();
      driver0.changeDatabaseName("jdbc:cjdbc://ui-n/", "jdbc:cjdbc://ui-n/");
      String string0 = driver0.changeDatabaseName("jdbc:cjdbc://ui-n/", "O'cT0S9WPJg");
      assertEquals("jdbc:cjdbc://ui-n:25322/O'cT0S9WPJg", string0);
  }

  //Test case number: 9
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.Driver.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I11 Branch 25 IFNONNULL L536 - false
   * Goal 3. org.objectweb.cjdbc.driver.Driver.acceptsURL(Ljava/lang/String;)Z: I29 Branch 26 IFNONNULL L543 - false
   * Goal 4. org.objectweb.cjdbc.driver.Driver.getPropertyInfo(Ljava/lang/String;Ljava/util/Properties;)[Ljava/sql/DriverPropertyInfo;: I5 Branch 42 IFNE L695 - false
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      Driver driver0 = new Driver();
      try { 
        driver0.getPropertyInfo("org.objectweb.cjdbc.common.sql.schema.DatabaseTable", (Properties) null);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Invalid url org.objectweb.cjdbc.common.sql.schema.DatabaseTable
         //
         assertThrownBy("org.objectweb.cjdbc.driver.Driver", e);
      }
  }
}