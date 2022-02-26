//  Stack Using Array

import java.util.Scanner;

class stack {
    int top = -1;
    int n = 10;
    int a[] = new int[n];

    void push() {
        if(top == (n-1)){
            System.out.print("Overflow");
        }
        else {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Data:- ");
            int i = sc.nextInt();
            top = top+1;
            a[top] = i;
            System.out.print("Item Inserted");
        }
    }

    void pop() {
        if(top == -1) {
            System.out.print("Underflow");

        }
        else{
            top = top-1;
            System.out.print("Item Deleted");
        }
    }

    void display() {
        System.out.print("Items are:- ");
        for(int j = 0; j >= 0; j--) {
            System.out.print(a[j]);
        }
    }
}

public class day13 {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);

        int d, l;
        stack s = new stack();

        do {
            System.out.println("press 1 to PUSH");            
            System.out.println("press 2 to POP");            
            System.out.println("press 3 to DISPLAY");            
            System.out.println("Enter your CHOICE");            

            d = sc.nextInt();
            switch(d)
            {
                case 1:
                {
                    s.push();
                    break;
                }
                case 2:
                {
                    s.pop();
                    break;
                }
                case 3:
                {
                    s.display();
                    break;
                }
            }
            System.out.print("Enter 0 to Go back to the Main Menu");
            System.out.print("Enter any Key to Exit");
            l = sc.nextInt();
        }
        while(l == 0);
        System.out.print("Exit Successfull");
        }    
}
