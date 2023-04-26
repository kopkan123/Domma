package Domaha3;
import java.util.Scanner;
import java.util.LinkedList;    
import java.util.Stack;
public class Dom1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите скобочки");
        String text1 = sc.nextLine();
        sc.close();
        System.out.println(isValid(text1));
    }
    
    public static boolean isValid(String s) {
        if(s.length()%2!=0) return false;
        Stack<Character> st=new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==')' || s.charAt(i)=='}' || s.charAt(i)==']'){
                char c='(';
                if(s.charAt(i)=='}') c='{';
                if(s.charAt(i)==']')c='[';
                if(st.isEmpty() || st.pop()!=c ) return false;
            }
            else st.push(s.charAt(i));
        }
        return st.isEmpty();
    
    }
}
