package com.dds.snsis;

public class Main {
    public static void main(String[] args) {

        Database db1 = Database.getInstance("Oracle");

        Database db2 = Database.getInstance("MySQL");

        System.out.println("db1 name = " + db1.getName());
        System.out.println("db2 name = " + db2.getName());

        System.out.println("Are both same object? " + (db1 == db2));
    }
}
