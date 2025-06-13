public class Class3 {
    public static void main(String[]args){
        sum(new int[]{10,20,3,3});
    }
    public static  void sum(int[] x){
        int total =0;
        for(int i=0; i<x.length; i++){
            total = total+x[i];
        }
        System.out.println(" the sum "+total);
    }
}
