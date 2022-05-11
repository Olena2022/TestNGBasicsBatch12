package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test (enabled=false)
    public void FirstTest() {
        System.out.println("1st");

    }

    @Test ()
    public void SecondTest() {
        System.out.println("2nd");

    }

    @Test ()
    public void ThirdTest() {
        System.out.println("3rd");

    }
}
