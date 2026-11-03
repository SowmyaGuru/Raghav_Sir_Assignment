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











