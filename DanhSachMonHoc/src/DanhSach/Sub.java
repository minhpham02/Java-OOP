package DanhSach;

/**
 *
 * @author ADMIN
 */
public class Sub implements Comparable<Sub>{
    private String id, name, form;

    public Sub(String id, String name, String form) {
        this.id = id;
        this.name = name;
        this.form = form;
    }
    
    @Override
    public int compareTo(Sub s){
        return id.compareTo(s.id);
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + form;
    }
}
