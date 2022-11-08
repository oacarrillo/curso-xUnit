/*
 * Copyright 2015-2021 the original author or authors.
 *
 * All rights reserved. This program and the accompanying materials are
 * made available under the terms of the Eclipse Public License v2.0 which
 * accompanies this distribution and is available at
 *
 * http://www.eclipse.org/legal/epl-v20.html
 */

package com.example.project;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class CalculatorTests {


	@DisplayName("1 + 1 = 2")
	void addsTwoNumbers() {
		Calculator calculator = new Calculator();//arrange
		assertEquals(2, calculator.add(1, 1), "1 + 1 should equal 2");
	}

	@Test
	@DisplayName("Prueba 1: 1 + 1=2 ")
	void addsTwoNumbersV2() {
		Calculator calculator = new Calculator();//Arrange
		int result=calculator.add(1, 1);//Act
		assertEquals(2,result , "1 + 1 should equal 2");//Asssert
	}

	@Test
	@DisplayName("Prueba 1: -1 + (-1)= -2 ")
	void addsTwoNumbersV3() {
		Calculator calculator = new Calculator();//Arrange
		int result=calculator.add(-1, -1);//Act
		assertEquals(-2,result , "1 + 1 should equal 2");//Asssert
	}

	@Test
	@DisplayName("Prueba 1: -1 + 3= 2 ")
	void addsTwoNumbersV4() {
		Calculator calculator = new Calculator();//Arrange
		int result=calculator.add(-1, -1);//Act
		assertEquals(-2,result , "1 + 1 should equal 2");//Asssert
	}

	@Test
	@DisplayName("Prueba 1: -1 + 3= 2 ")
	void addsTwoNumbersV5() {
		Calculator calculator = new Calculator();//Arrange
		int result=calculator.add("a", -1);//Act
		assertEquals(-2,result , "1 + 1 should equal 2");//Asssert
	}


	// valores menores (Negativos)
	// decimales

	// # java
	// caso 1 int a=1, b=1
	// caso 2 int a=2, b=1
	// caso 3 int a=3, b=1

	//@ParameterizedTest(name = "{0} + {1} = {2}")
	@CsvSource({
			"0,    1,   1",
			"1,    2,   3",
			"49,  51, 100",
			"1,  100, 101"
	})
	void add(int first, int second, int expectedResult) {
		Calculator calculator = new Calculator();
		assertEquals(expectedResult, calculator.add(first, second),
				() -> first + " + " + second + " should equal " + expectedResult);
	}
}
