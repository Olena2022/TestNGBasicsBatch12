package class01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertion {
    WebDriver driver;
//go to syntax login
//    enter wrong crdentails
//    verify the message is "invalid Credentials

    @BeforeMethod
    public void OpenBrowser(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
    }
    @Test(groups ="regression")
    public void VerifyCredentials() {

        SoftAssert soft=new SoftAssert();

        String expectedText = "Invalid credentials 101";
        WebElement Username = driver.findElement(By.id("txtUsername"));
        boolean displayed = Username.isDisplayed();
        Username.sendKeys("123456");
        driver.findElement(By.id("txtPassword")).sendKeys("123456");
        driver.findElement(By.id("btnLogin")).click();
        String text = driver.findElement(By.id("spanMessage")).getText();
//assertion to make sure that the message is correct
        soft.assertEquals(text,expectedText);


//        validate the diaplay is true or not
        System.out.println("hello world");
        soft.assertTrue(displayed);


//        check all asseertions
        soft.assertAll();

    }


    @Test(groups = "smoke")
    public void loginTest2(){
        System.out.println("i am test for login under smoke");
    }

    @AfterMethod
    public  void  CloseBrowser(){
        driver.quit();
    }


}

