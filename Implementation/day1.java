// Array Operations-Creation ,Traversal ,Insertion

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class day1 {
    public static void main(String args[]) {
        int n;

        // input the no. from user

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter No. of elements in array: ");
        n = sc.nextInt();

        int a[] = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        // Implemetation of how to create array 
        System.out.print("Elements are: ");
        for(int i = 0; i < n; i++){
            System.out.println(a[i]);
        }
    }



}

