/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
/**
 *
 * @author baur
 */
public class DuckDuckGoPage{
    
    final WebDriver driver;
    
    By input = By.id("search_form_input_homepage");
    By button = By.id("search_button_homepage");
    
    public DuckDuckGoPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void setSearch(String strText) {
        this.driver.findElement(input).sendKeys(strText); 
    }
    
    public void clickSearch() {
        this.driver.findElement(button).click();
    }
}
