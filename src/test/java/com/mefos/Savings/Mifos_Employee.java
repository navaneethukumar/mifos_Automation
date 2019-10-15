package com.mefos.Savings;

import static org.testng.Assert.assertEquals;

import org.testng.Reporter;

import com.mifos.util.TestUtil_Mifos;
import com.mifos.util.URL_Mifos;
import com.mifos.util.Webservices_Mifos;

import Mifos.api.Mifos_APIList;
import io.restassured.response.Response;

public class Mifos_Employee {
	
	public void getEmployee() {
String url=URL_Mifos.getEndPoint(Mifos_APIList.dummyapi);
Response res=Webservices_Mifos.GETRequestWithHeader_dummmy(url);
TestUtil_Mifos.verifyResponse(res);
Reporter.log("Response of getProcessEform"+res.asString(),true);
assertEquals(res.statusCode(), TestUtil_Mifos.RESPONSE_CODE_200);
			
		}
		
	}


