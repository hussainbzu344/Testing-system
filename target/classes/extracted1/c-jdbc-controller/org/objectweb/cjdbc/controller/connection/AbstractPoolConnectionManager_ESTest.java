/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 19:18:58 GMT 2016
 */

package org.objectweb.cjdbc.controller.connection;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;
import javax.swing.JLayeredPane;
import javax.swing.table.DefaultTableModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.chrono.MockThaiBuddhistDate;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.connection.FailFastPoolConnectionManager;
import org.objectweb.cjdbc.controller.connection.RandomWaitPoolConnectionManager;
import org.objectweb.cjdbc.controller.connection.VariablePoolConnectionManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractPoolConnectionManager_ESTest extends AbstractPoolConnectionManager_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 13 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - true
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - false
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - true
   * Goal 8. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - false
   * Goal 9. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I85 Branch 7 IFNONNULL L151 - false
   * Goal 10. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I93 Branch 8 IFNE L154 - false
   * Goal 11. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I97 Branch 9 IFLE L156 - true
   * Goal 12. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 13. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager("Illsal value fo size of theJpooljconnection m3nager: ", "Illsal value fo size of theJpooljconnection m3nager: ", "Illsal value fo size of theJpooljconnection m3nager: ", "Illsal value fo size of theJpooljconnection m3nager: ", "Illsal value fo size of theJpooljconnection m3nager: ", "Illsal value fo size of theJpooljconnection m3nager: ", 130);
      assertEquals(130, failFastPoolConnectionManager0.getCurrentNumberOfConnections());
      
      failFastPoolConnectionManager0.initializeConnections();
      assertEquals(0, failFastPoolConnectionManager0.getCurrentNumberOfConnections());
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.getCurrentNumberOfConnections()I: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      RandomWaitPoolConnectionManager randomWaitPoolConnectionManager0 = new RandomWaitPoolConnectionManager("UNyA)B Mp)l", "UNyA)B Mp)l", "", "H?X%; v6w:<", "aS`r'KP^N[sGUK", "UNyA)B Mp)l", 304, 1);
      int int0 = randomWaitPoolConnectionManager0.getCurrentNumberOfConnections();
      assertEquals(304, int0);
  }

  //Test case number: 2
  /*
   * 1 covered goal:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      RandomWaitPoolConnectionManager randomWaitPoolConnectionManager0 = null;
      try {
        randomWaitPoolConnectionManager0 = new RandomWaitPoolConnectionManager("", "", "", "", "view", "", 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Illegal value for size of the pool connection manager: 0
         //
         assertThrownBy("org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager", e);
      }
  }

  //Test case number: 3
  /*
   * 13 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - false
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - true
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - false
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - true
   * Goal 8. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - false
   * Goal 9. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I85 Branch 7 IFNONNULL L151 - false
   * Goal 10. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I93 Branch 8 IFNE L154 - false
   * Goal 11. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I97 Branch 9 IFLE L156 - true
   * Goal 12. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 13. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager("86.xY@%KN", "Y+", "Y+", "W=E;^", "86.xY@%KN", "W=E;^", 1560);
      failFastPoolConnectionManager0.initializeConnections(109);
      try { 
        failFastPoolConnectionManager0.initializeConnections(213);
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // Connection pool for backend '86.xY@%KN' already initialized
         //
         assertThrownBy("org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager", e);
      }
  }

  //Test case number: 4
  /*
   * 12 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - false
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - false
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - true
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - false
   * Goal 8. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I85 Branch 7 IFNONNULL L151 - false
   * Goal 9. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I93 Branch 8 IFNE L154 - false
   * Goal 10. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I97 Branch 9 IFLE L156 - true
   * Goal 11. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 12. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      VariablePoolConnectionManager variablePoolConnectionManager0 = new VariablePoolConnectionManager("connection.connections.still.active", "", "New connection:", "R@", "", "", 2089, 35, 35, 59);
      assertEquals(35, variablePoolConnectionManager0.getCurrentNumberOfConnections());
      
      variablePoolConnectionManager0.initializeConnections();
      assertEquals(0, variablePoolConnectionManager0.getCurrentNumberOfConnections());
  }

  //Test case number: 5
  /*
   * 7 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - true
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - true
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      VariablePoolConnectionManager variablePoolConnectionManager0 = new VariablePoolConnectionManager("getCrossReference", "QA3J>ENK'\"ck3beig7", "QA3J>ENK'\"ck3beig7", "getCrossReference", "aYPVX; tO`*Lg:bvGZ", "QA3J>ENK'\"ck3beig7", 1506, 0, 73, 39, 0);
      assertEquals(73, variablePoolConnectionManager0.getCurrentNumberOfConnections());
      
      variablePoolConnectionManager0.initializeConnections((-409));
      assertEquals(0, variablePoolConnectionManager0.getCurrentNumberOfConnections());
  }

  //Test case number: 6
  /*
   * 17 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - true
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - false
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - true
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - false
   * Goal 8. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I85 Branch 7 IFNONNULL L151 - false
   * Goal 9. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I93 Branch 8 IFNE L154 - false
   * Goal 10. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I97 Branch 9 IFLE L156 - true
   * Goal 11. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 12. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   * Goal 13. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I4 Branch 12 IFNE L189 - true
   * Goal 14. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I40 Branch 13 IFNE L202 - true
   * Goal 15. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I70 Branch 14 IFEQ L215 - true
   * Goal 16. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I98 Branch 15 IFLE L221 - true
   * Goal 17. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I153 Branch 17 IFEQ L243 - true
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager("ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", 1321);
      failFastPoolConnectionManager0.initializeConnections(1321);
      failFastPoolConnectionManager0.finalize();
      assertFalse(failFastPoolConnectionManager0.isInitialized());
  }

  //Test case number: 7
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I4 Branch 12 IFNE L189 - false
   */

	@Test(timeout=300000)
  public void test7()  throws Throwable  {
      VariablePoolConnectionManager variablePoolConnectionManager0 = new VariablePoolConnectionManager(", ", ", ", "connection.max.poolsize.reached", ", ", ", ", "60", 2, 1117, 2, (-862), 2);
      try { 
        variablePoolConnectionManager0.finalizeConnections();
        fail("Expecting exception: SQLException");
      
      } catch(SQLException e) {
         //
         // connection.pool.not.initialized
         //
         assertThrownBy("org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager", e);
      }
  }

  //Test case number: 8
  /*
   * 14 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - true
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - false
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - true
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - false
   * Goal 8. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I85 Branch 7 IFNONNULL L151 - false
   * Goal 9. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I93 Branch 8 IFNE L154 - false
   * Goal 10. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I97 Branch 9 IFLE L156 - true
   * Goal 11. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 12. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   * Goal 13. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I4 Branch 12 IFNE L189 - true
   * Goal 14. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I40 Branch 13 IFNE L202 - false
   */

	@Test(timeout=300000)
  public void test8()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager("connection.freed.connection", "connection.freed.connection", "connection.freed.connection", "connection.freed.connection", "connection.freed.connection", "connection.freed.connection", 3050);
      LinkedList<DefaultTableModel> linkedList0 = new LinkedList<DefaultTableModel>();
      failFastPoolConnectionManager0.freeConnections = linkedList0;
      Vector<MockThaiBuddhistDate> vector0 = new Vector<MockThaiBuddhistDate>();
      DefaultTableModel defaultTableModel0 = new DefaultTableModel((Vector) vector0, 3050);
      linkedList0.add(defaultTableModel0);
      failFastPoolConnectionManager0.initializeConnections(3050);
      // Undeclared exception!
      try { 
        failFastPoolConnectionManager0.finalizeConnections();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // javax.swing.table.DefaultTableModel cannot be cast to java.sql.Connection
         //
         assertThrownBy("org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager", e);
      }
  }

  //Test case number: 9
  /*
   * 17 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I14 Branch 1 IF_ICMPGE L96 - true
   * Goal 2. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.<init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V: I71 Branch 2 IFEQ L105 - true
   * Goal 3. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I4 Branch 3 IFEQ L131 - true
   * Goal 4. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I27 Branch 4 IF_ICMPLE L135 - true
   * Goal 5. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I74 Branch 5 IF_ICMPGE L147 - false
   * Goal 6. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - true
   * Goal 7. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I76 Branch 6 IFEQ L147 - false
   * Goal 8. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I85 Branch 7 IFNONNULL L151 - false
   * Goal 9. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I93 Branch 8 IFNE L154 - false
   * Goal 10. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I97 Branch 9 IFLE L156 - true
   * Goal 11. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I142 Branch 10 IFNE L176 - false
   * Goal 12. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.initializeConnections(I)V: I153 Branch 11 IFEQ L178 - true
   * Goal 13. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I4 Branch 12 IFNE L189 - true
   * Goal 14. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I40 Branch 13 IFNE L202 - true
   * Goal 15. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I70 Branch 14 IFEQ L215 - true
   * Goal 16. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I98 Branch 15 IFLE L221 - false
   * Goal 17. org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager.finalizeConnections()V: I113 Branch 16 IF_ICMPGE L224 - false
   */

	@Test(timeout=300000)
  public void test9()  throws Throwable  {
      FailFastPoolConnectionManager failFastPoolConnectionManager0 = new FailFastPoolConnectionManager("ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", "ronnectionMfXeed.9onn>?tEon", 1321);
      LinkedHashSet<Integer> linkedHashSet0 = new LinkedHashSet<Integer>();
      ArrayList<Integer> arrayList0 = new ArrayList<Integer>((Collection<? extends Integer>) linkedHashSet0);
      Integer integer0 = JLayeredPane.DEFAULT_LAYER;
      arrayList0.add(integer0);
      failFastPoolConnectionManager0.activeConnections = arrayList0;
      failFastPoolConnectionManager0.initializeConnections(1321);
      try { 
        failFastPoolConnectionManager0.finalize();
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to java.sql.Connection
         //
         assertThrownBy("org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager", e);
      }
  }
}
