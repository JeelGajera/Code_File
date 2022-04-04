//Practical 5.1
abstract class Shape {
    float side1, side2, radius;
    abstract float area();
}

class Triangle extends Shape {
    Triangle(float s1, float s2) {
        side1 = s1;
        side2 = s2;
    }

    float area() {
        System.out.print("Area of Triangle: ");
        return (side1 * side2) / 2;
    }
}

class Rectangle extends Shape {
    Rectangle(float s1, float s2) {
        side1 = s1;
        side2 = s2;
    }

    float area() {
        System.out.print("Area of Rectangle: ");
        return (side1 * side2);
    }
}

class Circle extends Shape {
    Circle(float r1) {
        radius = r1;
    }

    float area() {
        System.out.print("Area of Circle: ");
        return 3.14f * radius * radius;
    }
}

public class Practical5 {
    public static void main(String[] args) {
        Triangle t = new Triangle(3.4f, 4.3f);
        Rectangle r = new Rectangle(2.5f, 5.2f);
        Circle c = new Circle(10.4f);

        System.out.println(t.area());
        System.out.println(r.area());
        System.out.println(c.area());

    }
}

//Practical 5.2
interface I1 {

}

interface I2 {

}

interface I3 extends I1, I2 {

}

interface I4 {

}

class X implements I3 {

}

class W extends X implements I4 {

}

public class Practical5 {
    public static void main(String[] args) {
        W obj = new W();

        if (obj instanceof I1)
            System.out.println("W implements I1");
        if (obj instanceof I2)
            System.out.println("W implements I2");
        if (obj instanceof I3)
            System.out.println("W implements I3");
        if (obj instanceof I4)
            System.out.println("W implements I4");
        if (obj instanceof X)
            System.out.println("W extends X");
    }
}

//Practical 5.3
interface Exam {
    boolean Pass(int mark);
}

interface Classify {
    String Division(int average);
}

class Result implements Exam, Classify {
    int mark;

    Result(int m1) {
        mark = m1;
    }

    public String Division(int average) {
        if (average >= 60)
            return "First";
        if (average >= 50 && average < 60)
            return "Second";

        return "No division";
    }

    public boolean Pass(int mark) {
        if (mark >= 50)
            return true;
        else
            return false;
    }
}

public class Practical5 {
    public static void main(String[] args) {
        Result r1 = new Result(55);
        System.out.println(r1.Pass(55));
        System.out.println(r1.Division(60));
    }
}