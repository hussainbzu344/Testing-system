/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 21:10:29 GMT 2016
 */

package org.objectweb.cjdbc.controller.loadbalancer.policies.createtable;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableAll;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRoundRobin;
import org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRule;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class CreateTablePolicy_ESTest extends CreateTablePolicy_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getRuleList()Ljava/util/HashMap;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      HashMap hashMap0 = createTablePolicy0.getRuleList();
      assertTrue(hashMap0.isEmpty());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getTableRule(Ljava/lang/String;)Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTableRule;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      CreateTableRule createTableRule0 = createTablePolicy0.getTableRule("");
      assertNull(createTableRule0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getDefaultRule()Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTableRule;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      CreateTableRoundRobin createTableRoundRobin0 = (CreateTableRoundRobin)createTablePolicy0.getDefaultRule();
      assertNull(createTableRoundRobin0);
  }

  //Test case number: 3
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L105 Case 0 - true
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L105 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L105 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L105 Default-Case - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      String string0 = CreateTablePolicy.getXmlValue(0);
      assertEquals("random", string0);
  }

  //Test case number: 4
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L105 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L105 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L105 Case 2 - false
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L105 Default-Case - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      String string0 = CreateTablePolicy.getXmlValue(822);
      assertEquals("", string0);
  }

  //Test case number: 5
  /*
   * 8 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.addRule(Lorg/objectweb/cjdbc/controller/loadbalancer/policies/createtable/CreateTableRule;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L105 Case 0 - false
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L105 Case 1 - true
   * Goal 5. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L105 Case 2 - false
   * Goal 6. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L105 Default-Case - false
   * Goal 7. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXml()Ljava/lang/String;: I16 Branch 5 IFEQ L127 - true
   * Goal 8. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXml()Ljava/lang/String;: I16 Branch 5 IFEQ L127 - false
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      CreateTablePolicy createTablePolicy0 = new CreateTablePolicy();
      CreateTableRoundRobin createTableRoundRobin0 = new CreateTableRoundRobin();
      createTablePolicy0.addRule(createTableRoundRobin0);
      String string0 = createTablePolicy0.getXml();
      assertEquals("<CreateTable tableName=\"null\" policy=\"roundRobin\" numberOfNodes=\"0\"></CreateTable>", string0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 1 TABLESWITCH L105 Case 0 - false
   * Goal 2. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 2 TABLESWITCH L105 Case 1 - false
   * Goal 3. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 3 TABLESWITCH L105 Case 2 - true
   * Goal 4. org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy.getXmlValue(I)Ljava/lang/String;: I3 Branch 4 TABLESWITCH L105 Default-Case - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      CreateTableAll createTableAll0 = new CreateTableAll();
      String string0 = createTableAll0.getXml();
      assertEquals("<CreateTable tableName=\"null\" policy=\"all\" numberOfNodes=\"0\"></CreateTable>", string0);
  }
}
