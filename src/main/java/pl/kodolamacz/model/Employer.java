package pl.kodolamacz.model;

/**
 * Created by Jag on 2017-07-04.
 */


public class Employer {

    private int id;
    private String name;

    public Employer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
