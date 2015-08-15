/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 03 12:10:34 GMT 2015
 */

package com.epam.tour.command.admin;

import com.epam.tour.entity.Role;
import com.epam.tour.entity.User;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.*;

public class OrdersCommand_ESTest  {

  @Test
  public void test0()  throws Throwable  {
      OrdersCommand ordersCommand0 = new OrdersCommand();
      User user0 = new User();
      Role role0 = new Role();
      user0.setRole(role0);
      boolean boolean0 = ordersCommand0.checkAccess(user0);
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      OrdersCommand ordersCommand0 = new OrdersCommand();
      boolean boolean0 = ordersCommand0.checkAccess((User) null);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      OrdersCommand ordersCommand0 = new OrdersCommand();
      // Undeclared exception!
      try {
        ordersCommand0.execute((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      OrdersCommand ordersCommand0 = new OrdersCommand();
      User user0 = new User();
      Role role0 = new Role();
      user0.setRole(role0);
      role0.setRolename("admin");
      boolean boolean0 = ordersCommand0.checkAccess(user0);
      assertTrue(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      OrdersCommand ordersCommand0 = new OrdersCommand();
      User user0 = new User();
      boolean boolean0 = ordersCommand0.checkAccess(user0);
      assertFalse(boolean0);
  }
}
