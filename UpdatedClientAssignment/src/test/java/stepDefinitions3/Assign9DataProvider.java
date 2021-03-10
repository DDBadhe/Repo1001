package stepDefinitions3;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Assign9DataProvider {
	
	Response response;
	String url;
	
	@Test(dataProvider="SearchProvider", priority = 1)
	@Given("getting website")
	public void getting_website(String site) throws Throwable{
		url = site;
		System.out.println("getting URL");
		this.getting_response_from_website_provided();
		this.validating_the_response_code_for_all_sites();

	}
	
	@Test(priority = 2)
	@When("getting response from website provided")
	public void getting_response_from_website_provided() throws Throwable{
		response = RestAssured.get(url);
		System.out.println("response fetched");
	}
	
	@Test(priority = 3)
	@Then("validating the response code for all sites")
	public void validating_the_response_code_for_all_sites() throws Throwable{
		Assert.assertEquals(200, response.getStatusCode());
		System.out.println("validating response");

	}
	
    @DataProvider(name="SearchProvider")
    public Object[][] getDataFromDataprovider(){
    return new Object[][] 
    	{
            { "https://www.google.com/" },
            { "https://in.yahoo.com/" },
            { "https://api.ratesapi.io/" }
        };

    }
}
