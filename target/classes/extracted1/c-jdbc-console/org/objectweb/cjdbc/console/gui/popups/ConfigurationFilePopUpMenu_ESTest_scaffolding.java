/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 18 10:30:00 GMT 2016
 */

package org.objectweb.cjdbc.console.gui.popups;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConfigurationFilePopUpMenu_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.console.gui.popups.ConfigurationFilePopUpMenu"; 
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

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
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
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("java.vm.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.specification.version", "1.8"); 
            java.lang.System.setProperty("java.home", "/usr/local/lib/java/jdk1.8.0_91/jre"); 
    java.lang.System.setProperty("user.dir", "/home/li/Projects/phd/corpus-x/data/qualitas_corpus_20130901/c_jdbc-2.0.2/.xcorpus"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("user.home", "/home/li"); 
                                        java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
                java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar8403654039451335186.jar"); 
    java.lang.System.setProperty("java.class.version", "52.0"); 
        java.lang.System.setProperty("java.endorsed.dirs", "/usr/local/lib/java/jdk1.8.0_91/jre/lib/endorsed"); 
    java.lang.System.setProperty("java.ext.dirs", "/usr/local/lib/java/jdk1.8.0_91/jre/lib/ext:/usr/java/packages/lib/ext"); 
    java.lang.System.setProperty("java.library.path", "lib"); 
    java.lang.System.setProperty("java.runtime.name", "Java(TM) SE Runtime Environment"); 
    java.lang.System.setProperty("java.runtime.version", "1.8.0_91-b14"); 
    java.lang.System.setProperty("java.specification.name", "Java Platform API Specification"); 
    java.lang.System.setProperty("java.specification.vendor", "Oracle Corporation"); 
        java.lang.System.setProperty("java.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vendor.url", "http://java.oracle.com/"); 
    java.lang.System.setProperty("java.version", "1.8.0_91"); 
    java.lang.System.setProperty("java.vm.info", "mixed mode"); 
    java.lang.System.setProperty("java.vm.name", "Java HotSpot(TM) 64-Bit Server VM"); 
    java.lang.System.setProperty("java.vm.specification.name", "Java Virtual Machine Specification"); 
    java.lang.System.setProperty("java.vm.specification.vendor", "Oracle Corporation"); 
    java.lang.System.setProperty("java.vm.specification.version", "1.8"); 
    java.lang.System.setProperty("java.vm.version", "25.91-b14"); 
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("os.arch", "amd64"); 
    java.lang.System.setProperty("os.name", "Linux"); 
    java.lang.System.setProperty("os.version", "4.4.0-31-generic"); 
    java.lang.System.setProperty("path.separator", ":"); 
    java.lang.System.setProperty("user.country", "NZ"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "li"); 
    java.lang.System.setProperty("user.timezone", "Pacific/Auckland"); 
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConfigurationFilePopUpMenu_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.date.SerialDate",
      "org.objectweb.cjdbc.console.gui.objects.AbstractGuiObject",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.jfree.data.Dataset",
      "mx4j.MBeanDescriptionAdapter",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.jfree.data.Series",
      "mx4j.util.Utils",
      "org.jfree.data.DatasetChangeListener",
      "org.objectweb.cjdbc.common.jmx.JmxException",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.console.gui.popups.BackendPopUpMenu",
      "org.jfree.data.RangeInfo",
      "org.objectweb.cjdbc.console.gui.objects.DumpFileObject",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "mx4j.server.interceptor.MBeanServerInterceptorConfigurator",
      "org.jfree.data.MatrixSeriesCollection",
      "org.jfree.data.time.Day",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.console.monitoring.MonitoringConsole",
      "org.jfree.data.NonGridContourDataset",
      "org.objectweb.cjdbc.driver.Connection",
      "org.objectweb.cjdbc.console.gui.constants.GuiCommands",
      "org.objectweb.cjdbc.console.gui.popups.AbstractPopUpMenu",
      "org.jfree.data.DatasetGroup",
      "org.jfree.data.XYDataItem",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.XYDataset",
      "mx4j.log.Logger",
      "org.objectweb.cjdbc.console.gui.popups.ConfigurationFilePopUpMenu",
      "org.jfree.data.SeriesChangeEvent",
      "mx4j.server.MBeanMetaData$2",
      "mx4j.server.ReflectionMBeanInvoker$BadArgumentException",
      "org.jfree.data.DefaultContourDataset",
      "org.jfree.data.time.RegularTimePeriod",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.jfree.data.XYSeriesCollection",
      "org.jfree.data.time.TimeSeries",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "mx4j.server.MBeanIntrospector",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.jfree.data.AbstractDataset",
      "org.jfree.data.MatrixSeries",
      "org.objectweb.cjdbc.console.gui.objects.ControllerObject",
      "org.jfree.data.JDBCXYDataset",
      "org.jfree.data.DatasetChangeEvent",
      "mx4j.server.interceptor.MBeanServerInterceptor",
      "org.objectweb.cjdbc.common.i18n.GuiTranslate",
      "org.objectweb.cjdbc.console.gui.constants.GuiIcons",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.objectweb.cjdbc.common.exceptions.AuthenticationException",
      "org.objectweb.cjdbc.driver.Blob",
      "mx4j.loading.ClassLoaderObjectInputStream",
      "org.jfree.data.XYSeries",
      "org.jfree.data.Range",
      "org.jfree.data.XYDatasetTableModel",
      "mx4j.server.ReflectionMBeanInvoker",
      "org.jfree.data.SeriesChangeListener",
      "org.objectweb.cjdbc.console.gui.objects.ConfigurationFileObject",
      "org.jfree.data.AbstractSeriesDataset",
      "org.jfree.data.SeriesDataset",
      "mx4j.server.DefaultClassLoaderRepository",
      "org.objectweb.cjdbc.common.i18n.I18N",
      "org.objectweb.cjdbc.console.gui.objects.DatabaseObject",
      "org.objectweb.cjdbc.driver.BlobOutputStream",
      "org.objectweb.cjdbc.console.gui.objects.BackendObject",
      "mx4j.server.ModifiableClassLoaderRepository",
      "org.objectweb.cjdbc.common.exceptions.NoMoreControllerException",
      "org.objectweb.cjdbc.console.jmx.RmiJmxClient",
      "mx4j.server.MX4JMBeanServer",
      "mx4j.log.Log$1",
      "mx4j.log.Log$2",
      "org.objectweb.cjdbc.console.gui.constants.GuiConstants",
      "org.objectweb.cjdbc.console.gui.jtools.JTextAreaWriter",
      "org.objectweb.cjdbc.common.exceptions.DataCollectorException",
      "org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean",
      "org.jfree.data.SeriesException",
      "mx4j.server.MBeanRepository",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "mx4j.ImplementationException",
      "org.objectweb.cjdbc.driver.Driver",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.objectweb.cjdbc.common.i18n.MonitorTranslate",
      "org.jfree.data.ContourDataset",
      "org.jfree.data.DefaultTableXYDataset",
      "org.jfree.data.XYDataPair",
      "org.jfree.date.MonthConstants",
      "org.objectweb.cjdbc.driver.ControllerInfo",
      "org.objectweb.cjdbc.common.jmx.mbeans.DataCollectorMBean",
      "org.objectweb.cjdbc.common.jmx.mbeans.DatabaseBackendMBean",
      "org.jfree.data.TableXYDataset",
      "mx4j.MBeanDescription",
      "org.objectweb.cjdbc.console.gui.CjdbcGui",
      "org.objectweb.cjdbc.console.gui.CjdbcGui$4",
      "org.objectweb.cjdbc.console.gui.CjdbcGui$2",
      "org.objectweb.cjdbc.console.gui.CjdbcGuiListener",
      "org.objectweb.cjdbc.console.gui.CjdbcGui$3",
      "mx4j.server.MBeanMetaData",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.jfree.data.TimeSeriesTableModel",
      "mx4j.server.MBeanInvoker",
      "org.objectweb.cjdbc.console.gui.CjdbcGui$1",
      "org.objectweb.cjdbc.console.gui.session.GuiSession",
      "mx4j.server.interceptor.MBeanServerInterceptorConfiguratorMBean",
      "org.jfree.data.XYZDataset",
      "org.objectweb.cjdbc.common.jmx.mbeans.ControllerMBean",
      "org.objectweb.cjdbc.console.text.ConsoleException",
      "mx4j.log.Log",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.SerializableException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConfigurationFilePopUpMenu_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.cjdbc.console.gui.popups.AbstractPopUpMenu",
      "org.objectweb.cjdbc.console.gui.popups.ConfigurationFilePopUpMenu",
      "org.objectweb.cjdbc.common.i18n.GuiTranslate",
      "org.objectweb.cjdbc.console.gui.constants.GuiCommands",
      "org.objectweb.cjdbc.console.gui.CjdbcGui",
      "org.objectweb.cjdbc.console.gui.objects.AbstractGuiObject",
      "org.objectweb.cjdbc.console.gui.objects.ConfigurationFileObject",
      "org.objectweb.cjdbc.console.gui.constants.GuiIcons",
      "org.objectweb.cjdbc.console.gui.constants.GuiConstants",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.console.gui.objects.BackendObject",
      "org.objectweb.cjdbc.console.gui.popups.BackendPopUpMenu",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.common.i18n.MonitorTranslate",
      "org.objectweb.cjdbc.console.monitoring.MonitoringConsole",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.driver.Driver",
      "org.jfree.data.XYDatasetTableModel",
      "org.jfree.data.AbstractDataset",
      "org.jfree.data.AbstractSeriesDataset",
      "org.jfree.data.DefaultTableXYDataset",
      "org.jfree.data.DatasetGroup",
      "org.jfree.data.Series",
      "org.jfree.data.MatrixSeries",
      "org.jfree.data.SeriesChangeEvent",
      "org.jfree.data.MatrixSeriesCollection",
      "org.objectweb.cjdbc.driver.Blob",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.jfree.data.DefaultContourDataset",
      "org.jfree.data.NonGridContourDataset",
      "org.jfree.data.JDBCXYDataset",
      "org.jfree.data.DatasetChangeEvent",
      "org.jfree.data.XYSeries",
      "org.jfree.data.XYSeriesCollection",
      "org.jfree.data.TimeSeriesTableModel",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
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
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.common.sql.SelectRequest"
    );
  }
}
