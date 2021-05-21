package com.sda;

//Create a Facade DP, incorporating Facade, for Database.
// P. S. Implement at least 4 Database provider classes
// (MySQL, PostegresSQL, MS SQL, No SQL).

public class Facade {

    public static void main(String[] args) {
        DatabaseConnector dataBaseConnector = new DatabaseConnector();
        dataBaseConnector.connectmySQL();
        dataBaseConnector.connectpostegresSQL();
        dataBaseConnector.msSQL();
        dataBaseConnector.noSQL();

    }
}

interface Database {
    void connect();
}

class MySQL implements Database {
    @Override
    public void connect() {
        System.out.println("Connecting mySQL");
    }
}

class PostegresSQL implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting postegresSQL");
    }
}

class MsSQL implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting MsSQL");
    }
}

class NoSQL implements Database {

    @Override
    public void connect() {
        System.out.println("no SQL");
    }
}

class DatabaseConnector{
    private Database mySQL;
    private Database postegresSQL;
    private Database msSQL;
    private Database noSQL;

    public DatabaseConnector(){
        mySQL = new MySQL();
        postegresSQL = new PostegresSQL();
        msSQL = new MsSQL();
        noSQL = new NoSQL();
    }
    public void connectmySQL (){
        mySQL.connect();
    }
    public void connectpostegresSQL (){
        postegresSQL.connect();
    }
    public void msSQL (){
        msSQL.connect();
    }
    public void noSQL (){
        noSQL.connect();
    }
}