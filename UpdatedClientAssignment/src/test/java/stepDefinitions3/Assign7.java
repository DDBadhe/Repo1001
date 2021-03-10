package stepDefinitions3;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Assign7 {

	RequestSpecification httpRequest;
	Response response;
	String date = null;
	
	
	@Test(priority = 1)
	@Given("API is given for foreign exchange website")
	public void api_is_given_for_foreign_exchange_website() throws Throwable{
		RestAssured.baseURI = "https://api.ratesapi.io";

	}

	@Test(priority = 2)
	@When("when posted with future date")
	public void when_posted_with_future_date() throws Throwable{
		httpRequest = RestAssured.given();
		date = "2021-03-23";
		response = httpRequest.request(Method.GET, "/"+date);
	}

	@Test(priority = 3)
	@Then("Validate the date from body")
	public void validate_the_date_from_body() throws Throwable{
		System.out.println(response.getBody().asString());
		JsonPath jsonPathEvaluator = response.jsonPath();
		String dateFromresBody = jsonPathEvaluator.get("date");
		System.out.println();
		System.out.println("date from response body "+dateFromresBody);
		System.out.println();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");  
		LocalDate today = LocalDate.now(); 
		String todayFrmt = dtf.format(today);
		
		LocalDate yesterday = today.minusDays(1);
		String yesterDayFrmt = dtf.format(yesterday);
		boolean flag = false;
		
		if (todayFrmt.equals(dateFromresBody) || yesterDayFrmt.equals(dateFromresBody))
			flag = true;
		
		Assert.assertTrue(flag);
		
		System.out.println();


		Assert.assertNotEquals(date, dateFromresBody);
		Assert.assertNotEquals(201, response.getStatusCode());
		response.then().log().all();

	}

}
