import java.util.Scanner;

public class PetyaAndStrings112A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str1 = scan.next();
        String str2 = scan.next();

       int result = str1.compareToIgnoreCase(str2);
       if(result<0){
           System.out.println(-1);
       }
       else if(result>0){
           System.out.println(1);
       }
        else System.out.println(0);
    }
}
