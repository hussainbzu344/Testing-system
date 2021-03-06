/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 13:33:54 GMT 2016
 */

package org.objectweb.cjdbc.common.util;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ReadPrioritaryFIFOWriteLock_ESTest extends ReadPrioritaryFIFOWriteLock_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.isWriteLocked()Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      boolean boolean0 = readPrioritaryFIFOWriteLock0.isWriteLocked();
      assertFalse(boolean0);
      assertFalse(readPrioritaryFIFOWriteLock0.isReadLocked());
  }

  //Test case number: 1
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.acquireRead()V: I10 Branch 1 IFNE L84 - false
   * Goal 3. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.acquireRead()V: I13 Branch 2 IFNE L84 - false
   * Goal 4. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.releaseRead()V: I12 Branch 4 IFNE L131 - false
   * Goal 5. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.releaseRead()V: I15 Branch 5 IFLE L131 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      readPrioritaryFIFOWriteLock0.acquireRead();
      assertTrue(readPrioritaryFIFOWriteLock0.isReadLocked());
      
      readPrioritaryFIFOWriteLock0.releaseRead();
      assertFalse(readPrioritaryFIFOWriteLock0.isReadLocked());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.releaseRead()V: I12 Branch 4 IFNE L131 - true
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      readPrioritaryFIFOWriteLock0.releaseRead();
      assertFalse(readPrioritaryFIFOWriteLock0.isReadLocked());
      assertFalse(readPrioritaryFIFOWriteLock0.isWriteLocked());
  }

  //Test case number: 3
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.acquireWrite()V: I24 Branch 6 IFNE L155 - false
   * Goal 3. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.acquireWrite()V: I27 Branch 7 IFNE L155 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      assertFalse(readPrioritaryFIFOWriteLock0.isWriteLocked());
      
      readPrioritaryFIFOWriteLock0.acquireWrite();
      assertTrue(readPrioritaryFIFOWriteLock0.isWriteLocked());
  }

  //Test case number: 4
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.releaseWrite()V: I15 Branch 8 IFLE L188 - true
   * Goal 3. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.releaseWrite()V: I89 Branch 9 IFLE L208 - true
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      readPrioritaryFIFOWriteLock0.releaseWrite();
      assertFalse(readPrioritaryFIFOWriteLock0.isReadLocked());
      assertFalse(readPrioritaryFIFOWriteLock0.isWriteLocked());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.isReadLocked()Z: I4 Branch 10 IFLE L220 - true
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      boolean boolean0 = readPrioritaryFIFOWriteLock0.isReadLocked();
      assertFalse(readPrioritaryFIFOWriteLock0.isWriteLocked());
      assertFalse(boolean0);
  }

  //Test case number: 6
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.acquireRead()V: I10 Branch 1 IFNE L84 - false
   * Goal 3. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.acquireRead()V: I13 Branch 2 IFNE L84 - false
   * Goal 4. org.objectweb.cjdbc.common.util.ReadPrioritaryFIFOWriteLock.isReadLocked()Z: I4 Branch 10 IFLE L220 - false
   */

	@Test(timeout=300000)
  public void test6()  throws Throwable  {
      ReadPrioritaryFIFOWriteLock readPrioritaryFIFOWriteLock0 = new ReadPrioritaryFIFOWriteLock();
      assertFalse(readPrioritaryFIFOWriteLock0.isReadLocked());
      
      readPrioritaryFIFOWriteLock0.acquireRead();
      boolean boolean0 = readPrioritaryFIFOWriteLock0.isReadLocked();
      assertTrue(boolean0);
  }
}
