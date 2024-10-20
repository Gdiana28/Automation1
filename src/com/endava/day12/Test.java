package com.endava.day12;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;

public class Test{
	private static final Logger logger = LoggerFactory.getLogger(Test.class);
	public void ReportTest(String testName, boolean passed) {
		if (passed) {
			logger.info("Test {} passed.", testName);
		} else {
			logger.error("Test {} failed.", testName);
		}
	}
}
