import java.util.Scanner;
public class twosum{
    public static void main(String[] args){
        Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int[] arr=new int[n];
for(int i =0 ;i<n;i++){
 arr[i] = Sc.nextInt();
}
int sum =Sc.nextInt();
for(int  i =0;i<n;i++){
    for(int j=i+1;j<n;j++){
        if(arr[i]+arr[j]==sum){
            System.out.print(i+" "+j);
            return;
        }
    }
}
System.out.println("-1,-1");
    }
}