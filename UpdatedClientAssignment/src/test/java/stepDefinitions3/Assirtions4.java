package stepDefinitions3;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assirtions4 {
	String uri;
	Response response;
	@Test(priority = 1)
	@Given("url is given")
	public void url_is_given() throws Throwable{
		uri = "https://ratesapi.io/documentation";

	}
	
	@Test(priority = 2)
	@When("navigate to url and get response")
	public void navigate_to_url_and_get_response() throws Throwable{
		response = RestAssured.given().get(uri);
	}
	
	@Test(priority = 3)
	@Then("validate status code and status line")
	public void validate_status_code_and_status_line() throws Throwable{
		Assert.assertEquals(200, response.getStatusCode());
		
		Assert.assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
		
	}
}
