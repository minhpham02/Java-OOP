package HT;

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
            int n = Integer.parseInt(in.nextLine());
            String[] s = in.nextLine().split("\\s+");
            Stack<Long> st = new Stack<>();
            for(String i : s){
                if(i.equals("+") || i.equals("-") || i.equals("*") || i.equals("/")){
                    long b = st.peek(); st.pop();
                    long a = st.peek(); st.pop();
                    long c = 0;
                    if(i.equals("+")) c = a + b;
                    if(i.equals("-")) c = a - b;
                    if(i.equals("*")) c = a * b;
                    if(i.equals("/")) c = a / b;
                    st.push(c);
                }else
                    st.push(Long.parseLong(i));
            }
            System.out.println(st.peek());
        }
    }
}
