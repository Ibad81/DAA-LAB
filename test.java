import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= i; j++) {
                for (int j2 = 1; j2 <=100; j2++) {
                    count++;
                }
                
            }
        }
        System.out.println(count);
    }
}
