//Practical 3.1
import java.util.*;
public class Practical3 {
    public static void main(String[] args){
        int num;
        String[] ordinal = {"First","Second","Third","Fourth","Fifth","Sixth","Seventh","Eighth","Ninth","Tenth","Eleventh","Twelth","Thirteenth","Fourteenth","Fifteenth","Sixteenth","Seventeenth","Eighteenth","Nineteenth","Twentieth"};
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of arguements:- ");
        num = sc.nextInt();

        String[] student = new String[num];

        for (int i=0;i<num;i++){
            System.out.print("Enter the name of "+ordinal[i]+" Student:- ");
            student[i] = sc.next();
        }

        System.out.println("\nNumber of arguements:- "+num);
        for (int i=0;i<num;i++){
            System.out.println((i+1)+ ": "+ordinal[i] + " Student Name is:- "+student[i]);
        }
        sc.close();
    }
}

//Practical 3.2
class Rectangle {

    double width, height;

    public Rectangle() {
        width = 1;
        height = 1;
    }

    public Rectangle(double newWid, double newHigh) {
        width = newWid;
        height = newHigh;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Practical3 {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 3.59);

        System.out.println("The details of first Rectangle : ");
        System.out.println("Width of the Rectangle1:- " + r1.width);
        System.out.println("Height of the Rectangle1:- " + r1.height);
        System.out.println("Area of the Rectangle1:- " + r1.getArea());
        System.out.println("Perimeter of the Rectangle1:- " + r1.getPerimeter());

        System.out.println();

        System.out.println("The details of second Rectangle : ");
        System.out.println("Width of the Rectangle2:- " + r2.width);
        System.out.println("Height of the Rectangle2:- " + r2.height);
        System.out.println("Area of the Rectangle2- " + r2.getArea());
        System.out.println("Perimeter of the Rectangle2:- " + r2.getPerimeter());
    }
}

//Practical 3.3
class CartesianPoint {
    int x, y;
    CartesianPoint(int a) {
        x = y = a; 
    }
    CartesianPoint(int a, int b) {
        x = a;
        y = b;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public void move(int a) {
        x = y = a;
    }
    public void move(int a, int b) {
        x = a;
        y = b;
    }
    public void display() {
        System.out.println("Point(x,y) = (" + x + "," + y + ")");
    }
}
public class Practical3 {
    public static void main(String[] args) {
        CartesianPoint cp1 = new CartesianPoint(5,10);
        CartesianPoint cp2 = new CartesianPoint(5);

        System.out.print("Point1:- ");
        cp1.display();

        System.out.print("Point2:- ");
        cp2.display();

        cp1.move(5);
        cp2.move(6,25);

        System.out.print("After move 5 point1:- ");
        cp1.display();

        System.out.print("After move (6,25) point2:- ");
        cp2.display();

    }
}

//Practical 3.4
import java.util.*;
public class Practical3 {
    public static void main(String[] args) {
        Practical3 obj = new Practical3();
        obj.getData();
        obj.putData();
    }
    private String name;
    private double salary;
    public void getData() {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Your Name:- ");
        name = s1.nextLine();
        System.out.print("Enter Your Salary:- ");
        salary = s1.nextDouble();
        s1.close();
    }
    public void putData() {
        System.out.println("Name:- " + name + "\nSalary:- " + salary);
    }
}

//Practical 3.5
public class Time {
    public static void main(String[] args) {
        Time T1 = new Time();
        Time T2 = new Time();
        Time T3 = new Time();

        T1.getTime(2, 40);
        System.out.println("Time T1:- ");
        T1.showTime();

        T2.getTime(1, 30);
        System.out.println("Time T2:- ");
        T2.showTime();

        T3.sum(T1, T2);
        System.out.println("Time T3:- ");
        T3.showTime();

    }
    int h, m;
    public void getTime(int hour, int min) {
        h = hour;
        m = min;
    }
    public void showTime() {
        System.out.println("Hour:- " + h + "\nMinute:- " + m);
    }
    public void sum(Time T1, Time T2) {
        m = T1.m + T2.m;
        h = m / 60;
        m = m % 60;
        h = h + T1.h + T2.h;
    }
}

//Practical 3.6
class Point {
    int x, y;
    Point() {
        x = y = 5;
    }
    Point(int a, int b) {
        x = a;
        y = b;
    }
    Point(Point P) {
        x = P.x;
        y = P.y;
    }
    public void display(){
        System.out.println("Point(x,y):- (" + x + "," + y + ")");
    }
}
public class PointTest {
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        Point p1 = new Point();
        Point p2 = new Point();
        System.out.println("Point1:- ");
        p1.display();
        System.out.println("Copy of Point1:- ");
        System.out.print("Point2:- ");
        p2.display();

        System.out.println("Value assign by Users");
        Point p3 = new Point(6, 29);
        Point p4 = new Point(p3);
        System.out.print("Point3:- ");
        p3.display();
        System.out.println("Copy of Point3");
        System.out.print("Point4:- ");
        p4.display();
    }
}

//Practical 3.7
import java.util.*;

public class Account {
    static int num;
    Scanner s1 = new Scanner(System.in);
    long acId;
    String name;
    long balance;

    public void assign() {
        System.out.print("Enter Account Number:- ");
        acId = s1.nextLong();
        s1.nextLine();
        System.out.print("Enter Name:- ");
        name = s1.nextLine();
        System.out.print("Enter Amount:- ");
        balance = s1.nextLong();
    }

    public void display() {
        System.out.println("Account ID:- " + acId);
        System.out.println("Name:- " + name);
        System.out.println("Balance:- " + balance);
    }

    public void search(long acNum) {
        if (acId == acNum) {
            System.out.println("Account ID:- " + acId);
            System.out.println("Name:- " + name);
            System.out.println("Balance:- " + balance);
            num++;
        }
    }

    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("Enter Total Account:- ");
        int n = s1.nextInt();
        String[] ordinal = { "First", "Second", "Third", "Fourth", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth",
                "Tenth" };
        Account[] b;
        b = new Account[n];

        for (int i = 0; i < n; i++) {
            b[i] = new Account();
            b[i].assign();
        }

        for (int i = 0; i < n; i++) {
            System.out.println(ordinal[i] + " Account");
            b[i].display();
        }

        System.out.println("Enter account number which you want to find : ");
        long account_num = s1.nextLong();
        num = 0;

        for (int i = 0; i < n; i++) {
            b[i].search(account_num);
        }

        if (num == 0) {
            System.out.println("Account doesn't exist");
        }
        s1.close();
    }
}