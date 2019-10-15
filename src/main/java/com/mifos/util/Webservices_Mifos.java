package com.mifos.util;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Webservices_Mifos {
	
	/***
	 * 
	 * @param URI
	 * @param strJSON
	 * @param Userid
	 * @param tenantId
	 * @param trackingNumber
	 * @return Response
	 */
	public static Response POSTRequestWithHeader_mifos(String URI, String strJSON) {
		RequestSpecification requestSpecification = RestAssured.given().body(strJSON);
		requestSpecification.contentType(ContentType.JSON);
		//headers
		Response response = requestSpecification.post(URI);
		return response;
	}
	public static Response GETRequestWithHeader_dummmy(String URI) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
	    Response response = requestSpecification.get(URI);
		return response;
	}
	
	public static Response GETRequestWithHeader_Mifos(String URI) {
		RequestSpecification requestSpecification = RestAssured.given().auth().basic("mifos", "password");
		requestSpecification.contentType(ContentType.JSON);
	    Response response = requestSpecification.get(URI);
		return response;
	}
	


	public static Response POSTRequestWithHeader(String URIString) {
		RequestSpecification requestSpecification = RestAssured.given().auth().basic("mifos", "password");
		
		requestSpecification.contentType(ContentType.JSON);

		
		Response response = requestSpecification.post(URIString);
		return response;
	}
	public static Response POSTRequestWithHeader(String URI, String strJSON) {
		RequestSpecification requestSpecification = RestAssured.given().body(strJSON);
		requestSpecification.contentType(ContentType.JSON);
	/*	requestSpecification.header("x-zycus-tenantId", tenantId);
		requestSpecification.header("x-zycus-userId", Userid);
		requestSpecification.header("x-zycus-trackingNumber", trackingNumber);*/
		Response response = requestSpecification.post(URI);
		return response;
	}







	/***
	 * 
	 * @param URI
	 * @param strJSON
	 * @param Userid
	 * @param tenantId
	 * @return Response
	 */
	
	public static Response POSTRequestWithHeader(String URI, String strJSON,String Userid,String tenantId) {
		RequestSpecification requestSpecification = RestAssured.given().body(strJSON);
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("x-zycus-tenantId", tenantId);
		requestSpecification.header("x-zycus-userId", Userid);
		Response response = requestSpecification.post(URI);
		return response;
	}
	/***
	 * 
	 * @param URI
	 * @param Userid
	 * @param tenantId
	 * @param trackingNumber
	 * @return Response
	 */
	public static Response GETRequestWithHeader(String URI,String Userid,String tenantId,int trackingNumber) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("x-zycus-tenantId", tenantId);
		requestSpecification.header("x-zycus-userId", Userid);
		requestSpecification.header("x-zycus-trackingNumber", trackingNumber);
		Response response = requestSpecification.get(URI);
		return response;
	}
	public static Response GETRequestWithHeaderWithoutTrackingNumber(String URI,String Userid,String tenantId) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("x-zycus-tenantId", tenantId);
		requestSpecification.header("x-zycus-userId", Userid);
		Response response = requestSpecification.get(URI);
		return response;
	}
	/***
	 * 
	 * @param URI
	 * @param Userid
	 * @param tenantId
	 * @return Response
	 */
	public static Response GETRequestWithHeader(String URI,String Userid,String tenantId) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("x-zycus-tenantId", tenantId);
		requestSpecification.header("x-zycus-userId", Userid);
		Response response = requestSpecification.get(URI);
		return response;
	}
	/***
	 * 
	 * @param URI
	 * @param Userid
	 * @param tenantId
	 * @param trackingNumber
	 * @return Responses
	 */
	
	public static Response DeleteRequestWithHeader(String URI,String Userid,String tenantId,int trackingNumber) {
		RequestSpecification requestSpecification = RestAssured.given();
		requestSpecification.contentType(ContentType.JSON);
		requestSpecification.header("x-zycus-tenantId", tenantId);
		requestSpecification.header("x-zycus-userId", Userid);
		requestSpecification.header("x-zycus-trackingNumber", trackingNumber);
		Response response = requestSpecification.delete(URI);
		return response;
	}
	

}
