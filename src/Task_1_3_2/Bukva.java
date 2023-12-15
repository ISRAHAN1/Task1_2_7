package Task_1_3_2;

public class Bukva{
    public static void main(String[]args){
        int a=10;
        System.out.println(CharExppression(a));

    }
    public static char CharExppression(int a ){
        return (char) ('\\'+a);
    }
}
