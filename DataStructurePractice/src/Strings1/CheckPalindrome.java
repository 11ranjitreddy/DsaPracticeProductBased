package Strings1;

import java.util.*;
public class CheckPalindrome {
    public static boolean ispalindrome(String str){
        int left=0;
        int right=str.length()-1;

        while (left<=right){
            if(str.charAt(left)!=str.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
    public  static  void main(String args[]){
        String str1="rar";
        if(ispalindrome(str1))
            System.out.println("true");
        else
            System.out.println("false");
    }
}
