package stepDefinitions3;

import org.junit.Assert;
import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assign9DataProvider {
	
	Response response;
	String url;
	
	@Given("^getting (.*) website$")
	public void getting_site_website(String site) throws Throwable{
		url = site;

	}

	@When("getting response from website provided")
	public void getting_response_from_website_provided() throws Throwable{
		response = RestAssured.get(url);
	}

	@Then("validating the response code for all sites")
	public void validating_the_response_code_for_all_sites() throws Throwable{
		Assert.assertEquals(200, response.getStatusCode());

	}
}
