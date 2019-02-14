/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 10:18:15 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.objects;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.File;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.objects.DumpFileObject;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class DumpFileObject_ESTest extends DumpFileObject_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.getDumpFile()Ljava/io/File;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.<init>(Ljava/io/File;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.setDisplayName()V: I25 Branch 1 IF_ICMPEQ L79 - true
   * Goal 4. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.setDisplayName()V: I58 Branch 2 IF_ICMPNE L86 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      MockFile mockFile0 = new MockFile("\nLast Modified:");
      DumpFileObject dumpFileObject0 = new DumpFileObject((File) mockFile0);
      MockFile mockFile1 = (MockFile)dumpFileObject0.getDumpFile();
      assertFalse(mockFile1.isAbsolute());
  }

  //Test case number: 1
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.<init>(Ljava/io/File;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.getDumpName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.setDisplayName()V: I25 Branch 1 IF_ICMPEQ L79 - false
   * Goal 4. org.objectweb.cjdbc.console.gui.objects.DumpFileObject.setDisplayName()V: I58 Branch 2 IF_ICMPNE L86 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      MockFile mockFile0 = new MockFile("w-G?K!IMp!GSH@pi");
      DumpFileObject dumpFileObject0 = new DumpFileObject((File) mockFile0);
      // Undeclared exception!
      try { 
        dumpFileObject0.getDumpName();
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
         //
         // String index out of range: -1
         //
         assertThrownBy("java.lang.String", e);
      }
  }
}
