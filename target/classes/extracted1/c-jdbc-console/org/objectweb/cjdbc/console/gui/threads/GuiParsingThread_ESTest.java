/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 11:58:56 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.threads;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.JTextPane;
import javax.swing.event.CaretEvent;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.StyledDocument;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.threads.GuiParsingThread;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GuiParsingThread_ESTest extends GuiParsingThread_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.keyTyped(Ljava/awt/event/KeyEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.<init>(Ljavax/swing/JTextPane;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      GuiParsingThread guiParsingThread0 = new GuiParsingThread(jTextPane0);
      KeyEvent keyEvent0 = new KeyEvent((Component) jTextPane0, 60, 0L, 403, 305, '1');
      guiParsingThread0.keyTyped(keyEvent0);
      assertEquals(0, guiParsingThread0.countStackFrames());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.keyReleased(Ljava/awt/event/KeyEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.<init>(Ljavax/swing/JTextPane;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      GuiParsingThread guiParsingThread0 = new GuiParsingThread(jTextPane0);
      guiParsingThread0.keyReleased((KeyEvent) null);
      assertEquals(0, guiParsingThread0.countStackFrames());
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.caretUpdate(Ljavax/swing/event/CaretEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.<init>(Ljavax/swing/JTextPane;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test2()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      GuiParsingThread guiParsingThread0 = new GuiParsingThread(jTextPane0);
      guiParsingThread0.caretUpdate((CaretEvent) null);
      assertFalse(guiParsingThread0.isDaemon());
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.<init>(Ljavax/swing/JTextPane;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.keyPressed(Ljava/awt/event/KeyEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test3()  throws Throwable  {
      DefaultStyledDocument defaultStyledDocument0 = new DefaultStyledDocument();
      JTextPane jTextPane0 = new JTextPane((StyledDocument) defaultStyledDocument0);
      GuiParsingThread guiParsingThread0 = new GuiParsingThread(jTextPane0);
      guiParsingThread0.keyPressed((KeyEvent) null);
      assertFalse(guiParsingThread0.isInterrupted());
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.<init>(Ljavax/swing/JTextPane;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.threads.GuiParsingThread.setOutputPane(Ljavax/swing/JTextPane;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test4()  throws Throwable  {
      JTextPane jTextPane0 = new JTextPane();
      GuiParsingThread guiParsingThread0 = new GuiParsingThread(jTextPane0);
      guiParsingThread0.setOutputPane(jTextPane0);
      assertFalse(guiParsingThread0.isInterrupted());
  }
}
