package stepDefinitions3;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class exchangeSD3 {
	
	Response response1 = null;
	Response response2 = null;
	
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() throws Throwable{
	    System.out.println("API for foreign exchange");
	    response1 = RestAssured.get("https://ratesapi.io/documentation/ t");
	}

	@When("posted with correct information")
	public void posted_with_correct_information() throws Throwable{
	    System.out.println("posted with correct information");
	    response2 = RestAssured.get("https://ratesapi.io/documentation");
	}

	@Then("validate positive response code received")
	public void validate_positive_response_code_received() throws Throwable{
	    System.out.println("validate positive response code received");
	    
	    Assert.assertEquals(404, response1.getStatusCode());
	    Assert.assertEquals(200, response2.getStatusCode());
	}

}
