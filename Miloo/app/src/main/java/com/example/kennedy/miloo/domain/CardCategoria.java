package com.example.kennedy.miloo.domain;

/**
 * Created by Felipe on 12/07/2017.
 */

public class CardCategoria {
    private String model;
    private String brand;
    private int photo;


    public CardCategoria(){}
    public CardCategoria(String m, String b, int p){
        model = m;
        brand = b;
        photo = p;
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
