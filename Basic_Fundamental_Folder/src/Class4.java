import java.util.Scanner;

public class Class4 {
    void reverse(int[] arr, int n, int k) {
        int i = k;
        int j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the string");
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            System.out.print("Enter the element of the array :");
            arr[i] = sc.nextInt();
        }
        int k;
        System.out.println("Enter the position to value reverse ");
        k = sc.nextInt();

        Class4 obj = new Class4();
        obj.reverse(arr,n ,k);
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
