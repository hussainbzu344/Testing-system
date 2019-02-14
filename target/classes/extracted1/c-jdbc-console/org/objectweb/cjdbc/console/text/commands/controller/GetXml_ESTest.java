/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 08:47:36 GMT 2016
 */

package org.objectweb.cjdbc.console.text.commands.controller;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.console.jmx.RmiJmxClient;
import org.objectweb.cjdbc.console.text.Console;
import org.objectweb.cjdbc.console.text.commands.controller.GetXml;
import org.objectweb.cjdbc.console.text.module.AbstractConsoleModule;
import org.objectweb.cjdbc.console.text.module.MonitorConsole;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class GetXml_ESTest extends GetXml_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.GetXml.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.GetXml.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.GetXml.getCommandDescription()Ljava/lang/String;: root-Branch
   */

	@Test(timeout=300000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
          byte[] byteArray0 = new byte[7];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, true, true);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          GetXml getXml0 = new GetXml((AbstractConsoleModule) monitorConsole0);
          String string0 = getXml0.getCommandDescription();
          assertEquals("controller.command.get.xml.description", string0);
          assertEquals("show controller config", getXml0.getCommandName());
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  //Test case number: 1
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.console.text.commands.controller.GetXml.<init>(Lorg/objectweb/cjdbc/console/text/module/AbstractConsoleModule;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.console.text.commands.controller.GetXml.getCommandName()Ljava/lang/String;: root-Branch
   * Goal 3. org.objectweb.cjdbc.console.text.commands.controller.GetXml.parse(Ljava/lang/String;)V: root-Branch
   */

	@Test(timeout=300000)
  public void test1()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          byte[] byteArray0 = new byte[7];
          ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
          Console console0 = new Console((RmiJmxClient) null, (InputStream) byteArrayInputStream0, true, true);
          MonitorConsole monitorConsole0 = new MonitorConsole(console0);
          GetXml getXml0 = new GetXml((AbstractConsoleModule) monitorConsole0);
          try { 
            getXml0.parse("show controller config");
            fail("Expecting exception: Exception");
          
          } catch(Exception e) {
             //
             // controller.command.get.xml.error
             //
             assertThrownBy("org.objectweb.cjdbc.console.text.commands.controller.GetXml", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }
}