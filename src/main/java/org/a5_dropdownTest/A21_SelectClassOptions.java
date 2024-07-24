package org.a5_dropdownTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class A21_SelectClassOptions {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://djangovinoth.pythonanywhere.com/dropdown/");
        driver.manage().window().maximize();
        WebElement months = driver.findElement(By.xpath("//select[@name='month1']"));
        Select s = new Select(months);
        s.selectByIndex(2);
        Thread.sleep(1000);
        s.selectByValue("07");
        Thread.sleep(1000);
        s.selectByVisibleText("Sep");
        List<WebElement> options = s.getOptions();
        System.out.println(options.size());
        WebElement firstSelected = s.getFirstSelectedOption();
        System.out.println(firstSelected.getText());
        //System.out.println(s.getWrappedElement().getText());
        //System.out.println(s.getAllSelectedOptions());
        for(int i=0; i< options.size();i++)
        {
            System.out.println(options.get(i).getText());
        }




    }
}
