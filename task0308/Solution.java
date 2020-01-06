package com.javarush.task.task03.task0308;

/* 
Произведение 10 чисел
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int res = 1;
        for(int x = 1; x <= 10; x++){
            res*=x;
        }
        System.out.println(res);

    }
}
