package com.pack.controller;

import java.util.Scanner;
import java.util.Stack;

import com.pack.service.RomanToIntegerInterface;
import com.pack.repository.UnitsAndRoman;
import com.pack.service.RomanToIntegerConvertor;

public class RomanToIntegerController {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		RomanToIntegerConvertor converter =new RomanToIntegerConvertor(new UnitsAndRoman());

		   System.out.println("Enter the roman letters in Capital");
		    
	       String inputRomanValue = scan.nextLine();
	             
	       if(converter.Validate(inputRomanValue)) {
	    	   System.out.println(converter.compute(inputRomanValue));
	       }
	       else {
	    	   System.out.println("wrong value");
	       }
	      
	    }
}
