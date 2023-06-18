package class03;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class implementationOfListener implements ITestListener {
    @Override
    public void onTestSuccess(ITestResult result) { /* compiled code */
        System.out.println("test case passed");
    }
    @Override
    public void onTestFailure(ITestResult result) { /* compiled code */
        System.out.println("test case failed");
    }

}
