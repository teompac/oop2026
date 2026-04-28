package lab10_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingDemo {
    private ArrayList<String> fruits;

    public SortingDemo(String filename) {
        fruits = new ArrayList<>();
        try {
            File file = new File(filename);
            Scanner reader = new Scanner(file);
            while (reader.hasNext()) {
                String data = reader.next();
                if (!data.isEmpty()) {
                    fruits.add(data);
                }
            }
            reader.close();
            System.out.println("Successfully loaded " + fruits.size() + " fruits.");
        } catch (FileNotFoundException e) {
            System.out.println("Error: The file '" + filename + "' was not found.");
            e.printStackTrace();
        }
    }
    public void printFruits(){
        for(String fruits: fruits){
            System.out.println(fruits + " ");
        }
    }
    public void sortAlphabetically(){
        Collections.sort(fruits);
    }
    public void sortReverseAlphabetically(){
        Collections.sort(fruits,Collections.reverseOrder());
    }
}
