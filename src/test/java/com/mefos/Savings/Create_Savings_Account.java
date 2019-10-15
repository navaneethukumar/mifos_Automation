package com.mefos.Savings;

import org.json.JSONException;
import org.testng.annotations.Test;

import com.mifos.util.TestUtil_Mifos;
import com.mifos.util.URL_Mifos;
import com.mifos.util.Webservices_Mifos;

import Mifos.api.Mifos_APIList;
import io.restassured.response.Response;

public class Create_Savings_Account {

	@Test()
	public  void savings_Account_Creation() throws JSONException  {
		String url=URL_Mifos.getEndPoint(Mifos_APIList.dummypostapi);
	    String createIssuePayLaod = TestUtil_Mifos.generatePayLoadString_mifos("Savings");
	    Response res=Webservices_Mifos.POSTRequestWithHeader_mifos(url, createIssuePayLaod);
	   System.out.println(res);
	   //Reporter.log("Response "+res.asString(),true);
	    System.out.println("response is  "+res.asString());
		/*Reporter.log("Response "+res.asString(),true);
		Reporter.log("Status Code "+res.statusCode(),true);
		assertEquals(res.statusCode(), TestUtil.RESPONSE_CODE_200);*/
		//assertEquals(res.jsonPath().get("businessEntity.entityData.createdBy"), Arrays.asList(userId));

	
	}
	

}
