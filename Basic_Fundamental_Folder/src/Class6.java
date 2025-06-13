import java.util.Scanner;

public class Class6 {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        boolean[][] arr = new boolean[3][5];
//
//        System.out.println(arr.getClass().getName());
//        int arr[] = new int[0];
//        System.out.println(args.length);
//        int arr[] = new int['a'];
//        short s =30;
//        int[] p = new int[s];
//        byte t = 10;
//        int[] k =new int[t];
//
//        System.out.println(p);
//        System.out.println(k);
//        System.out.println(arr.length);
//
//        int arr2[] = new int[2147453647];
//        System.out.println(arr2.length);

        int n;
        System.out.println("Enter the size of the array:");
        n = sc.nextInt();
        int[][] arr1 = new int[n][n];
        int[][] arr2 = new int[n][n];
        int[][] arr3 = new int[n][n];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the First element of the array ");
                arr1[i][j] = sc.nextInt();
            }
        }

        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print("Enter the Second Element of the array:");
                arr2[i][j] = sc.nextInt();
            }
        }


        System.out.println(" ");

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr3[i][j] = arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Addition of the 2D array is :");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
