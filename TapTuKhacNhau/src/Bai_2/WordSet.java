package Bai_2;

import java.util.TreeSet;

/**
 *
 * @author ADMIN
 */
public class WordSet {
    TreeSet<String> ws;
    String[] str;

    public WordSet(TreeSet<String> ws) {
        this.ws = ws;
    }
    
    public WordSet(String in){
        this.str = in.toLowerCase().trim().split("\\s+");
        this.ws = new TreeSet<>();
        for(String i : str){
            this.ws.add(i);
        }
    }
    public String union(WordSet w){
        TreeSet<String> union = new TreeSet<>(ws);
        for(String i : w.ws)
            union.add(i);
        return String.join(" ", union);
    }
    public String intersection(WordSet w){
        TreeSet<String> intersection = new TreeSet<>();
        for(String i : w.ws)
            if(ws.contains(i)){
                intersection.add(i);
            }
        return String.join(" ", intersection);
    }
    
}
