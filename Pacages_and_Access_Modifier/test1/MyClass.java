import otherPacakes.sayHi; // Import package otherPacakes
package test1; // Declare package default

public class MyClass {
    public static void main(String[] args) {

        sayHi obj = new sayHi(); // Create an object of sayHi class
        obj.sayHello(); // Call the sayHello() method
    }
}
