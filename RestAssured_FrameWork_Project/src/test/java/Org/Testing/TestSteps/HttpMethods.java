package Org.Testing.TestSteps;

import java.util.Properties;

import Org.Testing.Payloads.PojoBodyData;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

public class HttpMethods {
	static Properties Pr;
	
	public HttpMethods(Properties Pr)
	{
		this.Pr = Pr;
	}
	
	public Response GetRequest(String URI) {
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(Pr.getProperty(URI));
		
		return res;				
	
	}
	
	public Response GetRequest(String keyValue, String URI) {
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(Pr.getProperty(URI)+"/"+keyValue);
		
		return res;				
	
	}
	
	public Response PostRequest(PojoBodyData Body, String URI) {
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(Body)
				.when()
				.post(Pr.getProperty(URI));
		
		return res;	
		
	}
	
	public Response DeleteRequest(String id, String URI) {
		String finalUri = Pr.getProperty(URI) +"/"+id;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.delete(finalUri);
		
		return res;	
		
	}
	
	
	public Response PutRequest(PojoBodyData Body,  String URI,String id) {
		String finalUri = Pr.getProperty(URI) +"/"+id;
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.body(Body)
				.when()
				.put(finalUri);
		
		return res;	
		
	}
	
	

}
