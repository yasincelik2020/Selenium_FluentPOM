package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class C02_FluentFaceBookRegisterPage {
    private WebDriver ldriver; //local Driver

    public C02_FluentFaceBookRegisterPage(WebDriver driver) {
        ldriver = driver;
    }

    By cookies1 = By.xpath("//button[@title=‘Allow all cookies']");
    By cookies2 = By.xpath("(//button[starts-with(@id,'u_0_')])[3]");

    public void handleCookies(){
          ldriver.findElement(cookies1).click();
          ldriver.findElement(cookies2).click();}

    By kayitOlButton = By.xpath("//a[@data-testid = 'open-registration-form-button']");
    By isim = By.name("firstname");
    By soyAd = By.name("lastname");
    By email = By.name("reg_email__");
    By password = By.name("reg_passwd__");
    By birthdayDay = By.name("birthday_day");
    By birthdayMonth = By.name("birthday_month");
    By birthdayYear = By.name("birthday_year");
    By femaleRadio = By.xpath("//input[@name='sex'][@value='1']");
    By maleRadio = By.xpath("//input[@name='sex'][@value='2']");
    By customRadio = By.xpath("//input[@name='sex'][@value='-1']");
    By signUpButton = By.name("websubmit");

    public C02_FluentFaceBookRegisterPage clickRegister() {
        ldriver.findElement(kayitOlButton).click();
        return this;
    }

    public C02_FluentFaceBookRegisterPage enterFirstName(String firstName) {
        ldriver.findElement(isim).sendKeys(firstName);
        return this;
    }

    public C02_FluentFaceBookRegisterPage enterLastName(String lastName) {
        ldriver.findElement(soyAd).sendKeys(lastName);
        return this;
    }

    public C02_FluentFaceBookRegisterPage enterEmail(String email) {
        ldriver.findElement(this.email).sendKeys(email);
        //this kullanmamizin sebebi isim cakismasidir, this keywordu kullanarak bunu handle ettik
        return this;
    }

    public C02_FluentFaceBookRegisterPage enterPassword(String password){
        ldriver.findElement(this.password).sendKeys(password);
        return this;
    }

    public C02_FluentFaceBookRegisterPage selectBirthDay(String day){
        Select select = new Select(ldriver.findElement(birthdayDay));
        select.selectByVisibleText(day);
        return this;
    }

    public C02_FluentFaceBookRegisterPage selectBirthMonth(String month){
        Select select = new Select(ldriver.findElement(birthdayMonth));
        select.selectByVisibleText(month);
        return this;
    }

    public C02_FluentFaceBookRegisterPage selectBirthYear(String year){
        Select select = new Select(ldriver.findElement(birthdayYear));
        select.selectByVisibleText(year);
        return this;
    }

    public C02_FluentFaceBookRegisterPage pickGender(String gender){
        switch (gender){
            case "Male":
                ldriver.findElement(maleRadio).click();
                break;
            case "Female":
                ldriver.findElement(femaleRadio).click();
                break;
            case "Custom":
                ldriver.findElement(customRadio).click();
                break;
        }
        return this;
    }

    public void clickSignUpButton(){
        ldriver.findElement(signUpButton).click();
    }
}
