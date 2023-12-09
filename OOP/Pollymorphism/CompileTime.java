package OOP.Pollymorphism;

class Compiletime {
    public static class Detail {
        // Separate methods for different parameter sets
        void printDetails(String name, int age) {
            System.out.println(name);
            System.out.println(age);
        }

        void printDetails(String name, int age, String college) {
            System.out.println(name);
            System.out.println(age);
            System.out.println(college);
        }
    }
}

public class CompileTime{
    public static void main(String[] args) {
        Compiletime.Detail c = new Compiletime.Detail();
        // c.printDetails("Abhinav", 21);
        c.printDetails("Abhinav", 21, "ABES EC");
    }
}
