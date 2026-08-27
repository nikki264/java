import java.util.Scanner;
public class searchInsert {
    public static int search(int[] arr,int key){
        int left =0;
        int right= arr.length-1,mid=0;
        while(left<=right){
            mid =(left+right)/2;
            if(arr[mid]==key){
                return mid;
            }
            else if(key<arr[mid]){
                right=mid-1;
            }
            else if(key>arr[mid]){
                left=mid+1;
            }
        }
        return left;
    }
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Sc.nextInt();
        }
        int key=Sc.nextInt();
        System.out.println(search(arr,key));
    }
    
}
