package com.company;
// This cclass will find the longest and the shortest word of your string str.
import java.util.Locale;
public class L4Task1 {
    public static void main(String[] args) {
                String str = "1. Дана строка произвольной длины с произвольными словами. Найти самое короткое слово в строке и вывести его на экран. Найти самое длинное слово в строке и вывести его на экран. Если таких слов несколько, то вывести последнее из них.";
                String[] words = str.split(" ");
                int i = 0;
                int[] lengths = new int[words.length];
                while (i < words.length){
            lengths[i] = words[i].length();
            i++;
        }
                i=0;
                int biggestNow = -1000000000;
                int positionOfLongestWord = 0;
                while (i < lengths.length){
                    int list = lengths[i];
                    if (list >= biggestNow){biggestNow=list; positionOfLongestWord = i;}
                    i++;
        }

        System.out.println("The longest word has the length of " + biggestNow + " . It is: ");
        System.out.println(words[positionOfLongestWord]);
        System.out.println("");

        i=0;
        int smallestNow = 1000000000;
        int positionOfShortestWord = 0;
        while (i < lengths.length){
            int list = lengths[i];
            if (list<= smallestNow){smallestNow=list; positionOfShortestWord = i;}
            i++;
        }
        System.out.println("The longest word has the length of " + smallestNow + " . It is: ");
        System.out.println(words[positionOfShortestWord]);
    }
}
