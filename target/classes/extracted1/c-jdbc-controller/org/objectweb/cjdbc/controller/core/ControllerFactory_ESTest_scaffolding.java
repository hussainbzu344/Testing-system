/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 18 16:36:40 GMT 2016
 */

package org.objectweb.cjdbc.controller.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ControllerFactory_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.controller.core.ControllerFactory"; 
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
        java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
        java.lang.System.setProperty("java.version", "1.8.0_91"); 
                java.lang.System.setProperty("awt.toolkit", "sun.awt.X11.XToolkit"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.separator", "/"); 
        java.lang.System.setProperty("java.awt.graphicsenv", "sun.awt.X11GraphicsEnvironment"); 
    java.lang.System.setProperty("java.awt.printerjob", "sun.print.PSPrinterJob"); 
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar8152035334990964882.jar"); 
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
                                                                                                                                                                                                                    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
                                                                                                                                          }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ControllerFactory_ESTest_scaffolding.class.getClassLoader() ,
      "org.jfree.data.Dataset",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.controller.requestmanager.RequestManager",
      "org.jfree.data.resources.DataPackageResources",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRoundRobin",
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.jfree.data.time.Minute",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom",
      "org.objectweb.cjdbc.common.jmx.JmxException",
      "org.apache.log4j.Level",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.common.net.SSLConfiguration",
      "org.objectweb.cjdbc.controller.xml.DatabasesParser",
      "org.apache.commons.cli.UnrecognizedOptionException",
      "org.objectweb.cjdbc.common.monitor.controller.TotalMemoryCollector",
      "org.jfree.data.DefaultKeyedValues2DDataset",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1PassThroughScheduler",
      "org.objectweb.cjdbc.controller.connection.SimpleConnectionManager",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching",
      "org.jfree.data.NonGridContourDataset",
      "org.objectweb.cjdbc.common.monitor.cache.HitsRatioCollector",
      "org.objectweb.cjdbc.common.monitor.cache.AbstractCacheStatsDataCollector",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRandom",
      "org.jfree.data.CombinedDataset$DatasetInfo",
      "org.webdocwf.util.loader.wizard.OctopusHelpPane",
      "org.objectweb.cjdbc.common.monitor.scheduler.AbstractSchedulerDataCollector",
      "org.objectweb.cjdbc.common.monitor.client.AbstractClientDataCollector",
      "org.jfree.data.DefaultContourDataset",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.apache.log4j.Hierarchy",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.driver.Statement",
      "org.objectweb.cjdbc.controller.connection.RandomWaitPoolConnectionManager",
      "org.jfree.data.DefaultKeyedValues",
      "org.objectweb.cjdbc.common.monitor.cache.CountHitsCollector",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.DatabaseThreadsCollector",
      "org.apache.commons.cli.Option",
      "org.objectweb.cjdbc.common.monitor.backend.ActiveConnectionsCollector",
      "org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRule",
      "org.jfree.data.time.Second",
      "org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF",
      "org.jfree.data.XYSeries",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1",
      "org.objectweb.cjdbc.driver.connectpolicy.AbstractControllerConnectPolicy",
      "org.jfree.data.KeyedValues",
      "org.jfree.data.XYDatasetTableModel",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_LPRF",
      "org.apache.log4j.helpers.OptionConverter",
      "org.objectweb.cjdbc.controller.core.security.ControllerSecurityManager",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.apache.commons.cli.MissingArgumentException",
      "org.jfree.data.SeriesChangeListener",
      "org.objectweb.cjdbc.controller.connection.FailFastPoolConnectionManager",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR",
      "org.jfree.data.AbstractSeriesDataset",
      "org.objectweb.cjdbc.driver.connectpolicy.PreferredListConnectPolicy",
      "org.objectweb.cjdbc.controller.core.ControllerServerThread",
      "org.apache.log4j.or.ObjectRenderer",
      "org.objectweb.cjdbc.common.monitor.backend.AbstractBackendDataCollector",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseTable",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableAll",
      "org.objectweb.cjdbc.controller.jmx.HttpAdaptor",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb1DistributedRequestManager",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler",
      "org.objectweb.cjdbc.common.monitor.cache.CountInsertCollector",
      "org.objectweb.cjdbc.common.exceptions.ProtocolException",
      "org.objectweb.cjdbc.common.sql.UpdateRequest",
      "org.objectweb.cjdbc.common.monitor.controller.AbstractControllerDataCollector",
      "org.apache.log4j.Category",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_RR",
      "org.jfree.data.CategoryDataset",
      "org.objectweb.cjdbc.common.monitor.backend.TransactionsCollector",
      "org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule",
      "org.jfree.data.HighLowDataset",
      "org.objectweb.cjdbc.common.exceptions.DataCollectorException",
      "org.jfree.data.time.Millisecond",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerForceShutdownThread",
      "org.objectweb.cjdbc.common.sql.StoredProcedure",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.objectweb.cjdbc.controller.xml.ControllerParser",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter",
      "org.objectweb.cjdbc.driver.connectpolicy.SingleConnectPolicy",
      "org.apache.regexp.RESyntaxException",
      "org.apache.commons.cli.Options",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerSafeShutdownThread",
      "org.objectweb.cjdbc.driver.ControllerInfo",
      "org.objectweb.cjdbc.common.monitor.backend.PendingRequestsCollector",
      "org.objectweb.cjdbc.controller.scheduler.raidb0.RAIDb0PassThroughLevelScheduler",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.ControllerCoreException",
      "org.objectweb.cjdbc.driver.Clob",
      "org.objectweb.tribe.messages.MessageListener",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.AbstractVirtualDatabaseDataCollector",
      "org.objectweb.cjdbc.common.monitor.scheduler.NumberReadCollector",
      "org.jfree.data.WindDataset",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException",
      "org.apache.commons.cli.CommandLine",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_RR",
      "org.jfree.data.TableXYDataset",
      "org.objectweb.cjdbc.driver.connectpolicy.RoundRobinConnectPolicy",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder",
      "org.objectweb.cjdbc.controller.scheduler.raidb0.RAIDb0PessimisticTransactionLevelScheduler",
      "org.apache.commons.cli.CommandLineParser",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.jfree.data.TimeSeriesTableModel",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR",
      "org.objectweb.tribe.gms.GroupMembershipListener",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticTransactionLevelScheduler",
      "org.objectweb.cjdbc.common.monitor.backend.WriteRequestsCollector",
      "org.jfree.data.XYZDataset",
      "org.jfree.data.IntervalCategoryDataset",
      "org.jfree.data.CombinedDataset",
      "org.apache.log4j.Priority",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec",
      "org.objectweb.cjdbc.common.monitor.backend.ActiveTransactionCollector",
      "org.apache.log4j.LogManager",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingAll",
      "org.jfree.date.SerialDate",
      "org.objectweb.cjdbc.common.xml.XmlComponent",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.controller.scheduler.singledb.SingleDBPessimisticTransactionLevelScheduler",
      "org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_RR",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerShutdownThread",
      "org.jfree.data.Series",
      "org.apache.log4j.or.RendererMap",
      "org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2QueryLevelScheduler",
      "org.jfree.data.DatasetChangeListener",
      "org.objectweb.cjdbc.controller.jmx.RmiConnector",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.controller.core.ReportManager",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_LPRF",
      "org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB",
      "org.objectweb.tribe.adapters.MulticastRequestListener",
      "org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedure",
      "org.objectweb.cjdbc.controller.core.shutdown.ShutdownThread",
      "org.objectweb.cjdbc.common.monitor.cache.CountSelectCollector",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.apache.log4j.spi.RootCategory",
      "org.objectweb.cjdbc.controller.backend.rewriting.SimpleRewritingRule",
      "org.apache.commons.cli.Parser",
      "org.objectweb.cjdbc.common.log.LogManager",
      "org.jfree.util.SortOrder",
      "org.objectweb.cjdbc.common.monitor.AbstractDataCollector",
      "org.jfree.data.time.Day",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0",
      "org.objectweb.cjdbc.common.monitor.client.ClientActiveTimeCollector",
      "org.apache.commons.cli.HelpFormatter$StringBufferComparator",
      "org.apache.log4j.CategoryKey",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2",
      "org.objectweb.cjdbc.controller.jmx.ChainedMBeanServerBuilder",
      "org.objectweb.cjdbc.driver.Connection",
      "org.objectweb.cjdbc.common.log.Trace",
      "org.jfree.data.time.TimePeriod",
      "org.jfree.data.DatasetGroup",
      "org.objectweb.cjdbc.controller.scheduler.singledb.SingleDBPassThroughScheduler",
      "org.jfree.data.XYDataset",
      "org.jfree.data.SeriesChangeEvent",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerWaitShutdownThread",
      "org.apache.log4j.helpers.Loader",
      "org.apache.commons.cli.HelpFormatter",
      "org.apache.log4j.ProvisionNode",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.date.SpreadsheetDate",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedureParameter",
      "org.objectweb.cjdbc.common.monitor.backend.RequestsCollector",
      "org.apache.regexp.RECompiler",
      "org.jfree.data.time.TimeSeries",
      "org.objectweb.cjdbc.controller.loadbalancer.singledb.SingleDB",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.objectweb.cjdbc.common.monitor.scheduler.PendingWritesCollector",
      "org.jfree.data.AbstractDataset",
      "org.jfree.data.DatasetChangeEvent",
      "org.objectweb.cjdbc.common.jmx.mbeans.RequestManagerMBean",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.objectweb.cjdbc.common.exceptions.AuthenticationException",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy",
      "org.objectweb.cjdbc.common.monitor.backend.ReadRequestsCollector",
      "org.objectweb.cjdbc.common.monitor.cache.CacheEntriesCollector",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec_RR",
      "org.apache.commons.cli.MissingOptionException",
      "org.apache.log4j.spi.RendererSupport",
      "org.objectweb.cjdbc.driver.Blob",
      "org.jfree.data.IntervalXYDataset",
      "org.apache.commons.cli.AlreadySelectedException",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.BackendDriverException",
      "org.jfree.data.Range",
      "org.apache.commons.cli.OptionGroup",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1QueryLevelScheduler",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseColumn",
      "org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PassThroughScheduler",
      "org.jfree.data.SeriesDataset",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_WRR",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_WRR",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.apache.regexp.RE",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1PessimisticTransactionLevelScheduler",
      "org.jfree.data.CombinationDataset",
      "org.apache.log4j.Logger",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "org.objectweb.cjdbc.common.i18n.I18N",
      "org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule",
      "org.objectweb.cjdbc.driver.BlobOutputStream",
      "org.apache.log4j.helpers.LogLog",
      "org.objectweb.cjdbc.common.exceptions.NoMoreControllerException",
      "org.objectweb.cjdbc.controller.scheduler.AbstractScheduler",
      "org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer",
      "org.webdocwf.util.loader.wizard.OctopusHelpToolBar",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec_WRR",
      "org.objectweb.cjdbc.driver.connectpolicy.RandomConnectPolicy",
      "org.apache.log4j.spi.RepositorySelector",
      "org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean",
      "org.objectweb.cjdbc.controller.connection.AbstractConnectionManager",
      "org.jfree.data.SeriesException",
      "org.jfree.data.Values2D",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.ActiveDatabaseThreadCollector",
      "org.apache.commons.cli.ParseException",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.objectweb.cjdbc.common.monitor.controller.ThreadsCountCollector",
      "org.jfree.data.DefaultCategoryDataset",
      "org.jfree.data.DefaultWindDataset",
      "org.objectweb.cjdbc.common.jmx.mbeans.AbstractLoadBalancerMBean",
      "org.jfree.data.time.TimeSeriesDataItem",
      "org.apache.log4j.or.DefaultRenderer",
      "org.jfree.data.ContourDataset",
      "org.apache.regexp.CharacterIterator",
      "org.objectweb.cjdbc.controller.backend.rewriting.ReplaceAllRewritingRule",
      "org.jfree.data.DefaultIntervalCategoryDataset",
      "org.objectweb.cjdbc.controller.authentication.AuthenticationManagerException",
      "org.jfree.data.DefaultTableXYDataset",
      "org.jfree.date.MonthConstants",
      "org.apache.log4j.PropertyConfigurator",
      "org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PessimisticTransactionLevelScheduler",
      "org.objectweb.cjdbc.controller.connection.VariablePoolConnectionManager",
      "org.apache.commons.cli.GnuParser",
      "org.jfree.data.time.Hour",
      "org.apache.log4j.Appender",
      "org.objectweb.cjdbc.common.jmx.mbeans.DataCollectorMBean",
      "org.objectweb.cjdbc.common.monitor.controller.UsedMemoryCollector",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb2DistributedRequestManager",
      "org.objectweb.cjdbc.controller.jmx.ChainedMBeanServer",
      "org.objectweb.cjdbc.controller.cache.result.CacheBehavior",
      "org.objectweb.cjdbc.common.monitor.scheduler.PendingTransactionsCollector",
      "org.objectweb.cjdbc.common.monitor.scheduler.NumberWriteCollector",
      "org.apache.regexp.REProgram",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager",
      "org.apache.log4j.spi.LoggingEvent",
      "org.jfree.data.KeyedValues2DDataset",
      "org.objectweb.cjdbc.common.monitor.controller.ControllerWorkerPendingQueueCollector",
      "org.objectweb.cjdbc.common.monitor.controller.ControllerIdleThreadsCollector",
      "org.objectweb.cjdbc.controller.core.ControllerFactory",
      "org.objectweb.cjdbc.common.jmx.mbeans.ControllerMBean",
      "org.jfree.data.KeyedValues2D",
      "org.jfree.data.Values",
      "org.objectweb.cjdbc.common.monitor.scheduler.NumberRequestsCollector",
      "org.apache.log4j.spi.LoggerRepository",
      "org.objectweb.cjdbc.controller.monitoring.datacollector.DataCollector",
      "org.objectweb.cjdbc.common.exceptions.driver.protocol.SerializableException",
      "org.objectweb.cjdbc.common.exceptions.BackupException",
      "org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase",
      "org.objectweb.cjdbc.controller.jmx.AbstractStandardMBean"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ControllerFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
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
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.objectweb.cjdbc.controller.core.ControllerFactory",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.controller.jmx.RmiConnector",
      "org.objectweb.cjdbc.controller.jmx.HttpAdaptor",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.apache.commons.cli.Option",
      "org.apache.commons.cli.HelpFormatter",
      "org.apache.commons.cli.ParseException",
      "org.apache.commons.cli.UnrecognizedOptionException",
      "org.objectweb.cjdbc.common.net.SSLConfiguration",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseTable",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.controller.xml.ControllerParser",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.objectweb.cjdbc.common.sql.UpdateRequest",
      "org.apache.regexp.RE",
      "org.apache.regexp.REProgram",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.apache.regexp.RECompiler",
      "org.jfree.data.TimeSeriesTableModel",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.controller.xml.DatabasesParser",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.objectweb.cjdbc.driver.Blob",
      "org.jfree.data.Series",
      "org.jfree.data.time.TimeSeries",
      "org.jfree.data.time.RegularTimePeriod",
      "org.jfree.data.time.Day",
      "org.objectweb.cjdbc.driver.Clob",
      "org.objectweb.cjdbc.driver.Connection",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.jfree.data.XYDatasetTableModel",
      "org.jfree.data.AbstractDataset",
      "org.jfree.data.DefaultContourDataset",
      "org.jfree.data.NonGridContourDataset",
      "org.jfree.data.DatasetGroup",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.jfree.data.AbstractSeriesDataset",
      "org.jfree.data.DefaultTableXYDataset",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.jfree.data.DefaultWindDataset",
      "org.webdocwf.util.loader.wizard.OctopusHelpToolBar",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseProcedure",
      "org.jfree.data.DefaultIntervalCategoryDataset",
      "org.jfree.data.resources.DataPackageResources",
      "org.jfree.data.CombinedDataset",
      "org.jfree.data.DatasetChangeEvent",
      "org.jfree.data.DefaultKeyedValues",
      "org.jfree.data.time.Millisecond",
      "org.jfree.data.time.Second",
      "org.jfree.data.time.Minute",
      "org.jfree.data.time.Hour",
      "org.jfree.date.SerialDate",
      "org.jfree.date.SpreadsheetDate",
      "org.jfree.data.DefaultCategoryDataset",
      "org.jfree.data.DefaultKeyedValues2DDataset",
      "org.jfree.data.DefaultKeyedValues2D",
      "org.apache.regexp.RESyntaxException"
    );
  }
}