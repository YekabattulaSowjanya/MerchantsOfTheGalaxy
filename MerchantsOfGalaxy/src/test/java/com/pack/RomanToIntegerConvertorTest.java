package com.pack;

import static org.junit.Assert.*;

import org.junit.Test;

import com.pack.repository.UnitsAndRoman;
import com.pack.service.RomanToIntegerConvertor;
import com.pack.service.RomanToIntegerInterface;

public class RomanToIntegerConvertorTest {
	
	
	@Test
	public void When_RomanIsSingleLetter_Returns_RomanInInteger() {
	
		RomanToIntegerInterface iroman = new RomanToIntegerConvertor(new UnitsAndRoman());
		
		String input="X";
		
		assertEquals(iroman.compute(input), 10);
			
	}
	
	@Test
	public void When_RomanIsAddition_Returns_RomanInInteger() {
		
		RomanToIntegerInterface iroman = new RomanToIntegerConvertor(new UnitsAndRoman());
		
		String input="MMVI";
		assertEquals(iroman.compute(input), 2006);
	}
	
	
	@Test
	public void When_RomanIsSubtraction_Returns_RomanInInteger() {
		
		RomanToIntegerInterface iroman = new RomanToIntegerConvertor(new UnitsAndRoman());
		

		
		String input="MCMXLIV";
		assertEquals(iroman.Convertor(input), 1944);
	}
	
	@Test
	public void When_RomanIsRepeated_Returns_RomanInInteger() {
		RomanToIntegerInterface iroman = new RomanToIntegerConvertor(new UnitsAndRoman());
		
		String input="XXXX";
		
		assertEquals(iroman.Convertor(input), 0);
		
	}
	
	@Test
	public void When_RomanIsCannotRepeated_Returns_RomanInInteger() {
		RomanToIntegerInterface iroman = new RomanToIntegerConvertor(new UnitsAndRoman());
		
		String input="DD";
		
		
		assertFalse(iroman.Validate(input));
		
	}
	
	@Test
	public void When_RomanIsNotSubtracted_Return_RomanInInteger() {
		RomanToIntegerInterface iroman = new RomanToIntegerConvertor(new UnitsAndRoman());
		
        String input="MXD";
		
		assertEquals(iroman.compute(input), 0);
		
	}
	
}
