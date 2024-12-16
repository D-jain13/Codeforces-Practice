import java.util.Scanner;

public class DominoPiling50A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();

        int area = m*n;
        int dominoCount = area/2;
        System.out.println(dominoCount);
    }
}
