import java.util.Scanner;
public class rotatearray {
    public static int[] rotate(int[] arr, int k){
        if(k>arr.length){
            k=k%arr.length;
        }
        int[] result =reverse(arr,0,arr.length-1);
        result =reverse(result,0,k-1);
        result =reverse(result,k,arr.length-1);
        return result;
    }
    public static int[] reverse(int[] arr,int left,int right){
        while(left<right){
            int temp =arr[left];
            arr[left] =arr[right];
            arr[right] =temp;
            left ++;
            right --;
        }
        return arr;
    }
    
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Sc.nextInt();
        }
        int k = Sc.nextInt();
        int[] result = rotate(arr, k);
        for (int i :result) {
            System.out.print(i + " ");
        }
    }
}
