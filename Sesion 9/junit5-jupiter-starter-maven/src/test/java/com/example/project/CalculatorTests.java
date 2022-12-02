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

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.internal.matchers.Any;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class CalculatorTests {

	@Mock
	ICalculadoraCloud calcCloud;//Dependencia Simulada

	@InjectMocks
	Calculator calculator = new Calculator();//Dependiente o injectada

	@Test
		void sumaDosNumeros() {
		int result=calculator.add(1, 1);//Act
		assertEquals(2,result , "1 + 1 should equal 2");
	}

	@Test
	void sumaDosNumerosCloud() {
		Mockito.when(calcCloud.sumar(Mockito.any(int.class),Mockito.any(int.class))).thenReturn(4);
		//Mockito.when(calcCloud.sumar(2,2)).thenReturn(4);
		int result = calculator.sumarEnCloud(100, 12343545);
		assertEquals(4, result);
	}
}
