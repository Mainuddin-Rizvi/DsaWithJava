package org.example.kunDSA.OOPSfeature;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double weight) {
        this.weight = -1;
    }


    public BoxWeight(double l,double h, double w, double weight){
        super(l,h,w); // for parent constructor
        this.weight = weight;
    }
}
