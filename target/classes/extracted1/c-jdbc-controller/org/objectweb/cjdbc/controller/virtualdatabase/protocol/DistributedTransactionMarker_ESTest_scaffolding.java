/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Tue Jul 19 00:05:30 GMT 2016
 */

package org.objectweb.cjdbc.controller.virtualdatabase.protocol;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DistributedTransactionMarker_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.controller.virtualdatabase.protocol.DistributedTransactionMarker"; 
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
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar6882119888180120138.jar"); 
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
                                                                                                                                                          }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DistributedTransactionMarker_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.cjdbc.common.xml.XmlComponent",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.DisableBackend",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.KillThreadTask",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.controller.requestmanager.RequestManager",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.SavepointTask",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerShutdownThread",
      "org.objectweb.cjdbc.common.exceptions.BadConnectionException",
      "org.apache.log4j.or.RendererMap",
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.objectweb.cjdbc.controller.cache.CacheStatistics",
      "org.objectweb.cjdbc.controller.jmx.RmiConnector",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.SetSavepoint",
      "org.objectweb.cjdbc.common.jmx.JmxException",
      "org.objectweb.cjdbc.common.shared.DumpInfo",
      "org.objectweb.cjdbc.controller.recoverylog.RecoveryTask",
      "org.objectweb.tribe.adapters.MulticastRequestListener",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.controller.requestmanager.TransactionMarkerMetaData",
      "org.objectweb.cjdbc.controller.core.ReportManager",
      "org.objectweb.tribe.exceptions.ChannelException",
      "org.apache.log4j.Level",
      "org.objectweb.cjdbc.common.net.SSLConfiguration",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.CopyLogEntry",
      "org.objectweb.cjdbc.common.sql.InsertRequest",
      "org.objectweb.cjdbc.controller.cache.result.AbstractResultCache",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.objectweb.cjdbc.controller.core.shutdown.ShutdownThread",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.controller.cache.result.ResultCache",
      "org.apache.log4j.spi.RootCategory",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint",
      "org.objectweb.tribe.channel.ReliableGroupChannel",
      "org.objectweb.cjdbc.controller.recoverylog.RecoveryLog",
      "org.objectweb.cjdbc.common.log.LogManager",
      "org.objectweb.cjdbc.controller.cache.CacheException",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.BeginTask",
      "org.apache.log4j.CategoryKey",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2",
      "org.objectweb.cjdbc.common.monitor.backend.BackendStatistics",
      "org.objectweb.cjdbc.common.log.Trace",
      "org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet",
      "org.objectweb.cjdbc.common.sql.filters.MacrosHandler",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.BackendStatus",
      "org.objectweb.cjdbc.controller.recoverylog.RecoverThread",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerWaitShutdownThread",
      "org.objectweb.cjdbc.controller.loadbalancer.AllBackendsFailedException",
      "org.apache.log4j.helpers.Loader",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.BackendTransfer",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.objectweb.cjdbc.common.sql.UnknownRequest",
      "org.apache.regexp.RECompiler",
      "org.objectweb.cjdbc.controller.cache.result.entries.ResultCacheEntryRelaxed",
      "org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread",
      "org.objectweb.cjdbc.controller.loadbalancer.singledb.SingleDB",
      "org.objectweb.tribe.common.Address",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.objectweb.tribe.exceptions.NotConnectedException",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseForceShutdownThread",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.DistributedTransactionMarker",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseShutdownThread",
      "org.objectweb.cjdbc.common.exceptions.UnreachableBackendException",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit",
      "org.objectweb.cjdbc.common.jmx.mbeans.RequestManagerMBean",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.ReadStoredProcedureTask",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRule",
      "org.apache.log4j.spi.RendererSupport",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.RollbackTask",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.ReleaseSavepointTask",
      "org.objectweb.cjdbc.controller.recoverylog.BackendRecoveryInfo",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1",
      "org.objectweb.cjdbc.controller.cache.parsing.ParsingCache",
      "org.objectweb.cjdbc.controller.backend.BackendStateListener",
      "org.objectweb.cjdbc.common.shared.BackendInfo",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseColumn",
      "org.apache.log4j.helpers.OptionConverter",
      "org.objectweb.cjdbc.controller.core.security.ControllerSecurityManager",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.Rollback",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReplicateLogEntries",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseSafeShutdownThread",
      "org.objectweb.cjdbc.controller.cache.metadata.MetadataCache",
      "org.objectweb.cjdbc.controller.core.ControllerServerThread",
      "org.objectweb.cjdbc.controller.backup.BackupManager",
      "org.apache.log4j.or.ObjectRenderer",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseTable",
      "org.apache.regexp.RE",
      "org.apache.log4j.Logger",
      "org.objectweb.cjdbc.controller.recoverylog.events.LogEntry",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseWaitShutdownThread",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.RollbackToSavepointTask",
      "org.objectweb.tribe.channel.JGroupsReliableChannelWithGms",
      "org.objectweb.cjdbc.common.i18n.I18N",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingException",
      "org.objectweb.cjdbc.common.sql.UpdateRequest",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "org.objectweb.cjdbc.controller.scheduler.AbstractScheduler",
      "org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer",
      "org.objectweb.cjdbc.common.exceptions.NoMoreBackendException",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy",
      "org.objectweb.tribe.common.Group",
      "org.apache.log4j.spi.RepositorySelector",
      "org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestWithKeysTask",
      "org.objectweb.cjdbc.controller.connection.AbstractConnectionManager",
      "org.objectweb.cjdbc.controller.cache.result.threads.EagerCacheThread",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerForceShutdownThread",
      "org.objectweb.cjdbc.common.sql.StoredProcedure",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException",
      "org.apache.log4j.spi.LoggerFactory",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint",
      "org.apache.log4j.spi.Configurator",
      "org.objectweb.cjdbc.controller.cache.result.ResultCacheRule",
      "org.objectweb.cjdbc.common.jmx.mbeans.AbstractLoadBalancerMBean",
      "org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter",
      "org.apache.log4j.or.DefaultRenderer",
      "org.objectweb.cjdbc.controller.connection.DriverClassLoader",
      "org.apache.regexp.CharacterIterator",
      "org.apache.regexp.RESyntaxException",
      "org.objectweb.tribe.channel.ReliableGroupChannelWithGms",
      "org.objectweb.cjdbc.common.sql.RequestType",
      "org.objectweb.cjdbc.common.exceptions.RollbackException",
      "org.apache.log4j.PropertyConfigurator",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerSafeShutdownThread",
      "org.objectweb.cjdbc.controller.authentication.AuthenticationManager",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestTask",
      "org.objectweb.tribe.messages.MessageListener",
      "org.apache.log4j.Appender",
      "org.objectweb.cjdbc.controller.cache.result.entries.AbstractResultCacheEntry",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseDynamicMetaData",
      "org.objectweb.tribe.exceptions.TimeoutException",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.EnableBackend",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy",
      "org.objectweb.cjdbc.common.jmx.mbeans.DatabaseBackendMBean",
      "org.objectweb.cjdbc.common.stream.encoding.Base64",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackend",
      "org.objectweb.cjdbc.controller.jmx.ChainedMBeanServer",
      "org.objectweb.cjdbc.controller.cache.result.CacheBehavior",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.CommitTask",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.VirtualDatabaseConfiguration",
      "org.objectweb.cjdbc.controller.connection.DriverManager",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager",
      "org.objectweb.tribe.adapters.MulticastRequestAdapter",
      "org.apache.regexp.REProgram",
      "org.objectweb.tribe.gms.GroupMembershipListener",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.log4j.spi.LoggingEvent",
      "org.objectweb.tribe.common.GroupIdentifier",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.InitiateDumpCopy",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.AbstractTask",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteStoredProcedureTask",
      "org.objectweb.cjdbc.common.jmx.mbeans.ControllerMBean",
      "org.objectweb.tribe.common.Member",
      "org.apache.log4j.Priority",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec",
      "org.objectweb.cjdbc.controller.monitoring.SQLMonitoring",
      "org.objectweb.cjdbc.common.sql.AlterRequest",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableException",
      "org.objectweb.cjdbc.controller.monitoring.Monitoring",
      "org.apache.log4j.spi.LoggerRepository",
      "org.objectweb.cjdbc.controller.recoverylog.events.LogEvent",
      "org.apache.log4j.LogManager",
      "org.objectweb.cjdbc.common.exceptions.BackupException",
      "org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase",
      "org.objectweb.cjdbc.controller.jmx.AbstractStandardMBean"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DistributedTransactionMarker_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.DistributedTransactionMarker",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.SetSavepoint",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
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
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.objectweb.cjdbc.controller.scheduler.AbstractScheduler",
      "org.objectweb.cjdbc.controller.cache.result.AbstractResultCache",
      "org.objectweb.cjdbc.controller.cache.result.ResultCache",
      "org.objectweb.cjdbc.controller.cache.result.threads.RelaxedCacheThread",
      "org.objectweb.cjdbc.controller.cache.result.threads.EagerCacheThread",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.WaitForCompletionPolicy",
      "org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1",
      "org.objectweb.cjdbc.controller.recoverylog.RecoveryLog",
      "org.objectweb.cjdbc.controller.connection.DriverManager",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.ReleaseSavepoint",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.Commit",
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTablePolicy",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.Rollback",
      "org.objectweb.cjdbc.controller.loadbalancer.singledb.SingleDB",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec",
      "org.objectweb.cjdbc.controller.virtualdatabase.protocol.RollbackToSavepoint",
      "org.objectweb.cjdbc.common.stream.encoding.Base64",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.common.jmx.JmxException",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec",
      "org.objectweb.cjdbc.controller.jmx.RmiConnector",
      "org.objectweb.cjdbc.controller.requestmanager.RequestManager",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.objectweb.cjdbc.common.sql.RequestType",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.common.sql.StoredProcedure",
      "org.objectweb.cjdbc.common.sql.AlterRequest",
      "org.objectweb.cjdbc.common.exceptions.NoMoreBackendException",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.objectweb.cjdbc.controller.cache.result.ResultCacheRule",
      "org.apache.regexp.RE",
      "org.apache.regexp.RECompiler",
      "org.apache.regexp.RESyntaxException",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException"
    );
  }
}
