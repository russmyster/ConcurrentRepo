package personal.algorithms;
/*
Author: Russell S.
Title: Radix Sort algorithm
Description: Understanding how to use the Radix Sort algorithm.
 */

import java.io.*;
import java.util.*;


public class radix_sort
{

    static int getMax(int arr[], int l)
    {
        for (int i = 0; i < l; i++) 
        { 
            arr[i] = arr[i] + 100000; 
        } 

        int mx = arr[0];
        for (int i = 1; i < l; i++)
        {
            if (arr[i] > mx)
            {
                mx = arr[i];
            }
        } return mx;
    }

    // counts sorts according to significant digit being observed for
    // any given element from arr[], of size l
    static void countSort(int arr[], int l, int exp)
    {
        int output[] = new int[l]; // output array
        int i;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        
        // Initialize i to 0, begin storing counts of modulo remainder operands
        for (i = 0;i < l; i++)
        {
            count[(arr[i] / exp) % 10]++;
        }

        // count[i] signifies the significant digit being observed for any given element
        for (i = 1; i < 10; i++)
        {
            count[i] += count[i - 1];
        }

        // output array construction + count[i] reduction
        for (i = l - 1; i >= 0; i--)
        {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // take values from output array construction (above) and then
        // store values in arr[], sorted by the significant digit being observed
        for (i = 0; i < l; i++)
        {
            arr[i] = output[i];
        }
    }




    // Interconnected sort function that sorts an arr[], of size l
    // while making use of getMax and countSort dependencies (coded above)
    static void radixsort(int arr[], int l)
    {
        int m = getMax(arr, l);

        for (int exp = 1; m / exp > 0; exp *= 10)
        {
            countSort(arr, l, exp);
        }
    }

    // Utility function to print our array
    static void print(int arr[], int l)
        {
            for (int i = 0; i < l; i++) 
            { 
                arr[i] = arr[i] - 100000; 
            } 

            for(int i = 0; i < l; i++)
            {
                System.out.print(arr[i] + " ");
            }
        }

    //Main driver method
    public static void main(String[] args)
    {
        //Arbitrary array
        int arr[]={ 34, 153, 7, 26, 81, 4, 19, 831, 1831, 8310, 1, 21, 35, 13};
        //int arr[]={ 170, 45, 75, 90, 802, 24, 2, 66};

        int l = arr.length;

        //Function call
        radixsort(arr, l);
        print(arr, l);

        /* Example test
        int x = 3;
        System.out.println(x + " is the value of x");
        */

        //System.out.println(l + " is the arr length");
    }
}
