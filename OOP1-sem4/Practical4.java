//Practical 4.1
import java.util.*;

public class Practical4 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        for (int i = 1; i < 6; i++) {
            System.out.print("Enter word no " + i + ":- ");
            String str = s1.nextLine(), reverseStr = "";

            for (int j = (str.length() - 1); j >= 0; --j) {
                reverseStr += str.charAt(j);
            }

            if (str.toLowerCase().equals(reverseStr.toLowerCase())) {
                System.out.println(str + " is a Palindrome String.");
            } else {
                System.out.println(str + " is not a Palindrome String.");
            }
        }
        s1.close();
    }
}

//Practical 4.2
import java.util.*;

class SavingAccount extends BankAccount {
    public void savingAc() {
        System.out.print("Enter Account  Name:- ");
        s1.nextLine();
        String sname = s1.nextLine();
        System.out.print("Enter Account Number:- ");
        acNum = s1.nextLong();
        System.out.print("Enter Amount:- ");
        balance = s1.nextLong();
        System.out.println(" === SavingAccount Details === ");
        System.out.println("Account Type:- SavingAccount \n" + "Account No:- " + acNum + "Name:- " + sname + "\n"
                + "Amount:- " + balance);
    }
}

class FixedDepositAccount extends BankAccount {
    public void fixDeposit() {
        System.out.print("Enter Account  Name:- ");
        s1.nextLine();
        String fname = s1.nextLine();
        System.out.print("Enter Account Number:- ");
        acNum = s1.nextLong();
        System.out.print("Enter FixDeposite:- ");
        long fixDeposit = s1.nextLong();
        System.out.println(" === FixedDepositAccount Details === ");
        System.out.println("Account Type:- FixedDepositAccount \n" + "Name:- " + fname + "\n" + "Fix Deposite:- "
                + fixDeposit);
    }
}

public class BankAccount {
    static long acNum;
    static String acName;
    static double balance;
    static Scanner s1 = new Scanner(System.in);

    public static void openAccount() {
        System.out.print("Enter Your Name:- ");
        s1.nextLine();
        acName = s1.nextLine();
        System.out.print("Enter Account Number:- ");
        acNum = s1.nextLong();
        System.out.print("Enter Amount:- ");
        balance = s1.nextLong();

    }

    public static void deposit() {
        System.out.print("Enter Amount to Add:- ");
        long amt = s1.nextLong();
        balance += amt;
        System.out.println("Total Balance:- " + balance);
    }

    public static void ckeckBalance() {
        System.out.println("Your Current Amount:- " + balance);
    }

    public static void withdraw() {
        System.out.print("Enter Amount to Withdraw:- ");
        long with = s1.nextLong();
        balance -= with;
        System.out.println("Total Balance:- " + balance);
    }

    public static void calInterest() {
        System.out.print("Enter Interest Rate:- ");
        double rate = s1.nextDouble();
        System.out.print("Enter Time(years):- ");
        double time = s1.nextDouble();
        System.out.println("Simple Interest:- " + (balance * rate * time) / 100);
    }

    public static void main(String[] args) {
        int ch;
        do {
            System.out.println("/ === Select Operation === /");
            System.out.println("1. Account Open \n" + "2. Deposite \n" + "3. Withdraw \n" + "4. checkBalance \n"
                    + "5. Saving Account Detail \n" + "6. FixedDeposite Account Detail \n" + "7. Interest Calculate \n"
                    + "8. Log Out Account");
            System.out.print("Enter Your Choice:- ");
            ch = s1.nextInt();
            switch (ch) {
                case 1:
                    openAccount();
                    break;
                case 2:
                    deposit();
                    break;

                case 3:
                    withdraw();
                    break;

                case 4:
                    ckeckBalance();
                    break;

                case 5:
                    SavingAccount obj = new SavingAccount();
                    obj.savingAc();
                    break;

                case 6:
                    FixedDepositAccount fc = new FixedDepositAccount();
                    fc.fixDeposit();
                    break;

                case 7:
                    calInterest();
                    break;

                case 8:
                    System.out.print("Thank You Visit Again :)");
                    break;

                default:
                    System.out.println("Oops!...Enter Valid Choice :)");
                    break;
            }

        } while (ch < 8);
    }
}

