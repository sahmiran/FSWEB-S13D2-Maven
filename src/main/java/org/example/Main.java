package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println(isPalindrome(-1221));//=> true dönmeli
        System.out.println(isPalindrome(-707));//=> true dönmeli
        System.out.println(isPalindrome(-11212));//=> false dönmeli

        System.out.println("---------------");
        System.out.println(isPerfectNumber(6)); //=> true dönmeli (1+2+3=6)
        System.out.println(isPerfectNumber(28)); //=> true dönmeli (1+2+4+7+14=28)
        System.out.println(isPerfectNumber(5)); //=> false dönmeli (kendisi dışındaki tek böleni 1)
        System.out.println(isPerfectNumber(-1)); //=> false dönmeli(parametre 0'dan küçük olamaz)

        System.out.println("---------------");
        System.out.println(numberToWords(123));//"One Two Three" dönmeli.
        System.out.println(numberToWords(1010)); //=> "One Zero One Zero" dönmeli.
        System.out.println(numberToWords(-12)); //=> "Invalid Value" dönmeli


    }
    public static boolean isPalindrome(int sayi){
        int reverse = 0;

        int temp = sayi;
        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
            //1221--> reverse 1 temp 122 -->reverse 12 temp 12--> reverse 122 temp 1 --> reserve 1221 temp 0
        }
        return (reverse == sayi);
    }
    public static boolean isPerfectNumber(int sayi){
        int bolenToplam = 0;
        for(int i = 1; i < sayi ; i++){
            if(sayi % i == 0){
                bolenToplam += i;
            }
        }
        return sayi == bolenToplam;
    }
    public static String numberToWords(int sayi){
        String output = "";
        if(sayi < 0){
            return "Invalid Value";
        }
        else{
            String stringSayi = String.valueOf(sayi);
            char[] charArray = stringSayi.toCharArray();

            for (int i = 0 ; i < charArray.length ; i++) {
                if(charArray[i]=='0'){
                    output += "Zero ";
                }
                else if(charArray[i]=='1'){
                    output += "One ";
                }
                else if(charArray[i]=='2'){
                    output += "Two ";
                }
                else if(charArray[i]=='3'){
                    output += "Three ";
                }
                else if(charArray[i]=='4'){
                    output += "Four ";
                }
                else if(charArray[i]=='5'){
                    output += "Five ";
                }
                else if(charArray[i]=='6'){
                    output += "Six ";
                }
                else if(charArray[i]=='7'){
                    output += "Seven ";
                }
                else if(charArray[i]=='8'){
                    output += "Eight ";
                }
                else if(charArray[i]=='9'){
                    output += "Nine ";
                }
            }

        }
        return output.trim();
    }

}

