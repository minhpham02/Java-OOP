package KT;

/**
 *
 * @author ADMIN
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        while(t-- > 0){
            char[] s = in.nextLine().split("\\.")[0].toCharArray();
            Stack<Character> st = new Stack<>();
            for(char i : s){
                if(!st.empty() && i == ')' && st.peek() == '(')
                    st.pop();
                else if(!st.empty() && i == ']' && st.peek() == '[')
                    st.pop();
                else if(i == '(' || i == ')' || i == '[' || i == ']')
                    st.push(i);
            }
            if(st.empty())  System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
