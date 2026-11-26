// Part A — Class and Object
//Create a Student class with name, age, and course fields. Create two objects and print their details.

import java.util.ArrayList;

class Student3 {
    String name = "Sowmya";
    int age = 29;
    String course = "CSE";


    public static void main(String[] args) {
        Student3 stu = new Student3();
        System.out.println(stu.name);
        System.out.println(stu.age);
        System.out.println(stu.course);

    }
}

//Create a Mobile class with brand and price. Create three objects with different values and display them.

class Mobile
{
    String brand;
    double price;

    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.brand = "Samsung";
        mob1.price = 50000;

        Mobile mob2 = new Mobile();
        mob2.brand = "iphone";
        mob2.price = 500000.00;

        Mobile mob3 = new Mobile();
        mob3.brand = "Google";
        mob3.price = 40000;

        System.out.println(mob1.brand + " - " + mob1.price);
        System.out.println(mob2.brand + " - " + mob2.price);
        System.out.println(mob3.brand + " - " + mob3.price);


    }
}

//Create a BankAccount class with accountHolder and balance. Add a method to deposit an amount and display the
//updated balance.

class BankAccount1
{

    void deposit(String accountHolder,double balance)
    {
        System.out.println("rupees deposited " + accountHolder + "=" + balance);
    }

    public static void main(String[] args) {
        BankAccount1 bnk = new BankAccount1();
        bnk.deposit("Sowmya",100000);
    }
}

//Create a Rectangle class with length and breadth. Add methods to calculate area and perimeter. Create an object and call
//both methods

class rect{


    double areaa(double length,double breadth)
    {
        double area = length * breadth;
        return area;

    }
    double perimeter(double length,double breadth)
    {
        double peri = 2 * length + breadth;
        return peri;
    }

    public static void main(String[] args) {
        rect ar = new rect();
        System.out.println(ar.areaa(10,20));

        System.out.println(ar.perimeter(10,20));
    }
}

//Part B — Interface Reference Rule
// Create an interface Payment with a method pay(double amount). Implement it in UPIPayment and CardPayment. Create
//objects using Payment references and call pay().

interface Paymentt{
    void pay(double amount);
}
class UPIPaymentt implements Paymentt
{
    @Override
    public void pay(double amount) {
        System.out.println("payment through UPI Payment");
    }
}
class CardPayment implements Paymentt
{
    @Override
    public void pay(double amount) {
        System.out.println("Payment through CardPayment");
    }

    public static void main(String[] args) {
        Paymentt p1 = new UPIPaymentt();
        p1.pay(2000);
        Paymentt p2 = new CardPayment();
        p2.pay(5000);
    }
}

//Create an interface Vehicle with start() and stop(). Implement it in Car and Bike. Use Vehicle references to call the
//methods for both objects

interface Vehiclee{
    void start();
    void stop();
}
class Carr implements Vehiclee{
    @Override
    public void start() {
        System.out.println("Car started");
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");
    }
}
class Bikee implements Vehiclee{
    @Override
    public void start() {
        System.out.println("Bike started");
    }

    @Override
    public void stop() {
        System.out.println("Bike stopped");
    }

    public static void main(String[] args) {
        Vehiclee veh = new Carr();
        veh.start();
        veh.stop();
        Vehiclee veh1 = new Bikee();
        veh1.start();
        veh1.stop();
    }
}

//Create an interface Notification with send(String message). Implement it in EmailNotification and SMSNotification. Call
//send() through a Notification reference.

interface  Notificationn{
    void send(String message);
}
class EmailNotificationn implements Notificationn{
    @Override
    public void send(String message) {
        System.out.println("Email notification found" + message);
    }
}
class SMSNotificationn implements Notificationn{
    @Override
    public void send(String message) {
        System.out.println("SMSNotification found" + message);

    }

    public static void main(String[] args) {
        Notificationn noti = new EmailNotificationn();
        noti.send(" your Email notification is here");
        Notificationn notii = new SMSNotificationn();
        notii.send(" SMS notification is here");

    }
}

//Q- In your own words, explain what happens in InterfaceName obj = new ClassName();. Identify the reference type, object
//type, and constructor call.
//Answer: We use an interface reference to hold an object of its implementing class. The reference type controls method accessibility, while the actual object type determines which overridden method gets executed at runtime


//Write one example where two different classes implement the same interface. Explain how the same interface reference
//can refer to objects of either class.

interface inter{
    void met();
}
class classA implements inter{
    @Override
    public void met() {
        System.out.println("classA");
    }
}
class classB implements inter{
    @Override
    public void met() {
        System.out.println("classB");
    }

    public static void main(String[] args) {
        inter in;
        in = new classA();
        in.met();
        in = new classB();
        in.met();
    }
}

//Write a small program using ArrayList to add, retrieve, update, remove, and iterate over five student names.

import java.util.ArrayList;

public class StudentList{
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<String>();

        students.add("sowmya");
        students.add("kavya");
        students.add("divya");
        students.add("riya");

        System.out.println("students list : " + students);

        //retrieve
        System.out.println(students.get(2));

        //update
        students.set(1,"Anjali");
        System.out.println(students);

        //remove
        students.remove(3);
        System.out.println(students);

        //iterate
        for (String name : students) {
            System.out.println(name);
        }

    }
}

















