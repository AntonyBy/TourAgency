/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 03 11:59:34 GMT 2015
 */

package com.epam.tour.command.admin;

import com.epam.tour.entity.Role;
import com.epam.tour.entity.User;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import static org.junit.Assert.*;

public class AddTourCommand_ESTest  {

  @Test
  public void test0()  throws Throwable  {
      AddTourCommand addTourCommand0 = new AddTourCommand();
      HttpServletRequest httpServletRequest0 = null;
      HttpServletRequestWrapper httpServletRequestWrapper0 = null;
      try {
        httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request cannot be null
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      AddTourCommand addTourCommand0 = new AddTourCommand();
      User user0 = new User();
      Role role0 = new Role();
      user0.setRole(role0);
      boolean boolean0 = addTourCommand0.checkAccess(user0);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      AddTourCommand addTourCommand0 = new AddTourCommand();
      // Undeclared exception!
      try {
        addTourCommand0.execute((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      AddTourCommand addTourCommand0 = new AddTourCommand();
      User user0 = new User();
      Role role0 = new Role();
      user0.setRole(role0);
      role0.setRolename("admin");
      boolean boolean0 = addTourCommand0.checkAccess(user0);
      assertTrue(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      AddTourCommand addTourCommand0 = new AddTourCommand();
      User user0 = new User();
      boolean boolean0 = addTourCommand0.checkAccess(user0);
      assertFalse(boolean0);
  }

  @Test
  public void test5()  throws Throwable  {
      AddTourCommand addTourCommand0 = new AddTourCommand();
      boolean boolean0 = addTourCommand0.checkAccess((User) null);
      assertFalse(boolean0);
  }
}