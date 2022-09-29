package day22_arraylist;

import java.util.ArrayList;

public class Restricted_ArrayList {

	
	public static void main(String[] args) {
		
		// Creating restricted ArrayList using generics 
		ArrayList<String> cars = new ArrayList<>();
		cars.add("Bentley");
		cars.add("Nissan");
		cars.add("Ferrari");
		cars.add("Volga");
//		cars.add(1);       will not accept anything, but Strings
//		cars.add(true);
//		cars.add(2.5f);
		
		for(String car : cars) {
			System.out.println(car);
		}
		
		System.out.println(cars);
		System.out.println(cars.size());
		
		/*
		 * prim:   Wrapper Classes (non-primitives)
		 * byte -> Byte
		 * short -> Short
		 * int -> Integer
		 * long -> Long
		 * float -> Float
		 * double -> Double
		 * char -> Character
		 * boolean -> Boolean 
		 * 
		 * 
		 * 
		 */
		
		ArrayList<Double> doubles = new ArrayList<>();
		doubles.add(2.34); //autoboxing: conversion from primitives to a Wrapper class
		doubles.add(1.67d);
		doubles.add(0.56);
//		doubles.add(null);    nulls can be placed in the ArrayList
		
		System.out.println(doubles);

		for(double dbl : doubles) { //unboxing: conversion from Wrapper to primitive
			System.out.println(dbl);
		}
	}
}

