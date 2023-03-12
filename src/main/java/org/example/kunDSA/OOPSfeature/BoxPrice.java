package org.example.kunDSA.OOPSfeature;

public class BoxPrice extends BoxWeight{
    double price;

    public BoxPrice(double weight, double price) {
        super(weight);
        this.price = price;
    }

    public BoxPrice(double l, double h, double w, double weight) {
        super(l, h, w, weight);
    }



}
