/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 15 20:15:23 GMT 2016
 */

package org.objectweb.cjdbc.driver;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.Choice;
import java.awt.TextComponent;
import java.util.Hashtable;
import javax.naming.CompositeName;
import javax.naming.InitialContext;
import javax.naming.Reference;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.driver.DataSourceFactory;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DataSourceFactory_ESTest extends DataSourceFactory_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.DataSourceFactory.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.DataSourceFactory.getObjectInstance(Ljava/lang/Object;Ljavax/naming/Name;Ljavax/naming/Context;Ljava/util/Hashtable;)Ljava/lang/Object;: I13 Branch 1 IFNULL L68 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      DataSourceFactory dataSourceFactory0 = new DataSourceFactory();
      Reference reference0 = new Reference((String) null, "SpreadsheetDate: Invalid day.", "SpreadsheetDate: Invalid day.");
      CompositeName compositeName0 = new CompositeName("user");
      InitialContext initialContext0 = new InitialContext((Hashtable<?, ?>) null);
      Object object0 = dataSourceFactory0.getObjectInstance(reference0, compositeName0, initialContext0, (Hashtable) null);
      assertNull(object0);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.driver.DataSourceFactory.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.driver.DataSourceFactory.getObjectInstance(Ljava/lang/Object;Ljavax/naming/Name;Ljavax/naming/Context;Ljava/util/Hashtable;)Ljava/lang/Object;: I13 Branch 1 IFNULL L68 - false
   * Goal 3. org.objectweb.cjdbc.driver.DataSourceFactory.getObjectInstance(Ljava/lang/Object;Ljavax/naming/Name;Ljavax/naming/Context;Ljava/util/Hashtable;)Ljava/lang/Object;: I25 Branch 2 IFNE L68 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      DataSourceFactory dataSourceFactory0 = new DataSourceFactory();
      CompositeName compositeName0 = new CompositeName();
      Hashtable<TextComponent, Choice> hashtable0 = new Hashtable<TextComponent, Choice>();
      InitialContext initialContext0 = new InitialContext();
      Reference reference0 = new Reference("org.objectweb.cjdbc.driver.DataSource", "org.objectweb.cjdbc.driver.DataSource", "org.objectweb.cjdbc.driver.DataSource");
      try { 
        dataSourceFactory0.getObjectInstance(reference0, compositeName0, initialContext0, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.driver.DataSourceFactory", e);
      }
  }
}