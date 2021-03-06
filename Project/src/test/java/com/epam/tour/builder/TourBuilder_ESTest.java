/*
 * This file was automatically generated by EvoSuite
 * Fri Jul 03 11:43:49 GMT 2015
 */

package com.epam.tour.builder;

import com.epam.tour.entity.Tour;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.fail;

public class TourBuilder_ESTest {



  @Test
  public void test01()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      hashMap0.put("hot", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test02()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      hashMap0.put("regular_discount", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test03()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      hashMap0.put("price", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test04()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "1";
      hashMap0.put("tourname", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test05()  throws Throwable  {
      TourBuilder.TourBuilderHolder tourBuilder_TourBuilderHolder0 = new TourBuilder.TourBuilderHolder();
  }






  @Test
  public void test09()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      hashMap0.put("price", stringArray0);
      stringArray0[0] = "1";
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test10()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "price";
      hashMap0.put("price", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test11()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "hot";
      hashMap0.put("hot", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test12()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "regular_discount";
      hashMap0.put("regular_discount", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test13()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "1";
      hashMap0.put("regular_discount", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test14()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[2];
      stringArray0[0] = "A ]]]]]]z";
      hashMap0.put("details", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test
  public void test15()  throws Throwable  {
      TourBuilder tourBuilder0 = TourBuilder.TourBuilderHolder.HOLDER_INSTANCE;
      HashMap<String, String[]> hashMap0 = new HashMap<String, String[]>();
      String[] stringArray0 = new String[1];
      stringArray0[0] = "details";
      hashMap0.put("details", stringArray0);
      // Undeclared exception!
      try {
        tourBuilder0.build((Map<String, String[]>) hashMap0, (Tour) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
