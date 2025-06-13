import java.util.Scanner;

public class Class9 {
    public static void main(String[] args){
         //int[] arr = {10,20,30,40};
         //char[] ch = {'a','b','c','d'};
        // int[] b = arr; // promoted to int to int array
//        // int[] c = ch;// char array cannot be promoted to int  array
        Scanner sc = new Scanner(System.in);
//
//        int n;
//        System.out.println("Enter the size of the array:");
//        n = sc.nextInt();
//        int[] arr = new int [n];
//
//        for(int i=0; i<arr.length; i++){
//            System.out.print("Enter the element of the array: ");
//            arr[i] = sc.nextInt();
//        }
//        int ans = 0;
//        System.out.println("Sum of the array is : ");
//        for(int i=0; i<arr.length; i++){
//            ans = ans+arr[i];
//        }
//        System.out.println(ans);

//        for(int i=0; i<args.length; i++){
//            System.out.println(args[i]);
//        }
        String[] argh ={"a","b","c"};
        args = argh;
        for(String s:args){
            System.out.println(s);
        }
    }
}
