//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     int[] arr ={10,20,3,40,50};
     int[] arr2 = {10,90};
     int[] b;
     b = arr;
     arr = arr2;
        System.out.println(" after swapping Arrays");

        for(int i=0; i<b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println();

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

        int[][] s ={{10,20}, {30,40,5,0,5}};
        int[][] k;
        k = s;
        for (int i = 0; i < k.length; i++) {
            for (int j = 0; j < k[i].length; j++) {
                System.out.print(k[i][j] + " ");
            }
            System.out.println();
        }


    }
}