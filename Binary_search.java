import java .util.Scanner;
public class Binary_search {

    public static int Binary(int arr[],int target){
        int first=0;
        int last=arr.length-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(target==arr[mid]){
                return mid;
            }
            else if(target>arr[mid]){
                first=mid+1;
            }
            else{
                last=mid-1;
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
        int res=Binary(arr, target);
        System.out.println(res);
    }
}
