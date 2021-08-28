package com.company;
// Hello again. This class analyses te mane of the document.
public class L4Task0 {
    public static void main(String[] args) {
        // xxxx-yyy-xxxx-yyyy-xyxy; x is a number, y a letter
        String docNumber = "1234-abc-5678-def-9g1h";
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        char[] array = docNumber.toCharArray();
        if (docNumber.length() > 4 ) {sb1.append(docNumber.substring(0, 4));}
        sb1.append(" ");
        if (docNumber.length() > 13 ) {sb1.append(docNumber.substring(9, 13));}
        System.out.println("Numbers: " + sb1);
        if (docNumber.length() > 8 ) {
            sb3.append(docNumber.substring(5, 8));
            sb3.append("/");
        }
        if (docNumber.length() > 18 ) {
            sb3.append(docNumber.substring(14, 17));
            sb3.append("/");
        }
        if (docNumber.length() > 20 ) {
            sb3.append(docNumber.substring(19, 20));
            sb3.append("/");
        }
        if (docNumber.length() > 21 ) {
            sb3.append(docNumber.substring(21, 22));
        }
        System.out.println("Letters: " + sb3);
        if (docNumber.toLowerCase().contains("abc")){System.out.println("Contains abc.");}else{System.out.println("Does not contain abc.");}
        if (docNumber.toLowerCase().startsWith("555")){System.out.println("Starts with 555");}else{System.out.println("Does not start with 555");}
        if (docNumber.toLowerCase().endsWith("1a2b")){System.out.println("Ends with 1a2b");}else{System.out.println("Does not end with 1a2b");}
}}
