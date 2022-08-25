import java.util.Scanner;

public class Linear_search{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int [] arr=new int [n];
        for (int index = 0; index < n; index++) {
            arr[index]=sc.nextInt();

        }
        System.out.println("Enter target");
        int target=sc.nextInt();
        for (int i = 0; i < n; i++) {
            if(arr[i]==target){
                System.out.println("Found on index"+i);
            }
        }
    }
}