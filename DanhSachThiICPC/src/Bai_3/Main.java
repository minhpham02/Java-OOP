package Bai_3;


/**
 *
 * @author ADMIN
 */
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        ArrayList<Team> te = new ArrayList<>();
        ArrayList<Student> st = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for(int i = 1;i <= n;i++){
            te.add(new Team(i, in.nextLine(),in.nextLine()));
        }
        int m = Integer.parseInt(in.nextLine());
        for(int i = 1;i <= m;i++){
            st.add(new Student(i, in.nextLine(),in.nextLine()));
        }
        Collections.sort(st);
        for(Student tmp : st){
            for(Team i : te){
                if(tmp.getIdTeam().equals(i.getId())){
                    tmp.setNameTeam(i.getName());
                    tmp.setNameScho(i.getScho());
                    System.out.println(tmp);
                }
            }
        }
    }
}

