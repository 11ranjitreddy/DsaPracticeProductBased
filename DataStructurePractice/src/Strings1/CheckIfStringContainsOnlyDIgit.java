package Strings1;

import  java.util.*;

public class CheckIfStringContainsOnlyDIgit {
    public static  void main(String args[]){
        String str="12345r";

        boolean istrue=true;

        for(char ch:str.toCharArray()){
            if(!(Character.isDigit(ch)))
                istrue=false;
        }
        if(istrue)
            System.out.println("true");
        else
            System.out.println("false");
    }

}
