package Bai3;

/**
 *
 * @author ADMIN
 */
public class MonThi implements Comparable<MonThi>{
    
    private String id, name, type;

    public MonThi(String id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }
    
    public int comperaTo(MonThi s){
        return this.id.compareTo(s.id);
    }
    
    @Override
    public String toString(){
        return id + " " + name + " " + type;
    }
}
