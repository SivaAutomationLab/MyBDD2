package org.a2_locatorTest;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkTextTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");


        WebElement searchBox = driver.findElement(By.id("APjFqb"));
        searchBox.sendKeys("flipKart" + Keys.ENTER);

        WebElement flipKartLinkText = driver.findElement(By.partialLinkText("flipkart"));
        flipKartLinkText.click();
        /*for (WebElement links : flipKartLinkText) {
            System.out.println(links.getText());
        }*/
        String actual_title = driver.getTitle();
        String expected_title = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
        //Assert.assertEquals( actual_title, expected_title);
        Assert.assertTrue(actual_title.contains(expected_title));
        System.out.println("verified and pas");


    }
}
