package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class C01_FaceBookRegisterPage {
    private WebDriver ldriver; //local Driver

    public C01_FaceBookRegisterPage(WebDriver driver) {
        ldriver = driver;

    }
    By cookies1 = By.xpath("//button[@title='Allow all cookies']");
//    By cookies2 = By.xpath("(//button[starts-with(@id,'u_0_')])[3]");

      public void handleCookies(){
          ldriver.findElement(cookies1).click();
//          ldriver.findElement(cookies2).click();
      }

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

    public void clickRegister() {
        ldriver.findElement(kayitOlButton).click();}

    public void enterFirstName(String firstName) {
        ldriver.findElement(isim).sendKeys(firstName);}

    public void enterLastName(String lastName) {
        ldriver.findElement(soyAd).sendKeys(lastName);}

    public void enterEmail(String email) {
        ldriver.findElement(this.email).sendKeys(email);
        //this kullanmamizin sebebi isim cakismasidir, this keywordu kullanarak bunu handle ettik
    }

    public void enterPassword(String password){
        ldriver.findElement(this.password).sendKeys(password);
    }

    public void selectBirthDay(String day){
        Select select = new Select(ldriver.findElement(birthdayDay));
        select.selectByVisibleText(day);

    }

    public void selectBirthMonth(String month){
        Select select = new Select(ldriver.findElement(birthdayMonth));
        select.selectByVisibleText(month);
    }

    public void selectBirthYear(String year){
        Select select = new Select(ldriver.findElement(birthdayYear));
        select.selectByVisibleText(year);
    }

    public void pickGender(String gender){

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

    }

    public void clickSignUpButton(){
        ldriver.findElement(signUpButton).click();
    }
}
