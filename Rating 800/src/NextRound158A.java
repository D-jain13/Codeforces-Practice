import java.util.Scanner;

public class NextRound158A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int k = scan.nextInt();

        int[] arr = new int[n];

        for(int i=0;i<n;i++){

            arr[i] = scan.nextInt();
            if(i==0 &&  arr[i] == 0){
                System.out.println(0);
                return;
            }
        }
        int count = 0;

        for(int i=0;i<n;i++){
            if(arr[i] >= arr[k-1] && arr[i]!=0){
                count++;
            }
        }
        System.out.println(count);
    }
}
