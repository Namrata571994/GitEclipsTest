package com.Test.demo;

class ReverseString {
    public static void main(String[] args)
    {
        String input = "Namrata Panigrahi";
 
        StringBuilder input1 = new StringBuilder();
 
        // append a string into StringBuilder input1
        input1.append(input);
 
        // reverse StringBuilder input1
       StringBuilder s= input1.reverse();
     
 
        // print reversed String
        System.out.println("Result :"+ input1);
    }
}
