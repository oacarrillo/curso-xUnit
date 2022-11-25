package com.example.project;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

public class Calculator2Test {
    Calculator calc = new Calculator();

    @BeforeAll
    static void init(){
        System.out.println("Antes de todos los test");

    }

    @BeforeEach
    void before(){
        System.out.println("Antes de cada test");
    }

    @AfterEach
    void after(){
        System.out.println("Despues de cada test");
    }

    @AfterAll
    static void exit(){
        System.out.println("Despues de todos los test");
    }

    @Test
    void sumar2mas2v1(){
        Calculator calc = new Calculator();
        int result=calc.add(2,2);
        assertEquals(4,result);
    }


    @Test
    void sumar2mas2v2(){//con AssertAll
        Calculator calc = new Calculator();
        int result=calc.add(2,2);
        int result1=calc.add(2,2);

        //assertEquals(4,result);
        assertAll("sumadores",
                () -> assertEquals(4,result),
                () -> assertEquals(5,result1)
        );
    }

    @Test
    void sumar2mas2v3(){//sin creacion del objeto
        int result=calc.add(2,2);
        int result1=calc.add(2,2);
        assertAll("sumadores",
                () -> assertEquals(4,result),
                () -> assertEquals(4,result1)
        );
    }

    @Test
    void sumar4mas4(){
        Calculator calc = new Calculator();
        int result=calc.add(4,4);
        assertEquals(8,result);
    }

    @RepeatedTest(5)
    void sumar4mas4v2(){
        Calculator calc = new Calculator();
        int result=calc.add(4,4);
        assertEquals(8,result);
    }

    @ParameterizedTest(name = "{0} + {1} = {2}")
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

    //AssertTrue
    @Test
    void sumar4mas4v3(){
        Calculator calc = new Calculator();
        int result=calc.add(4,4);
        assertEquals(8,result);
        assertTrue(5>1);
    }
    @Test
    void soyUnErrorTest (){
        //Throwable exc = asse
        //assertThrows(IOException.class,() -> calc.soyUnError());// Caso OK
        assertThrows(OutOfMemoryError.class,() -> calc.soyUnError());//Caso KO
    }

    @Test
    void soyUnErrorTestv2 (){
        assumeTrue(1>2);
        assertThrows(OutOfMemoryError.class,() -> calc.soyUnError());
    }

    @Test
    void soyUnErrorTestv3 (){
        //System.out.println(System.getProperties()); Listar caracteristicas del sistema
        String os = System.getProperty("os.name");//captura OS
        assumeTrue(os.equalsIgnoreCase("Windows 8"));
            assertThrows(OutOfMemoryError.class,() -> calc.soyUnError());
    }
}
