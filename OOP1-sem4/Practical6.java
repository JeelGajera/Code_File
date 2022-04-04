//Practical 6.1
class MyException extends Exception {
    private int ex;

    MyException(int b) {
        ex = b;
    }

    public String toString() {
        return "My Exception:- Number isn't divided by " + ex;
    }
}

public class Practical6 {
    static void divide(int a, int b) throws MyException {
        if (b <= 0) {
            throw new MyException(b);
        } else {
            System.out.println("Division : " + a / b);
        }
    }

    public static void main(String[] args) {
        try {
            divide(11, 0);
        } catch (MyException err) {
            System.out.println(err);
        }
    }
}

//Practical 6.2
import java.util.Scanner;

class DivideException extends Exception {
    private int ex;

    DivideException(int b) {
        ex = b;
    }

    public String toString() {
        return "My Exception:- Number isn't divided by " + ex;
    }
}

public class Practical6 {
    static int divide(int val, int b) throws DivideException {
        if (b <= 0) {
            throw new DivideException(b);
        } else
            return val / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int[] arr = new int[] { 10, 20, 30, 40 };
            System.out.println("Enter the index of array to divide that value");
            int ch = sc.nextInt();
            System.out.println("The value at index " + ch + " is : " + arr[ch]);
            System.out.println("Enter the value with you want to divide");
            int b = sc.nextInt();
            int c = divide(arr[ch], b);
            System.out.println("The division is : " + c);
        } catch (DivideException e) {
            System.out.println(e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Size of index is out of range");
        } finally {
            System.out.println("End of the programme");
        }
        sc.close();
    }
}

//Practical 6.3
import java.util.Scanner;

public class Bank {
    float bal;

    void deposit(float amount) {
        bal = amount;
    }

    void withdraw(float money) throws Exception {
        float newbal = bal - money;
        if (newbal <= 0) {
            throw new Exception("Not sufficient Fund");
        } else {
            bal = newbal;
            System.out.println("Balance After withdraw:- " + bal);
        }
    }

    public static void main(String[] args) {
        Bank b = new Bank();
        b.deposit(1000f);
        while (true) {
            try {
                float money;
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter amount you want to withdraw:- ");
                money = sc.nextInt();
                System.out.println("Withdrawing amount:- " + money);
                b.withdraw(money);
            } catch (Exception e) {
                System.out.println(e.getMessage());
                break;
            }
        }
    }
}

//Practical 6.4
import java.util.Scanner;

public class Practical6 {
    public static double average(String[] str) throws NullPointerException, NumberFormatException {
        int n = str.length;
        double avg = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            double x = Double.parseDouble(str[i]);
            avg = avg + x;
            count++;
        }
        avg = avg / count;
        return avg;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] str = new String[5];
        for (int i = 0; i < str.length; i++) {
            System.out.print("Enter String " + (i + 1) + ":- ");
            if (i == 0) {
                continue;
            }
            str[i] = sc.nextLine();
        }
        try {
            double average = average(str);
            System.out.println("Average is : " + average);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        sc.close();
    }
}

//Practical 6.5
public class Practical6 {
    public static void custom(String[] args) throws customException {
        if (Integer.parseInt(args[0]) == 0) {
            throw new customException();
        } else {
            for (String arg : args) {
                System.out.println(arg);
            }
        }
    }

    public static void main(String[] args) {
        try {
            custom(args);
        } catch (customException e) {
            System.out.println(e);
        }
    }
}
class customException extends Exception {
    public String toString() {
        return "Custom Exception:-  First command line argument is 0";
    }
}

//Practical 6.6
import java.util.Scanner;

class markException extends Exception {
    public String toString() {
        return "Illegal Mark";
    }
}

