/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jul 18 12:48:24 GMT 2016
 */

package org.objectweb.cjdbc.common.monitor.virtualdatabase;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class PendingDatabaseConnectionCollector_ESTest_scaffolding {

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);

  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector"; 
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
    java.lang.System.setProperty("java.class.path", "/tmp/EvoSuite_pathingJar7559932990645216288.jar"); 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PendingDatabaseConnectionCollector_ESTest_scaffolding.class.getClassLoader() ,
      "org.objectweb.cjdbc.common.exceptions.CJDBCException",
      "org.objectweb.cjdbc.controller.requestmanager.RequestManager",
      "org.objectweb.cjdbc.controller.core.Controller",
      "org.objectweb.cjdbc.common.jmx.JmxException",
      "org.objectweb.cjdbc.common.shared.DumpInfo",
      "org.apache.log4j.Level",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseStaticMetaData",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBufferPool",
      "org.apache.xerces.xni.XMLResourceIdentifier",
      "org.apache.xerces.impl.XMLEntityManager",
      "org.apache.xerces.impl.dtd.XMLDTDDescription",
      "org.objectweb.cjdbc.controller.connection.SimpleConnectionManager",
      "org.apache.xerces.impl.dv.InvalidDatatypeValueException",
      "org.objectweb.cjdbc.common.i18n.Translate",
      "org.apache.xerces.parsers.AbstractXMLDocumentParser",
      "org.apache.xerces.impl.XMLScanner",
      "org.apache.xerces.impl.dv.dtd.NOTATIONDatatypeValidator",
      "org.apache.xerces.xni.parser.XMLParseException",
      "org.objectweb.cjdbc.common.monitor.backend.BackendStatistics",
      "org.apache.xerces.impl.XMLEntityScanner",
      "org.apache.xerces.util.URI$MalformedURIException",
      "org.objectweb.cjdbc.controller.virtualdatabase.ControllerResultSet",
      "org.apache.xerces.impl.XMLNSDocumentScannerImpl",
      "org.apache.xerces.util.URI",
      "org.apache.xerces.xni.parser.XMLDocumentFilter",
      "org.apache.xerces.xni.parser.XMLDTDSource",
      "org.apache.xerces.impl.dv.SecuritySupport",
      "org.apache.xerces.impl.dtd.XMLAttributeDecl",
      "org.objectweb.cjdbc.controller.loadbalancer.AllBackendsFailedException",
      "org.apache.xerces.parsers.XMLParser",
      "org.objectweb.cjdbc.common.sql.schema.DatabaseSchema",
      "org.apache.log4j.Hierarchy",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.objectweb.cjdbc.driver.Statement",
      "org.objectweb.cjdbc.controller.connection.RandomWaitPoolConnectionManager",
      "org.apache.xerces.util.SymbolTable",
      "org.objectweb.cjdbc.common.exceptions.ControllerException",
      "org.objectweb.cjdbc.common.sql.SelectRequest",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseForceShutdownThread",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseShutdownThread",
      "org.apache.xerces.impl.dv.ValidationContext",
      "org.objectweb.cjdbc.controller.connection.AbstractPoolConnectionManager",
      "org.objectweb.cjdbc.common.exceptions.UnreachableBackendException",
      "org.apache.xerces.impl.dtd.XMLDTDValidator",
      "org.apache.xerces.impl.dtd.XML11NSDTDValidator",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.apache.xerces.util.AugmentationsImpl",
      "org.apache.xerces.impl.dv.ObjectFactory",
      "org.apache.xerces.impl.dv.DatatypeValidator",
      "org.apache.xerces.jaxp.SAXParserImpl",
      "org.objectweb.cjdbc.controller.backend.BackendStateListener",
      "org.apache.xerces.xni.grammars.XMLGrammarDescription",
      "org.apache.log4j.helpers.OptionConverter",
      "org.objectweb.cjdbc.controller.core.security.ControllerSecurityManager",
      "org.objectweb.cjdbc.common.sql.AbstractWriteRequest",
      "org.jfree.data.SeriesChangeListener",
      "org.objectweb.cjdbc.controller.connection.FailFastPoolConnectionManager",
      "org.objectweb.cjdbc.controller.backend.DriverCompliance",
      "org.apache.xerces.xni.parser.XMLErrorHandler",
      "org.apache.xerces.util.MessageFormatter",
      "org.objectweb.cjdbc.controller.core.ControllerServerThread",
      "org.apache.log4j.or.ObjectRenderer",
      "org.dom4j.io.SAXReader$SAXEntityResolver",
      "org.apache.xerces.xni.parser.XMLDTDScanner",
      "org.apache.xerces.xni.XMLAttributes",
      "org.apache.xerces.impl.dv.dtd.StringDatatypeValidator",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseWaitShutdownThread",
      "org.apache.xerces.impl.dv.DTDDVFactory",
      "org.apache.xerces.impl.dv.dtd.IDDatatypeValidator",
      "org.objectweb.cjdbc.common.exceptions.ProtocolException",
      "org.apache.xerces.impl.validation.ValidationManager",
      "org.apache.xerces.xni.XNIException",
      "org.apache.log4j.Category",
      "org.objectweb.cjdbc.common.exceptions.DataCollectorException",
      "org.apache.xerces.xni.parser.XMLDocumentSource",
      "org.apache.xerces.xni.XMLDTDContentModelHandler",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerForceShutdownThread",
      "org.objectweb.cjdbc.common.sql.StoredProcedure",
      "org.apache.xerces.util.AugmentationsImpl$SmallContainer",
      "org.apache.xerces.impl.XMLErrorReporter",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.objectweb.cjdbc.common.sql.filters.AbstractBlobFilter",
      "org.apache.xerces.util.XMLStringBuffer",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackendSchemaConstants",
      "org.apache.xerces.jaxp.JAXPConstants",
      "org.apache.xerces.xni.parser.XMLParserConfiguration",
      "org.apache.xerces.xni.XMLString",
      "org.apache.xerces.impl.dv.DVFactoryException",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerSafeShutdownThread",
      "org.apache.xerces.impl.dv.DatatypeException",
      "org.apache.xerces.parsers.XML11Configurable",
      "org.apache.xerces.parsers.XIncludeAwareParserConfiguration",
      "org.objectweb.cjdbc.controller.authentication.AuthenticationManager",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.AbstractVirtualDatabaseDataCollector",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabaseDynamicMetaData",
      "org.apache.xerces.impl.xs.identity.FieldActivator",
      "org.objectweb.cjdbc.common.exceptions.VirtualDatabaseException",
      "org.apache.xerces.jaxp.SAXParserFactoryImpl",
      "org.apache.xerces.xs.ElementPSVI",
      "org.apache.xerces.parsers.AbstractSAXParser",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackend",
      "org.apache.xerces.xni.parser.XMLDTDContentModelSource",
      "org.apache.xerces.xni.parser.XMLDTDFilter",
      "org.objectweb.cjdbc.common.stream.CJDBCInputStream",
      "org.jfree.data.TimeSeriesTableModel",
      "org.apache.xerces.xni.XMLLocator",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.objectweb.cjdbc.common.sql.metadata.MetadataContainer",
      "org.apache.xerces.jaxp.SAXParserImpl$JAXPSAXParser",
      "org.apache.xerces.xni.Augmentations",
      "org.apache.xerces.impl.XMLEntityHandler",
      "org.apache.log4j.Priority",
      "org.objectweb.cjdbc.controller.monitoring.SQLMonitoring",
      "org.apache.xerces.xni.parser.XMLComponent",
      "org.apache.xerces.impl.dv.dtd.ListDatatypeValidator",
      "org.apache.log4j.LogManager",
      "org.apache.xerces.impl.XMLEntityManager$ScannedEntity",
      "org.apache.xerces.jaxp.JAXPValidatorComponent",
      "org.objectweb.cjdbc.common.xml.XmlComponent",
      "org.apache.xerces.xni.parser.XMLDTDContentModelFilter",
      "org.apache.xerces.xs.PSVIProvider",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerShutdownThread",
      "org.apache.log4j.or.RendererMap",
      "org.apache.xerces.impl.dtd.XMLEntityDecl",
      "org.apache.xerces.xs.ItemPSVI",
      "org.apache.xerces.impl.dv.dtd.ENTITYDatatypeValidator",
      "org.objectweb.cjdbc.controller.core.ReportManager",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.apache.xerces.xni.parser.XMLEntityResolver",
      "org.apache.xerces.impl.dtd.XMLNSDTDValidator",
      "org.apache.xerces.impl.XMLDTDScannerImpl",
      "org.apache.xerces.impl.dv.dtd.NMTOKENDatatypeValidator",
      "org.apache.xerces.parsers.ObjectFactory",
      "org.apache.xerces.xni.parser.XMLConfigurationException",
      "org.apache.xerces.impl.XML11NSDocumentScannerImpl",
      "org.apache.xerces.parsers.SAXParser",
      "org.objectweb.cjdbc.controller.core.shutdown.ShutdownThread",
      "org.apache.xerces.impl.XMLEntityManager$RewindableInputStream",
      "org.objectweb.cjdbc.common.sql.AbstractRequest",
      "org.apache.log4j.spi.RootCategory",
      "org.apache.xerces.xni.parser.XMLInputSource",
      "org.objectweb.cjdbc.common.log.LogManager",
      "org.apache.xerces.xni.parser.XMLComponentManager",
      "org.objectweb.cjdbc.common.monitor.AbstractDataCollector",
      "org.apache.xerces.impl.io.UTF8Reader",
      "org.apache.log4j.CategoryKey",
      "org.apache.xerces.impl.dtd.XMLSimpleType",
      "org.apache.xerces.impl.XML11DocumentScannerImpl",
      "org.apache.xerces.util.AugmentationsImpl$AugmentationsItemsContainer",
      "org.objectweb.cjdbc.common.log.Trace",
      "org.apache.xerces.impl.XML11DTDScannerImpl",
      "org.apache.xerces.impl.dtd.XMLElementDecl",
      "org.jfree.data.SeriesChangeEvent",
      "org.apache.xerces.xni.grammars.Grammar",
      "org.objectweb.cjdbc.controller.core.shutdown.ControllerWaitShutdownThread",
      "org.apache.xerces.impl.dtd.models.ContentModelValidator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.xerces.xni.grammars.XMLGrammarLoader",
      "org.apache.xerces.xni.XMLDocumentHandler",
      "org.apache.xerces.impl.io.UCSReader",
      "org.apache.xerces.impl.XMLEntityManager$CharacterBuffer",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector",
      "org.objectweb.cjdbc.common.jmx.mbeans.RequestManagerMBean",
      "org.apache.xerces.impl.validation.ValidationState",
      "org.apache.xerces.impl.XMLEntityManager$Entity",
      "org.objectweb.cjdbc.common.stream.CJDBCOutputStream",
      "org.apache.xerces.util.XMLResourceIdentifierImpl",
      "org.apache.log4j.spi.RendererSupport",
      "org.apache.xerces.xni.NamespaceContext",
      "org.apache.xerces.impl.dtd.XMLDTDLoader",
      "org.apache.xerces.parsers.ObjectFactory$ConfigurationError",
      "org.objectweb.cjdbc.common.shared.BackendInfo",
      "org.apache.xerces.impl.io.ASCIIReader",
      "org.objectweb.cjdbc.controller.core.shutdown.VirtualDatabaseSafeShutdownThread",
      "org.apache.xerces.impl.dtd.XMLDTDProcessor",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl",
      "org.apache.xerces.parsers.SecuritySupport",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.dom4j.io.SAXReader",
      "org.dom4j.io.SAXHelper",
      "org.apache.log4j.Logger",
      "org.apache.xerces.impl.XML11EntityScanner",
      "org.apache.xerces.impl.dtd.DTDGrammar",
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "org.apache.xerces.impl.dv.dtd.IDREFDatatypeValidator",
      "org.objectweb.cjdbc.common.i18n.I18N",
      "org.objectweb.cjdbc.controller.backend.rewriting.AbstractRewritingRule",
      "org.apache.xerces.impl.dv.dtd.DTDDVFactoryImpl",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.xerces.impl.dtd.XMLContentSpec",
      "org.apache.xerces.xs.AttributePSVI",
      "org.apache.xerces.impl.dtd.DTDGrammarBucket",
      "org.apache.xerces.impl.msg.XMLMessageFormatter",
      "org.apache.xerces.xni.parser.XMLDocumentScanner",
      "org.apache.xerces.impl.XMLVersionDetector",
      "org.apache.xerces.impl.XMLDocumentScannerImpl",
      "org.apache.xerces.xni.parser.XMLPullParserConfiguration",
      "org.apache.log4j.spi.RepositorySelector",
      "org.apache.xerces.impl.XMLDocumentFragmentScannerImpl$Dispatcher",
      "org.objectweb.cjdbc.common.jmx.mbeans.VirtualDatabaseMBean",
      "org.objectweb.cjdbc.controller.connection.AbstractConnectionManager",
      "org.apache.xerces.impl.xs.XMLSchemaValidator",
      "org.apache.xerces.xni.grammars.XMLDTDDescription",
      "org.objectweb.cjdbc.common.exceptions.NoTransactionStartWhenDisablingException",
      "org.objectweb.cjdbc.common.exceptions.NotImplementedException",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.xerces.xni.QName",
      "org.apache.xerces.jaxp.TeeXMLDocumentFilterImpl",
      "org.apache.xerces.util.XMLAttributesImpl",
      "org.apache.xerces.impl.XMLEntityManager$InternalEntity",
      "org.apache.xerces.impl.RevalidationHandler",
      "org.apache.log4j.PropertyConfigurator",
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
      "org.apache.xerces.parsers.AbstractSAXParser$2",
      "org.objectweb.cjdbc.controller.jmx.ChainedMBeanServer",
      "org.apache.log4j.spi.LoggingEvent",
      "org.apache.xerces.impl.XMLEntityManager$ExternalEntity",
      "org.apache.xerces.impl.validation.EntityState",
      "org.apache.xerces.util.ParserConfigurationSettings",
      "org.objectweb.cjdbc.common.jmx.mbeans.ControllerMBean",
      "org.apache.xerces.impl.dv.ObjectFactory$ConfigurationError",
      "org.apache.log4j.spi.LoggerRepository",
      "org.objectweb.cjdbc.controller.monitoring.Monitoring",
      "org.apache.xerces.impl.dtd.XML11DTDValidator",
      "org.objectweb.cjdbc.common.exceptions.BackupException",
      "org.objectweb.cjdbc.controller.jmx.AbstractStandardMBean"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PendingDatabaseConnectionCollector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.objectweb.cjdbc.common.monitor.AbstractDataCollector",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.AbstractVirtualDatabaseDataCollector",
      "org.objectweb.cjdbc.common.monitor.virtualdatabase.PendingDatabaseConnectionCollector",
      "org.objectweb.cjdbc.common.i18n.Translate",
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
      "org.objectweb.cjdbc.common.jmx.JmxConstants",
      "org.objectweb.cjdbc.controller.jmx.MBeanServerManager",
      "org.objectweb.cjdbc.controller.jmx.AuthenticatingMBeanServer",
      "org.objectweb.cjdbc.common.i18n.JmxTranslate",
      "org.objectweb.cjdbc.controller.virtualdatabase.VirtualDatabase",
      "org.objectweb.cjdbc.driver.DriverResultSet",
      "org.jfree.data.TimeSeriesTableModel",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackend",
      "org.objectweb.cjdbc.controller.backend.DriverCompliance",
      "org.objectweb.cjdbc.common.shared.BackendInfo",
      "org.objectweb.cjdbc.controller.backend.DatabaseBackendSchemaConstants",
      "org.dom4j.io.SAXHelper",
      "org.apache.xerces.jaxp.SAXParserImpl",
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
      "org.dom4j.io.SAXReader$SAXEntityResolver"
    );
  }
}
