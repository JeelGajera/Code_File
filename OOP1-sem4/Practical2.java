// Practical 2.1
public class Practical2 { 
    // Generate a 6*6 Matrix
    public static void main(String[] args) {
        int[][] matrix = new int[6][6];

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int)(Math.random()*2);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        Odd1r(matrix);
        Odd1c(matrix);

    }

    //odd 1s row implementation
    public static void Odd1r(int m[][]) {
        int numr = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(m[i][j] == 1) {
                    numr++;
                }
            }
            if(numr%2 != 0 ) {
                System.out.println("Row - " + (i + 1) + " have ODD no of 1s");
            }
        }       
    }

    //odd 1s column implementation 
    public static void Odd1c(int m[][]) {
        int numc = 0;
        for(int i = 0; i < m.length; i++) {
            for(int j = 0; j < m[i].length; j++) {
                if(m[j][i] == 1) {
                    numc++;
                }
            }
            if(numc%2 != 0 ) {
                System.out.println("Column - "+(i+1)+" have ODD no of 1s");
            }
        }       
    }
}

// Practical 2.2
import java.util.*;
public class Practical2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        //Input Value Of Matrix
        Scanner s1 = new Scanner(System.in);
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = s1.nextInt();
            }
        }
        s1.close();
        //Display Matrix
        System.out.println("Matrix you entered:- ");
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Max value of Matrix:- " + getMaxValue(matrix));
        System.out.println("Min value of Matrix:- " + getMinValue(matrix));
    }
    // Find Max Value In Matrix
    public static int getMaxValue(int[][] matrix) {
        int maxValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > maxValue) {
                    maxValue = matrix[i][j];
                }
            }
        }
        return maxValue;
    }
    // Find Min Value In Matrix
    public static int getMinValue(int[][] matrix) {
        int minValue = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < minValue) {
                    minValue = matrix[i][j];
                }
            }
        }
        return minValue;
    }
}

// Practical 2.3
import java.util.Arrays;
public class Practical2 {
    public static void main(String[] args) {
        int arr[] = { 10, 34, 12, 3, 45, 67, 21, 5 };
        Arrays.sort(arr);
        int length = removeDuplicate(arr, arr.length);
        for(int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    // Remove Duplicate elements 
    public static int removeDuplicate(int arr[], int n) {
        if(n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];
        int j = 0;
        for(int i = 0; i < n-1; i++) {
            if(arr[i] != arr[i+1]) {
                temp[j] = arr[i];
                j++;
            }
        }
        for(int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }
}

// Practical 2.4
import java.util.*;
public class Practical2 {
    public static void main(String[] args) {
        int[][] arr1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
        int[][] arr2 = { {5, 6, 7}, {1, 2, 0}, {4, 3, 2} };
        System.out.println("</ === Sample Array 1 === />");
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("</ === Sample Array 2 === />");
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
        Scanner s1 = new Scanner(System.in);
        System.out.println("Choose Operation:-");
        System.out.println("Addition : 1" + "\n" + "Subtraction : 2" + "\n" + "Multiplication : 3");
        System.out.print("Input Your Choice :- ");
        int choice = s1.nextInt();
        s1.close();
        switch (choice) {
            case 1:
                additionArr(arr1, arr2);
                break;
            case 2:
                subtractionArr(arr1, arr2);
                break;
            case 3:
                multiplicationArr(arr1, arr2);
                break;
            default:
                System.out.println("Enter choice between 1 to 3");
                break;
        }
    }
    //Addition Of Array
    public static int[][] additionArr(int[][] arr1, int[][] arr2) {
        int[][] addArr = new int[3][3];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                addArr[i][j] = arr1[i][j] + arr2[i][j];
            }
        }
        System.out.println("</ === Addition of Arrays === />");
        for (int i = 0; i < addArr.length; i++) {
            for (int j = 0; j < addArr[i].length; j++) {
                System.out.print(addArr[i][j] + " ");
            }
            System.out.println();
        }
        return addArr;
    }
    //Suntraction Of Array
    public static int[][] subtractionArr(int[][] arr1, int[][] arr2) {
        int[][] subArr = new int[3][3];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                subArr[i][j] = arr1[i][j] - arr2[i][j];
            }
        }
        System.out.println("</ === Subtraction of Arrays === />");
        for (int i = 0; i < subArr.length; i++) {
            for (int j = 0; j < subArr[i].length; j++) {
                System.out.print(subArr[i][j] + " ");
            }
            System.out.println();
        }
        return subArr;
    }
    //Multiplication Of Array
    public static int[][] multiplicationArr(int[][] arr1, int[][] arr2) {
        int[][] multyArr = new int[3][3];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr1[i].length; j++) {
                multyArr[i][j] = arr1[i][j] * arr2[i][j];
            }
        }
        System.out.println("</ === Multiplication of Arrays === />");
        for (int i = 0; i < multyArr.length; i++) {
            for (int j = 0; j < multyArr[i].length; j++) {
                System.out.print(multyArr[i][j] + " ");
            }
            System.out.println();
        }
        return multyArr;
    }
}

// Practical 2.5
public class Practical2 {
    public static void main(String[] args) {
        int[] arr = {2, 64, -5, 12, 9, 15, 43, 89, 34, 44};
        System.out.println("</ Array Before  Sorting />");
        for(int i:arr) {
            System.out.print(i + " ");
        }System.out.println();
        selectionSort(arr);
        System.out.println("</ Array After  Sorting />");
        for(int i:arr) {
            System.out.print(i + " ");
        }
    }
    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for(int i = 0; i < n -1; i++) {
            int minIdx = i;
            for(int j = i+1; j < n; j++) {
                if(arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}

// Practical 2.6
public class Practical2 {
    public static void main(String[] args) {
        String str = "Object Oriented Programming is awesome";
        int vowels = 0, consonants = 0;
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                ++vowels;
            }
            else if (ch >= 'a' && ch <= 'z') {
                ++consonants;
            }
        }
        System.out.println("String: " + str);
        System.out.println("Vowels:- " + vowels);
        System.out.println("Consonants:- " + consonants);
    }
}

// Practical 2.7 
import java.util.*;
public class Practical2 {
    public static void main(String[] args) {
        System.out.println("</ Enter a Two String />");
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        System.out.print("String 1:- ");
        String str1 = s1.nextLine();
        System.out.print("String 2:- ");
        String str2 = s2.nextLine();
        String str = "";
        s1.close();
        s2.close();
        for (int i = 0, j = 0; i <= str1.length()-1 && j <= str2.length()-1;i++,j++) {
            if(str1.charAt(i) != str2.charAt(j)) {
                break;
            }
            str += str1.charAt(i); 
        }
        System.out.println("Common Prefix:- " + str);
    }
}

// Practical 2.8
import java.util.*;
public class Practical2 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("A password must have at least eight characters of only letters and digits, must contain at least two digits");
        System.out.print("Enter Password:- ");
        String password = s1.nextLine();
        s1.close();
        if(validation(password)) {
            System.out.println("Your Password is Valid.");
        } else {
            System.out.println("Your Password isn't Valid.");
        }
    }
    public static boolean validation(String password) {
        int passLen = 8, charCount = 0, numCount = 0;
        if(password.length() < passLen) {
            return false;
        }
        for(int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if(isChar(ch)) {
                charCount++;
            } else if (isNum(ch)) {
                numCount++;
            } else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean isChar(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z');
    }
    public static boolean isNum(char ch) {
        return (ch >= '0' && ch <= '9');
    }
}
