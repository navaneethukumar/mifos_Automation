package com.mifos.util;

public class URL_Mifos {

	public static final String URL = TestUtil_Mifos.getUrl();
	
	
	public static String getEndPoint(){
		
		return URL;
	}
	
	public static String getEndPoint(String resource){
		
		return URL + resource;
	}	
	
	public static String getEndPoint(String resource,String postparam){
		
		return URL + resource + postparam;
	}
    public static String getEndPoint(String resource,String postparam,String lastEndPoint){
		
		return URL + resource + postparam + lastEndPoint;
	}
    
    
}
