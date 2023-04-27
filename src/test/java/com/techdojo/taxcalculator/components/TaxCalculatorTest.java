package com.techdojo.taxcalculator.components;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
public class TaxCalculatorTest {
    /*
     *  Tax brackets
     * Tax bracket A(0 to 14k) = 10.5%
     * Tax bracket B($14,001 to $48,000) = 17.50%
     * Tax bracket C($48,001 to $70,000) = 30.00%
     * Tax bracket D($70,001 to $180,000) = 33.00%
     * Tax bracket E($180,000+) = 39.00%
     * */
@Autowired
    TaxCalculator taxCalculator;
@Test
public void taxBracketA(){
    double income=14000;
    double expectedTax=income*(10.5/100);
    double actualTax=taxCalculator.calculateTax(income);
    Assertions.assertEquals(expectedTax,actualTax,"invalid Tax");


}

    @Test
    public void taxBracketB(){
        double income=14001;
        double expectedTax=income*(17.5/100);
        double actualTax=taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax,actualTax,"invalid Tax");


    }
    @Test
    public void taxBracketC(){
        double income=48001;
        double expectedTax=income*(30.0/100);
        double actualTax=taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax,actualTax,"invalid Tax");


    }
    @Test
    public void taxBracketD(){
        double income=70001;
        double expectedTax=income*(33.0/100);
        double actualTax=taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax,actualTax,"invalid Tax");


    }

    @Test
    public void taxBracketE(){
        double income=180001;
        double expectedTax=income*(39.0/100);
        double actualTax=taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax,actualTax,"invalid Tax");


    }
}
