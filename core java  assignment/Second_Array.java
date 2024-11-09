import java.util.Arrays;
import java.util.Scanner;
class Second_array {
    
    // function to find the second largest element
    static int getSecondLargest(int[] arr) {
        int n = arr.length;
        
        // Sort the array in non-decreasing order
        Arrays.sort(arr);
        
        // start from second last element as last element is the largest
        for (int i = n - 2; i >= 0; i--) {
            
            // return the first element which is not equal to the 
            // largest element
            if (arr[i] != arr[n - 1]) {
                return arr[i];
            }
        }
        
        // If no second largest element was found, return -1
        return -1;
    }

    public static void main(String[] args) {
        int n;  
        Scanner sc=new Scanner(System.in);  
        System.out.print("Enter the number of elements you want to store: ");  
 
    n=sc.nextInt();  
   
    int[] array = new int[n];  
    System.out.println("Enter the elements of the array: ");  
    for(int i=0; i<n; i++)  
    {     
 
    array[i]=sc.nextInt();  
    }  
    System.out.println("Array elements are: ");  
   
    for (int i=0; i<n; i++)   
    {  
    System.out.print(array[i]+" ");  
    }  
    System.out.println();
        System.out.println("Second largest element of the array is :: "+getSecondLargest(array));
    }
}