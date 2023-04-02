package Bai_3;

/**
 *
 * @author ADMIN
 */
public class Student implements Comparable<Student>{
    private String id, name, idTeam, nameTeam, nameScho;
    private Team t;
    
    public Student(int n, String name, String idTeam) {
        id = "C" + String.format("%03d", n);
        this.name = name;
        this.idTeam = idTeam;
    }

    public void setNameTeam(String nameTeam) {
        this.nameTeam = nameTeam;
    }

    public void setNameScho(String nameScho) {
        this.nameScho = nameScho;
    }

    public String getIdTeam() {
        return idTeam;
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + nameTeam + " " + nameScho;
    }
    @Override
    public int compareTo(Student s){
        if(name.compareTo(s.name) > 0)   return 1;
        if(name.compareTo(s.name) < 0)   return -1;
        return 0;
    }
}
