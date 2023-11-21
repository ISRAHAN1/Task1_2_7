package Task_1_3_2;

public class Bukva{
    private static int a;

    public static void main(String[]args){
        int a='\\';
        char rez = CharExppression(a);
        System.out.println(rez);

    }
    public static char CharExppression(int a ){
        return '\\'+'a';
    }
}
