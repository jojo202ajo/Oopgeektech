package com.company;

public class Hero {
    private int supersposob;
    private int healshero;

    public int getSupersposob() {
        return supersposob;
    }

    public void setSupersposob(int supersposob) {
        this.supersposob = supersposob;
    }

    public int getHealshero() {
        return healshero;
    }

    public void setHealshero(int healshero) {
        this.healshero = healshero;
    }

    public int getDameghero() {
        return dameghero;
    }

    public void setDameghero(int dameghero) {
        this.dameghero = dameghero;
    }

    private int dameghero;


    public Hero(int supersposob, int healshero, int dameghero){
        this.supersposob = supersposob;
        this.healshero = healshero;
        this.dameghero = dameghero;
    }
    public Hero( int healshero, int dameghero){

        this.healshero = healshero;
        this.dameghero = dameghero;}
}
