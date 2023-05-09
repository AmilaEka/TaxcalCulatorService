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
//    @Test
//    public void taxBracketXLow() {
//        double income = -1.00;
//        double expectedTax = income * (10.5 / 100);
//        double actualTax = taxCalculator.calculateTax(income);
//        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");
//
//
//    }

    @Test
    public void taxBracketALow() {
        double income = 0.00;
        double expectedTax = income * (10.5 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }
    @Test
    public void taxBracketAHigh() {
        double income = 14000.00;
        double expectedTax = income * (10.5 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }

    @Test
    public void taxBracketBLow() {
        double income = 14001.00;
        double expectedTax = income * (17.5 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }
    @Test
    public void taxBracketBHigh() {
        double income = 48000.00;
        double expectedTax = income * (17.5 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }

    @Test
    public void taxBracketCLow() {
        double income = 48001.00;
        double expectedTax = income * (30.0 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }
    @Test
    public void taxBracketCHigh() {
        double income = 70000.00;
        double expectedTax = income * (30.0 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }

    @Test
    public void taxBracketDLow() {
        double income = 70001.00;
        double expectedTax = income * (33.0 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }

    @Test
    public void taxBracketDHigh() {
        double income = 180000.00;
        double expectedTax = income * (33.0 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


    }
    @Test
    public void taxBracketELow() {
        double income = 180001.00;
        double expectedTax = income * (39.0 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");


     }

    @Test
    public void taxBracketFBelow0() {
        double income = 0;
        double expectedTax = income * (15.00 / 100);
        double actualTax = taxCalculator.calculateTax(income);
        Assertions.assertEquals(expectedTax, actualTax, "invalid Tax");

    }


}