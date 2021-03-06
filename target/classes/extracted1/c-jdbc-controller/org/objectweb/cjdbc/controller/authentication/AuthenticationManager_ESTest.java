/*
 * This file was automatically generated by EvoSuite
 * Mon Jul 18 23:13:48 GMT 2016
 */

package org.objectweb.cjdbc.controller.authentication;

import org.junit.Test;
import static xcorpus.AssertionAdapter.*;

import java.util.ArrayList;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import org.objectweb.cjdbc.common.users.AdminUser;
import org.objectweb.cjdbc.common.users.DatabaseBackendUser;
import org.objectweb.cjdbc.common.users.VirtualDatabaseUser;
import org.objectweb.cjdbc.controller.authentication.AuthenticationManager;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true) 
public class AuthenticationManager_ESTest extends AuthenticationManager_ESTest_scaffolding {

  //Test case number: 0
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getVirtualLogins()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test00()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      ArrayList arrayList0 = authenticationManager0.getVirtualLogins();
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 1
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getRealLogins()Ljava/util/HashMap;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test01()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      HashMap hashMap0 = authenticationManager0.getRealLogins();
      assertEquals(0, hashMap0.size());
  }

  //Test case number: 2
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addVirtualUser(Lorg/objectweb/cjdbc/common/users/VirtualDatabaseUser;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualLogin(Ljava/lang/String;)Z: I10 Branch 3 IFEQ L123 - false
   * Goal 4. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualLogin(Ljava/lang/String;)Z: I23 Branch 4 IFLE L126 - false
   */

	@Test(timeout=300000)
  public void test02()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      VirtualDatabaseUser virtualDatabaseUser0 = new VirtualDatabaseUser("", "a");
      authenticationManager0.addVirtualUser(virtualDatabaseUser0);
      boolean boolean0 = authenticationManager0.isValidVirtualLogin("");
      assertTrue(boolean0);
  }

  //Test case number: 3
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.removeAdminUser(Lorg/objectweb/cjdbc/common/users/AdminUser;)Z: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test03()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      boolean boolean0 = authenticationManager0.removeAdminUser((AdminUser) null);
      assertFalse(boolean0);
  }

  //Test case number: 4
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getAdminUsers()Ljava/util/ArrayList;: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   */

	@Test(timeout=300000)
  public void test04()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      ArrayList arrayList0 = authenticationManager0.getAdminUsers();
      assertEquals(0, arrayList0.size());
  }

  //Test case number: 5
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addAdminUser(Lorg/objectweb/cjdbc/common/users/AdminUser;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidAdminUser(Lorg/objectweb/cjdbc/common/users/AdminUser;)Z: I6 Branch 1 IFLE L97 - false
   */

	@Test(timeout=300000)
  public void test05()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      AdminUser adminUser0 = new AdminUser("", "");
      authenticationManager0.addAdminUser(adminUser0);
      boolean boolean0 = authenticationManager0.isValidAdminUser(adminUser0);
      assertTrue(boolean0);
  }

  //Test case number: 6
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidAdminUser(Lorg/objectweb/cjdbc/common/users/AdminUser;)Z: I6 Branch 1 IFLE L97 - true
   */

	@Test(timeout=300000)
  public void test06()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      AdminUser adminUser0 = new AdminUser("mwo Zvy<qn^EK$n`6m~", "<AuthenticationManager><Admin></Admin><VirtualUsers></VirtualUsers></AuthenticationManager>");
      boolean boolean0 = authenticationManager0.isValidAdminUser(adminUser0);
      assertFalse(boolean0);
  }

  //Test case number: 7
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualUser(Lorg/objectweb/cjdbc/common/users/VirtualDatabaseUser;)Z: I6 Branch 2 IFLE L109 - true
   */

	@Test(timeout=300000)
  public void test07()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      VirtualDatabaseUser virtualDatabaseUser0 = new VirtualDatabaseUser("78_gayz:N4R", "");
      boolean boolean0 = authenticationManager0.isValidVirtualUser(virtualDatabaseUser0);
      assertFalse(boolean0);
  }

  //Test case number: 8
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addVirtualUser(Lorg/objectweb/cjdbc/common/users/VirtualDatabaseUser;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualUser(Lorg/objectweb/cjdbc/common/users/VirtualDatabaseUser;)Z: I6 Branch 2 IFLE L109 - false
   */

	@Test(timeout=300000)
  public void test08()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      VirtualDatabaseUser virtualDatabaseUser0 = new VirtualDatabaseUser("", "");
      authenticationManager0.addVirtualUser(virtualDatabaseUser0);
      boolean boolean0 = authenticationManager0.isValidVirtualUser(virtualDatabaseUser0);
      assertTrue(boolean0);
  }

  //Test case number: 9
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addVirtualUser(Lorg/objectweb/cjdbc/common/users/VirtualDatabaseUser;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualLogin(Ljava/lang/String;)Z: I10 Branch 3 IFEQ L123 - true
   * Goal 4. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualLogin(Ljava/lang/String;)Z: I10 Branch 3 IFEQ L123 - false
   * Goal 5. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.isValidVirtualLogin(Ljava/lang/String;)Z: I23 Branch 4 IFLE L126 - true
   */

	@Test(timeout=300000)
  public void test09()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      VirtualDatabaseUser virtualDatabaseUser0 = new VirtualDatabaseUser("<AuthenticationManager><Admin></Admin><VirtualUsers></VirtualUsers></AuthenticationManager>", "");
      authenticationManager0.addVirtualUser(virtualDatabaseUser0);
      boolean boolean0 = authenticationManager0.isValidVirtualLogin("");
      assertFalse(boolean0);
  }

  //Test case number: 10
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I11 Branch 5 IFNONNULL L169 - true
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I11 Branch 5 IFNONNULL L169 - false
   * Goal 4. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I46 Branch 6 IFNULL L179 - false
   */

	@Test(timeout=300000)
  public void test10()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      DatabaseBackendUser databaseBackendUser0 = new DatabaseBackendUser("`]GnZgatxlR$W(*", "xt'X[LX", "}}%;#!@Vj=OJY");
      authenticationManager0.addRealUser("xt'X[LX", databaseBackendUser0);
      try { 
        authenticationManager0.addRealUser("xt'X[LX", databaseBackendUser0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // authentication.failed.add.user.already.exists
         //
         assertThrownBy("org.objectweb.cjdbc.controller.authentication.AuthenticationManager", e);
      }
  }

  //Test case number: 11
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I11 Branch 5 IFNONNULL L169 - true
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I11 Branch 5 IFNONNULL L169 - false
   * Goal 4. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I46 Branch 6 IFNULL L179 - true
   */

	@Test(timeout=300000)
  public void test11()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      DatabaseBackendUser databaseBackendUser0 = new DatabaseBackendUser("`]GnZgatxlR$W(*", "xt'X[LX", "}}%;#!@Vj=OJY");
      authenticationManager0.addRealUser("xt'X[LX", databaseBackendUser0);
      DatabaseBackendUser databaseBackendUser1 = new DatabaseBackendUser("\"UuQczc[", (String) null, "xt'X[LX");
      authenticationManager0.addRealUser("xt'X[LX", databaseBackendUser1);
      assertEquals("", databaseBackendUser1.getXml());
  }

  //Test case number: 12
  /*
   * 3 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addRealUser(Ljava/lang/String;Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;)V: I11 Branch 5 IFNONNULL L169 - false
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getDatabaseBackendUser(Ljava/lang/String;Ljava/lang/String;)Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;: I10 Branch 7 IFNONNULL L201 - true
   */

	@Test(timeout=300000)
  public void test12()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      DatabaseBackendUser databaseBackendUser0 = new DatabaseBackendUser("K", "K", "K");
      authenticationManager0.addRealUser("K", databaseBackendUser0);
      DatabaseBackendUser databaseBackendUser1 = authenticationManager0.getDatabaseBackendUser("K", "K");
      assertEquals("K", databaseBackendUser1.getBackendName());
  }

  //Test case number: 13
  /*
   * 2 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getDatabaseBackendUser(Ljava/lang/String;Ljava/lang/String;)Lorg/objectweb/cjdbc/common/users/DatabaseBackendUser;: I10 Branch 7 IFNONNULL L201 - false
   */

	@Test(timeout=300000)
  public void test13()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      DatabaseBackendUser databaseBackendUser0 = authenticationManager0.getDatabaseBackendUser("", "");
      assertNull(databaseBackendUser0);
  }

  //Test case number: 14
  /*
   * 5 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addAdminUser(Lorg/objectweb/cjdbc/common/users/AdminUser;)V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getXml()Ljava/lang/String;: I27 Branch 8 IF_ICMPGE L243 - true
   * Goal 4. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getXml()Ljava/lang/String;: I27 Branch 8 IF_ICMPGE L243 - false
   * Goal 5. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getXml()Ljava/lang/String;: I68 Branch 9 IF_ICMPGE L251 - true
   */

	@Test(timeout=300000)
  public void test14()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      AdminUser adminUser0 = new AdminUser((String) null, (String) null);
      authenticationManager0.addAdminUser(adminUser0);
      String string0 = authenticationManager0.getXml();
      assertEquals("<AuthenticationManager><Admin><User username=\"null\" password=\"null\" /></Admin><VirtualUsers></VirtualUsers></AuthenticationManager>", string0);
  }

  //Test case number: 15
  /*
   * 4 covered goals:
   * Goal 1. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.addVirtualUser(Lorg/objectweb/cjdbc/common/users/VirtualDatabaseUser;)V: root-Branch
   * Goal 2. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.<init>()V: root-Branch
   * Goal 3. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getXml()Ljava/lang/String;: I27 Branch 8 IF_ICMPGE L243 - true
   * Goal 4. org.objectweb.cjdbc.controller.authentication.AuthenticationManager.getXml()Ljava/lang/String;: I68 Branch 9 IF_ICMPGE L251 - false
   */

	@Test(timeout=300000)
  public void test15()  throws Throwable  {
      AuthenticationManager authenticationManager0 = new AuthenticationManager();
      authenticationManager0.addVirtualUser((VirtualDatabaseUser) null);
      // Undeclared exception!
      try { 
        authenticationManager0.getXml();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         assertThrownBy("org.objectweb.cjdbc.controller.authentication.AuthenticationManager", e);
      }
  }
}
