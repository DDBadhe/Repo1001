package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions3.Assign9DataProvider;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"stepDefinitions3"},monochrome = true)
public class TestRunner9 extends Assign9DataProvider{

}

