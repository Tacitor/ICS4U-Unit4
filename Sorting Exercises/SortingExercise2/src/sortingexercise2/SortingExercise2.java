/*
 * Lukas Krampiz
 * Oct 21, 2020
 * Bubble Sort
 */
package sortingexercise2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lukra1175
 */
public class SortingExercise2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> words = loadFile();
        bubbleSort(words);
        
        for (int i = 0; i < words.size(); i++) {
            System.out.println(words.get(i));
        }
        
    }
    
    public static void bubbleSort(ArrayList<String> a) {
        int bottom = a.size() - 1;
        boolean swch = true;
        while (swch) {            
            swch = false;
            for (int j = 0; j < bottom; j++) {
                if (a.get(j).compareTo(a.get(j + 1)) > 0) {
                    swap(a, j, j + 1);
                    swch = true;
                }
            }
            bottom--;
        }
    }
    
    public static void swap(ArrayList a, int n, int m) {
        a.set(m, a.set(n, a.get(m)));
    }
    
    protected static ArrayList<String> loadFile() {
        ArrayList<String> array = new ArrayList();
        String adr = "src\\sortingexercise2\\randomWords.txt";

        try {
            File file = new File(adr);
            Scanner scanner = new Scanner(file);

            //load up
            while (scanner.hasNextLine()) {

                array.add(scanner.nextLine());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        return array;
    }
    
}
