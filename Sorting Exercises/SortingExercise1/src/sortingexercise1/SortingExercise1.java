/*
 * Lukas Krampitz
 * Oct 21, 2020
 * Selection Sort
 */
package sortingexercise1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class SortingExercise1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> numbers = loadFile();
        
        System.out.println("Unsorted:");
        for (Integer num: numbers) {
            System.out.println(num);
        }
        
        System.out.println("Sorted:");
        selectionSort(numbers);
    }
    
    public static void selectionSort(ArrayList<Integer> a) {
        int indexSmall;
        //test every inxex
        for (int i = 0; i < a.size(); i++) {
            //find the smallest one, ignor the first element as it is already 
            for (int j = 1; j < a.size(); j++) {
                
            }
        }
    }
    
    protected static ArrayList<Integer> loadFile() {
        ArrayList<Integer> nums = new ArrayList();
        String adr = "src\\sortingexercise1\\randomNumbers.txt";

        try {
            File file = new File(adr);
            Scanner scanner = new Scanner(file);

            //load up
            while (scanner.hasNextLine()) {

                nums.add(Integer.parseInt(scanner.nextLine()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        return nums;
    }
    
}
