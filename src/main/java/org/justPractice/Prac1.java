package org.justPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Prac1 {
    public static void main(String[] args) throws InterruptedException{

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.selenium.dev/documentation/");

        driver.getTitle();
        driver.getCurrentUrl();

      /*  WebElement aboutDropDownTab = driver.findElement(By.id("navbarDropdown"));
        System.out.println(aboutDropDownTab.getText());
        //Thread.sleep(30000);
        Actions action = new Actions(driver);
        action.moveToElement(aboutDropDownTab).build().perform();
        aboutDropDownTab.click();*/
        /*List<WebElement> aboutdropDownOptions = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a[@class='dropdown-item']"));
        for(WebElement aboutdropDownOption : aboutdropDownOptions){
            //System.out.println(aboutdropDownOption.getText());
            String options = aboutdropDownOption.getText();
            if(options.equals("History")){
                aboutdropDownOption.click();
            }

        }
*/

        /*List<WebElement> headers = driver.findElements(By.xpath("//a[contains(text(), 'Sponsors')]/ancestor::li[@class='nav-item dropdown']/following::a[@class='nav-link']"));
        // xpath 1: //a[contains(text(), 'Sponsors')]/ancestor::li[@class='nav-item dropdown']/following::a[@class='nav-link']
        //xpath 2: //a[@class='nav-link']
        System.out.println(headers.size());
        for(WebElement header: headers){
            System.out.println(header.getText());
        }*/

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());
        for(WebElement link: links){
            System.out.println(link.getText());
        }




    }
}
