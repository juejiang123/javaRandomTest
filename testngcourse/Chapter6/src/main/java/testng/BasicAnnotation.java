package testng;

import org.testng.annotations.*;

public class BasicAnnotation {

    @Test
    public void testCase1(){
        System.out.println("这是个demo");
    }
    @BeforeTest
    public void testCase2(){
        System.out.println("beforetest");
    }
    @AfterTest
    public void testCase3(){
        System.out.println("aftertest");
    }
    @BeforeMethod
    public void testCase4(){
        System.out.println("BeforeMethod");
    }
    @AfterMethod
    public void testCase5(){
        System.out.println("AfterMethod");
    }
    @BeforeClass
    public void testCase6(){
        System.out.println("BeforeClass");
    }

    @AfterClass
    public void testCase7(){
        System.out.println("AfterClass");
    }

    @BeforeSuite
    public void testCase8(){
        System.out.println("BeforeSuite");
    }

    @AfterSuite
    public void testCase9(){
        System.out.println("AfterSuite");
    }

}
