/*
 * Lukas Krampiz
 * Oct 21, 2020
 * Quik Sort
 */
package sortingexercise4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukra1175
 */
public class SortingExercise4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> nums = loadFile();
        
        quikSort(nums, 0, nums.size() - 1);
        
        for(Integer i : nums) {
            System.out.println(i);
        }
    }
    
    public static void quikSort(ArrayList<Integer> a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = a.get((left + right) / 2);
        int i = left;
        int j = right;
        while (i < j) {
            while (a.get(i) < pivot) i++;
            while (a.get(j) > pivot) j--;
            if (i <= j) {
                int temp = a.get(i);
                a.set(i, a.get(j));
                a.set(j, temp);
                i++;
                j--;
            }
        }
        quikSort(a, left, j);
        quikSort(a, i, right);
    }
    
    public static void swap(ArrayList a, int n, int m) {
        a.set(m, a.set(n, a.get(m)));
    }
    
    protected static ArrayList<Integer> loadFile() {
        ArrayList<Integer> array = new ArrayList();
        String adr = "src\\sortingexercise4\\randomNumbers.txt";

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
