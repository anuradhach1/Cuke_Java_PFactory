package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(format = {"pretty", "html:Reports/cucumber_html_Reports", "json:Reports/cucumber.json"},
					features = {"src/com/cucumber/Features"},
					tags = {"@smoke"} // to run single tag scenarios
//					tags = {"@smoke, @regression"} // to run tags with && option
				)
public class CucumberRunner {
	
	public void runTests(){
	
	}
}
