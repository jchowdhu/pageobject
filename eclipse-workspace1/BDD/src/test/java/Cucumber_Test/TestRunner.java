package Cucumber_Test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
/*
@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/QaclickAcadamy.feature",
 		glue = "stepDefinations",
		plugin= {"usage"},
		format= {"pretty","html:target/cuucmber"},
		monochrome= true,tags="@smoke")

public class TestRunner {

}*/


@CucumberOptions(
		features = "src/test/java/features/QaclickAcadamy.feature",
		glue = "stepDefinations",
		format= {"pretty","html:target/cucumber-reports"},monochrome= true,tags="@smoke1")

public class TestRunner extends AbstractTestNGCucumberTests {

}