package com.mefos.Savings;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mifos.util.TestBase_Mifos;
import com.mifos.util.TestUtil_Mifos;
import com.mifos.util.URL_Mifos;
import com.mifos.util.Webservices_Mifos;

import Mifos.api.Mifos_APIList;
import io.restassured.http.Headers;
import io.restassured.response.Response;

public class GetSavingDetails extends TestBase_Mifos {

	 //@Test( dataProviderClass = Data.class, dataProvider = "getdataobjects", description = "get the all details", enabled = true)
	public void getSaving_Account_details(String s1,String s2) {
		 System.out.println(s1);
		 System.out.println(s2);
		String url=URL_Mifos.getEndPoint(Mifos_APIList.dummyapi);
	    Response res=Webservices_Mifos.GETRequestWithHeader_dummmy(url);
		TestUtil_Mifos.verifyResponse(res);
		Reporter.log("Response of getProcessEform"+res.asString(),true);
		assertEquals(res.statusCode(), TestUtil_Mifos.RESPONSE_CODE_200);
		
	}
	@Test
		public void getSaving_Account_details2() {
		
			String url=URL_Mifos.getEndPoint(Mifos_APIList.dummyapi);
		    Response res=Webservices_Mifos.GETRequestWithHeader_dummmy(url);
	/*	 List<Object> w = res.jsonPath().getList("$");
		for(int i=0;i<w.size();i++) {
			System.out.println(w.get(0).equals("Mariusz32536"));
			
		}
		System.out.println(w.size());
		
		//  System.out.println(data1);
*/			TestUtil_Mifos.verifyResponse(res);
			res.body().asString();
			
		
			Reporter.log("Response of getProcessEform"+res.asString(),true);
			assertEquals(res.statusCode(), TestUtil_Mifos.RESPONSE_CODE_200);
			
		}
	@Test
		public void m1() {
	
			System.out.println("m1 method");
		
	}
	@Test
	public void getemployeedcetailsbyid() {
		String url=URL_Mifos.getEndPoint(Mifos_APIList.dummyapibyid);
	    Response res=Webservices_Mifos.GETRequestWithHeader_dummmy(url);
	    Reporter.log("Response of getProcessEform"+res.asString(),true);
	    Headers r = res.getHeaders();
	    System.out.println(r);
	    res.asString().equalsIgnoreCase("abhssishek");
		assertEquals(res.statusCode(), TestUtil_Mifos.RESPONSE_CODE_200);
		
	}
	@Test
	public void getCilentDetails()
	
	{
		String url=URL_Mifos.getEndPoint(Mifos_APIList.getClientapi);
	    Response res=Webservices_Mifos.GETRequestWithHeader_Mifos(url);
	
		Reporter.log("Response of getProcessEform"+res.asString(),true);
		assertEquals(res.statusCode(), TestUtil_Mifos.RESPONSE_CODE_200);
		
	}
}
	
	
