package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions3.Assign9DataProvider;
@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", 
glue = {"stepDefinitions3"},
monochrome = true,
plugin= {"pretty", "html:target/HtmlReports","json:target/cucumber-reports/Cucumber.json" }

		)
public class TestRunner1 extends Assign9DataProvider{

}

