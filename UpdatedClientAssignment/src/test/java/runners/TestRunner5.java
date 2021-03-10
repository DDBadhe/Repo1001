package runners;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import stepDefinitions3.Assign5_Neg_scenario;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\Features", glue = {"stepDefinitions3"},monochrome = true)
public class TestRunner5 extends Assign5_Neg_scenario{

}

