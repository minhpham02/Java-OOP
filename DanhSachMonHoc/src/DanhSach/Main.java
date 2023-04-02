package DanhSach;

/**
 *
 * @author ADMIN
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new FileInputStream("MONHOC.in"));
        TreeSet<Sub> subj = new TreeSet<>();
        while(in.hasNext()){
            subj.add(new Sub(in.nextLine(), in.nextLine(), in.nextLine()));
        }
        for(Sub tmp : subj){
            System.out.println(tmp);
        }
    }
}
