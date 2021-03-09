package stepDefinitions3;

import org.testng.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assign6_Neg_Scenario {
	
	String uri = null;
	Response response = null;
	@Given("setting up environment")
	public void setting_up_environment() throws Throwable{
		uri = "https://api.ratesapi.io/api/";
	}

	@When("response is invoked")
	public void response_is_invoked() throws Throwable{
		response = RestAssured.get(uri);
	}

	@Then("validation for response code")
	public void validation_for_response_code() throws Throwable{
		Assert.assertNotEquals(200, response.getStatusCode());
		Assert.assertFalse(response.getStatusCode() == 200);
	}

}
