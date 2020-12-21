package testng.suite;

import org.testng.annotations.Test;

public class Ignore {

    @Test(enabled = false)
    public void ignore1(){
        System.out.println("ignore execute");
    }

    @Test(enabled = true)
    public void ignore2(){
        System.out.println("ignore execute");
    }
}
