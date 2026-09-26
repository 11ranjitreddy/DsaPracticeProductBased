package Array1;

import java.util.*;
public class InterSection {
    public static void main(String args[]){
        int a[]={1,2,2,1};
        int b[]={2,2};

        Arrays.sort(a);
        Arrays.sort(b);

        int i=0,j=0,k=0;
        int temp[]=new int[a.length+b.length];
        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                i++;
            }else if(a[i]>b[j]){
                j++;
            }else{
                if(k==0 || temp[k-1]!=a[i]){
                    temp[k++]=a[i];
                }
                i++;
                j++;

            }
        }
        for(int t=0;t<k;t++)
            System.out.println(temp[t]+" ");
    }
}

