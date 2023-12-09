package OOP.Pollymorphism.Interface;

public class Interface {
    interface Animal {
        void lion();
        void tiger();
    }

    abstract static class Animal1 implements Animal {
        @Override
        public void lion() {
            System.out.println("Lion Roar spread very far");
        }

        @Override
        public void tiger() {
            System.out.println("Tiger also roar very far but not as much as a lion does");
        }
    }

    static class ConcreteAnimal extends Animal1 {
        // You can add additional methods or override existing ones if needed
 
        // @Override
        // public void lion() {
        //     System.out.println("Lion Roar spread very far");
        // }

        // @Override
        // public void tiger() {
        //     System.out.println("Tiger also roar very far but not as much as a lion does");
        // }

    }

    public static void main(String[] args) {
        ConcreteAnimal a = new ConcreteAnimal();
        a.lion();
        a.tiger();
    }
}
