package Array1;


import java.util.*;
public class LeftRotate {
    public static void main(String argss[]){
        int a[]={1,2,3,4,5};

        int temp[]=new int[a.length];

        int k=2;
        for(int i=0;i<a.length;i++){
            temp[(i+k)%a.length]=a[i];
        }

        for(int i=0;i<a.length;i++)
        System.out.print(temp[i]+" ");
    }
}
