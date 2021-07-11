package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.Payloads.PojoSimpleBody;
import Org.Testing.TestResponseValidations.*;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.*;
import io.restassured.response.Response;

public class TC2 {

	/*
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
		
		PojoBodyData Body = PojoSimpleBody.getBodyData();
		
		Response res = http.PostRequest(Body, "QA_URI1");
		
		ResponseValidations ResObj = new ResponseValidations();
		ResObj.ResponseValidation(res);	

	}
	*/
	
	/*
	public void testcase2() throws IOException {
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
		
		PojoBodyData Body = PojoSimpleBody.getBodyData();
		
		Response res = http.PostRequest(Body, "QA_URI1");
		
		ResponseValidations ResObj = new ResponseValidations();
		ResObj.ResponseValidation(res);	

	}
	*/
	static String JsonKeyValue;
	
	public void testcase2() throws IOException {
		System.out.println("Executing test case 2");
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		HttpMethods http =new HttpMethods(pr);
		
		PojoBodyData Body = PojoSimpleBody.getBodyData();
		
		Response res = http.PostRequest(Body, "QA_URI1");
		
		ResponseValidations.ResponseStatusCodeVal(201, res);
		
		JsonKeyValue = JsonResParsing.JsonResDataParsing(res,"id");
		System.out.println("The value of Json Key is: "+JsonKeyValue);
		
		ResponseValidations.ResponseDataValid("2016", JsonKeyValue);
	}

}

