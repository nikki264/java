import java.util.Scanner;
public class plusone{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number of digits in the array:");
        int n =sc.nextInt();
        int[] arr =new int[n];
        System.out.println("enter the digits of the array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=n-1;i>=0;i--){
            if(arr[i]<9){
                arr[i]++;
                System.out.println("The new array is:");
                for(int j=0;j<n;j++){
                    System.out.print(arr[j]+" ");
                }
                return;
            }
            arr[i]=0;
        }
        // If we reach here, it means all digits were 9, so we need to add a new digit at the beginning
        int[] result = new int[n + 1];
        result[0] = 1;
        System.out.println("The new array is:");
        for(int j=0;j<=n;j++){
            System.out.print(result[j]+" ");
        }
    }
}