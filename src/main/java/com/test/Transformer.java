package com.test;

import org.apache.camel.Exchange;
import org.apache.camel.Message;

public class Transformer {
	
	public TestClass transform(Exchange exchange) {
    	
    	Message message = exchange.getIn();
    	
    	TestClass testClass = (TestClass) message.getBody();
    	testClass.setName("Transformed "+ testClass.getName());
    	return testClass;
    }
}
