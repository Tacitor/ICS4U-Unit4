/*
 * Lukas Krampiz
 * Oct 21, 2020
 * 
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
        
        quikSort(nums);
        
        for(Integer i : nums) {
            System.out.println(i);
        }
    }
    
    public static void quikSort(ArrayList<Integer> a) {
        int temp;
        int pivot = (int)(Math.random() * a.size()); //pick a rand point
        System.out.println("oaysudfgkajsdgfkasjvfjvasdhkgfv " + pivot);
        //reagrange the values based on the pivot
        for (int i = 0; i < a.size(); i++) {
            //put all the smaller ones on the left, leave the bigger ones where they are
            if (a.get(pivot) > a.get(i)) {
                //store it
                temp = a.get(i);
                //delete it
                a.remove(i);
                //put it on the correct side
                a.add(pivot - 1, temp);
            }
        }
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
