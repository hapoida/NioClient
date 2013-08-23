package com.benepia.client;

import org.springframework.stereotype.Component;


/**
 * {@link Service} with hard-coded input data.
 */
@Component
public class ExampleService implements Service {
	
	/**
	 * Reads next record from input
	 */
	public String getMessage() {
		return "Hello world!";	
	}

	public String plus(int firstValue, int seconValue) {
		
		StringBuffer rslt = new StringBuffer();
		
		if(firstValue == 1 && seconValue == 1){
			rslt.append("1±Í¿ä¹Ì1"); 
		} else if(firstValue == 2 && seconValue == 2){
			rslt.append("2±Í¿ä¹Ì2"); 
		} else if(firstValue == 3 && seconValue == 3){
			rslt.append("3±Í¿ä¹Ì3"); 
		} else if(firstValue == 4 && seconValue == 4){
			rslt.append("4±Í¿ä¹Ì4"); 
		} else if(firstValue == 5 && seconValue == 5){
			rslt.append("5±Í¿ä¹Ì5"); 
		} else if(firstValue == 6 && seconValue == 6){
			rslt.append("ÂÊÂÊÂÊÂÊÂÊÂÊ ±Í¿ä¹Ì"); 
		} 
		
		return rslt.toString();
	}

	
}
