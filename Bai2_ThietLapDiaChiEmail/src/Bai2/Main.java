package Bai2;

/**
 *
 * @author ADMIN
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("DANHSACH.in"));
        HashMap<String, Integer> map = new LinkedHashMap<>();
        ArrayList<String> list = new ArrayList<>();
        while(in.hasNext()){
            String[] tmp = in.nextLine().trim().toLowerCase().split("\\s+");
            String temp="";
            for(String i : tmp){
                temp += i;
            }
            if(list.contains(temp))  continue;
            list.add(temp);
            String res = "";
            res += tmp[tmp.length - 1];
            for(int i = 0; i < tmp.length - 1; i++){
                res += tmp[i].charAt(0);
            }
            if(!map.containsKey(res)){
                map.put(res, 1);
                System.out.println(res + "@ptit.edu.vn");
            }
            else{    
                map.put(res, map.get(res) + 1);
                System.out.println(res + map.get(res) + "@ptit.edu.vn");
            }
        }
    }
}
