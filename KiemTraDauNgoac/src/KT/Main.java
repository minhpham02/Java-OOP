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
            char[] s = in.nextLine().split("\\s+")[0].toCharArray();
            Stack<Character> st = new Stack<>();
            for(char i : s){
                if(!st.empty() && st.peek() == '(' && i == ')')
                    st.pop();
                else if(!st.empty() && st.peek() == '[' && i == ']')
                    st.pop();
                else if(!st.empty() && st.peek() == '{' && i == '}')
                    st.pop();
                else
                    st.push(i);
            }
            if(st.empty())
                System.out.println(true);
            else
                System.out.println(false);
            
        }
    }
}
