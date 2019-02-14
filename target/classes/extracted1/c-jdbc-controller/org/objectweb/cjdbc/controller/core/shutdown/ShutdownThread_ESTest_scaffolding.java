/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 18 16:59:46 GMT 2016
 */

package org.objectweb.cjdbc.controller.core.shutdown;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ShutdownThread_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.controller.core.shutdown.ShutdownThread"; 
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
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar3628533130837575665.jar"); 
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
                                                                                                                                                                                                          }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ShutdownThread_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.controller.requestmanager.RequestManager",
      "mx4j.util.Utils",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRoundRobin",
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRandom",
      "org.objectweb.cjdbc.common.jmx.JmxException",
      "org.objectweb.cjdbc.common.shared.DumpInfo",
      "org.objectweb.cjdbc.controller.recoverylog.RecoveryTask",
      "org.objectweb.cjdbc.controller.requestmanager.TransactionMarkerMetaData",
      "org.apache.log4j.Level",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.common.net.SSLConfiguration",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBufferPool",
      "org.objectweb.cjdbc.controller.xml.DatabasesParser",
      "org.apache.xerces.xni.XMLResourceIdentifier",
      "org.apache.xerces.impl.XMLEntityManager",
      "org.apache.xerces.impl.dtd.XMLDTDDescription",
      "mx4j.server.interceptor.MBeanServerInterceptorConfigurator",
      "org.objectweb.cjdbc.controller.connection.SimpleConnectionManager",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1PassThroughScheduler",
      "org.apache.xerces.impl.dv.InvalidDatatypeValueException",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.objectweb.cjdbc.common.xml.XmlValidator",
      "org.apache.xerces.parsers.AbstractXMLDocumentParser",
      "org.apache.xerces.impl.XMLScanner",
      "org.apache.xerces.impl.dv.dtd.NOTATIONDatatypeValidator",
      "org.objectweb.cjdbc.controller.cache.result.rules.EagerCaching",
      "org.apache.xerces.xni.parser.XMLParseException",
      "org.objectweb.cjdbc.common.monitor.backend.BackendStatistics",
      "org.apache.xerces.impl.XMLEntityScanner",
      "org.apache.xerces.util.URI$MalformedURIException",
      "org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet",
      "org.apache.xerces.impl.XMLNSDocumentScannerImpl",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRandom",
      "org.apache.xerces.util.URI",
      "org.apache.xerces.xni.parser.XMLDocumentFilter",
      "org.apache.xerces.xni.parser.XMLDTDSource",
      "org.objectweb.cjdbc.common.sql.filters.MacrosHandler",
      "org.apache.xerces.impl.dv.SecuritySupport",
      "org.apache.xerces.impl.dtd.XMLAttributeDecl",
      "mx4j.server.MBeanMetaData$2",
      "mx4j.server.ReflectionMBeanInvoker$BadArgumentException",
      "org.objectweb.cjdbc.controller.loadbalancer.AllBackendsFailedException",
      "org.apache.xerces.parsers.XMLParser",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.apache.log4j.Hierarchy",
      "org.objectweb.cjdbc.driver.Statement",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.controller.connection.RandomWaitPoolConnectionManager",
      "org.apache.xerces.util.SymbolTable",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "mx4j.server.MBeanIntrospector",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseForceShutdownThread",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.common.exceptions.driver.DriverSQLException",
      "org.apache.commons.cli.Option",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseShutdownThread",
      "org.apache.xerces.impl.dv.ValidationContext",
      "org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager",
      "org.apache.xerces.impl.dtd.XMLDTDValidator",
      "org.apache.xerces.impl.dtd.XML11NSDTDValidator",
      "org.objectweb.cjdbc.common.exceptions.UnreachableBackendException",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableRule",
      "org.apache.xerces.util.AugmentationsImpl",
      "mx4j.loading.ClassLoaderObjectInputStream",
      "org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_LPRF",
      "org.apache.xerces.impl.dv.ObjectFactory",
      "org.apache.xerces.impl.dv.DatatypeValidator",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.ReleaseSavepointTask",
      "org.objectweb.cjdbc.controller.recoverylog.BackendRecoveryInfo",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1",
      "org.objectweb.cjdbc.driver.connectpolicy.AbstractControllerConnectPolicy",
      "org.objectweb.cjdbc.controller.backend.BackendStateListener",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_LPRF",
      "org.apache.xerces.xni.grammars.XMLGrammarDescription",
      "mx4j.server.ReflectionMBeanInvoker",
      "org.apache.log4j.helpers.OptionConverter",
      "org.objectweb.cjdbc.controller.core.security.ControllerSecurityManager",
      "org.objectweb.cjdbc.common.exceptions.ShutdownException",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.objectweb.cjdbc.controller.connection.FailFastPoolConnectionManager",
      "org.apache.xerces.xni.parser.XMLErrorHandler",
      "org.objectweb.cjdbc.controller.backend.DriverCompliance",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_RR",
      "org.apache.xerces.util.MessageFormatter",
      "org.objectweb.cjdbc.driver.connectpolicy.PreferredListConnectPolicy",
      "org.objectweb.cjdbc.controller.cache.metadata.MetadataCache",
      "org.objectweb.cjdbc.controller.core.ControllerServerThread",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.xerces.xni.parser.XMLDTDScanner",
      "org.apache.xerces.xni.XMLAttributes",
      "org.apache.xerces.impl.dv.dtd.StringDatatypeValidator",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.createtable.CreateTableAll",
      "org.objectweb.cjdbc.controller.jmx.HttpAdaptor",
      "org.objectweb.cjdbc.controller.recoverylog.events.LogEntry",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb1DistributedRequestManager",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseWaitShutdownThread",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.RollbackToSavepointTask",
      "org.apache.xerces.impl.dv.DTDDVFactory",
      "org.apache.xerces.impl.dv.dtd.IDDatatypeValidator",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingRoundRobin",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticQueryLevelScheduler",
      "org.objectweb.cjdbc.common.exceptions.ProtocolException",
      "org.objectweb.cjdbc.common.sql.UpdateRequest",
      "org.apache.xerces.xni.XNIException",
      "org.apache.log4j.Category",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_RR",
      "mx4j.server.MX4JMBeanServer",
      "mx4j.log.Log$1",
      "mx4j.log.Log$2",
      "org.objectweb.cjdbc.controller.backend.rewriting.PatternRewritingRule",
      "org.apache.xerces.xni.parser.XMLDocumentSource",
      "org.apache.xerces.xni.XMLDTDContentModelHandler",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerForceShutdownThread",
      "org.objectweb.cjdbc.common.sql.StoredProcedure",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.apache.xerces.util.AugmentationsImpl$SmallContainer",
      "org.apache.xerces.impl.XMLErrorReporter",
      "org.apache.log4j.spi.LoggerFactory",
      "mx4j.ImplementationException",
      "org.apache.log4j.spi.Configurator",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter",
      "org.objectweb.cjdbc.driver.connectpolicy.SingleConnectPolicy",
      "org.apache.xerces.util.XMLStringBuffer",
      "org.apache.regexp.RESyntaxException",
      "org.apache.xerces.xni.parser.XMLParserConfiguration",
      "org.apache.commons.cli.Options",
      "org.apache.xerces.xni.XMLString",
      "org.apache.xerces.impl.dv.DVFactoryException",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerSafeShutdownThread",
      "org.objectweb.cjdbc.driver.ControllerInfo",
      "org.apache.xerces.impl.dv.DatatypeException",
      "org.apache.xerces.parsers.XML11Configurable",
      "org.objectweb.cjdbc.controller.scheduler.raidb0.RAIDb0PassThroughLevelScheduler",
      "org.apache.xerces.parsers.XIncludeAwareParserConfiguration",
      "org.objectweb.cjdbc.controller.authentication.AuthenticationManager",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteRequestTask",
      "org.objectweb.tribe.messages.MessageListener",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseDynamicMetaData",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_RR",
      "org.objectweb.cjdbc.driver.connectpolicy.RoundRobinConnectPolicy",
      "org.apache.xerces.xs.ElementPSVI",
      "org.objectweb.cjdbc.common.stream.encoding.Base64",
      "org.apache.xerces.parsers.AbstractSAXParser",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackend",
      "org.apache.xerces.xni.parser.XMLDTDContentModelSource",
      "org.apache.xerces.xni.parser.XMLDTDFilter",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerBuilder",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.CommitTask",
      "org.objectweb.cjdbc.controller.scheduler.raidb0.RAIDb0PessimisticTransactionLevelScheduler",
      "org.apache.commons.cli.CommandLineParser",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2_WRR",
      "org.objectweb.tribe.gms.GroupMembershipListener",
      "org.apache.xerces.xni.XMLLocator",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1OptimisticTransactionLevelScheduler",
      "mx4j.server.interceptor.MBeanServerInterceptorConfiguratorMBean",
      "org.objectweb.cjdbc.common.sql.metadata.MetadataContainer",
      "org.apache.xerces.xni.Augmentations",
      "org.apache.xerces.impl.XMLEntityHandler",
      "org.apache.log4j.Priority",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec",
      "org.objectweb.cjdbc.controller.monitoring.SQLMonitoring",
      "org.apache.xerces.xni.parser.XMLComponent",
      "org.apache.xerces.impl.dv.dtd.ListDatatypeValidator",
      "org.objectweb.cjdbc.controller.recoverylog.events.LogEvent",
      "org.apache.log4j.LogManager",
      "org.apache.xerces.impl.XMLEntityManager$ScannedEntity",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingAll",
      "org.objectweb.cjdbc.common.xml.XmlComponent",
      "org.apache.xerces.xni.parser.XMLDTDContentModelFilter",
      "org.objectweb.cjdbc.driver.PreparedStatement",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.controller.scheduler.singledb.SingleDBPessimisticTransactionLevelScheduler",
      "mx4j.MBeanDescriptionAdapter",
      "org.objectweb.cjdbc.common.net.SSLException",
      "org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB_RR",
      "org.apache.xerces.xs.PSVIProvider",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerShutdownThread",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.SavepointTask",
      "org.objectweb.cjdbc.common.exceptions.BadConnectionException",
      "org.apache.log4j.or.RendererMap",
      "org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2QueryLevelScheduler",
      "org.apache.xerces.impl.dtd.XMLEntityDecl",
      "org.objectweb.cjdbc.controller.jmx.RmiConnector",
      "org.apache.xerces.xs.ItemPSVI",
      "org.apache.xerces.impl.dv.dtd.ENTITYDatatypeValidator",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.controller.core.ReportManager",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_LPRF",
      "org.objectweb.cjdbc.controller.loadbalancer.paralleldb.ParallelDB",
      "org.objectweb.tribe.adapters.MulticastRequestListener",
      "org.apache.xerces.xni.parser.XMLEntityResolver",
      "org.apache.xerces.impl.dtd.XMLNSDTDValidator",
      "org.apache.xerces.impl.XMLDTDScannerImpl",
      "org.apache.xerces.impl.dv.dtd.NMTOKENDatatypeValidator",
      "org.apache.xerces.parsers.ObjectFactory",
      "org.apache.xerces.xni.parser.XMLConfigurationException",
      "org.objectweb.cjdbc.driver.connectpolicy.OrderedConnectPolicy",
      "org.apache.xerces.impl.XML11NSDocumentScannerImpl",
      "org.objectweb.cjdbc.common.sql.InsertRequest",
      "org.objectweb.cjdbc.common.sql.CreateRequest",
      "org.apache.xerces.parsers.SAXParser",
      "org.objectweb.cjdbc.controller.core.shutdown.ShutdownThread",
      "org.apache.xerces.impl.XMLEntityManager$RewindableInputStream",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.apache.log4j.spi.RootCategory",
      "org.objectweb.cjdbc.controller.backend.rewriting.SimpleRewritingRule",
      "org.apache.xerces.xni.parser.XMLInputSource",
      "org.objectweb.cjdbc.common.log.LogManager",
      "org.objectweb.cjdbc.controller.recoverylog.RecoveryLog",
      "org.apache.xerces.xni.parser.XMLComponentManager",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb0.RAIDb0",
      "org.apache.xerces.impl.io.UTF8Reader",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.BeginTask",
      "org.apache.log4j.CategoryKey",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2",
      "org.apache.xerces.impl.dtd.XMLSimpleType",
      "org.objectweb.cjdbc.controller.jmx.ChainedMBeanServerBuilder",
      "org.apache.xerces.impl.XML11DocumentScannerImpl",
      "org.objectweb.cjdbc.driver.Connection",
      "org.apache.xerces.util.AugmentationsImpl$AugmentationsItemsContainer",
      "org.objectweb.cjdbc.common.log.Trace",
      "org.objectweb.cjdbc.controller.core.ControllerConstants",
      "org.objectweb.cjdbc.controller.scheduler.singledb.SingleDBPassThroughScheduler",
      "org.apache.xerces.impl.XML11DTDScannerImpl",
      "org.apache.xerces.impl.dtd.XMLElementDecl",
      "mx4j.log.Logger",
      "org.apache.xerces.xni.grammars.Grammar",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerWaitShutdownThread",
      "org.apache.xerces.impl.dtd.models.ContentModelValidator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.commons.cli.HelpFormatter",
      "org.apache.log4j.ProvisionNode",
      "org.apache.xerces.xni.grammars.XMLGrammarLoader",
      "org.apache.xerces.xni.XMLDocumentHandler",
      "org.objectweb.cjdbc.controller.loadbalancer.singledb.SingleDB",
      "org.objectweb.cjdbc.common.sql.DropRequest",
      "org.apache.xerces.impl.io.UCSReader",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBuffer",
      "org.objectweb.cjdbc.common.jmx.mbeans.RequestManagerMBean",
      "org.apache.xerces.impl.validation.ValidationState",
      "mx4j.server.interceptor.MBeanServerInterceptor",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.ReadStoredProcedureTask",
      "org.apache.xerces.impl.XMLEntityManager$Entity",
      "org.objectweb.cjdbc.common.exceptions.AuthenticationException",
      "org.objectweb.cjdbc.controller.loadbalancer.policies.errorchecking.ErrorCheckingPolicy",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec_RR",
      "org.apache.xerces.util.XMLResourceIdentifierImpl",
      "org.apache.log4j.spi.RendererSupport",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.RollbackTask",
      "org.apache.xerces.xni.NamespaceContext",
      "org.apache.xerces.impl.dtd.XMLDTDLoader",
      "org.objectweb.cjdbc.controller.cache.parsing.ParsingCache",
      "org.apache.xerces.parsers.ObjectFactory$ConfigurationError",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1QueryLevelScheduler",
      "org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PassThroughScheduler",
      "org.apache.xerces.impl.io.ASCIIReader",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseSafeShutdownThread",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb2.RAIDb2ec_WRR",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1_WRR",
      "org.apache.xerces.impl.dtd.XMLDTDProcessor",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl",
      "org.apache.xerces.parsers.SecuritySupport",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.objectweb.cjdbc.controller.scheduler.raidb1.RAIDb1PessimisticTransactionLevelScheduler",
      "org.apache.log4j.Logger",
      "org.apache.xerces.impl.XML11EntityScanner",
      "org.apache.xerces.impl.dtd.DTDGrammar",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "mx4j.server.DefaultClassLoaderRepository",
      "org.apache.xerces.impl.dv.dtd.IDREFDatatypeValidator",
      "org.objectweb.cjdbc.common.i18n.I18N",
      "org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule",
      "org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl",
      "org.apache.log4j.helpers.LogLog",
      "mx4j.server.ModifiableClassLoaderRepository",
      "org.objectweb.cjdbc.common.exceptions.NoMoreControllerException",
      "org.objectweb.cjdbc.controller.scheduler.AbstractScheduler",
      "org.apache.xerces.impl.dtd.XMLContentSpec",
      "org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer",
      "org.apache.xerces.xs.AttributePSVI",
      "org.objectweb.cjdbc.controller.loadbalancer.raidb1.RAIDb1ec_WRR",
      "org.apache.xerces.impl.dtd.DTDGrammarBucket",
      "org.apache.xerces.impl.msg.XMLMessageFormatter",
      "org.apache.xerces.xni.parser.XMLDocumentScanner",
      "org.apache.xerces.impl.XMLVersionDetector",
      "org.apache.xerces.impl.XMLDocumentScannerImpl",
      "org.apache.xerces.xni.parser.XMLPullParserConfiguration",
      "org.objectweb.cjdbc.driver.connectpolicy.RandomConnectPolicy",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$Dispatcher",
      "org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean",
      "org.objectweb.cjdbc.controller.connection.AbstractConnectionManager",
      "org.apache.xerces.xni.grammars.XMLDTDDescription",
      "mx4j.server.MBeanRepository",
      "org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.apache.commons.cli.ParseException",
      "org.objectweb.cjdbc.common.jmx.mbeans.AbstractLoadBalancerMBean",
      "org.apache.log4j.or.DefaultRenderer",
      "org.objectweb.cjdbc.controller.connection.DriverClassLoader",
      "org.apache.xerces.xni.QName",
      "org.apache.xerces.util.XMLAttributesImpl",
      "org.objectweb.cjdbc.controller.backend.rewriting.ReplaceAllRewritingRule",
      "org.objectweb.cjdbc.controller.authentication.AuthenticationManagerException",
      "org.apache.xerces.impl.XMLEntityManager$InternalEntity",
      "org.apache.xerces.impl.RevalidationHandler",
      "org.apache.log4j.PropertyConfigurator",
      "org.objectweb.cjdbc.controller.scheduler.raidb2.RAIDb2PessimisticTransactionLevelScheduler",
      "org.apache.xerces.util.AugmentationsImpl$LargeContainer",
      "org.objectweb.cjdbc.controller.connection.VariablePoolConnectionManager",
      "org.apache.xerces.impl.dtd.BalancedDTDGrammar",
      "org.apache.xerces.xni.XMLDTDHandler",
      "org.apache.xerces.impl.dtd.XML11DTDProcessor",
      "org.apache.xerces.parsers.XML11Configuration",
      "org.apache.log4j.Appender",
      "org.apache.xerces.impl.dtd.XMLDTDValidatorFilter",
      "org.objectweb.cjdbc.common.jmx.mbeans.DatabaseBackendMBean",
      "org.apache.xerces.parsers.AbstractSAXParser$1",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.RAIDb2DistributedRequestManager",
      "org.apache.xerces.parsers.AbstractSAXParser$2",
      "mx4j.MBeanDescription",
      "org.objectweb.cjdbc.controller.jmx.ChainedMBeanServer",
      "org.objectweb.cjdbc.controller.cache.result.CacheBehavior",
      "mx4j.server.MBeanMetaData",
      "org.objectweb.cjdbc.controller.connection.DriverManager",
      "org.objectweb.cjdbc.controller.requestmanager.distributed.DistributedRequestManager",
      "mx4j.server.MBeanInvoker",
      "org.apache.log4j.spi.LoggingEvent",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.AbstractTask",
      "org.objectweb.cjdbc.controller.loadbalancer.tasks.WriteStoredProcedureTask",
      "org.apache.xerces.impl.XMLEntityManager$ExternalEntity",
      "org.apache.xerces.impl.validation.EntityState",
      "org.objectweb.cjdbc.controller.core.ControllerWorkerThread",
      "org.apache.xerces.util.ParserConfigurationSettings",
      "org.objectweb.cjdbc.controller.core.ControllerFactory",
      "org.objectweb.cjdbc.common.jmx.mbeans.ControllerMBean",
      "org.apache.xerces.impl.dv.ObjectFactory$ConfigurationError",
      "org.objectweb.cjdbc.common.sql.AlterRequest",
      "mx4j.log.Log",
      "org.apache.log4j.spi.LoggerRepository",
      "org.objectweb.cjdbc.controller.monitoring.Monitoring",
      "org.apache.xerces.impl.dtd.XML11DTDValidator",
      "org.objectweb.cjdbc.common.exceptions.BackupException",
      "org.objectweb.cjdbc.controller.virtualdatabase.DistributedVirtualDatabase",
      "org.objectweb.cjdbc.controller.jmx.AbstractStandardMBean"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ShutdownThread_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.Logger",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.objectweb.cjdbc.controller.jmx.RmiConnector",
      "org.objectweb.cjdbc.controller.jmx.HttpAdaptor",
      "org.objectweb.cjdbc.common.stream.encoding.Base64",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.objectweb.cjdbc.controller.core.ControllerServerThread",
      "org.objectweb.cjdbc.common.util.Constants",
      "org.objectweb.cjdbc.driver.Driver",
      "org.objectweb.cjdbc.driver.PreparedStatement",
      "org.objectweb.cjdbc.controller.recoverylog.RecoveryLog",
      "org.objectweb.cjdbc.controller.connection.DriverManager",
      "org.objectweb.cjdbc.controller.xml.DatabasesParser",
      "org.apache.xerces.parsers.XMLParser",
      "org.apache.xerces.parsers.AbstractSAXParser",
      "org.apache.xerces.parsers.SAXParser",
      "org.apache.xerces.parsers.ObjectFactory",
      "org.apache.xerces.parsers.SecuritySupport",
      "org.apache.xerces.util.ParserConfigurationSettings",
      "org.apache.xerces.parsers.XML11Configuration",
      "org.apache.xerces.parsers.XIncludeAwareParserConfiguration",
      "org.apache.xerces.util.SymbolTable",
      "org.apache.xerces.impl.XMLEntityManager",
      "org.apache.xerces.util.AugmentationsImpl$SmallContainer",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBufferPool",
      "org.apache.xerces.impl.XMLEntityScanner",
      "org.apache.xerces.impl.XMLErrorReporter",
      "org.apache.xerces.impl.XMLScanner",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl",
      "org.apache.xerces.impl.XMLDocumentScannerImpl",
      "org.apache.xerces.util.XMLStringBuffer",
      "org.apache.xerces.util.XMLAttributesImpl",
      "org.apache.xerces.impl.XMLDTDScannerImpl",
      "org.apache.xerces.impl.dtd.XMLDTDProcessor",
      "org.apache.xerces.impl.dtd.XMLDTDValidator",
      "org.apache.xerces.impl.validation.ValidationState",
      "org.apache.xerces.impl.dtd.XMLElementDecl",
      "org.apache.xerces.impl.dtd.XMLSimpleType",
      "org.apache.xerces.impl.dv.DTDDVFactory",
      "org.apache.xerces.impl.dv.ObjectFactory",
      "org.apache.xerces.impl.dv.SecuritySupport",
      "org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl",
      "org.apache.xerces.impl.XMLVersionDetector",
      "org.apache.xerces.impl.msg.XMLMessageFormatter",
      "org.objectweb.cjdbc.common.xml.XmlValidator",
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException",
      "org.objectweb.cjdbc.controller.core.ControllerConstants",
      "org.objectweb.cjdbc.driver.CjdbcUrl",
      "org.objectweb.cjdbc.common.jmx.JmxException",
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
      "org.objectweb.cjdbc.controller.loadbalancer.AbstractLoadBalancer",
      "org.objectweb.cjdbc.driver.Field",
      "org.objectweb.cjdbc.controller.cache.parsing.ParsingCache",
      "org.objectweb.cjdbc.common.exceptions.ShutdownException",
      "org.objectweb.cjdbc.controller.core.ControllerFactory",
      "org.apache.commons.cli.Option",
      "org.objectweb.cjdbc.controller.core.ReportManager",
      "org.objectweb.cjdbc.controller.cache.metadata.MetadataCache",
      "org.apache.commons.cli.HelpFormatter",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.objectweb.cjdbc.common.sql.DeleteRequest",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackend"
    );
  }
}
