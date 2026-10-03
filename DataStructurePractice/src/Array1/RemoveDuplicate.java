package Array1;

import java.util.*;
public class RemoveDuplicate {
    public static void main(String args[]){
        int a[]={1,2,3,2,4,6,4,6,7,4,8};

       HashSet<Integer> set=new HashSet<>();
       for(int num:a)
           set.add(num);

       for(int num:set)
           System.out.print(num);
    }
}
