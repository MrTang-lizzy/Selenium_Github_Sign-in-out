// CopyRight@Yang Qiangxin
// Version-1.1
// JRE-1.8
// Date-2020.07


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;



class Selenium_Github {
    public int id;
    private WebDriver driver;

    Selenium_Github(int num) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Google_Chrome\\Chrome_2019_12_18\\Google\\Chrome\\Application\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://github.com/login");
        id = num;
    }

    public void login(String name, String password) {
        WebDriverWait wait = new WebDriverWait(driver, 1);

        //input the user_name
        WebElement user_name = driver.findElement(By.id("login_field"));
        user_name.sendKeys(name);

        //input the password
        WebElement user_pwd = driver.findElement(By.id("password"));
        user_pwd.sendKeys(password);

        //the login_in action
        WebElement loginBtn = driver.findElement(
                By.cssSelector("#login > form > div.auth-form-body.mt-3 > input.btn.btn-primary.btn-block"));
        loginBtn.click();

        System.out.println("Successful Sign in");

    }

    public void quit()  {
        WebElement quitBtn1 = driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/summary"));
        loginBtn1.click();
        WebElement quitBtn2 = driver.findElement(By.xpath("/html/body/div[1]/header/div[7]/details/details-menu/form/button"));
        loginBtn2.click();
        System.out.println("Fail Sign in");

    }

}

public class Test_Selenium {
    public static void main(String...args) {
        Selenium_Github usr1 = new Selenium_Github(1); //initialing the account id
        usr1.login("ZTE", "666666"); //login the account
        usr1.quit();
    }
}
