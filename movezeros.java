import java.util.Scanner;
public class movezeros{
    public static void main(String[] args){
Scanner Sc=new Scanner(System.in);
int n=Sc.nextInt();
int[] arr=new int[n];
for(int i =0 ;i<n;i++){
 arr[i] = Sc.nextInt();
}
int j=0;
for(int i=0;i<n;i++){
    if(arr[i]!=0){
        arr[j]=arr[i];
        j++;
    }
}
while(j<n){
    arr[j]=0;
    j++;
}
for(int i=0;i<n;i++){
    System.out.print(arr[i]+" ");
   }                                                                                      
}
}