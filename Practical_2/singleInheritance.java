import java.util.*; 

class Vehicle { 
    String brandName; 
    int numberOfTyre; 

    void honk() { 
        System.out.println("Vehicle honks"); 
    } 

    Vehicle(String bName, int t) { 
        this.numberOfTyre = t; 
        this.brandName = bName; 
    } 
} 

class Car extends Vehicle { 
    int numberOfDoors; 

    Car(String bName, int t, int d) { 
        super(bName, t); 
        this.numberOfDoors = d; 
    } 

    void start(){ 
        System.out.println("Car Starts");
    } 
} 

class Main { 
    public static void main(String[] args ){ 
        Car car1 = new Car("toyota", 4, 4); 
        System.out.println("Brand is "+ car1.brandName);
        car1.honk(); 
        car1.start(); 
    } 
}

