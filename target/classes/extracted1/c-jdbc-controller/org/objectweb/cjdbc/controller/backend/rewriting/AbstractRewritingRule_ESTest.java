/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 18:57:29 GMT 2016
 */

package org.objectweb.cjdbc.controller.backend.rewriting;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.backend.rewriting.ReplaceAllRewritingRule;
import org.objectweb.cjdbc.controller.backend.rewriting.SimpleRewritingRule;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractRewritingRule_ESTest extends AbstractRewritingRule_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.isStopOnMatch()Z: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      ReplaceAllRewritingRule replaceAllRewritingRule0 = new ReplaceAllRewritingRule("B. xEn/-KEb11", "", false, false);
      boolean boolean0 = replaceAllRewritingRule0.isStopOnMatch();
      assertEquals("", replaceAllRewritingRule0.getRewrite());
      assertFalse(replaceAllRewritingRule0.isCaseSensitive());
      assertFalse(boolean0);
      assertFalse(replaceAllRewritingRule0.hasMatched());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.hasMatched()Z: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      ReplaceAllRewritingRule replaceAllRewritingRule0 = new ReplaceAllRewritingRule("B. xEn/-KEb11", "", false, false);
      boolean boolean0 = replaceAllRewritingRule0.hasMatched();
      assertFalse(replaceAllRewritingRule0.isCaseSensitive());
      assertFalse(replaceAllRewritingRule0.isStopOnMatch());
      assertEquals("", replaceAllRewritingRule0.getRewrite());
      assertFalse(boolean0);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.getXml()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      ReplaceAllRewritingRule replaceAllRewritingRule0 = new ReplaceAllRewritingRule("B. xEn/-KEb11", "", false, false);
      String string0 = replaceAllRewritingRule0.getXml();
      assertFalse(replaceAllRewritingRule0.hasMatched());
      assertEquals("<RewritingRule queryPattern=\"B. xEn/-KEb11\" rewrite=\"\" caseSensitive=\"false\" stopOnMatch=\"false\"/>", string0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.getQueryPattern()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      ReplaceAllRewritingRule replaceAllRewritingRule0 = new ReplaceAllRewritingRule("B. xEn/-KEb11", "", false, false);
      String string0 = replaceAllRewritingRule0.getQueryPattern();
      assertEquals("B. xEn/-KEb11", string0);
      assertEquals("", replaceAllRewritingRule0.getRewrite());
      assertFalse(replaceAllRewritingRule0.isCaseSensitive());
      assertFalse(replaceAllRewritingRule0.hasMatched());
      assertFalse(replaceAllRewritingRule0.isStopOnMatch());
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.getRewrite()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      SimpleRewritingRule simpleRewritingRule0 = new SimpleRewritingRule("v:*5{DEJ", "v:*5{DEJ", false, true);
      String string0 = simpleRewritingRule0.getRewrite();
      assertEquals("v:*5{dej", string0);
      assertTrue(simpleRewritingRule0.isStopOnMatch());
      assertNotNull(string0);
      assertFalse(simpleRewritingRule0.hasMatched());
      assertFalse(simpleRewritingRule0.isCaseSensitive());
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule.isCaseSensitive()Z: root-Branch
   */

	@Test(timeout=300000)
  public void test5()  throws Throwable  {
      ReplaceAllRewritingRule replaceAllRewritingRule0 = new ReplaceAllRewritingRule("B. xEn/-KEb11", "", false, false);
      boolean boolean0 = replaceAllRewritingRule0.isCaseSensitive();
      assertFalse(replaceAllRewritingRule0.hasMatched());
      assertFalse(replaceAllRewritingRule0.isStopOnMatch());
      assertEquals("", replaceAllRewritingRule0.getRewrite());
      assertFalse(boolean0);
  }
}
