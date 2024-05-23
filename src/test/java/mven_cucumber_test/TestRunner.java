package mven_cucumber_test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features", glue = "stepDefinitions", monochrome = false, plugin = {
		"pretty", "html:target/HtmlReports/cucumber-html-report.html" }, tags = "@smoketest")
public class TestRunner {
}