//Practical 4.3
public class Practical4 {

    static final double PI = Math.PI;
	void Area(float a)
	{
		float A = a * a;
		System.out.println("Area of the Square: " + A);
	}
	void Area(double a)
	{
		double A = PI * a * a;
		System.out.println("Area of the Circle: " + A);
	}
	void Area(int a, int b)
	{
		int A = a * b;
		System.out.println("Area of the Rectangle: " + A);
	}
    void Area(int a, int b, int c)
	{
		int s = (a+b+c)/2;
        double A = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Area of the Triangle: " + A);
	}
    public static void main(String[] args) {
        Practical4 obj = new Practical4();

		obj.Area(14.5);
		obj.Area(5);
		obj.Area(12, 8);
        obj.Area(3, 4, 5);
    }
}

// Practical 4.4

public class Practical4 {

    static final double PI = Math.PI;
	void Area(float a)
	{
		float V = a * a;
		System.out.println("Volume of the Cube: " + V);
	}
	void Area(double a)
	{
		double V = ((4/3)*PI)*(Math.pow(a, 3));
		System.out.println("Volume of the Sphere: " + V);
	}
	void Area(float a, float b, float c)
	{
		float V = a * b * c;
		System.out.println("Volume of the Rectangular Cube: " + V);
	}
    public static void main(String[] args) {
        Practical4 obj = new Practical4();

		obj.Area(5);
		obj.Area(14.5);
		obj.Area(12, 8, 3);
    }
}

//Practical 4.5
import java.util.*;
class BasicInfo extends Employee {
    void basicInfo() {
        System.out.println(" === Enter BasicInfo of Employee === ");
        System.out.print("Id:- ");
        empId = s1.nextInt();
        System.out.print("Name:- ");
        s1.nextLine();
        empName = s1.nextLine();
        System.out.print("Gender:- ");
        gender = s1.nextLine();
    }
}
class DepartmentInfo extends BasicInfo {
    void deptInfo() {
        System.out.println(" === Enter DepartmentInfo of Employee === ");
        System.out.print("Department Name:- ");
        depName = s1.nextLine();
        System.out.print("Salary:- ");
        salary = s1.nextLong();
        System.out.print("Work:- ");
        s1.nextLine();
        work = s1.nextLine();
    }
}
public class Employee {
    Scanner s1 = new Scanner(System.in);
    int empId;
    String empName;
    String gender;
    String depName;
    long salary;
    String work; 
    public static void main(String[] args) {
        DepartmentInfo emp = new DepartmentInfo();
        emp.basicInfo();
        emp.deptInfo();
        System.out.println(" === Complete Employee Detail ===");
        System.out.println("Employee Name:- " + emp.empName);
        System.out.println("Employee Id:- " + emp.empId);
        System.out.println("Employee Gender:- " + emp.gender);
        System.out.println("Department Name:- " + emp.depName);
        System.out.println("Employee Salary:- " + emp.salary);
        System.out.println("Assign Work:- " + emp.work);
    }
}

//Practical 4.6
import java.util.*;

class Rectangle extends Shape {
    void getdata() {
        System.out.println(" === Rectangle Details ===");
        System.out.print("Enter Height:- ");
        height = s1.nextDouble();
        System.out.print("Enter Base:- ");
        base = s1.nextDouble();
    }

    void display_area() {
        System.out.println("Area Of Rectangle:- " + height * base);
    };
}

class Triangle extends Shape {
    void getdata() {
        System.out.println(" === Triangle Details ===");
        System.out.print("Enter Height:- ");
        height = s1.nextDouble();
        System.out.print("Enter Base:- ");
        base = s1.nextDouble();
    }

    void display_area() {
        System.out.println("Area Of Triangle:- " + (0.5 * height * base));
    }
}

public class Shape {
    static double height, base;
    static Scanner s1 = new Scanner(System.in);
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.getdata();
        t1.display_area();

        Rectangle r1 = new Rectangle();
        r1.getdata();
        r1.display_area();
    }
}
