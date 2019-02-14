/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 18:57:51 GMT 2016
 */

package org.objectweb.cjdbc.controller.backend.rewriting;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class PatternRewritingRule_ESTest extends PatternRewritingRule_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 20 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - true
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - false
   * Goal 3. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I84 Branch 2 IF_ICMPLE L73 - false
   * Goal 4. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - true
   * Goal 5. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - false
   * Goal 6. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I175 Branch 4 IF_ICMPNE L94 - true
   * Goal 7. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I223 Branch 6 IFNE L107 - false
   * Goal 8. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - true
   * Goal 9. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - false
   * Goal 10. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - true
   * Goal 11. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - true
   * Goal 12. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - false
   * Goal 13. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I66 Branch 10 IF_ICMPNE L139 - true
   * Goal 14. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I79 Branch 11 IFNULL L145 - true
   * Goal 15. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I79 Branch 11 IFNULL L145 - false
   * Goal 16. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I83 Branch 12 IFNONNULL L147 - true
   * Goal 17. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I83 Branch 12 IFNONNULL L147 - false
   * Goal 18. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I116 Branch 13 IF_ICMPGE L154 - false
   * Goal 19. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I120 Branch 14 IFNULL L156 - false
   * Goal 20. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I126 Branch 15 IFEQ L158 - false
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      PatternRewritingRule patternRewritingRule0 = new PatternRewritingRule("JSAYhQ?{c?yoH(]FxpA", "dmFUNB6", true, true);
      String string0 = patternRewritingRule0.rewrite("JSAYhQ?{c?yoH(]FxpA");
      assertEquals("JSAYhQ?{c?yoH(]FxpA", string0);
  }

  //Test case number: 1
  /*
   * 14 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - false
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I84 Branch 2 IF_ICMPLE L73 - true
   * Goal 3. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - false
   * Goal 4. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I175 Branch 4 IF_ICMPNE L94 - false
   * Goal 5. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I206 Branch 5 IF_ICMPLE L101 - true
   * Goal 6. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I223 Branch 6 IFNE L107 - false
   * Goal 7. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - false
   * Goal 8. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - true
   * Goal 9. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - false
   * Goal 10. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - false
   * Goal 11. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I116 Branch 13 IF_ICMPGE L154 - true
   * Goal 12. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I165 Branch 16 IF_ICMPGE L172 - false
   * Goal 13. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I176 Branch 17 IFNONNULL L175 - true
   * Goal 14. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I187 Branch 18 IF_ICMPEQ L177 - true
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      PatternRewritingRule patternRewritingRule0 = new PatternRewritingRule("?O", "?O", false, false);
      // Undeclared exception!
      try { 
        patternRewritingRule0.rewrite("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule", e);
      }
  }

  //Test case number: 2
  /*
   * 29 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - true
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - false
   * Goal 3. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I84 Branch 2 IF_ICMPLE L73 - true
   * Goal 4. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I84 Branch 2 IF_ICMPLE L73 - false
   * Goal 5. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - true
   * Goal 6. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - false
   * Goal 7. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I175 Branch 4 IF_ICMPNE L94 - true
   * Goal 8. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I175 Branch 4 IF_ICMPNE L94 - false
   * Goal 9. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I206 Branch 5 IF_ICMPLE L101 - true
   * Goal 10. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I206 Branch 5 IF_ICMPLE L101 - false
   * Goal 11. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I223 Branch 6 IFNE L107 - true
   * Goal 12. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I223 Branch 6 IFNE L107 - false
   * Goal 13. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - false
   * Goal 14. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - true
   * Goal 15. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - false
   * Goal 16. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - true
   * Goal 17. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - false
   * Goal 18. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I66 Branch 10 IF_ICMPNE L139 - true
   * Goal 19. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I79 Branch 11 IFNULL L145 - true
   * Goal 20. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I79 Branch 11 IFNULL L145 - false
   * Goal 21. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I83 Branch 12 IFNONNULL L147 - false
   * Goal 22. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I116 Branch 13 IF_ICMPGE L154 - false
   * Goal 23. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I120 Branch 14 IFNULL L156 - false
   * Goal 24. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I126 Branch 15 IFEQ L158 - true
   * Goal 25. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I165 Branch 16 IF_ICMPGE L172 - false
   * Goal 26. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I176 Branch 17 IFNONNULL L175 - true
   * Goal 27. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I176 Branch 17 IFNONNULL L175 - false
   * Goal 28. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I187 Branch 18 IF_ICMPEQ L177 - true
   * Goal 29. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I187 Branch 18 IF_ICMPEQ L177 - false
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      PatternRewritingRule patternRewritingRule0 = new PatternRewritingRule("]>F}o2#RL:\"(uk?(H?[", "]>F}o2#RL:\"(uk?(H?[", false, false);
      patternRewritingRule0.rewrite("]>F}o2#RL:\"(uk?(H?[");
      assertTrue(patternRewritingRule0.hasMatched());
  }

  //Test case number: 3
  /*
   * 11 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - true
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - false
   * Goal 3. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I84 Branch 2 IF_ICMPLE L73 - false
   * Goal 4. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - true
   * Goal 5. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - false
   * Goal 6. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I175 Branch 4 IF_ICMPNE L94 - true
   * Goal 7. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I223 Branch 6 IFNE L107 - false
   * Goal 8. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - false
   * Goal 9. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - true
   * Goal 10. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - true
   * Goal 11. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I66 Branch 10 IF_ICMPNE L139 - false
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      PatternRewritingRule patternRewritingRule0 = new PatternRewritingRule("JSAYhQ?{c?yoH(]FxpA", "dmFUNB6", true, true);
      String string0 = patternRewritingRule0.rewrite("");
      assertEquals("", string0);
      assertFalse(patternRewritingRule0.hasMatched());
      assertNotNull(string0);
  }

  //Test case number: 4
  /*
   * 16 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I53 Branch 1 IF_ICMPNE L66 - true
   * Goal 2. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I101 Branch 3 IFNE L79 - false
   * Goal 3. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I175 Branch 4 IF_ICMPNE L94 - true
   * Goal 4. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.<init>(Ljava/lang/String;Ljava/lang/String;ZZ)V: I223 Branch 6 IFNE L107 - false
   * Goal 5. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - true
   * Goal 6. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I25 Branch 7 IF_ICMPGE L127 - false
   * Goal 7. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I36 Branch 8 IFNONNULL L130 - true
   * Goal 8. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I47 Branch 9 IF_ICMPNE L132 - true
   * Goal 9. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I66 Branch 10 IF_ICMPNE L139 - true
   * Goal 10. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I79 Branch 11 IFNULL L145 - true
   * Goal 11. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I116 Branch 13 IF_ICMPGE L154 - false
   * Goal 12. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I120 Branch 14 IFNULL L156 - true
   * Goal 13. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I165 Branch 16 IF_ICMPGE L172 - true
   * Goal 14. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I165 Branch 16 IF_ICMPGE L172 - false
   * Goal 15. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I176 Branch 17 IFNONNULL L175 - true
   * Goal 16. org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule.rewrite(Ljava/lang/String;)Ljava/lang/String;: I187 Branch 18 IF_ICMPEQ L177 - false
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      PatternRewritingRule patternRewritingRule0 = new PatternRewritingRule("-O", "-O", false, false);
      patternRewritingRule0.rewrite("-O");
      assertTrue(patternRewritingRule0.hasMatched());
  }
}
