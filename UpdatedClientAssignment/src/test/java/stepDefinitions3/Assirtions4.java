package stepDefinitions3;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assirtions4 {
	String uri = null;
	Response response = null;
	@Given("url is given")
	public void url_is_given() throws Throwable{
		uri = "https://ratesapi.io/documentation";

	}

	@When("navigate to url and get response")
	public void navigate_to_url_and_get_response() throws Throwable{
		response = RestAssured.given().get(uri);
	}

	@Then("validate status code and status line")
	public void validate_status_code_and_status_line() throws Throwable{
		Assert.assertEquals(200, response.getStatusCode());
		Assert.assertEquals("HTTP/1.1 200 OK", response.getStatusLine());
		
	}
}
