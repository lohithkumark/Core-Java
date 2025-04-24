package com.xworkz.abstraction.internal;

public class IplAPP {

    private JDBC jdbc;

    public IplAPP(JDBC jdbc) {
        this.jdbc = jdbc;
    }

    public void saveTeam() {
        if (this.jdbc != null) {
           this.jdbc.jdbc();
        }
        else
        {
            System.out.println("JDBC IS NULL");
        }
    }
}
