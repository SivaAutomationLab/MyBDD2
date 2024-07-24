package org.a3_actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class A43_ToolTipTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.globalsqa.com/demo-site/");
        driver.manage().window().maximize();
        WebElement toolTipButton = driver.findElement(By.xpath("//a[starts-with(@class, 'button') and contains(text(), 'ToolTip')]"));
        toolTipButton.click();
        WebElement formsBasedTab = driver.findElement(By.id("Forms Based"));
        formsBasedTab.click();
        Thread.sleep(3000);

        List<WebElement> framesList = driver.findElements(By.tagName("iframe"));
        System.out.println(framesList.size());

        WebElement Frame = driver.findElement(By.xpath("//div[@rel-title=\"Forms Based\"]/descendant::iframe"));


        driver.switchTo().frame(Frame);
        Thread.sleep(3000);

       /*WebElement showHelpButton = driver.findElement(By.xpath("//button[contains(text(), 'Show help')]"));
        showHelpButton.click();*/

        WebElement firstNameField = driver.findElement(By.xpath("//input[@id='firstname']"));
        String firstNameToolTip = firstNameField.getAttribute("title");
        System.out.println(firstNameToolTip);


    }
}
