package org.example.kunDSA.oopsPackageStaticSingletonInbuiltmethods.Singleton;

//making singleton make constructor priate so access not possible
// create logic like below so ony one create by if and method of get instance
class Singleton{
    private Singleton() {

    }
    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}
public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        System.out.println(obj1);
        System.out.println(obj2);
    }
}

