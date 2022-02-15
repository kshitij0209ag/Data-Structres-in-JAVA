import java.util.Scanner;

public class day2 {
    public static void main(String args[]){

        int n, m, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of ROWS:- ");
        n = sc.nextInt();
        System.out.print("Enter no. of COLUMNS:- ");
        m = sc.nextInt();
        int a[][] = new int[n][m];
        System.out.print("Enter Values:- ");
        for(int i = 0; i <n; i++)
        {                  // n=2, m=3
            for(int j = 0; j <m; j++)
            {
                a[i][j] = sc.nextInt();         // a[0][0], a[0][1], a[0][2] / a[1][0], a[1][1], a[1][2]
            }
        }

        for (int i = 0; i < n; i++) 
        { // n=2, m=3
            for (int j = 0; j < m; j++) 
            {
                a[i][j] = sc.nextInt(); // a[0][0], a[0][1], a[0][2] / a[1][0], a[1][1], a[1][2]
            }
        }

    }
}
