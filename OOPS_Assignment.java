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

//************************** PART B Abstraction ******************************************//
//Create an abstract class Animal with an abstract method makeSound(). Create Dog and Cat classes that implement
//this method. Test both classes

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

//Create an abstract class Vehicle with an abstract method startEngine() and a concrete method stopEngine(). Create
//Car and Bike classes and implement startEngine() in each

abstract class Vehicle1
{
    abstract void startEngine();
    void stopEngine()
    {
         System.out.println("stop vehicle");
    }
}
class Car1 extends Vehicle1
{
   @Override
    void startEngine()
   {
       System.out.println("Start car");
   }
}
class Bike extends Vehicle1
{
    @Override
    void startEngine()
    {
        System.out.println("Start Bike");
    }

    public static void main(String[] args) {
        Vehicle1 veh = new Car1();
        veh.startEngine();
        veh.stopEngine();

        Car1 ca = new Car1();
        ca.startEngine();
        ca.stopEngine();

        Bike bi = new Bike();
        bi.startEngine();
        bi.stopEngine();
    }
}

//Create an abstract class Employee with a constructor that initializes an employee name. Create a Developer class that
 //       extends it. Create a Developer object and observe the constructor execution.

abstract class Employee2
{
    String employee_name;

    Employee2(String name)
    {
       employee_name = name;
       System.out.println("Employee constructor executed");
    }
}
class Developer1 extends Employee2
{
    Developer1(String name)
    {
        super(name);
        System.out.println("Developer constructor executed");
    }

        public static void main(String[] args)
        {
            Developer1 dev = new Developer1("sowmya");

            System.out.println("Employee Name: " + dev.employee_name);
        }


}

//Create an abstract class Shape with an abstract method draw(). Create Circle and Rectangle classes that implement
//draw(). Use a Shape reference to call the methods of both child objects.

abstract class Shape1
{
    abstract  void draw();

}
class Circle extends Shape1
{
    @Override
    void draw() {
        System.out.println("This is draw of a circle");
    }
}
class Rectangle1 extends Shape1
{
    @Override
    void draw() {
        System.out.println("This is draw of a rectangle");
    }

    public static void main(String[] args) {
        Shape1 shape;

        shape = new Circle();
        shape.draw();
        shape = new Rectangle1();
        shape.draw();

    }
}

//Create an interface Payment with a method pay(double amount). Implement it in CreditCardPayment and
//UPIPayment. Display a different payment message for each implementation

interface Payment
{
    void pay(double amount);

}
class CreditCardPayment implements Payment
{
    @Override
    public void pay(double amount) {
        System.out.println("This is pay method of Creditcard payment class: " + amount);
    }
}
class UPIPayment implements Payment
{
    @Override
    public void pay(double amount) {
        System.out.println("This is pay method of UPIpayment class: " + amount);
    }

    public static void main(String[] args) {
           CreditCardPayment cc = new CreditCardPayment();
           cc.pay(5000);
           UPIPayment up = new UPIPayment();
           up.pay(6000);
    }
}

//Explain the differences between an abstract class and an interface in Java. Write a small example demonstrating when
//each might be useful.

//Abstract class: Used when related classes share common properties and behaviours.
//Interface: Used when different classes need to follow the same contract or implement common functionality.


//Create an abstract class Notification with an abstract method sendNotification(). Create EmailNotification,
//SMSNotification, and PushNotification classes that implement the method differently.

abstract class Notification {

    abstract void sendNotification();
}

class EmailNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("This is an EmailNotification");
    }
}

class SMSNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("This is an SMSNotification");
    }
}

class PushNotification extends Notification {

    @Override
    void sendNotification() {
        System.out.println("This is a PushNotification");
    }

        public static void main(String[] args) {

            Notification notification;

            notification = new EmailNotification();
            notification.sendNotification();

            notification = new SMSNotification();
            notification.sendNotification();

            notification = new PushNotification();
            notification.sendNotification();
        }

}


//Create an interface Database with methods connect() and disconnect(). Implement the interface in MySQLDatabase
//and OracleDatabase. Test both implementations.

interface Database
{
    void connect();
    void disconnect();
}
class MySQLDatabase implements Database
{
    @Override
    public void connect() {
        System.out.println("This is MYSQLDatabase connect method");
    }

    @Override
    public void disconnect() {
        System.out.println("This is MYSQLDatabase disconnect method");

    }
}
class OracleDatabase implements Database
{
    @Override
    public void connect() {
        System.out.println("This is OracleDatabase connect method");
    }

    @Override
    public void disconnect() {
        System.out.println("This is OracleDatabase disconnect method");

    }

    public static void main(String[] args) {

        MySQLDatabase mysql = new MySQLDatabase();
        mysql.connect();
        mysql.disconnect();


        OracleDatabase oracle = new OracleDatabase();
        oracle.connect();
        oracle.disconnect();

    }
}

//Create an abstract class Shape with an abstract method calculateArea(). Implement it in Circle and Rectangle.
//Calculate and display the area of each shape.

