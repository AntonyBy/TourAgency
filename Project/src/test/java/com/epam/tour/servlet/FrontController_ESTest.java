/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 03 12:16:07 GMT 2015
 */

package com.epam.tour.servlet;

import org.junit.Test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import static org.junit.Assert.fail;

public class FrontController_ESTest  {

  @Test
  public void test0()  throws Throwable  {
      FrontController frontController0 = new FrontController();
      HttpServletRequest httpServletRequest0 = null;
      HttpServletResponse httpServletResponse0 = null;
      // Undeclared exception!
      try {
        frontController0.doGet((HttpServletRequest) null, (HttpServletResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test1()  throws Throwable  {
      FrontController frontController0 = new FrontController();
      frontController0.init();
  }

  @Test
  public void test2()  throws Throwable  {
      FrontController frontController0 = new FrontController();
      // Undeclared exception!
      try {
        frontController0.doPost((HttpServletRequest) null, (HttpServletResponse) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}