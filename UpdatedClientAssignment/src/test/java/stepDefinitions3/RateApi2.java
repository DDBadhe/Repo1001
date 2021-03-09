package stepDefinitions3;

import org.testng.annotations.Test;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RateApi2 {
	@Given("API is given for foreign exchange")
	public void api_is_given_for_foreign_exchange() throws Throwable{

		System.out.println("API is given for foreign exchange");

	}
	@When("checking the url")
	public void checking_the_url() throws Throwable{

		System.out.println("checking the url");


	}
	@Then("getting the response")
	public void getting_the_response() throws Throwable{

		System.out.println("getting the response");
	}
}
