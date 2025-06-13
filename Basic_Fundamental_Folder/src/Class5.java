import java.util.Scanner;

public class Class5 {
    int findpeak(int[] arr, int size){
        int start =0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]<arr[mid+1]){
                start = mid+1;
            }else{
                end = mid;
            }
        }
        return end;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println(" Enter the size of the array: ");
        size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<arr.length; i++){
            System.out.print(" Enter the element of the array :");
            arr[i] = sc.nextInt();
        }
        Class5 obj = new Class5();
        int peakindex = obj.findpeak(arr,size);

        System.out.println("The peak Element Found at "+peakindex+" Index"+" and Element is : "+arr[peakindex]);
    }
}
