package com.javarush.task.task03.task0313;

/* 
Мама мыла раму
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        String [] str = {"Мама", "Мыла", "Раму"};
        System.out.println(str[1] + str[2] + str[0]);
        System.out.println(str[1] + str[0] + str[2]);
        System.out.println(str[2] + str[1] + str[0]);
        System.out.println(str[2] + str[0] + str[1]);
        System.out.println(str[0] + str[2] + str[1]);
        System.out.println(str[0] + str[1] + str[2]);

    }
}
