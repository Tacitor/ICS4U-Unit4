/*
 * Lukas Krampitz
 * Oct 22, 2020
 * Help get the decresing quik sort to work
 */
package sorttest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tacitor
 */
public class SortTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] nums = new int[]{8220, -7247, 7865, 3808, 9500, -3072, 2590, 698, -9962, -5984}; //set the length
        
        System.out.println(Arrays.toString(nums));
        
        quikSortDec(nums, 0, nums.length - 1);
        
        System.out.println(Arrays.toString(nums));
        
    }
    
    protected static int[] loadFile(int[] a, String adr) {

        try {
            File file = new File(adr);
            Scanner scanner = new Scanner(file);

            //load up
            for (int i = 0; i < a.length; i++) {

                a[i] = (Integer.parseInt(scanner.nextLine()));
            }

        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e);
        }

        return a;
    }
    
    public static void quikSortDec(int[] a, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivot = a[(left + right) / 2];
        int i = left;
        int j = right;
        while (i < j) {
            while (a[i] > pivot) {
                i++;
            }
            while (a[j] < pivot) {
                j--;
            }
            if (i <= j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                i++;
                j--;
            }
        }
        quikSortDec(a, left, j);
        quikSortDec(a, i, right);
    }
    
}
