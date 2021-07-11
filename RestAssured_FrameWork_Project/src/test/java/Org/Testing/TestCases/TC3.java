package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;


import Org.Testing.TestResponseValidations.ResponseValidations;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC3 {
	/*
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
	
		
		String id  = "4567575734";		
		Response res = http.DeleteRequest(id, "QA_URI1");
		
		ResponseValidations ResObj = new ResponseValidations();
		ResObj.ResponseValidation(res);
	}
	*/
	
	/*
	public void testcase3() throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
	
		
		String id  = "4567575734";		
		Response res = http.DeleteRequest(id, "QA_URI1");
		
		ResponseValidations ResObj = new ResponseValidations();
		ResObj.ResponseValidation(res);
	}
	*/
	
	public void testcase3() throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
	
		
				
		Response res = http.DeleteRequest(TC2.JsonKeyValue, "QA_URI1");
		ResponseValidations.ResponseStatusCodeVal(200, res);
		
		System.out.println("Data Deleted Successfully : "+res.getStatusCode());
	}
	
	
	

}
