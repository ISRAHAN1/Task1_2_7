package Task_1_3_2;
public class BukVa {
    public static void main(String[]args){
        int a=13;
        System.out.println(CharExppression(a));

    }
    public static char CharExppression(int a ){
        return (char) ('\\'+a);
    }
}
