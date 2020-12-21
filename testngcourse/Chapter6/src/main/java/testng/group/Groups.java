package testng.group;

import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class Groups {

    @Test(groups = "teacher")
    public void test1(){
        System.out.println("teacher1");
    }
    @Test(groups = "teacher")
    public void test2(){
        System.out.println("teacher2");
    }

    @BeforeGroups("teacher")
    public void test3(){
        System.out.println("school");
    }
}
