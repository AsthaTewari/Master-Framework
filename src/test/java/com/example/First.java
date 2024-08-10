package com.example;

import org.aeonbits.owner.ConfigCache;
import org.aeonbits.owner.ConfigFactory;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class First {

    @Test
    public void testlogin(){

        // // FrameworkConfig config = ConfigFactory.create(FrameworkConfig.class);
        // // FrameworkConfig config = ConfigCache.getOrCreate(FrameworkConfig.class);
        // System.out.println(config.browser());

        // System.out.println(ConfigFactory.getConfig().browser());
        System.out.println(com.example.ConfigFactory.getConfig().browser());

        
        // WebDriverManager.chromedriver().setup();
        // WebDriver driver = new ChromeDriver();
        // driver.get("https://google.co.in");
        // driver.quit();


        
    }

}
