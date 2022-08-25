import java.util.Scanner;

public class Linear_search_meethod {
    public static int search(int arr[],int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int index = 0; index < n; index++) {
            arr[index]=sc.nextInt();
        }
        int target=sc.nextInt();
        int res=search(arr, target);
        System.out.println(res);
    }
}
