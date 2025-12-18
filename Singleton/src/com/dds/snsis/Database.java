package com.dds.snsis;

public class Database {
    private String name;


    private static Database instances;

    public static Database getInstance(String name) {
        if(null==instances) {
            instances=new Database(name);
            return instances;
        }
        else {
            return instances;
        }
    }
    public Database(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
