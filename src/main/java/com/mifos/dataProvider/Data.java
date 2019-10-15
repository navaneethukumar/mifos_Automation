package com.mifos.dataProvider;

import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import com.mifos.util.Mifos_Constants;

public class Data {

@DataProvider  
public static Object [][] getdataobjects(ITestContext testContext){
    Object[] array1={Mifos_Constants.name,Mifos_Constants.address};
   return new Object[][] { array1 };
}
}