package org.justPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class Just {

    public static void main(String [] args){
       // WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        /*driver.get("http://djangovinoth.pythonanywhere.com/login/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));

        WebElement userNameBox = driver.findElement(By.id("id_username"));
        userNameBox.sendKeys("user1");

        WebElement pwBox = driver.findElement(By.id("id_password"));
        pwBox.sendKeys("Guru@12345");
        WebElement submitBtn = driver.findElement(By.xpath("//button[@type='submit']"));
        submitBtn.click();

        List<WebElement> list = driver.findElements(By.xpath("//li[@class='list-group-item list-group-item-light']"));

        for(int i =0; i< list.size(); i++){
           String data = list.get(i).getText();
            System.out.println(data);
        }


        List<WebElement> links = driver.findElements(By.tagName("a"));
        for (int i=0; i<links.size(); i++){
            String linkData = links.get(i).getText();
            System.out.println(linkData);
        }

        driver.get("https://jqueryui.com/tooltip/");
        System.out.println(driver.getCurrentUrl());

        List <WebElement> l = driver.findElements(By.tagName("iframe"));
        System.out.println(l.size());

        driver.switchTo().frame(0);
        driver.switchTo().defaultContent();
*/
        driver.get("https://www.google.co.in/");

WebElement gmailButoon = driver.findElement(By.xpath("//a[text()='Gmail']"));

Actions action = new Actions(driver);
action.moveToElement(gmailButoon).contextClick().build().perform();


    }
}

