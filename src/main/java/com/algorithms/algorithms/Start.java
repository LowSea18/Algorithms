package com.algorithms.algorithms;

import org.junit.Test;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Start {



    @Test
    public void fibonacciSequencetest(){
        Algorytms a = new Algorytms();
        System.out.println(a.fibonacciSequence(10));

    }



    @Test
    public void factorialtest(){
        Algorytms a = new Algorytms();
        System.out.println(a.factorial(4));

    }


}
