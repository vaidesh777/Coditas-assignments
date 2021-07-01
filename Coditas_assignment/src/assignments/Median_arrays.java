package assignments;
import java.util.Scanner;

public class Median_arrays {
	 
	
	    public static void main(String[] args) 
	    {
	        Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter number of elements in arrays");
	        int N = s1.nextInt();
	        int[] a1 = new int[ N ];
	        int[] a2 = new int[ N ];
	        System.out.println("Enter "+ N +" elements of array 1");
	        for (int i = 0; i < N; i++)
	            a1[i] = s1.nextInt();
	        System.out.println("Enter "+ N +" elements of array 2");
	        for (int i = 0; i < N; i++)
	            a2[i] = s1.nextInt();
	        int med = median(a1, a2);
	        System.out.println("Median = "+ med);
	     }
	     public static int median(int[] arr1, int[] arr2)
	     {
	         int N = arr1.length;
	         return median(arr1, 0, N -1 , arr2, 0, N - 1);
	     }
	     public static int median(int[] arr1, int l1, int h1, int[] arr2, int l2, int h2)
	     {
	         int mid1 = (h1 + l1 ) / 2;
	         int mid2 = (h2 + l2 ) / 2;
	 
	         if (h1 - l1 == 1)
	             return (Math.max(arr1[l1] , arr2[l2]) + Math.min(arr1[h1] , arr2[h2]))/2;
	         else if (arr1[mid1] > arr2[mid2])
	             return median(arr1, l1, mid1 , arr2, mid2 , h2);    
	         else
	             return median(arr1, mid1 , h1, arr2, l2 , mid2 );    
	     }     
	}


