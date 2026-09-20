package Strings3;

import java.util.*;

public class GroupAnagrams {
    public static void main(String args[]){
        String []str={"eat","tea","tan","ate","nat","bat"};

        HashMap<String,ArrayList<String>> map=new HashMap<>();

        for(String s:str){

            char ch[]=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);

            if(!map.containsKey(key)){
                map.put(key,new ArrayList<>());
            }
            map.get(key).add(s);
        }
        System.out.println(map.values());
    }
}
