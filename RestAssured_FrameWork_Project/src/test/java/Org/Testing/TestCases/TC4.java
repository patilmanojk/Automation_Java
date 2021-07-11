package Org.Testing.TestCases;

import java.io.IOException;
import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import Org.Testing.Payloads.PojoSimpleUpdatedData;
import Org.Testing.TestResponseValidations.ResponseValidations;
import Org.Testing.TestSteps.HttpMethods;
import Org.Testing.TestUtilities.JsonResParsing;
import Org.Testing.TestUtilities.PropertiesFileLoad;
import io.restassured.response.Response;

public class TC4 {
	public void testcase4() throws IOException {
		System.out.println("Executing test case 4");
		// TODO Auto-generated method stub
		Properties pr = PropertiesFileLoad.PropFileLoad("../RestAssured_FrameWork_Project/Env.properties");
		
		PojoBodyData Body = PojoSimpleUpdatedData.getUpdatedBodyData();
		
		HttpMethods http =new HttpMethods(pr);
		
		
		Response res = http.PutRequest(Body, "QA_URI1", TC2.JsonKeyValue );
		System.out.println("Data updated by http put() request");
		ResponseValidations.ResponseStatusCodeVal(200, res);
		
		String UpdatedData = JsonResParsing.JsonResDataParsing(res,"lastName");
		System.out.println("The value of Json Key is: "+UpdatedData);
		System.out.println(res.asPrettyString());
		ResponseValidations.ResponseDataValid("Dean", UpdatedData);
	}
	
	

}
