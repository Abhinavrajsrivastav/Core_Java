package Inheritance;

class Animal{
    String name = "Lion";
    int price = 2000;
        }

        class Pet extends Animal{
//           "Child class name" extends "Parent class name"
        }
public class Inheritance_1{
    public static void main(String[] args){
        Pet a1 = new Pet();
        System.out.println(a1.name);
        System.out.println(a1.price);
    }
}

// Single or Simple Level Inheritance