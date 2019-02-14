/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 18 10:48:28 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.frames.jmxdesktop;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class OperationCallDialog_ESTest_scaffolding {

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.console.gui.frames.jmxdesktop.OperationCallDialog"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init(); 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public void setSystemProperties() {
 
    /*No java.lang.System property to set*/
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OperationCallDialog_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.cjdbc.console.gui.frames.jmxdesktop.OperationCallDialog",
      "org.objectweb.cjdbc.console.gui.jtools.JTextAreaWriter",
      "org.objectweb.cjdbc.console.gui.CjdbcGui"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OperationCallDialog_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.cjdbc.console.gui.frames.jmxdesktop.OperationCallDialog",
      "org.objectweb.cjdbc.common.i18n.GuiTranslate",
      "org.objectweb.cjdbc.console.gui.constants.GuiIcons",
      "org.objectweb.cjdbc.console.gui.constants.GuiConstants",
      "org.objectweb.cjdbc.console.gui.constants.GuiCommands",
      "org.objectweb.cjdbc.console.gui.CjdbcGui",
      "mx4j.server.MX4JMBeanServer",
      "mx4j.log.Log",
      "mx4j.log.Logger",
      "mx4j.server.DefaultClassLoaderRepository",
      "mx4j.server.MBeanIntrospector",
      "mx4j.server.interceptor.MBeanServerInterceptorConfigurator",
      "mx4j.server.MBeanMetaData$2",
      "mx4j.server.ReflectionMBeanInvoker",
      "mx4j.util.Utils",
      "mx4j.ImplementationException",
      "org.objectweb.cjdbc.console.gui.objects.AbstractGuiObject",
      "org.objectweb.cjdbc.console.gui.objects.BackendObject",
      "org.objectweb.cjdbc.console.gui.popups.AbstractPopUpMenu",
      "org.objectweb.cjdbc.console.gui.popups.BackendPopUpMenu",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.common.i18n.MonitorTranslate",
      "org.objectweb.cjdbc.console.monitoring.MonitoringConsole",
      "org.objectweb.cjdbc.driver.Blob",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.driver.Clob"
    );
  }
}