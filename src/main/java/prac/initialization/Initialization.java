package prac.initialization;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.Browser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;



public class Initialization {
public static WebDriver driver;
public static Properties prop;

public static void openBrowser() throws IOException, InterruptedException {

    File f = new File("src/main/resources/features/env.properties");
    FileInputStream fis = new FileInputStream(f);
    prop = new Properties();
    prop.load(fis);

    if(prop.getProperty("Browser").equalsIgnoreCase("Chrome")){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        Thread.sleep(1000);
        driver.get(prop.getProperty("URL"));
    }
    if(prop.getProperty("Browser").equals("Edge")){
        WebDriverManager.edgedriver().setup();
        driver=new EdgeDriver();
    }

}


public static void checkTheUrl(){


}


}
