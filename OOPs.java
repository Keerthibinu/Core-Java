public class OOPs {
    public static void main(String[] args) {
        Vehicle v=new Vehicle();
        v.startEngine();
        Car c = new Car();
        c.startEngine();
        Bike b = new Bike();
        b.startEngine();
        Vehicle v1=new Car();
        v1.startEngine();
        Vehicle v2=new Bike();
        v2.startEngine();
    }
}

class Vehicle{
     void startEngine(){
        System.out.println("Engine starts");
    }
}

class Car extends Vehicle{
    public void startEngine() {
        System.out.println("Car Starts");
    }
}

class Bike extends Vehicle{
    void startEngine() {
        System.out.println("Bike Starts");
    }
}
