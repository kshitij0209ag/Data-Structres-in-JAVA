// Array Operations-Creation ,Traversal ,Insertion

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class day1 {
    public static void main(String args[]) {
        int n,m,p;

        // input the no. from user

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter No. of elements in array: ");
        n = sc.nextInt();

        int a[] = new int[n];
        int b[] = new int[n+1];

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        System.out.print("Enter Index of new Value to be Inserted");
        m = sc.nextInt();
        System.out.print("Enter new Value to be Inserted");
        p = sc.nextInt();
        for(int i = 0; i < n+1; i++){
            if(i<m){
                b[i] = a[i];
            }
            else if(i==m){
                b[i] = p;
            }
            else{
                b[i] = a[i-1];
            }
        }

        // Implemetation of how to create array 
        System.out.print("Elements are: ");
        for(int i = 0; i < n+1; i++){
            // creation array
            // System.out.println(a[i]);
            System.out.println(b[i]);
        }
    }



}

