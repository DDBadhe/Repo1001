package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions3.Assign6_Neg_Scenario;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"stepDefinitions3"},monochrome = true)
public class TestRunner6 extends Assign6_Neg_Scenario{

}

