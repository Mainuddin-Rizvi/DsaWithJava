package org.example.kunDSA.OOPSfeature;

public class Box {
    double l;
    double h;
    double w;

    public Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    public Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(Box old){
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public  void information(){
        System.out.println("Running the box");
    }

}
