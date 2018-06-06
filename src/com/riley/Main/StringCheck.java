package com.riley.Main;

public class StringCheck {
    public static void main(String[] args) {

                String str = "Would you like to go out for a little dinner?";
                System.out.println("First String is :"+ str);
                System.out.println("Its Length is :"+ str.length());
                System.out.println("The character at position 6 is :" + str.charAt(6));
                System.out.println("The substrng from 26 to 32 is :" + str.substring(26,32));
                System.out.println("The index of the first 'a' :" +str.indexOf('a'));
                System.out.println("The index of the beginning of the  :" + "Substring\"dinner :" + str.indexOf("dinner"));
                System.out.println("The string in uppercase is :" + str.toUpperCase());
            }
        }






