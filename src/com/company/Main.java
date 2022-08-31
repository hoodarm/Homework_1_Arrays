package com.company;

public class Main {

    public static void main(String[] args) {
        int [] sample = {2,5,-3,11,193,-2};
        int sum = 0;
        for(int element:sample)
        {
            sum=sum+element;
            System.out.print(element + " ");
        }
        System.out.println();
        System.out.println("Sum:- " + sum);
    }
}
