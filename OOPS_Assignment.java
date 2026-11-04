class Animal {
    public static void main(String[] args) {
        eat();
    }

    static void eat()
    {
        System.out.println("This is eat method");
    }
}

class Dog extends Animal
{
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.bark();
        dog.eat();
    }

    static void bark()
    {
        System.out.println("This is bark method");
    }
}

class Vehicle
{
    public static void main(String[] args) {
        start();
        stop();
    }
    static void start()
    {
        System.out.println("This is start method of vehicle class");
    }
    static void stop()
    {
        System.out.println("This is stop method of vehicle class");
    }
}

class Car extends Vehicle
{
    public static void main(String[] args) {
           Car music = new Car();
           Car.start();
           Car.stop();
           Car.playMusic();
    }
    static void playMusic()
    {
        System.out.println("This is playmusic method of car class");
    }
}

class Person
{
    String name = "Sowmya";
    int age = 29;

}
class Student extends Person
{
    int rollnumber = 2026;
    public static void main(String[] args) {
        Student stu = new Student();
        System.out.println(stu.name);
        System.out.println(stu.age);

        System.out.println(stu.rollnumber);
    }
}

class Employee
{
    String employeeName = "Sowmya";
    double salary = 100000.00;
}
class Manager extends Employee
{
    String department = "Technology";

    public static void main(String[] args) {
        Manager man = new Manager();
        System.out.println(man.employeeName);
        System.out.println(man.salary);
        System.out.println(man.department);

    }
}

class animal
{

    void makeSound()
    {
           System.out.println("This is animal sound");
    }
}
class dog extends animal
{
    @Override
    void makeSound()
    {
        System.out.println("This is dog bark");
    }
}
class cat extends animal
{
    @Override
    void makeSound()
    {
        System.out.println("This is cat's meow");
    }
}
class Main extends animal{
    public static void main(String[] args) {
        dog dg = new dog();
        cat ct = new cat();
        animal ani = new animal();

        ani.makeSound();
        dg.makeSound();
        ct.makeSound();
    }
}


class LivingThing
{
    void some()
    {
        System.out.println("Some method of living thing");
    }
}
class Animal1 extends LivingThing
{
    void some1()
    {
        System.out.println("Some method of Animal1");
    }
}
class Dog1 extends Animal1
{
    void some2()
    {
        System.out.println("Some method of Dog1");
    }

    public static void main(String[] args) {
        Dog1 doggy = new Dog1();
        doggy.some();
        doggy.some1();
        doggy.some2();

    }


}

class Shape
{
    void displayShape()
    {
        System.out.println("This is displayShape method");
    }
}
class circle extends Shape
{
    void cir()
    {
        System.out.println("Circle method");
    }
}
class Triangle extends Shape
{
    void Tri()
    {
        System.out.println("Triangle method");
    }

}
class Rectangle extends Shape
{
    void Rec()
    {
        System.out.println("Rectangle method");
    }

    public static void main(String[] args) {
        Rectangle rec = new Rectangle();
        Triangle tri = new Triangle();
        circle cir = new circle();
        rec.displayShape();
        rec.Rec();
        tri.displayShape();
        tri.Tri();

        cir.displayShape();
        cir.cir();


    }
}

//class Parent {
//    void show() {
//        System.out.println("Parent show");
//    }
//}
//class Child extends Parent {
//    @Override
//    void show() {
//        System.out.println("Child show");
//    }
//}
//public class Main {
//    public static void main(String[] args) {
//        Child obj = new Child();
//        obj.show();
//    }
//}

//output is: Child show



class Product
{
    String productName = "Sowmya";
    double price = 5000.00;
}
class Electronics extends Product
{
    int warrantyYears = 20;

    public static void main(String[] args) {
        Electronics pro = new Electronics();
        System.out.println(pro.productName);
        System.out.println(pro.price);
        System.out.println(pro.warrantyYears);

    }
}

//Create an Employee class with a method work(). Create Developer and Tester classes that inherit from Employee and
//override work() to describe their responsibilities.

class Employee1
{
    void work()
    {
        System.out.println("Employee work");
    }
}
class Developer extends Employee1
{
    @Override
    void work()
    {
        System.out.println("Developer work");
    }
}
class Tester extends Employee1
{
    @Override
    void work()
    {
        System.out.println("Tester work");
    }

