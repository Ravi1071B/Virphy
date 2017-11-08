package com.virphy.TestNG;

import org.testng.annotations.Test;

import com.virphy.util.DataSupliers;

public class DataProvidersD {
  @Test(testName = "new",dataProviderClass=DataSupliers.class,dataProvider = "EmployeesDetails",description="This test case will gonna help for freshers ")
  public void EmployeeDetails(int employeeID , String name) {
	  System.out.print("Employeename:" + name + "| " );
	  System.out.println("EmployeeID:" +employeeID);
  }

//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1071, "Ravi C" },
//      new Object[] { 1072, "Rohith V" },
//      new Object[] { 1073, "Rutwick R" },
//      new Object[] { 1074, "Sachin R" },
//      new Object[] { 1077, "Praveen P" },
//    };
//  }
}
