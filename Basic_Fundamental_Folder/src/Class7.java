import java.util.Scanner;

public class Class7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        int [] x = new int [3];
//        System.out.println(x);// output is [I@3e25a5
//        System.out.println(x[2]); // output is 0

        // sum of the array

//        int[][] arr = new int[3][3];
//        System.out.println(arr);
//        System.out.println(arr[0]);
//        System.out.println(arr[0][0]);



        int n;
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the First element of the array ");
                arr1[i][j] = sc.nextInt();
            }
        }
        int ans=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                ans =ans+arr1[i][j];
            }
        }
        System.out.println("The sum of the Two daimentation"+ans);
    }
}
