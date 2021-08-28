package com.company;
import java.util.Arrays;
//This class showes you which word is forward and backward readen the same e.g. 101.
public class L4Task2 {
    public static void main(String[] args) {
        String str = "bhjsfsfdjsfhjsfdcvfjncfnjc njnvjkcfdjksfdjk bndnjcfdnjcfdnjcfd bnc v bn c vnc vnjnjfdcnjfdhjfdsnhjfdfdsfdcsfdfdfd cfdfdfdcfdcfdfdc fdfdsdjjij hjh hjh hj bh j hb hj bhj j bhbhjbhjbh jnhbhjh bhhj gg jigz jn ghhjhghzu njhh bhjgh hjghhj hbg hjgh ghhjg ghhg ghg  hhgzhh ggz hz  hz hhhhhhh hhhh hhh hhh hhh hhhh hhh hhhh hhh hhhh hhh hhh hhh hhhh huu ztftr t tgzhjuj gtrthzh ggz uhzzg zhzzg";
        String[] words = str.split(" ");
        String strR =  new StringBuffer(str).reverse().toString();
        String[] wordsR = strR.split(" ");
        int o = words.length -1;
        int i = 0;
        while (i < words.length){
            if (words[o].equals(wordsR[i])){
                System.out.println(words[o]);
            }
            i++;
            o--;
        }}}
