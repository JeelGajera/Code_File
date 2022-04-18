//Practical 7.1
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Practical7 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Invalid String \n" + "Format: java Practical1.java word filename");
        }
        File filename = new File(args[1]);
        if(!filename.exists()) {
            System.out.println(args[1]+ " does not exist.");
        }
        String s = "";
        try{
            try (Scanner sc = new Scanner(filename)) {
                while (sc.hasNext()) {
                    s += sc.nextLine();
                }
            }
        } catch (FileNotFoundException e) {
            e.getMessage();
        }
        s = s.replaceAll(args[0], "");
        try{
            PrintWriter output = new PrintWriter(filename);
            System.out.println(s);
            output.write(s);
            output.close();
        } catch(FileNotFoundException e) {
            e.getMessage();
        }
        System.out.println("We are Done.");
    }
}

//Practical 7.2
import java.io.*;
import java.util.*;

public class Practical7 {
 public static void main(String[] args) throws FileNotFoundException {
     if(args.length != 1) {
         System.out.println("Usage: java filename");
         System.exit(1);
     }
     File file = new File(args[0]);
     if(!file.exists()) {
         System.out.println("File " + args[0] + " does not exist.");
         System.exit(2);
     }
     int characters = 0;
     int words = 0;
     int lines = 0;
     try (Scanner sc = new Scanner(file)) {
         while (sc.hasNext()) {
             lines++;
             String line = sc.nextLine();
             characters += line.length();
         }
    } 
    try(Scanner sc  = new Scanner(file)) {
        while (sc.hasNext()) {
            String line = sc.next();
            words++;
        }
    }
     System.out.println("File " + file.getName() + " has");
     System.out.println("characters: " + characters);
     System.out.println("Words: " + words);
     System.out.println("Lines: " + lines);
 }
}

//Practical 7.3
import java.util.*;
import java.io.*;

public class Practical7 {
	public static void main(String[] args) throws Exception {
		File file = new File("File1.txt");
		if (file.exists()) {
			System.out.println("File already exists");
		}

		try (
			PrintWriter output = new PrintWriter(file);
		) {
			for (int i = 0; i < 100; i++) {
				output.print(((int)(Math.random() * 500) + 1) + " ");
			}
		}

		ArrayList<Integer> list = new ArrayList<>();

		try(
			Scanner input = new Scanner(file);
		) {
			while (input.hasNext()) {
				list.add(input.nextInt());
			}
		}
		Collections.sort(list);
		System.out.print(list.toString());
		System.out.println();
	}
}