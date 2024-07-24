package org.a3_actionsTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class A15_DragAndDropTest {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.manage().window().maximize();
       driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
       Thread.sleep(1000);
       WebElement acceptedElementsTab = driver.findElement(By.id("Accepted Elements"));
        acceptedElementsTab.click();
        Thread.sleep(5000);
        WebElement drag = driver.findElement(By.id("draggable"));
        WebElement drop = driver.findElement(By.id("droppable"));
        Actions action = new Actions(driver);
        action.dragAndDrop(drag, drop).build().perform();

    }
}
