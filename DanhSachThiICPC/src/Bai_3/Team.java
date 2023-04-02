package Bai_3;

/**
 *
 * @author ADMIN
 */
public class Team {
    private String id, name, scho;

    public Team(int n, String name, String scho) {
        id = "Team" + String.format("%02d", n);
        this.name = name;
        this.scho = scho;
    }

    Team() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getScho() {
        return scho;
    }
}

