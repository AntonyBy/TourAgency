/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 03 11:59:01 GMT 2015
 */

package com.epam.tour.command.admin;

import com.epam.tour.entity.Role;
import com.epam.tour.entity.User;
import org.junit.Test;

import javax.servlet.http.HttpServletRequest;

import static org.junit.Assert.*;

public class UpdateTourCommand_ESTest  {

  @Test
  public void test0()  throws Throwable  {
      UpdateTourCommand updateTourCommand0 = new UpdateTourCommand();
      User user0 = new User();
      Role role0 = new Role();
      user0.setRole(role0);
      boolean boolean0 = updateTourCommand0.checkAccess(user0);
      assertFalse(boolean0);
  }

  @Test
  public void test1()  throws Throwable  {
      UpdateTourCommand updateTourCommand0 = new UpdateTourCommand();
      boolean boolean0 = updateTourCommand0.checkAccess((User) null);
      assertFalse(boolean0);
  }

  @Test
  public void test2()  throws Throwable  {
      UpdateTourCommand updateTourCommand0 = new UpdateTourCommand();
      // Undeclared exception!
      try {
        updateTourCommand0.execute((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test3()  throws Throwable  {
      UpdateTourCommand updateTourCommand0 = new UpdateTourCommand();
      User user0 = new User();
      Role role0 = new Role();
      role0.setRolename("admin");
      user0.setRole(role0);
      boolean boolean0 = updateTourCommand0.checkAccess(user0);
      assertTrue(boolean0);
  }

  @Test
  public void test4()  throws Throwable  {
      UpdateTourCommand updateTourCommand0 = new UpdateTourCommand();
      User user0 = new User();
      boolean boolean0 = updateTourCommand0.checkAccess(user0);
      assertFalse(boolean0);
  }
}