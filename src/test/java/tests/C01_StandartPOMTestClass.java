package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.C01_FaceBookRegisterPage;

import java.time.Duration;

public class C01_StandartPOMTestClass {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");

        C01_FaceBookRegisterPage registerPage = new C01_FaceBookRegisterPage(driver);

        registerPage.handleCookies();
        registerPage.clickRegister();
        registerPage.enterFirstName("John");
        registerPage.enterLastName("Nash");
        registerPage.enterEmail("john@example.com");
        registerPage.enterPassword("1234qwe*");
        registerPage.selectBirthDay("24");
        registerPage.selectBirthMonth("Eyl");
        registerPage.selectBirthYear("1989");
        registerPage.pickGender("Male");
        registerPage.clickSignUpButton();
    }
}