public class IllegalMarkException {
    public static void marklist() throws markException {
        Scanner sc = new Scanner(System.in);
        String s;
        String name;
        double sum = 0;
        int regNo;
        int[] mark = new int[3];
        System.out.print("Enter the Name of Student:- ");
        name = sc.nextLine();
        System.out.print("Enter the Register Number:- ");
        regNo = sc.nextInt();
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the Marks of subject " + (i + 1) +":- ");
            mark[i] = sc.nextInt();
            sum = sum + mark[i];
        }
        for (int j = 0; j < 3; j++) {
            if (mark[j] < 0) {
                throw new markException();
            }
        }
        int avg = (int) sum / 3;
        if (avg <= 40) {
            s = "FAIL";
        } else {
            s = "PASS";
        }
        System.out.println("</== Mark List ==/>");
        System.out.println("Name : " + name);
        System.out.println("Register No: " + regNo);
        System.out.println("Average marks : " + avg);
        System.out.println("Status : " + s);
    }

    public static void main(String[] args) {
        try {
            marklist();
        } catch (markException e) {
            System.out.println(e);
        }
    }
}

// Practical 6.7
import Student.*;

class Practical6 {
    public static void main(String args[]) {
        Student s = new Student(7080, "Oggy", 56, 65, 87, 78, 93);
        s.getStudent();
    }
}

//Student/Student.java
package Student;

import Exam.*;

public class Student extends Result {
    private int enNo;
    private String name;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;

    public Student() {
        this.enNo = 0;
        this.name = "undefine";
        this.m1 = 0;
        this.m2 = 0;
        this.m3 = 0;
        this.m4 = 0;
        this.m5 = 0;
    }

    public Student(int enNo, String name, int m1, int m2, int m3, int m4, int m5) {
        this.enNo = enNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    public int getTotal() {
        return (this.m1 + this.m2 + this.m3 + this.m4 + this.m5);
    }

    public int getAverage() {
        return ((this.m1 + this.m2 + this.m3 + this.m4 + this.m5) / 5);
    }

    public void getStudent() {
        System.out.println("</== Result ==/>");
        System.out.println("Name:- " + this.name);
        System.out.println("Enrollment:- " + this.enNo);
        System.out.println("Mark Sub 1:- " + this.m1);
        System.out.println("Mark Sub 2:- " + this.m2);
        System.out.println("Mark Sub 3:- " + this.m3);
        System.out.println("Mark Sub 4:- " + this.m4);
        System.out.println("Mark Sub 5:- " + this.m5);
        System.out.println("Average:- " + this.getTotal());
        System.out.println("Total:- " + this.getAverage());
        String x = this.pass(this.getTotal()) ? "PASS" : "FAIL";
        System.out.println("Result:- " + x);
        System.out.println("Division:- " + this.division(this.getAverage()));
        System.out.println("<== // ==>");
    }
}
//Exam/Result.java
package Exam;

interface Exam {
    public boolean pass(int mark);
}

interface Classify {
    public String division(int average);
}

public class Result implements Exam, Classify {
    public boolean pass(int mark) {
        return (mark >= 50);
    }

    public String division(int average) {
        String d = "undefine";
        if (average >= 60)
            d = "First";
        else if (average >= 50)
            d = "Second";
        else
            d = "No division";
        return (d);
    }
}


//Practical 6.8
//Apack/A.java
package Apack;

public class A {
    protected int x;
    private int y;
    public int z;

    public A() {
        this.x = 10;
        this.y = 20;
        this.z = 30;
    }

    public A(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return (this.x);
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return (this.y);
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return (this.z);
    }

    public void setZ(int z) {
        this.z = z;
    }
}
//Bpack/B.java
package Bpack;

import Apack.*;

public class B extends A {
    public void display() {
        System.out.println("</== Package-B ==/>");
        System.out.println("protected x : " + x);
        //System.out.println("private y : "+y); //ERROR : Can't Inherite private variable
        System.out.println("private y : " + getY());
        System.out.println("public z : " + z);
        System.out.println("</== ***** ==/>\n");
    }
}
//CPack/C.java
package Cpack;

import Apack.*;

public class C {
    public void display() {
        System.out.println("</== Package-C ==/>");
        A obj = new A();
        System.out.println("protected x : " + obj.getX());
        System.out.println("private y : " + obj.getY());
        System.out.println("public z : " + obj.getZ());
        System.out.println("</== ***** ==/>\n");
    }
}
//Dpack/ProtectedDemo.java
package Dpack;

import Bpack.*;
import Cpack.*;

public class ProtectedDemo {
    public static void main(String args[]) {
        B objB = new B();
        objB.display();
        C objC = new C();
        objC.display();
    }
}

