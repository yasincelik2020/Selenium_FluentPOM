package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.C01_FaceBookRegisterPage;
import pages.C02_FluentFaceBookRegisterPage;

import java.time.Duration;

public class C02_FluentPOMTestClass {
    @Test
    public void test(){
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.facebook.com/");

        C02_FluentFaceBookRegisterPage registerPage = new C02_FluentFaceBookRegisterPage(driver);

        //registerPage.handleCookies();

        registerPage
                .clickRegister()
                .enterFirstName("John")
                .enterLastName("Nash")
                .enterEmail("john@example.com")
                .enterPassword("1234qwe*")
                .selectBirthDay("24")
                .selectBirthMonth("Eyl")
                .selectBirthYear("1989")
                .pickGender("Male")
                .clickSignUpButton();
    }
}
