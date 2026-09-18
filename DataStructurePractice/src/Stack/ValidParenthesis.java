package Stack;
import java.util.*;
public class ValidParenthesis {
    public static void main(String args[]) {
        String str = "{()}]";
       System.out.println( isvalid(str));
    }
    public static boolean isvalid(String str){
        Stack<Character> s=new Stack<>();

        for(char ch:str.toCharArray()){
            if(ch=='(' || ch=='{' || ch=='['){
                s.push(ch);
            }else{
                if(s.isEmpty())
                    return false;

                char top=s.pop();
                if(ch==')' && top!='(')
                    return  false;
                if(ch=='}' && top!='{')
                    return false;
                if(ch==']' && top!='[')
                    return false;
            }
        }
        return true;
    }


}

