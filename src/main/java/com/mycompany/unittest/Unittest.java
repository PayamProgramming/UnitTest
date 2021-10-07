/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.unittest;

/**
 *
 * @author intel one
 */


public class Unittest {
    int n1 = 0;
    int n2 = 0;
    int n3 = 0;
    int n4 = 0;
    
    // * //

    public void Multiplication(int i1 , int i2) {
        int n = i1 * i2 ;
        n1 = n ;
        System.out.format("\nMultiplication : %s", n);
    }
    public int MultiplicationAns(int n) {
        n = n1 ;
        return n;
    }
    
    public void Division(int i1 , int i2) {
        int n = i1 / i2 ;
        n2 = n;
        System.out.format("\nDivision : %s" , n);
    }
    public int DivisionAns(int n) {
        n = n2 ;
        return n;
    }
    
    public void Total(int i1 , int i2) {
        int n = i1 + i2 ;
        n3 = n;
        System.out.format("\nTotal : %s" , n);
    }
    public int TotalAns(int n) {
        n = n3 ;
        return n;
    }

    public void Minus(int i1 , int i2) {
        int n = i1 - i2 ;
        n4 = n ;
        System.out.format("\nMinus : %s" , n);
    }
    public int MinusAns(int n) {
        n = n4 ;
        return n;
    }

    public static void main(String[] args) {
        Unittest e = new Unittest();
        e.Total(6 , 1);
        e.Minus(6 , 1);
        e.Multiplication(6 , 1);
        e.Division(6 , 1);
          
        
        
        
    }



}
