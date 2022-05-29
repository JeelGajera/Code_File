package Practical11.src;

import java.util.*;

public class Prac3 {
        public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Map<String, String> statesAndCapitals = getData();

        System.out.print("Enter a state: ");
        String state = input.nextLine();

        if (statesAndCapitals.get(state) != null) {
            System.out.println("The capital of " + state + " is "
                    + statesAndCapitals.get(state));
        }input.close();
    }

    public static Map<String, String> getData() {
        Map<String, String> map = new HashMap<>();
        String[][] data = {
                { "Andhra Pradesh", "Amaravati" }, { "Arunachal Pradesh", "Itanagar" },
                { "Assam", "Dispur" }, { "Bihar", "Patna" }, { "Chhattisgarh", "Raipur" },
                { "Goa", "Panaji" }, { "Gujarat", "Gandhinagar" }, { "Haryana", "Chandigarh" },
                { "Himachal Pradesh", "Shimla" }, { "Jharkhand", "Ranchi" }, { "Karnataka", "Bangalore" },
                { "Kerala", "Thiruvananthapuram" }, { "Madhya Pradesh", "Bhopal" }, { "Maharashtra", "Mumbai" },
                { "Manipur", "Imphal" }, { "Meghalaya", "Shillong" }, { "Mizoram", "Aizawl" },
                { "Nagaland", "Kohima" }, { "Odisha", "Bhubaneswar" }, { "Punjab", "Chandigarh" },
                { "Rajasthan", "Jaipur" }, { "Sikkim", "Gangtok" }, { "Tamil Nadu", "Chennai" },
                { "Telangana", "Hyderabad" }, { "Tripura", "Agartala" }, { "Uttar Pradesh", "Lucknow" },
                { "Uttarakhand", "Dehradun" }, { "West Bengal", "Kolkata" }
        };

        for (int i = 0; i < data.length; i++) {
            map.put(data[i][0], data[i][1]);
        }

        return map;
    }
}
