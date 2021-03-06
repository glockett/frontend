package com.gu.test;

import junit.framework.Assert;

import org.openqa.selenium.By;

import cucumber.annotation.en.Then;


public class DisplayAdvertsSteps {


    private final SharedDriver webDriver;

    public DisplayAdvertsSteps(SharedDriver webDriver) {
        this.webDriver = webDriver;
    }
	
	@Then("^an advert will be at the top of the page$")
	public void an_Advert_will_be_at_the_top_of_the_page() throws Throwable {
		Assert.assertTrue(webDriver.waitForElement(By.cssSelector("#ad-slot-top-banner-ad iframe.ad")) != null);
	}

	@Then("^an advert will not be at the foot of the page$")
	public void an_advert_will_not_be_at_the_foot_of_the_page() throws Throwable {
		Assert.assertFalse(webDriver.waitForElement(By.cssSelector("#ad-slot-bottom-banner-ad iframe.ad")) != null);
	}

}






