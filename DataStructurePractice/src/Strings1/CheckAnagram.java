package Strings1;

import  java.util.*;

public class CheckAnagram {
    public static void main(String args[]){
        String str1="anagram";
        String str2="nagaram";

        char s[]=new char[str1.length()];
        char t[]=new char[str2.length()];
        for(int i=0;i<str1.length();i++)
            s[i]=str1.charAt(i);

        for(int i=0;i<str2.length();i++)
            t[i]=str2.charAt(i);

        Arrays.sort(s);
        Arrays.sort(t);

        if(Arrays.equals(s,t))
            System.out.println("true");
        else
            System.out.println("false");

    }
}
