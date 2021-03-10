package stepDefinitions3;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assign5_Neg_scenario {
	
	String uri = null;
	Response response = null;
	
	@Test(priority = 1)
	@Given("setting up url")
	public void setting_up_url() throws Throwable{
	   uri = "https://ratesapi.io/documentation/ t";
	}

	@Test(priority = 2)
	@When("response fetched")
	public void response_fetched() throws Throwable{
	  response = RestAssured.get(uri);
	}

	@Test(priority = 3)
	@Then("validating the response received")
	public void validating_the_response_received() throws Throwable{
		Assert.assertNotEquals(200, response.getStatusCode());
		response.then().log().all();
	}	

}
