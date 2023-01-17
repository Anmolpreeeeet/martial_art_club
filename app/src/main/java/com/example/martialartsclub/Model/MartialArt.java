package com.example.martialartsclub.Model;

public class MartialArt {
    private String martialArtName;
    private double martialArtPrice;
    private String martialArtColor;
    private int martialArtID;

    public MartialArt(int id , String name , double price , String color) {
        setMartialArtColor(color);
        setMartialArtID(id);
        setMartialArtPrice(price);
        setMartialArtName(name);
    }

    public void setMartialArtName(String martialArtName) {
        this.martialArtName = martialArtName;
    }

    public void setMartialArtPrice(double martialArtPrice) {
        this.martialArtPrice = martialArtPrice;
    }

    public void setMartialArtColor(String martialArtColor) {
        this.martialArtColor = martialArtColor;
    }

    public void setMartialArtID(int martialArtID) {
        this.martialArtID = martialArtID;
    }

    public String getMartialArtName() {
        return martialArtName;
    }

    public double getMartialArtPrice() {
        return martialArtPrice;
    }

    public String getMartialArtColor() {
        return martialArtColor;
    }

    public int getMartialArtID() {
        return martialArtID;
    }

    @Override
    public String toString() {
        return getMartialArtID() + 1 + " " + getMartialArtName() + " "  + getMartialArtPrice() + " " + getMartialArtColor() + "\n";

    }
}
