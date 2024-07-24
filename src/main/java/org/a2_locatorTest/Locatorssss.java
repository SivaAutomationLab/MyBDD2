package org.a2_locatorTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.BlockingDeque;

public class Locatorssss {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
       // WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Hi");
        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
        searchBoxWithID.clear();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.bing.com/");
        WebElement locatorClassName = driver.findElement(By.className("sb_form_q"));

        locatorClassName.sendKeys("InvalidSelectorException");
        locatorClassName.sendKeys(Keys.ENTER);

        WebElement locatorLinkText = driver.findElement(By.linkText("InvalidSelectorException: Message: invalid selector: An invalid or i…"));
        //locatorLinkText.sendKeys(Keys.chord(Keys.CONTROL, Keys.RETURN));
        String openLinkInNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
        locatorLinkText.sendKeys(openLinkInNewTab);

//        WebElement locatorPartialLinkText = driver.findElement(By.partialLinkText("InvalidSelectorException"));
//        locatorPartialLinkText.click();

        driver.get("https://djangovinoth.pythonanywhere.com/login/");
        WebElement relativeXpath = driver.findElement(By.xpath("//*[@id='id_username']"));
        relativeXpath.sendKeys("Chennai");

        WebElement absoluteXpath = driver.findElement(By.xpath("/html/body/main/div/div/div/div/form/fieldset/div[2]/div/input"));
        absoluteXpath.sendKeys("mumbai");

    }
}
