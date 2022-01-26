package com.tosan.example9;

public class Example9 {
    public static void main(String[] args) {
        String str = new String("Tosan"); // new
        String str2 = "Tosan"; // literal
        str2 = str2 + "a";
        String str3 = "Tosan"; // literal
        if(str == str2){
            System.out.println("str == str2");
        }
        if(str.equals(str2)){
            System.out.println("str equals to str2");
        }
        if(str3 == str2){
            System.out.println("str3 == str2");
        }
        if(str3.equals(str2)){
            System.out.println("str3 equals to str2");
        }
    }
}
