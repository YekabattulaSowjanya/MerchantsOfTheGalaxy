package com.pack.service;

import java.util.HashMap;

import com.pack.repository.UnitsAndRoman;

public class RomanToIntegerConvertor implements RomanToIntegerInterface {

	 private UnitsAndRoman initMap1;

	 
	UnitsAndRoman roman = new UnitsAndRoman();

	public RomanToIntegerConvertor(UnitsAndRoman initMap1) {
		this.initMap1 = initMap1;

	}


	public boolean Validate(String inputRomanValue) {
		
		
		char[] romans = inputRomanValue.toCharArray();
		int repeatI = 0, repeatX = 0, repeatC = 0, repeatM = 0, repeatD = 0, repeatL = 0, repeatV = 0;		
		
				if (inputRomanValue.equals("")) {
					return false;
				}
				
		for (int i = 0; i <= romans.length - 1; i++)	
			{
				if ('I' == romans[i]) {
					repeatI++;
				} else if ('X' == romans[i]) {
						repeatX++;
					} else if ('C' == romans[i]) {
						repeatC++;
					} else if ('M' == romans[i]) {
						repeatM++;
					} else if ('D' == romans[i]) {
						repeatD++;
					} else if ('L' == romans[i]) {
						repeatL++;
					} else if ('V' == romans[i]) {
						repeatV++;
					}                                    
					
					if (repeatI > 3 || repeatX > 3 || repeatC > 3 || repeatM > 3) {
						return false;

					}
					
					                    
		
					if (repeatD > 1 || repeatL > 1 || repeatV > 1) {

						return false;

					}
					
				}
		
		return true;
		
	}

	

	public int compute(String inputRomanValue) {

		int result = 0;
		
		char[] romans = inputRomanValue.toCharArray();
		
		for (int i = 0; i <= romans.length - 1; i++) {//X

			Character currentKey = null;
			int currentValue = 0;
			Character nextKey = null;
			int nextValue = 0;	

			
			for (Character key : roman.initMap1.keySet()) {

				if (key == romans[i]) {
					currentKey = key;
					currentValue = roman.initMap1.get(key);
				}
			}
			
			

			if (i >= romans.length - 1) {
				result += currentValue;
				break;
			}
			
			for (Character key : roman.initMap1.keySet()) {
				if (key == romans[i + 1]) {
					nextKey = key;
					nextValue = roman.initMap1.get(key);
				}
			}
			if (currentValue == 0) {

				System.out.println("unexpected roman char:" + romans[i]);

			}
			if (nextValue == 0) {

				System.out.println("unexpected roman char:" + romans[i + 1]);

			}

			if (currentValue >= nextValue) {
				result += currentValue;
			} else {

				
				
				if (currentKey == 'I' && nextKey != 'V' && nextKey != 'X') {

					
					return 0;

				}
				
				
				if (currentKey == 'X' && nextKey != 'L' && nextKey != 'C') {

					
					return 0;

				}

				 
				if (currentKey == 'C' && nextKey != 'D' && nextKey != 'M') {

					
					return 0;

				}
				
				if ('V' == romans[i] || 'L' == romans[i] || 'D' == romans[i]) {
					
					return 0;

				}
				result += nextValue - currentValue;
				i++;
			}
		}
		return result;
		
	}

}
