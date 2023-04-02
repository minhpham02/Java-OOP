package Bai3;

/**
 *
 * @author ADMIN
 */
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("MONHOC.in"));
        TreeSet<MonThi> su = new TreeSet<>();
        while(in.hasNext()){
            su.add(new MonThi(in.nextLine(), in.nextLine(),in.nextLine()));
        }
        for(MonThi i : su){
            System.out.println(i);
        }
    }
}
