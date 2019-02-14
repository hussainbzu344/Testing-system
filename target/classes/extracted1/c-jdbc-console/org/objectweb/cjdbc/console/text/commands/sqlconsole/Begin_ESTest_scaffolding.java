/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 18 08:12:55 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.sqlconsole;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@EvoSuiteClassExclude
public class Begin_ESTest_scaffolding {

  protected static ExecutorService executor; 

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.console.text.commands.sqlconsole.Begin"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    executor = Executors.newCachedThreadPool(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init(); 
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    executor.shutdownNow(); 
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
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar8646880409651146244.jar"); 
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
                        java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
                    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
                                                                                                                                                                      }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Begin_ESTest_scaffolding.class.getClassLoader() ,
      "jline.SimpleCompletor",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.Disable",
      "jline.ArgumentCompletor",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.Backup",
      "org.objectweb.cjdbc.console.text.commands.controller.RefreshLogs",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.apache.log4j.or.RendererMap",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowDatabases",
      "org.objectweb.cjdbc.console.text.commands.ConsoleCommand",
      "jline.FileNameCompletor",
      "org.objectweb.cjdbc.console.text.ColorPrinter",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.Enable",
      "org.apache.log4j.Level",
      "org.objectweb.cjdbc.console.text.commands.controller.ShowLoggingConfig",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.console.text.commands.monitor.AbstractMonitorCommand",
      "jline.CandidateListCompletionHandler",
      "org.objectweb.cjdbc.console.text.module.AbstractConsoleModule$CommandDelimiter",
      "org.objectweb.cjdbc.console.views.DatabasesViewer",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.AbstractAdminCommand",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.apache.log4j.spi.RootCategory",
      "org.objectweb.cjdbc.common.log.LogManager",
      "org.objectweb.cjdbc.console.text.commands.controller.Load",
      "org.apache.log4j.CategoryKey",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowCache",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowStats",
      "org.objectweb.cjdbc.driver.Connection",
      "org.objectweb.cjdbc.console.views.SchedulerViewer",
      "org.objectweb.cjdbc.console.text.commands.History",
      "org.objectweb.cjdbc.common.log.Trace",
      "mx4j.log.Logger",
      "org.objectweb.cjdbc.console.text.module.AbstractConsoleModule",
      "org.objectweb.cjdbc.common.i18n.ConsoleTranslate",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.apache.log4j.Hierarchy",
      "org.objectweb.cjdbc.console.text.commands.Help",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.Load",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.console.text.commands.Quit",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.objectweb.cjdbc.console.text.commands.controller.Admin",
      "jline.Completor",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.Restore",
      "mx4j.server.interceptor.MBeanServerInterceptor",
      "org.objectweb.cjdbc.console.text.commands.controller.Connect",
      "org.objectweb.cjdbc.common.exceptions.AuthenticationException",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.objectweb.cjdbc.console.text.commands.controller.GetXml",
      "org.objectweb.cjdbc.console.views.BackendViewer",
      "org.objectweb.cjdbc.console.text.commands.controller.AddDriver",
      "org.apache.log4j.spi.RendererSupport",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.SetFetchSize",
      "mx4j.loading.ClassLoaderObjectInputStream",
      "jline.WindowsTerminal",
      "org.objectweb.cjdbc.console.text.commands.controller.ListDatabases",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ShowControllers",
      "org.objectweb.cjdbc.console.text.commands.monitor.ChangeTarget",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.SetTimeout",
      "org.apache.log4j.helpers.OptionConverter",
      "org.objectweb.cjdbc.console.views.InfoViewer",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.SetSavePoint",
      "org.objectweb.cjdbc.console.text.commands.controller.Bind",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.SetIsolation",
      "org.objectweb.cjdbc.console.text.module.ControllerConsole",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.Commit",
      "org.apache.log4j.or.ObjectRenderer",
      "jline.ArgumentCompletor$ArgumentDelimiter",
      "org.apache.log4j.Logger",
      "org.objectweb.cjdbc.console.text.commands.controller.DropDB",
      "mx4j.server.DefaultClassLoaderRepository",
      "jline.History",
      "org.objectweb.cjdbc.common.i18n.I18N",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ListBackends",
      "org.apache.log4j.helpers.LogLog",
      "mx4j.server.ModifiableClassLoaderRepository",
      "org.objectweb.cjdbc.console.views.SQLStatViewer",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.SetMaxRows",
      "org.objectweb.cjdbc.common.exceptions.NoMoreControllerException",
      "org.apache.log4j.Category",
      "org.objectweb.cjdbc.console.jmx.RmiJmxClient",
      "mx4j.server.MX4JMBeanServer",
      "mx4j.log.Log$1",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.GetXml",
      "mx4j.log.Log$2",
      "jline.ConsoleOperations",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ExpertMode",
      "org.objectweb.cjdbc.console.text.commands.controller.Shutdown",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ViewBackupers",
      "org.objectweb.cjdbc.console.views.CacheStatsViewer",
      "org.objectweb.cjdbc.console.text.commands.controller.Monitor",
      "org.objectweb.cjdbc.console.text.module.VirtualDatabaseConsole",
      "org.apache.log4j.spi.RepositorySelector",
      "org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean",
      "jline.ArgumentCompletor$AbstractArgumentDelimiter",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowRecoveryLog",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowScheduler",
      "org.objectweb.cjdbc.controller.authentication.PasswordAuthenticator",
      "mx4j.server.MBeanRepository",
      "org.apache.log4j.spi.LoggerFactory",
      "mx4j.ImplementationException",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.objectweb.cjdbc.driver.Driver",
      "org.apache.log4j.spi.Configurator",
      "org.objectweb.cjdbc.console.views.ControllerLoadViewer",
      "org.apache.log4j.or.DefaultRenderer",
      "jline.UnixTerminal",
      "org.apache.log4j.PropertyConfigurator",
      "org.objectweb.cjdbc.driver.ControllerInfo",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.Begin",
      "org.objectweb.cjdbc.console.views.CacheViewer",
      "org.objectweb.cjdbc.console.text.Console",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.Rollback",
      "jline.ConsoleReader",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowController",
      "org.objectweb.cjdbc.driver.Clob",
      "org.apache.log4j.Appender",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.TransferDump",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException",
      "jline.Terminal",
      "org.objectweb.cjdbc.common.jmx.mbeans.DataCollectorMBean",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ViewDumps",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowCacheStats",
      "org.objectweb.cjdbc.common.jmx.mbeans.DatabaseBackendMBean",
      "org.objectweb.cjdbc.console.text.module.MonitorConsole",
      "jline.UnixTerminal$1",
      "org.objectweb.cjdbc.console.text.commands.monitor.ShowBackends",
      "mx4j.server.MBeanMetaData",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.objectweb.cjdbc.console.views.RecoveryLogViewer",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.CallStoredProcedure",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.objectweb.cjdbc.common.jmx.mbeans.ControllerMBean",
      "org.apache.log4j.Priority",
      "org.objectweb.cjdbc.console.text.ConsoleException",
      "org.objectweb.cjdbc.console.text.commands.controller.SaveConfiguration",
      "org.objectweb.cjdbc.console.text.commands.sqlconsole.ShowTables",
      "mx4j.log.Log",
      "jline.UnsupportedTerminal",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.RemoveDump",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ShowBackend",
      "jline.CursorBuffer",
      "org.objectweb.cjdbc.console.text.module.VirtualDatabaseAdmin",
      "jline.CompletionHandler"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Begin_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.cjdbc.common.i18n.ConsoleTranslate",
      "org.objectweb.cjdbc.console.jmx.RmiJmxClient",
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.objectweb.cjdbc.controller.authentication.PasswordAuthenticator",
      "org.objectweb.cjdbc.console.text.module.AbstractConsoleModule",
      "mx4j.server.MX4JMBeanServer",
      "mx4j.log.Log",
      "mx4j.log.Logger",
      "org.objectweb.cjdbc.console.text.Console",
      "jline.ConsoleReader",
      "jline.Terminal",
      "jline.UnixTerminal",
      "jline.CandidateListCompletionHandler",
      "org.objectweb.cjdbc.console.text.commands.dbadmin.ExpertMode",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.console.text.ColorPrinter",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.console.text.ConsoleException",
      "org.objectweb.cjdbc.driver.Clob",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.common.sql.SelectRequest"
    );
  }
}
