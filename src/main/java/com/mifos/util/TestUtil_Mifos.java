package com.mifos.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.apache.commons.io.IOUtils;
import org.testng.Reporter;

import io.restassured.response.Response;

public class TestUtil_Mifos {
	
	public final static int RESPONSE_CODE_200 = 200;
	public final static int RESPONSE_CODE_201 = 201;
	public final static int RESPONSE_CODE_400 = 400;	
	public final static int RESPONSE_CODE_401 = 401;


	
	public static String readDataFromFile(String filePath) throws FileNotFoundException, IOException {
        //return IOUtils.toString(new FileInputStream(new File(getFileAbsolutePath(filePath))),"UTF-8");
        return IOUtils.toString(new FileInputStream(new File(filePath)),"UTF-8");
    }

    public static String getTest_JSON() throws FileNotFoundException, IOException {
        return readDataFromFile(System.getProperty("user.dir")+"\\src\\main\\java\\eInvoice\\dewdrops\\jsonData\\CREDITMMO_APPOORTIONMENT.json");
    }
    
	public static String getUrl(){
		return TestBase_Mifos.ReadPropertiesFile().getProperty("baseurl").trim();
	}


	

	public static String generatePayLoadString_mifos(String filename){
		
		String filePath = System.getProperty("user.dir")+"\\src\\test\\resources\\"+filename+".json";
		try {
			return new String(Files.readAllBytes(Paths.get(filePath)));
			
		} catch (Exception e) {
	
			return null;
		}
    
		
	
}

 /**
    Compare two lists
   */
   public static boolean compareTwoListObjects(List<Object> excepted, List<Object> actual) {
       if (actual.size() != excepted.size()) {
	      return false;
	      } 
    for (Object value : actual) {
	    if (!excepted.contains(value)) {
		return false;
	}
}
return true;
}


   /**
    * This function will veify the response
    *
    */
   public static boolean verifyCorrectResponse(Response res) {
	   boolean status=false;
	   if(res.getStatusCode()==200)
		   status=true;
	   else 
		   status=false;
	   
	   return status;
   }

   
   
   /**
    * This function will check error codes in response 
    * @return
    */
   public static boolean verifyResponse(Response res) {
	   if(res.getBody().asString().contains("errorDescription")) {
		   Reporter.log("Error "+res.jsonPath().get("errors.errorDescription"),true);
		   return false;}
		   else if(res.getBody().asString()=="") {
			   Reporter.log("Blank Response getting,Might be QA down",true);
			   return false;}
		   else
			  return true;
	   
   }
   

   
   
}