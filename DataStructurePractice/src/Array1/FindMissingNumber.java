package Array1;

import  java.util.*;

public class FindMissingNumber {
    public  static  void main(String args[]){
        int a[]={1,2,3,4,5,7};
        int sum=0;

        for(int i=0;i<a.length;i++)
            sum+=a[i];

        int n=a.length+1;
        int total=(n*(n+1))/2;
        System.out.print(total-sum);
    }
}
