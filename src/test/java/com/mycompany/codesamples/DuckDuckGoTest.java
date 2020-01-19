/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author baur
 */
public class DuckDuckGoTest {
    
    private WebDriver driver;
    private DuckDuckGoPage homePage;
    private DuckDuckGoResultPage resultPage;
    
    @BeforeEach
    public void setUp() {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1280, 1024));
    }

    @AfterEach
    public void tearDown() {
        if (driver != null)
            driver.close(); // quit()
    }
    
    @Test
    public void testDuckDuckGo() {
        driver.get("https://duckduckgo.com");
        
        homePage = new DuckDuckGoPage(driver);
        homePage.setSearch("DuckDuckGo");
        homePage.search();
        
        resultPage = new DuckDuckGoResultPage(driver);
        resultPage.getResults();
    }
}
