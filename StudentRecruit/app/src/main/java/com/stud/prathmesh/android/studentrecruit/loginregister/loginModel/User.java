package com.stud.prathmesh.android.studentrecruit.loginregister.loginModel;


public class User {

    private int id;
    private String name;
    private String email;
    private String password;
    private int gre;
    private int toefl;


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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getGre() {
        return gre;
    }

    public void setGre(int gre) {
        this.gre = gre;
    }

    public int getToefl() {
        return toefl;
    }

    public void setToefl(int toefl) {
        this.toefl = toefl;
    }

}
