package quicksort;
import java.util.Random;
import java.util.Arrays;

/**
 *
 * @author Sam Brighton
 * Package contains all methods relevant to the quickSort homework3 due on 9.25.17
 * for 333.001 taught by Dr. Whitley
 * 
 * quickSort sorts an array of integers
 * 
 */
public class Quicksort {

    
    public static void main(String[] args) {
        
        // Tester method for quickSort Class
        int stuff[] = new int[25];
        Random rand = new Random();
        
        System.out.println();
        System.out.println("Test Case 1:");
        
        for (int i = 0; i < stuff.length; i++) {
            stuff[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(stuff));
        quickSort(stuff, 0, stuff.length-1);
        randomQuicksort(stuff, 0, stuff.length-1);
        System.out.println(Arrays.toString(stuff));
        
        System.out.println();
        System.out.println("Test Case 2:");
        
        for (int i = 0; i < stuff.length; i++) {
            stuff[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(stuff));
        quickSort(stuff, 0, stuff.length-1);
        randomQuicksort(stuff, 0, stuff.length-1);
        System.out.println(Arrays.toString(stuff));
        
        System.out.println();
        System.out.println("Test Case 3:");
        
        for (int i = 0; i < stuff.length; i++) {
            stuff[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(stuff));
        quickSort(stuff, 0, stuff.length-1);
        randomQuicksort(stuff, 0, stuff.length-1);
        System.out.println(Arrays.toString(stuff));
        
        System.out.println();
        System.out.println("Test Case 4:");
        
        for (int i = 0; i < stuff.length; i++) {
            stuff[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(stuff));
        quickSort(stuff, 0, stuff.length-1);
        randomQuicksort(stuff, 0, stuff.length-1);
        System.out.println(Arrays.toString(stuff));
        
        System.out.println();
        System.out.println("Test Case 5:"); 
        
        for (int i = 0; i < stuff.length; i++) {
            stuff[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(stuff));
        quickSort(stuff, 0, stuff.length-1);
        randomQuicksort(stuff, 0, stuff.length-1);
        System.out.println(Arrays.toString(stuff));
    }
    
    /**
     * Quicksort, sorts a list of integers from p to r
     * with a naive choice of pivot.
     * @param list array to be sorted
     * @param p beginning of the array inclusive
     * @param r end of the array inclusive
     */
    public static void quickSort(int[] list, int p, int r){
        
        if(p < r){
            int q = partition(list, p, r);
            quickSort(list, p, q-1);
            quickSort(list, q+1, r);
        }
        
    }
    
    /**
     * randomQuicksort, sorts a list of integers from p to r
     * with a random choice of pivot.
     * @param list array to be sorted
     * @param p beginning of the array inclusive
     * @param r end of the array inclusive
     */
    public static void randomQuicksort(int[] list, int p, int r){
        
        if(p < r){
            Random quiq = new Random();
            int z = quiq.nextInt(r - p) + p;
            swap(list, z, r);
            int q = partition(list, p, r);
            randomQuicksort(list, p, q-1);
            randomQuicksort(list, q+1, r);
        }
        
    }
    
    /**
     * Partition subproblem, splits the array passed to it.
     * @param list  Array to be parted
     * @param p Beginning of subproblem inclusive
     * @param r end of subproblem inclusive
     * @return the location of the pivot after the part
     */
    private static int partition(int[] list, int p, int r){
        
        int x = list[r]; // x is the pivot
        int i = p-1;
        for(int j = p; j <= r-1; j++){
            if(list[j] <= x){
                i++;
                swap(list, i, j);
            }
        }
        swap(list, i+1, r);
        return i+1;
    }
    
    /**
     * swaps the element at index a with the element at index b in an array of ints
     * @param list array containing the elements that need swapping
     * @param a location of element one
     * @param b location of element two
     */
    public static void swap(int[] list, int a, int b){
        
        int hold = list[a];
        list[a] = list[b];
        list[b] = hold;
    }
    
}
