package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.Payloads.PojoSimpleBody;
import Org.Testing.TestResponseValidations.*;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC1 {
	/*

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
		
		Response res = http.GetRequest("QA_URI2");
		
		ResponseValidations ResObj = new ResponseValidations();
		ResObj.ResponseValidation(res);
		
		ResponseValidations.ResponseStatusCodeVal(200, res);
		
		System.out.println("The get response is fetched and is it :"+res.asString());		

	}
	
	*/
	
	/*
	public void testcase1() throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
		
		Response res = http.GetRequest("QA_URI2");
		
		ResponseValidations ResObj = new ResponseValidations();
		ResObj.ResponseValidation(res);
		
		ResponseValidations.ResponseStatusCodeVal(200, res);
		
		System.out.println("The get response is fetched and is it :"+res.asString());
	}
	*/
	
	public void testcase1() throws IOException {
		System.out.println("Executing test case 1");
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
		
		
		Response res = http.GetRequest(TC2.JsonKeyValue, "QA_URI1");
		
		ResponseValidations.ResponseStatusCodeVal(200, res);
		
		String ParseData = JsonResParsing.JsonResDataParsing(res,"firstName");
		System.out.println("The value of Json Key is: "+ParseData);
		System.out.println(res.asPrettyString());
		ResponseValidations.ResponseDataValid("Jenny", ParseData);
	}
	
	
	

}
