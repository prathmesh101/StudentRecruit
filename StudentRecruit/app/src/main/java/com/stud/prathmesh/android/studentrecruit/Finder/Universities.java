package com.stud.prathmesh.android.studentrecruit.Finder;

/**
 * Created by HP on 3/15/2018.
 */

public class Universities {


    private int id;
    private String universitiesName;
    private int gre;


    public Universities () {

    }

    public Universities(int id, String name, int gre) {


        this.id = id;
        this.universitiesName = name;
        this.gre = gre;

    }

    public int getUnivId() {

        return this.id;
    }

    public void setUnivId(int id) {

        this.id = id;
    }

    public String getUnivName() {

        return this.universitiesName;
    }

    public void setUnivName(String universitiesName) {

        this.universitiesName = universitiesName;
    }

    public int getGre() {
        return this.gre;
    }

    public void setGre(int gre) {

        this.gre = gre;
    }










}
