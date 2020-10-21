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
        
        /*
        System.out.println("Unsorted:");
        for (Integer num: numbers) {
            System.out.println(num);
        }
        */
        
        System.out.println("Sorted:");
        selectionSort(numbers);
        for (Integer num: numbers) {
            System.out.println(num);
        }
    }
    
    public static void selectionSort(ArrayList<Integer> a) {
        //go through every index from right to left, ignor the last one as it will just end up as being the largest
        for (int i = 0; i < a.size() - 1; i++) {
            //find the smallest remaining one, start after what is already sorted (at the left/begining)
            for (int j = i + 1; j < a.size(); j++) {
                if (a.get(i) > a.get(j)) {
                    swap(a, j, i);
                }
            }
        }
    }
    
    public static void swap(ArrayList<Integer> a, int n, int m) {
        a.set(m, a.set(n, a.get(m)));
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
