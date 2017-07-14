package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 12/07/2017.
 */

public class Bag {

    private String nomeBag;
    private int backGround;


    public Bag(){}
    public Bag(String n, int b){
        nomeBag = n;
        backGround = b;
    }


    public String getnomeBag() {
        return nomeBag;
    }

    public void setnomeBag(String nomeBag) {
        this.nomeBag = nomeBag;
    }

    public int getbackGround() {
        return backGround;
    }

    public void setbackGround(int backGround) {
        this.backGround = backGround;
    }
}
