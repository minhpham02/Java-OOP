package Bai_8;


/**
 *
 * @author ADMIN
 */
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in1 = new Scanner(new FileInputStream("SINHVIEN.in"));
        Scanner in2 = new Scanner(new FileInputStream("DETAI.in"));
        Scanner in3 = new Scanner(new FileInputStream("NHIEMVU.in"));
        ArrayList<SV> sv = new ArrayList<>();
        ArrayList<DT> dt = new ArrayList<>();
        ArrayList<NV> nv = new ArrayList<>();
        int n = Integer.parseInt(in1.nextLine());
        for(int i = 1;i <= n;i++){
            sv.add(new SV(in1.nextLine(),in1.nextLine(),in1.nextLine(),in1.nextLine()));
        }
        int m= Integer.parseInt(in2.nextLine());
        for(int i = 1;i <= m;i++){
            dt.add(new DT(i,in2.nextLine(),in2.nextLine()));
        }
        int p = Integer.parseInt(in3.nextLine());
        for(int i = 1;i <= p;i++){
            String[] s = in3.nextLine().split(("\\s+"));
            nv.add(new NV(s[0],s[1],s[3]));
        }
        Collections.sort(dt);
        for(DT i : dt){
            for(NV j : nv){
                if(i.getIdDT().equals(j.getIdNV())){
                for(SV k : sv){
                    if(j.getId().equals(k.getId())){
                        i.setIdSV(k.getId());
                        i.setMailSV(k.getMail());
                        i.setNameSV(k.getName());
                        i.setNumSV(k.getNum());
                        System.out.println(i);
                        }
                    }
                }
            }
        }
    }
}
