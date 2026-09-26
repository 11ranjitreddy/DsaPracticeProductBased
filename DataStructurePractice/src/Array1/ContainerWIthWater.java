package Array1;

import java.util.*;
public class ContainerWIthWater {
    public static void main(String args[]){
        int a[]={1,8,6,2,5,4,8,3,7};

        int left=0,right=a.length-1,max=0;

        while(left<right){
            int dist=right-left;
            int height=Math.min(a[left],a[right]);
            max=Math.max(max,dist*height);
            if(a[left]<a[right])
                left++;
            else
                right--;
        }
      System.out.println(max);
    }
}
