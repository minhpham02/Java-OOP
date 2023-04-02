package SapXep;

/**
 *
 * @author ADMIN
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int n = in.nextInt();
            Map<Integer, Integer> map = new HashMap<>();
            for(int i = 1;i <= n;i++ ){
                int a = in.nextInt();
                if(!map.containsKey(a)) map.put(a, 1);
                else map.put(a, map.get(a) + 1);
            }
            ArrayList<Integer> list = new ArrayList<>(map.values());
            Collections.sort(list);
            for(int i = 0; i < list.size();i++){
                if(map.containsValue(list.get(i)))
                    System.out.println(map.get(i));
            }
        }
    }
}

