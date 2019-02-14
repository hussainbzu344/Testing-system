/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 05:28:21 GMT 2016
 */

package org.objectweb.cjdbc.console.views;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.views.RecoveryLogViewer;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class RecoveryLogViewer_ESTest extends RecoveryLogViewer_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 9 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getColumnNames()[Ljava/lang/String;: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.RecoveryLogViewer.setLabels()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.views.RecoveryLogViewer.<init>([[Ljava/lang/Object;)V: root-Branch
   * Goal 4. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I17 Branch 1 IF_ICMPGE L55 - true
   * Goal 5. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I17 Branch 1 IF_ICMPGE L55 - false
   * Goal 6. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I54 Branch 2 IF_ICMPGE L61 - false
   * Goal 7. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I59 Branch 3 IF_ICMPEQ L63 - true
   * Goal 8. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I59 Branch 3 IF_ICMPEQ L63 - false
   * Goal 9. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I62 Branch 4 IF_ICMPNE L63 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      Object[][] objectArray0 = new Object[0][5];
      RecoveryLogViewer recoveryLogViewer0 = new RecoveryLogViewer(objectArray0);
      String[] stringArray0 = recoveryLogViewer0.getColumnNames();
      Object[][] objectArray1 = new Object[3][2];
      objectArray1[0] = (Object[]) stringArray0;
      // Undeclared exception!
      try { 
        recoveryLogViewer0.updateData(objectArray1);
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"console.infoviewer.recoverylog.column.2\"
         //
         assertThrownBy("java.lang.NumberFormatException", e);
      }
  }

  //Test case number: 1
  /*
   * 6 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.views.RecoveryLogViewer.<init>([[Ljava/lang/Object;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I17 Branch 1 IF_ICMPGE L55 - false
   * Goal 3. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I54 Branch 2 IF_ICMPGE L61 - true
   * Goal 4. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I54 Branch 2 IF_ICMPGE L61 - false
   * Goal 5. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I59 Branch 3 IF_ICMPEQ L63 - false
   * Goal 6. org.objectweb.cjdbc.console.views.RecoveryLogViewer.getDataTypes([[Ljava/lang/Object;)[[Ljava/lang/Object;: I62 Branch 4 IF_ICMPNE L63 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "JgV#9.JfM7i3IN*g[";
      stringArray0[1] = "JgV#9.JfM7i3IN*g[";
      Object[][] objectArray0 = new Object[8][5];
      objectArray0[0] = (Object[]) stringArray0;
      RecoveryLogViewer recoveryLogViewer0 = null;
      try {
        recoveryLogViewer0 = new RecoveryLogViewer(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // [Ljava.lang.Object; cannot be cast to [Ljava.lang.String;
         //
         assertThrownBy("org.objectweb.cjdbc.console.views.RecoveryLogViewer", e);
      }
  }
}
