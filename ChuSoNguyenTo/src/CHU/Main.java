package CHU;

/**
 *
 * @author ADMIN
 */
import java.util.*;

public class Main {
    public static boolean check(String s){
        if(s.equals("") || s.charAt(s.length() - 1) == '2') return false;
        int[] cnt = new int[10]; 
        for(int i = 0; i < s.length();i++){
            cnt[s.charAt(i) - '0']++;
        }
        if(cnt[2] != 0 && cnt[3] != 0 && cnt[5] != 0 && cnt[7] != 0)
            return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        Queue<String> Q = new LinkedList<>();
        Q.add("");
        while(true){
            String s = Q.poll();
            if(s.length() <= t){
                if(check(s)){
                    System.out.println(s);
                }
                Q.add(s + "2");
                Q.add(s + "3");
                Q.add(s + "5");
                Q.add(s + "7");
            }else
                break;
        }
    }
}
