// Practical 1.2
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("Welcome to Java, Learning Java Now and Programming is fun");
//     }
// }

// Practical 1.3
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("1) 3.4X + 50.2Y = 44.5 \n2) 2.1X + 0.55Y = 5.9");
//         double a = 3.4, b = 50.2, c = 2.1, d = 0.55, e = 44.5, f = 5.9, x, y;
//         x = (e*d - b*f)/(a*d - b*c);
//         y = (a*f - e*c)/(a*d - b*c);
//         System.out.println("X= "+ x);
//         System.out.println("Y= "+ y);
//     }
// }

// Practical 1.4
// import java.util.Scanner;
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("Enter length in meter(m): ");
//         Scanner in = new Scanner(System.in);
//         float inLength = in.nextFloat();
//         double len = inLength*3.2808399;
//         System.out.println("Length in Feet: " + len + "feet");
//         in.close();
//     }
// }

// Practical 1.5
// import java.util.Scanner;
// import java.lang.Math;
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("Enter your Weight(pound) And Height(inch)");
//         Scanner in = new Scanner(System.in);
//         System.out.println("Weight:- ");
//         float weight = in.nextFloat();
//         System.out.println("Height:- ");
//         float height = in.nextFloat();     
//         double pound = 0.45359237, inch = 0.0254;   
//         double BMI = weight*pound/Math.pow(2, height*inch); 
//         System.out.println("Your BMI:- " + BMI);
//         in.close();
//     }
// }

// Practical 1.6
// import java.util.Scanner;
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("/** Enter three number **/");
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Num1:- ");
//         int num1 = sc.nextInt();
//         System.out.println("Num2:- ");
//         int num2 = sc.nextInt();
//         System.out.println("Num3:- ");
//         int num3 = sc.nextInt();
//         System.out.println("Decreasing Order of numbers:- ");
//         if(num1>num2 && num2>num3) {
//             System.out.println(num1 + ">" + num2 + '>' + num3);
//         } else if (num2>num1 && num1>num3) {
//             System.out.println(num2 + ">" + num1 + ">" + num3);
//         } else if (num3>num2 && num2>num1) {
//             System.out.println(num3 + ">" + num2 + ">" + num1);
//         } else if (num3>num1 && num1>num2) {
//             System.out.println(num3 + ">" + num1 + ">" + num2);
//         } else if (num1>num3 && num3>num2) {
//             System.out.println(num1 + ">" + num3 + ">" + num2);
//         }
//         sc.close();
//     }
// }

// Practical 1.7
// import java.util.Scanner;
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("Enter a Letter:- ");
//         Scanner sc = new Scanner(System.in);
//         char let = sc.next().charAt(0);
//         switch (let) {
//             case ('a'):
//             case ('e'):
//             case ('i'):
//             case ('o'):
//             case ('u'):
//                 System.out.println(let + " is a Vowel.");
//                 break;
//             default: 
//                 System.out.println(let + " is a Constant.");
//         }
//         sc.close();
//     }
// }

// Practical 1.8
// import java.util.Scanner;
// class Practice {
//     public static void main(String[] args) {
//         System.out.println("Enter a amount you want to withdraw:-");
//         Scanner sc = new Scanner(System.in);
//         int amount = sc.nextInt();
//         System.out.println("Notes Require Of 100₹:- " + amount/100);
//         System.out.println("Notes Require Of 50₹:- " + (amount%100)/50);
//         System.out.println("Notes Require Of 10₹:- " + ((amount%100)%50)/10);
//         System.out.println("Notes Require Of 5₹:- " + (((amount%100)%50)%10)/5);
//         System.out.println("Notes Require Of 2₹:- " + ((((amount%100)%50)%10)%5)/2);
//         System.out.println("Notes Require Of 1₹:- " + (((((amount%100)%50)%10)%5)%2));
//         sc.close();
//     }
// } 

// Practical 1.9
// import java.util.Scanner;
// class Practical {
//     public static void main(String[] args) {
//         System.out.println("Enter a 5 Digit Number:-");
//         Scanner sc = new Scanner(System.in);
//         double num = sc.nextDouble();
//         System.out.println("Number incressing by 1 per digit:- " + (num + 11111));
//         sc.close();
//     }
// }

// Practical 1.10
// import java.util.Scanner;
// import java.lang.Math;
// class Practical {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter 3 side of triangle");
//         System.out.println("Side1:- ");
//         float side1 = sc.nextFloat();
//         System.out.println("Side2:- ");
//         float side2 = sc.nextFloat();
//         System.out.println("Side3:- ");
//         float side3 = sc.nextFloat();
//         double S = (side1 + side2 + side3)/2;
//         System.out.println("Area of Triangle:- " + Math.sqrt(S*(S-side1)*(S-side2)*(S-side3)));
//         sc.close();
//     }
// }

// Practical 1.11 (A)
// class Practical {
//     public static void main(String[] args) {
//         int i, j, n = 5;
//         for (i = 1; i < n; i++) {
//             for (j = i; j < n; j++) 
//                 System.out.print("*");
//             System.out.print("\n");
//         }
//     }
// }

// Practical 1.11 (B)
// class Practical {
//     public static void main(String[] args) {
//         int i, j, n = 5;
//         for (i = 1; i < n; i++) {
//             for (j = i; j < n; j++)
//                 System.out.print(j);
//             System.out.print("\n");
//         }
//     }
// }

// Practical 1.11 (C)
// class Practical {
//     public static void main(String[] args) {
//         int n = 4, i, j, space = 1;
//         space = n - 1;
//         for (i = 1; i <= n; i++) {
//             for (j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }
//             space--;
//             for (j = 1; j <= 2 * i - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//         space = 1;
//         for (i = 1; i <= n - 1; i++) {
//             for (j = 1; j <= space; j++) {
//                 System.out.print(" ");
//             }
//             space++;
//             for (j = 1; j <= 2 * (n - i) - 1; j++) {
//                 System.out.print("*");
//             }
//             System.out.println("");
//         }
//     }
// }

// Practical 1.11(D)
// class Practical {
//     public static void main(String[] args) {
//         int i, j, k = 1;
//         for (i = 4; i > 0; i--) {
//             for (j = 0; j < i; j++, k++) {
//                 if (k < 10) {
//                     System.out.print(k);
//                 } else {
//                     k = 0;
//                     System.out.print(k);
//                 }
//             }
//             System.out.println("");
//         }
//     }
// }