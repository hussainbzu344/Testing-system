/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 18:50:55 GMT 2016
 */

package org.objectweb.cjdbc.controller.requestmanager;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.sql.AbstractRequest;
import org.objectweb.cjdbc.common.sql.SelectRequest;
import org.objectweb.cjdbc.common.sql.UnknownRequest;
import org.objectweb.cjdbc.common.sql.schema.DatabaseSchema;
import org.objectweb.cjdbc.controller.requestmanager.ParserThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class ParserThread_ESTest extends ParserThread_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.requestmanager.ParserThread.<init>(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.requestmanager.ParserThread.run()V: I5 Branch 1 IFNE L73 - true
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      SelectRequest selectRequest0 = new SelectRequest("1]g?+", false, (-2359), "1]g?+", (DatabaseSchema) null, 0, false);
      ParserThread parserThread0 = new ParserThread((AbstractRequest) selectRequest0, (DatabaseSchema) null, 0, true);
      parserThread0.run();
      assertFalse(parserThread0.isDaemon());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.requestmanager.ParserThread.<init>(Lorg/objectweb/cjdbc/common/sql/AbstractRequest;Lorg/objectweb/cjdbc/common/sql/schema/DatabaseSchema;IZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.requestmanager.ParserThread.run()V: I5 Branch 1 IFNE L73 - false
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      UnknownRequest unknownRequest0 = new UnknownRequest("/,Px|v{~&y'M=?", true, 0, "&P'.9wR},g&kKLy");
      ParserThread parserThread0 = new ParserThread((AbstractRequest) unknownRequest0, (DatabaseSchema) null, 0, false);
      parserThread0.run();
      assertFalse(parserThread0.isDaemon());
  }
}
