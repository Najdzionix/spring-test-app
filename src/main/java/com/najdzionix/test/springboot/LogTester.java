package com.najdzionix.test.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * Created by Kamil Nadłonek on 14-11-2017
 * email:kamilnadlonek@gmail.com
 */
@Component
public class LogTester {

	private static final Logger LOG = LoggerFactory.getLogger(LogTester.class);
	 public LogTester() {
	 	for(int i=0;i<100; i++) {
	 		    LOG.info("Test logger");
		}
	 }

}
