package com.pack.controller;

import java.util.Scanner;
import java.util.Stack;

import com.pack.service.RomanToIntegerInterface;
import com.pack.repository.UnitsAndRoman;
import com.pack.service.RomanToIntegerConvertor;

public class RomanToIntegerController {

	public RomanToIntegerInterface romantointegerservice;
	
	
	public RomanToIntegerController(RomanToIntegerInterface romantointegerservice)
	{
		this.romantointegerservice=romantointegerservice;
	}
	
	public int RomanCustomer(String value)
	{
		return romantointegerservice.Convertor(value);
	}
	
}