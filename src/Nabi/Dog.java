package Nabi;

public class Dog {
    //instance variable
    String breed;
    String size;
    String color;
    int age;

    public static void main(String[] args) {
        //create object here
        Dog Dog1Object = new Dog();
        Dog Dog2Object = new Dog();
        Dog Dog3Object = new Dog();

        //Data input for Dog Object1
        Dog1Object.breed="Beagle";
        Dog1Object.size="large";
        Dog1Object.color="black";
        Dog1Object.age=2;

        //Data input for Dog Object2
        Dog2Object.breed="Buldog";
        Dog2Object.size="large";
        Dog2Object.color="orange";
        Dog2Object.age=4;

        //Data input for Dog Object3
        Dog3Object.breed="Jaff";
        Dog3Object.size="small";
        Dog3Object.color="orange";
        Dog3Object.age=6;
    }
}
