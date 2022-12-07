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

	@Test
	void sumarDosNumeros() {
		Calculator calculator = new Calculator();
		int result=calculator.suma(1, 1);
		assertEquals(2,result);
	}
	@Test
	void restarDosNumeros() {
		Calculator calculator = new Calculator();
		int result=calculator.resta(3, 1);
		assertEquals(2,result);
	}

	@Test
	void multiplicarDosNumeros() {
		Calculator calculator = new Calculator();
		int result=calculator.multiplicacion(2, 2);
		assertEquals(4,result);
	}

	@Test
	void dividirDosNumeros() {
		Calculator calculator = new Calculator();
		int result=calculator.division(10, 2);
		assertEquals(5,result);
	}


}
