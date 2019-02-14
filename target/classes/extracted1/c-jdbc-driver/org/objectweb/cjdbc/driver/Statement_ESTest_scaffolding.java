/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 19 03:48:48 GMT 2016
 */

package org.objectweb.cjdbc.driver;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Statement_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.driver.Statement"; 
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
    java.lang.System.setProperty("line.separator", "\n"); 
    java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar364466987088371533.jar"); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Statement_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.date.SerialDate",
      "org.jfree.data.time.Quarter",
      "org.objectweb.cjdbc.driver.connectpolicy.PreferredListConnectPolicy",
      "org.jfree.data.time.Year",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseTable",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.common.exceptions.ProtocolException",
      "org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy",
      "org.objectweb.cjdbc.driver.BlobOutputStream",
      "org.objectweb.cjdbc.common.sql.UpdateRequest",
      "org.objectweb.cjdbc.common.sql.InsertRequest",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.objectweb.cjdbc.common.exceptions.NoMoreControllerException",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedure",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.driver.connectpolicy.RandomConnectPolicy",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.objectweb.cjdbc.common.sql.StoredProcedure",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.driver.Connection",
      "org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter",
      "org.objectweb.cjdbc.common.log.Trace",
      "org.jfree.data.time.TimePeriod",
      "org.objectweb.cjdbc.driver.connectpolicy.SingleConnectPolicy",
      "org.jfree.date.MonthConstants",
      "org.objectweb.cjdbc.common.sql.RequestType",
      "org.objectweb.cjdbc.driver.ControllerInfo",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.ControllerCoreException",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.jfree.date.SpreadsheetDate",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.TimePeriodFormatException",
      "org.objectweb.cjdbc.driver.Statement",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter",
      "org.objectweb.cjdbc.driver.Clob",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.objectweb.cjdbc.driver.connectpolicy.RoundRobinConnectPolicy",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.objectweb.cjdbc.common.exceptions.AuthenticationException",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.objectweb.cjdbc.common.sql.metadata.MetadataContainer",
      "org.objectweb.cjdbc.driver.Blob",
      "org.objectweb.cjdbc.common.sql.AlterRequest",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException",
      "org.objectweb.cjdbc.driver.connectpolicy.AbstractControllerConnectPolicy",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.SerializableException",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseColumn",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Statement_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.cjdbc.driver.Connection",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedure",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.objectweb.cjdbc.common.sql.AlterRequest",
      "org.objectweb.cjdbc.driver.Blob",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseTable",
      "org.jfree.date.SerialDate",
      "org.objectweb.cjdbc.common.sql.RequestType",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Quarter",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.objectweb.cjdbc.driver.Clob",
      "org.objectweb.cjdbc.common.sql.metadata.MetadataContainer",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter"
    );
  }
}
