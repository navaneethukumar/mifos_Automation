package com.mefos.Savings;

import org.json.JSONException;
import org.json.JSONObject;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.mifos.util.TestUtil_Mifos;
import com.mifos.util.URL_Mifos;
import com.mifos.util.Webservices_Mifos;

import Mifos.api.Mifos_APIList;
import io.restassured.response.Response;

public class Update_Savings_Account {
	
	//put
	
	@Test()
	public  void savings_Update() throws JSONException  {
	    String url=URL_Mifos.getEndPoint(Mifos_APIList.dummyupdateapi);
	    String createIssuePayLaod = TestUtil_Mifos.generatePayLoadString_mifos("Savings_update");
	    JSONObject js = new JSONObject(createIssuePayLaod);
	    js.put("name", "");
	    js.put("salary", "");
	    js.put("age", "");
	    String finalJson = ((Object) js).toString();
	   
	    Response res=Webservices_Mifos.POSTRequestWithHeader_mifos(url, finalJson);
	  //  TestUtil.verifyResponse(res);
		Reporter.log("Response of Eform_Updation"+res.asString(),true);
		Reporter.log("Status Code "+res.statusCode(),true);
		//assertEquals(res.statusCode(), TestUtil.RESPONSE_CODE_200);
	//	assertEquals(res.jsonPath().get("businessEntity.entityData.tenantId"), Arrays.asList(tenantid));
}
	
    
}
