package stepDefinitions3;

import org.junit.Assert;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assign5_Neg_scenario {
	
	String uri = null;
	Response response = null;
	
	@Given("setting up url")
	public void setting_up_url() throws Throwable{
	   uri = "https://ratesapi.io/documentation/ t";
	}

	@When("response fetched")
	public void response_fetched() throws Throwable{
	  response = RestAssured.get(uri);
	}

	@Then("validating the response received")
	public void validating_the_response_received() throws Throwable{
		Assert.assertNotEquals(200, response.getStatusCode());
		response.then().log().all();
	}	

}
