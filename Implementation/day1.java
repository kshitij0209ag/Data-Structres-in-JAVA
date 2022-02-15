// Array Operations-Creation ,Traversal ,Insertion, Deletion

import java.util.Scanner;

public class day1 {
    public static void main(String args[]) {
        int n;
        int m;
        // int p;

        // input the no. from user

        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter No. of elements in array: ");
        n = sc.nextInt();

        int a[] = new int[n];

        // int b[] = new int[n+1];    for inserting the array
        int b[] = new int[n-1];  // for deleting an array

        for(int i = 0; i<n; i++){
            a[i] = sc.nextInt();
        }

        // delete an array from given input values

        System.out.print("Enter Index of new Value to be Deleted:- ");
        m = sc.nextInt();

        for(int i = 0; i <a.length; i++){
            if(i<m){
                b[i] = a[i];
            }
            else if(i==m){
                continue;
            }
            else{
                b[i-1] = a[i];
            }
        }


        // // inserting a new value into an array

        // System.out.print("Enter new Value to be Inserted");
        // p = sc.nextInt();
        // for(int i = 0; i < n; i++){
        //     if(i<m){
        //         b[i] = a[i];
        //     }
        //     else if(i==m){
        //         b[i] = p;
        //     }
        //     else{
        //         b[i] = a[i-1];
        //     }
        // }

        // Implemetation of how to create array 
        System.out.print("Elements are: ");
        for(int i = 0; i < n-1; i++){
            // creation array
            // System.out.println(a[i]);
            System.out.println(b[i]);
        }
    }
}

