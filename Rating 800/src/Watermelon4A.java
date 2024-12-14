import java.util.Scanner;

public class Watermelon4A {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

       int input = scan.nextInt();

       if(input == 2) {
           System.out.println("NO");
       }
       else if(input % 2 == 0){
           System.out.println("YES");
       }
       else{
           System.out.println("NO");
       }
    }
}