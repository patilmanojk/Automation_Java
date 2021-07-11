package Org.Testing.TestResponseValidations;

import io.restassured.response.Response;

import org.testng.Assert;

public class ResponseValidations {

	public void ResponseValidation(Response res) {
		System.out.println("Status code for request: " + res.getStatusCode());
		System.out.println(res.getStatusLine());
		System.out.println("Data posted is: ");
		System.out.println(res.asString());
	}

	public static void ResponseStatusCodeVal(int expStatusCode, Response res) {
		Assert.assertEquals(res.getStatusCode(), expStatusCode);
		System.out.println("Response Status Validated");

	}

	public static void ResponseDataValid(String ExpData, String ActualData) {
		Assert.assertEquals(ExpData, ActualData);
		System.out.println("Response Data Validated");
	}

}
