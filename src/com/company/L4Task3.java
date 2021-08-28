package com.company;

import java.util.Arrays;
/**This is the 3 Task, lesson 4. I had difficulties with this task, but the last word that is displayed is the correct word. It will search after a word, which has the lowest entropy.*/
public class L4Task3 {
    public static void main(String[] args) {
        String str = "777 777 777 www www ddd vvv bbb ";
String finalword = "";
        String[] words = str.split(" ");
        int i = 0;
        int o = 1;
        String word;
        System.out.println("The last word that is written is the word you look for.");
        while (i < words.length){
            word = words[i];
            for (int q = 0; q < word.length(); q++){
                if (word.charAt(o) == word.charAt(0)){
                    o++;
                    finalword = word;
               }
                System.out.println("The word is " + finalword);
            }
            i++;
        }

    }}