package seleniumtests;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryListener implements IRetryAnalyzer {
	int iteratorCounter = 0;
	int iterateForMaximumCount = 1;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub

		if (iteratorCounter < iterateForMaximumCount) {
			iteratorCounter++;
			return true;// runs a method again
		} else {
			return false;// stops the method execution
		}
	}

}
