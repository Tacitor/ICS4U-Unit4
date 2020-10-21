/*
 * Lukas Krampiz
 * Oct 21, 2020
 * Insertion Sort
 */
package sortingexercise3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukra1175
 */
public class SortingExercise3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> nums = loadFile();
        
        insertionSort(nums);
        
        for(Integer i : nums) {
            System.out.println(i);
        }
    }
    
    public static void insertionSort(ArrayList<Integer> a) {
        //go through each index, first one is always considered sorted so skip it
        for (int n = 1; n < a.size(); n++) {
            int temp = a.get(n);
            int j = n - 1;
            while (j >= 0 && a.get(j) > temp) {
                a.set(j + 1, a.get(j));
                j = j - 1;
            }
            a.set(j+1, temp);
        }
    }
    
    public static void swap(ArrayList a, int n, int m) {
        a.set(m, a.set(n, a.get(m)));
    }
    
    protected static ArrayList<Integer> loadFile() {
        ArrayList<Integer> array = new ArrayList();
        String adr = "src\\sortingexercise3\\randomNumbers.txt";

        try {
            File file = new File(adr);
            Scanner scanner = new Scanner(file);

            //load up
            while (scanner.hasNextLine()) {

                array.add(Integer.parseInt(scanner.nextLine()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        return array;
    }
    
}
