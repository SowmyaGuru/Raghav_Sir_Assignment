// Part A — Class and Object
//Create a Student class with name, age, and course fields. Create two objects and print their details.

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