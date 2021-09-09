/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author ASUS
 */
@WebService(serviceName = "CalculatorService")
public class CalculatorService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "IntergerAddition")
    public int integerAdditon(@WebParam(name = "number1") int num1, @WebParam(name = "number2") int num2) {
        return num1+num2;
    }
    
    @WebMethod(operationName = "IntergerSubstractiontion")
    public int intergerSubstractiontion(@WebParam(name = "number1") int num1, @WebParam(name = "number2") int num2) {
        return num1-num2;
    }
    
    @WebMethod(operationName = "IntergerMultiplication")
    public int intergerMultiplication(@WebParam(name = "number1") int num1, @WebParam(name = "number2") int num2) {
        return num1*num2;
    }
    
    @WebMethod(operationName = "IntergerDivition")
    public int intergerDivition(@WebParam(name = "number1") int num1, @WebParam(name = "number2") int num2) {
        return num1/num2;
    }
}
