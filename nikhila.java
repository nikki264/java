import java.util.Scanner;
 public class nikhila{
public static void main (String[] args){
    Scanner Sc =new Scanner(System.in);
    int n =Sc.nextInt();
    int[] arr =new int[n];
    for(int i=0;i<n;i++){
        arr[i] =Sc.nextInt();
    }
    System.out.println("traversal using for loop");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+ " ");


    }
    System.out.println( );
    System.out.println( "traversal using for each loop");
    for(int i:arr){
        System.out.print(i+ " ");
    }
}
}