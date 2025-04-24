package com.xworkz.abstraction.Runner;

import com.xworkz.abstraction.internal.IplAPP;
import com.xworkz.abstraction.internal.JDBC;
import com.xworkz.abstraction.internal.MySql;
import com.xworkz.abstraction.internal.Oracle;

public class JDBCRunner  {

    public static void main(String[] args) {

        JDBC jdbc = new MySql();
        IplAPP iplAPP = new IplAPP(jdbc);
        iplAPP.saveTeam();
    }
}

