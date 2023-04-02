package Bai_3;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("DANHSACH.in"));
        int n = Integer.parseInt(in.nextLine());
        ArrayList<String> list = new ArrayList<>();
        while(n-- > 0){
            String[] s = in.nextLine().toLowerCase().trim().split("\\s+");
            String tmp = s[s.length - 1];
            for(int i = 0 ;i < s.length - 1; i++){
                tmp += s[i].charAt(0);
            }
            list.add(tmp);
            int t = Collections.frequency(list, tmp);
            if(t > 1)
                tmp = tmp + t;
            System.out.println(tmp + "@ptit.edu.vn");
        }
    }
}