    public static void main(String[] args) {
        Employee1 obj1 = new Employee1();
        obj1.work();
        Developer obj2 = new Developer();
        obj2.work();
        Tester obj3 = new Tester();
        obj3.work();
    }
}

//Explain single, multilevel, and hierarchical inheritance with simple Java examples. Also explain why Java does not
//support multiple inheritance through classes.

//Below is the single inheritance where parent class is inherited by a child class
class A
{
    void abc()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    void def()
    {
        System.out.println("class B");
    }
       public static void main(String[] args) {
        A abd = new B();
        B ghi = new B();
        abd.abc();
        ghi.def();

    }
}

//Java does not support multiple inheritance through classes mainly because it can create ambiguity when two parent classes contain methods with the same name.


//Create a BankAccount class with methods deposit() and withdraw(). Create a SavingsAccount class that inherits from
 //       BankAccount and adds a method calculateInterest(). Test the methods.

class BankAccount
{
    void deposit()
    {
        System.out.println("Deposit method");
    }
    void withdraw()
    {
        System.out.println("withdraw method");
    }
}
class SavingsAccount extends BankAccount
{
    void calculateInterest()
    {
        System.out.println("Calculate interest method");
    }

    public static void main(String[] args) {
        BankAccount BAcc = new BankAccount();
        BAcc.deposit();
        BAcc.withdraw();
        SavingsAccount SAcc = new SavingsAccount();
        SAcc.calculateInterest();
    }

}


//Create a parent class with public, protected, default-access, and private variables. Create a child class and try
//accessing these variables. Explain which variables can be accessed and why.

class Parent
{
    public String name = "SOWMYA";
    protected double Balance = 2000000.00;
    String designation = "Senior QA";
    private int age = 29;
}
class Child extends Parent
{
    public static void main(String[] args) {
        Child chi = new Child();
        System.out.println(chi.Balance);
        System.out.println(chi.designation);
        System.out.println(chi.name);

        //chi.age;    //private variable error
    }
}
//Public: Accessible from anywhere.
//Protected: Accessible within the same package and by subclasses in other packages.
//Default: Accessible only within the same package. If you don't specify an access modifier, Java uses default access.
//Private: Accessible only within the class where it is declared.

//Create a parent class containing a final method named display(). Create a child class and attempt to override the
//method. What happens? Explain the purpose of the final keyword in this situation.

class Parent1
{
    final void display()
    {
        System.out.println("Final method");
    }
}
class child1 extends Parent1
{
    //    void display()
//    {
//        System.out.println("Child final method");                      //cannot override final method
//    }
    public static void main(String[] args) {
        child1 chi1 = new child1();
        chi1.display();
    }
}

//Java does not allow overriding a final method. When we declare a method as final in a parent class, the child class can inherit and access that method, but it cannot provide its own implementation. The purpose is to prevent modification of the method's implementation through overriding."


//Create a Person class with common details such as name and age. Create Student and Professor classes that inherit
//from Person. Add suitable fields and methods to each child class and display their details.

class Person1
{
    String name = "SOWMYA";
    int age = 29;
}
class Student1 extends Person1
{
    String Course = "CSE";
    float Marks = 50;

    void displayStudent()
    {
        System.out.println("Student details:");
        System.out.println(name);
        System.out.println(age);
        System.out.println(Course);
        System.out.println(Marks);
    }
}
class Professor extends Person1
{
      String Subject = "Mathematics";
      float Experience = 15;

      void displayProfessor()
      {
          System.out.println("Professor details:");
          System.out.println(name);
          System.out.println(age);
          System.out.println(Subject);
          System.out.println(Experience);
      }

    public static void main(String[] args) {
        Professor prof = new Professor();
        prof.displayProfessor();
        Student1 stu = new Student1();
        stu.displayStudent();
    }
}

//PART B Abstraction

abstract class Animal2 {

    abstract void makeSound();

}

class Dog2 extends Animal2 {

    @Override
    void makeSound() {
        System.out.println("this is Dog2 makesound");
    }
}

class Cat extends Animal2 {

    @Override
    void makeSound() {
        System.out.println("this is Cat makesound");
    }
           public static void main(String[] args) {

            Dog2 dog = new Dog2();
            dog.makeSound();

            Cat cat = new Cat();
            cat.makeSound();
        }

}




