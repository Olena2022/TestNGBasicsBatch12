package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test
    public void cfirstTest() {
        System.out.println("This is my first testcase");
    }

    @Test
    public void asecondTest() {
        System.out.println("This is my second testcase");
    }

    @Test
    public void bthirdTest() {
        System.out.println("This is my third testcase");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("*****I am Precondition*****");
    }

    @AfterMethod
    public void aftermethod(){

        System.out.println("^^^^^I am Postcondition^^^^^");
    }

}