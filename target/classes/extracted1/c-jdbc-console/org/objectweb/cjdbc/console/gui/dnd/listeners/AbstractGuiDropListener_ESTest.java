/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 12:21:41 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.dnd.listeners;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.awt.dnd.DragGestureEvent;
import java.awt.dnd.DragSourceDragEvent;
import java.awt.dnd.DragSourceDropEvent;
import java.awt.dnd.DragSourceEvent;
import java.awt.dnd.DropTargetDragEvent;
import java.awt.dnd.DropTargetEvent;
import java.awt.event.MouseEvent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.gui.CjdbcGui;
import org.objectweb.cjdbc.console.gui.dnd.listeners.BackendTransferListener;
import org.objectweb.cjdbc.console.gui.dnd.listeners.ControllerTransferListener;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AbstractGuiDropListener_ESTest extends AbstractGuiDropListener_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragDropEnd(Ljava/awt/dnd/DragSourceDropEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      // Undeclared exception!
      try { 
        controllerTransferListener0.dragDropEnd((DragSourceDropEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener", e);
      }
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mouseEntered(Ljava/awt/event/MouseEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.mouseEntered((MouseEvent) null);
  }

  //Test case number: 2
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mouseDragged(Ljava/awt/event/MouseEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.mouseDragged((MouseEvent) null);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mouseExited(Ljava/awt/event/MouseEvent;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.mouseExited((MouseEvent) null);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragExit(Ljava/awt/dnd/DropTargetEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.dragExit((DropTargetEvent) null);
  }

  //Test case number: 5
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mouseReleased(Ljava/awt/event/MouseEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.mouseReleased((MouseEvent) null);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragOver(Ljava/awt/dnd/DropTargetDragEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.dragOver((DropTargetDragEvent) null);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragEnter(Ljava/awt/dnd/DragSourceDragEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.dragEnter((DragSourceDragEvent) null);
  }

  //Test case number: 8
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mouseClicked(Ljava/awt/event/MouseEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.mouseClicked((MouseEvent) null);
  }

  //Test case number: 9
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragOver(Ljava/awt/dnd/DragSourceDragEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.dragOver((DragSourceDragEvent) null);
  }

  //Test case number: 10
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mouseMoved(Ljava/awt/event/MouseEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.mouseMoved((MouseEvent) null);
  }

  //Test case number: 11
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.mousePressed(Ljava/awt/event/MouseEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.mousePressed((MouseEvent) null);
  }

  //Test case number: 12
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dropActionChanged(Ljava/awt/dnd/DropTargetDragEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.dropActionChanged((DropTargetDragEvent) null);
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragExit(Ljava/awt/dnd/DragSourceEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.dragExit((DragSourceEvent) null);
  }

  //Test case number: 14
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dropActionChanged(Ljava/awt/dnd/DragSourceDragEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test14()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      backendTransferListener0.dropActionChanged((DragSourceDragEvent) null);
  }

  //Test case number: 15
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragEnter(Ljava/awt/dnd/DropTargetDragEvent;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test15()  throws Throwable  {
      ControllerTransferListener controllerTransferListener0 = new ControllerTransferListener((CjdbcGui) null);
      controllerTransferListener0.dragEnter((DropTargetDragEvent) null);
  }

  //Test case number: 16
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.<init>(Lorg/objectweb/cjdbc/console/gui/CjdbcGui;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener.dragGestureRecognized(Ljava/awt/dnd/DragGestureEvent;)V: I4 Branch 1 IFNULL L74 - true
   */

	@Test(timeout=300000)
  public void test16()  throws Throwable  {
      BackendTransferListener backendTransferListener0 = new BackendTransferListener((CjdbcGui) null);
      // Undeclared exception!
      try { 
        backendTransferListener0.dragGestureRecognized((DragGestureEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.console.gui.dnd.listeners.AbstractGuiDropListener", e);
      }
  }
}
