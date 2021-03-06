/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/**
 *
 * @author baur
 */
public final class DuckDuckGoResultPage extends Page {
    
    By results = By.cssSelector(".result__title");
    
    public DuckDuckGoResultPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public List<WebElement> getResults() {
        return driver.findElements(results);
    }
}
