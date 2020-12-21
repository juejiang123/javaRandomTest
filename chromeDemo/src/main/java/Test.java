import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.mobile.NetworkConnection;
import org.openqa.selenium.support.ui.Select;

import java.util.Date;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","/usr/local/bin/chromedriver");
        ChromeDriver driver = new ChromeDriver();
        String url1 = "http://www.baidu.com";
        String url2 = "http://www.sougou.com";
        driver.get(url1);
        driver.findElement(By.id("kw")).sendKeys("hello");
        driver.findElement(By.id("su")).click();
        WebElement inputText = driver.findElement(By.id("kw"));
        inputText.clear();
        inputText.sendKeys("ui");
        WebElement button = driver.findElement(By.id("su"));
        if(button.isEnabled()){
            button.click();
        }
        System.out.println(11111);
        Date date = new Date();
        System.out.println(date);
//        Actions actions = new Actions(driver);
//        actions.doubleClick(inputText).build().perform();
//        actions.contextClick(inputText).build().perform();
//        WebElement selectElement =driver.findElement(By.id("form"));
//        Select select = new Select(selectElement);
//        select.selectByIndex(0);

//        Thread.sleep(5000);
//        driver.navigate().to(url2);
//        Thread.sleep(2000);
//        driver.navigate().back();
//        driver.navigate().back();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(2000);
//        driver.navigate().forward();
//        Thread.sleep(5000);
//        driver.navigate().refresh();
//        Thread.sleep(5000);
//        driver.manage().window().maximize();
        String title = driver.getTitle();
        System.out.println(title);
//        LocalStorage localStorage = driver.getLocalStorage();
//        System.out.println(localStorage);
//        String pageSource = driver.getPageSource();
//        System.out.println(pageSource);
//        String currentUrl = driver.getCurrentUrl();
//        System.out.println(currentUrl);

//        driver.quit();


    }
}