abstract class Shape2
{
    abstract void calculateArea();
}
class Circle1 extends Shape2
{
    @Override
    void calculateArea() {
        System.out.println("Area of a circle");
    }
}
class Rectangle5 extends Shape2
{
    @Override
    void calculateArea() {
        System.out.println("Area of a rectangle");

    }

    public static void main(String[] args) {
        Shape2 shp2 ;

        shp2 = new Rectangle5();
        shp2.calculateArea();

        shp2 = new Circle1();
        shp2.calculateArea();

    }
}


//***********************  PART C   *********************************************//

//Create an abstract class BaseTest with an abstract method executeTest() and a concrete method startTest(). Create
//LoginTest and CheckoutTest classes that implement executeTest(). Test both using a BaseTest reference.

abstract class BaseTest
{
    abstract void executeTest();

    void startTest()
    {
        System.out.println("start test base test");
    }
}

class LoginTest extends BaseTest
{
    @Override
    void executeTest() {

        System.out.println("This is BaseLogintest");
    }

    @Override
    void startTest() {
        super.startTest();
        System.out.println("This is starttest of logintest");
    }
}
class CheckoutTest extends BaseTest
{
    @Override
    void executeTest() {

        System.out.println("This is BaseCheckoutTest");
    }

    @Override
    void startTest() {
        super.startTest();
        System.out.println("This is starttest of CheckoutTest");
    }

    public static void main(String[] args) {
        BaseTest bt;
         bt = new LoginTest();
         bt.startTest();
         bt.executeTest();

         bt = new CheckoutTest();
         bt.startTest();
         bt.executeTest();
    }
}

//Create an abstract class Browser with abstract methods launch() and close(). Create ChromeBrowser and
//FirefoxBrowser classes and implement both methods. Test each browser implementation

abstract class Browser
{
    abstract void launch();
    abstract void close();

}
class ChromeBrowser extends Browser
{
    @Override
    void launch() {
        System.out.println("Chromebrowser launch");
    }

    @Override
    void close() {
        System.out.println("Chromebrowser close");

    }
}
class FirefoxBrowser extends Browser
{
    @Override
    void launch() {
        System.out.println("FirefoxBrowser launch");

    }
    @Override
    void close() {
        System.out.println("FirefoxBrowser close");

    }

    public static void main(String[] args) {
        Browser bro;

        bro = new ChromeBrowser();
        bro.launch();
        bro.close();

        bro = new FirefoxBrowser();
        bro.launch();
        bro.close();

    }
}

//Create an interface ApiTest with methods sendRequest() and validateResponse(). Implement it in GetApiTest and
//PostApiTest. Display suitable messages for each operation.


interface ApiTest
{
     void sendRequest();
     void ValidateResponse();
}
class GetApiTest implements ApiTest
{
    @Override
    public void sendRequest() {
        System.out.println("GetAPI Sendrequest");
    }

    @Override
    public void ValidateResponse() {
        System.out.println("GetAPI Validateresponse");

    }
}
class PostApiTest implements ApiTest
{
    @Override
    public void sendRequest() {
        System.out.println("PostApiTest Sendrequest");
    }

    @Override
    public void ValidateResponse() {
        System.out.println("PostApiTest Validateresponse");

    }

    public static void main(String[] args) {

        ApiTest api;

        api = new GetApiTest();
        api.sendRequest();
        api.ValidateResponse();

        api=new PostApiTest();
        api.sendRequest();
        api.ValidateResponse();

    }
}

//Create an abstract class LoginTest with an abstract method validateLogin(). Create ValidLoginTest and
//InvalidLoginTest classes with different implementations. Test both classes and display the results.

abstract class LoginTest1
{
    abstract void validateLogin();
}
class ValidLoginTest extends LoginTest1
{
    @Override
    void validateLogin() {
        System.out.println("Valid credentials");
    }
}
class InvalidLoginTest extends LoginTest1
{
    @Override
    void validateLogin() {
        System.out.println("In-Valid credentials");

    }

    public static void main(String[] args) {
        LoginTest1 login;
        login = new ValidLoginTest();
        login.validateLogin();

        login = new InvalidLoginTest();
        login.validateLogin();
    }
}

//Create an abstract class Report with an abstract method generateReport() and a concrete method printHeader().
//Create HtmlReport and PdfReport classes that implement generateReport(). Use a Report reference to test both
//implementations.

abstract  class  Report
{
    abstract void generateReport();
    void printHeader()
    {
          System.out.println("Print Header");
    }
}
class HtmlReport extends Report
{
    @Override
    void generateReport() {
        System.out.println("HTML Report");
    }

    @Override
    void printHeader() {
        super.printHeader();
        System.out.println("HTML Report header");

    }
}
class PdfReport extends Report
{
    @Override
    void generateReport() {
        System.out.println("PDF Report");

    }

    @Override
    void printHeader() {
        super.printHeader();
        System.out.println("PDF Report header");

    }

    public static void main(String[] args) {
        Report rep ;
        rep = new HtmlReport();
        rep.generateReport();
        rep.printHeader();

        rep = new PdfReport();
        rep.generateReport();
        rep.printHeader();
    }

}

















































