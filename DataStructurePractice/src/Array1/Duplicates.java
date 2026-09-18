package Array1;

import  java.util.*;

public class Duplicates {
    public static  void main(String args[]){
        int a[]={1,2,3,4,5,6,5};
        Arrays.sort(a);
        for(int i=1;i<a.length;i++){
            if(a[i]==a[i-1]){
                System.out.print(a[i]);
            }
        }
    }
}
