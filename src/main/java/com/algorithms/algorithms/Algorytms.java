package com.algorithms.algorithms;

import org.junit.Test;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Algorytms {


    public int factorial(int n){
        int l=1;
        int k = 1;

        if(n<=0){
            System.out.println("the number must be greater than zero");
        }else if (n==1){
            return 1;
        }

        while (l<=n){
            k=k*l;
            l++;
        }
        return k;
    }

    public List<Integer> fibonacciSequence(int n){
        int l =0;
        int a =1;
        int b=1;
        List<Integer> list = new ArrayList();
        list.add(1);
        list.add(1);

        for (int i=2;i<n;i++){
            list.add(list.get(i-1)+ list.get(i-2));


        }
        return list;
    }



}