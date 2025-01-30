package baselibrary;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import java.io.IOException;

import org.testng.IAlterSuiteListener;
import org.testng.IExecutionListener;
import org.testng.ITestListener;
import org.testng.ITestResult;
  
public class CustomReportListener extends BaseLibrary implements    ITestListener

{
	@Override
    public void onTestStart(ITestResult result) 
	{
       
	}
    @Override
    public void onTestSuccess(ITestResult result) 
    {
       
    }

    @Override
    public void onTestFailure(ITestResult result)
    {
       System.out.println("Falied Test ");
       try 
       {
		failed(result.getMethod().getMethodName());
	   } 
       catch (IOException e) 
       {
		
		e.printStackTrace();
	   }
    }

    @Override
    public void onTestSkipped(ITestResult result) 
    {
       
    }

    @Override
    public void onFinish(org.testng.ITestContext context) 
    {
       
    }
}

