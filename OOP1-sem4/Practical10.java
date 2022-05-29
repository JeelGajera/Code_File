//Practical 10.1
import java.util.*;

public class Practical10 {
    public static String dec2Bin(int value) {
        String res = "";
        return dec2Bin(value, res);
    }
    public static String dec2Bin(int value, String res) {
        if(value / 2 == 0) 
            return (value % 2) + res;
        else 
            return dec2Bin(value /2 , (value % 2) + res);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number:- ");
        int num = sc.nextInt();
        System.out.println("The binary of " + num + " is:- " + dec2Bin(num));
        sc.close();
    }
}

//Practical 10.2
import java.util.*;

public class Practical10 {
    public static <E> ArrayList<E> removeDuplicate(ArrayList<E> list) {
        ArrayList<E> newList = new ArrayList<>(list.size());
        for(E lVar : list) {
            if(!newList.contains(lVar))
                newList.add(lVar);
        }
        return newList;
    }

    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0; i<3; i++) {
            str.add("Java");
        }
        str.add("hello");
        System.out.println(str);
        str = removeDuplicate(str);
        for (String s : str)
            System.out.print(s + " ");
    }
}

//Practical 10.3
public class Practical10 {
    public static <E extends Comparable<E>> int binarySearch(E[] list, E val) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high - low) / 2 + low;
            if(list[mid].compareTo(val) == 0 )
                return mid;
            if(list[mid].compareTo(val) < 0)
                low = mid + 1;
            else 
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] list = new Integer[10];
        for(int i = 0; i < 10; i++) {
            list[i] = i;
        }
        for(int arr : list) {
            System.out.print(arr + " ");
        }
        System.out.println();
        for (int i = 0; i < list.length; i++) {
            System.out.println("Max:- " + binarySearch(list, i));
        }
    }
}