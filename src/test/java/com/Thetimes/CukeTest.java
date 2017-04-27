package com.Thetimes;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * @author Jay Vaghani on 26/04/2017.
 */

@RunWith(Cucumber.class)
@CucumberOptions(features = ".",format ="html:target/Cucumber.Report",tags = "@java")
public class CukeTest
{

}
