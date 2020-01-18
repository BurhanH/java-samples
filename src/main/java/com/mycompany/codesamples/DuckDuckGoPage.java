/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.codesamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
/**
 *
 * @author baur
 */
public final class DuckDuckGoPage extends Page {
    
    By input = By.cssSelector("#search_form_homepage_top > input.js-search-input.search__input--adv");
    
    public DuckDuckGoPage(WebDriver driver) {
        this.driver = driver;
    }
    
    public void setSearch(String strText) {
        driver.findElement(input).sendKeys(strText); 
    }
    
    public void Search() {
        driver.findElement(input).sendKeys(Keys.ENTER);
    }
}
