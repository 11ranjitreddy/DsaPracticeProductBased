package Array1;

import java.util.*;
public class PairsInArray {
    public static void main (String args[]){
        int a[]={1, 5, 7, -1, 5};
        int target=6;

        HashMap<Integer,Integer> map=new HashMap<>();
        for(int num:a){
            int compliment=target-num;

            if(map.getOrDefault(compliment,0)>0){
                System.out.println(compliment+" "+num);
                map.put(compliment,map.get(compliment)-1);
            }else{
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
    }

}
