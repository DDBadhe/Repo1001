package stepDefinitions3;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class exchangeSD3 {
	
	Response response1 = null;
	Response response2 = null;
	String uri1 = null;
	String uri2 = null;
	
	
	@Test(priority = 1)
	@Given("API for foreign exchange")
	public void api_for_foreign_exchange() throws Throwable{
	    System.out.println("API for foreign exchange");
	    uri1 = "https://ratesapi.io/documentation/ t";
	}

	@Test(priority = 2)
	@When("posted with correct information")
	public void posted_with_correct_information() throws Throwable{
	    System.out.println("posted with correct information");
	    uri2 = "https://ratesapi.io/documentation";
	}

	@Test(priority = 3)
	@Then("validate positive response code received")
	public void validate_positive_response_code_received() throws Throwable{
	    System.out.println("validate positive response code received");

	    
	    RestAssured.given().get(uri1).then().statusCode(404).log().status();
	    RestAssured.given().get(uri2).then().statusCode(200).log().status();
	}

}
