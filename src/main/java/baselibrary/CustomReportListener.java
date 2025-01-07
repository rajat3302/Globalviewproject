package baselibrary;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import org.testng.IAlterSuiteListener;
import org.testng.IExecutionListener;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomReportListener implements ITestListener {
    private ExtentReports extentReports;
    private ExtentTest test;

    @Override
    public void onStart(org.testng.ITestContext context) {
        // Initialize the ExtentReports
        //ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("test-output/ExtentReport.html");
//        extentReports = new ExtentReports();
//        extentReports.attachReporter(htmlReporter);
//    
    	}

    @Override
    public void onTestStart(ITestResult result) {
        // Create a new test entry in the report
        test = extentReports.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test passed successfully");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip("Test skipped");
    }

    @Override
    public void onFinish(org.testng.ITestContext context) {
        // Flush the report
        extentReports.flush();
    }
}

