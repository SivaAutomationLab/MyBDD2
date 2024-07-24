package org.a1_browserTest;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_BrowserPositionTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\My Folder\\Open\\Driver\\chromedriver-win64\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");

        Dimension d = new Dimension(300, 800);
        driver.manage().window().setSize(d);

        Point point = new Point(500, 0);
        driver.manage().window().setPosition(point);
    }
}
