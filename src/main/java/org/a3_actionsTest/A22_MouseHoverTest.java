package org.a3_actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class A22_MouseHoverTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.globalsqa.com/demo-site/");
        driver.manage().window().maximize();

        WebElement framesButton = driver.findElement(By.xpath("//a[starts-with(@class, 'button') and contains(text(), 'Frames')]"));
        WebElement TabsButton = driver.findElement(By.xpath("//a[starts-with(@class, 'button') and contains(text(), 'Tabs')]"));

        Actions a = new Actions(driver);

        a.moveToElement(framesButton).build().perform();
        Thread.sleep(2000);

        a.moveToElement(TabsButton).build().perform();
        Thread.sleep(2000);
    }
}
