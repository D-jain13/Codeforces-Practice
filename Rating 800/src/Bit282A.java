import java.util.Scanner;

public class Bit282A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loopCount = scan.nextInt();
        int var_x = 0;

        for(int i=0;i<loopCount;i++){
            String str = scan.next();

            if(str.equals("++X") || str.equals("X++") ){
                var_x++;
            } else if (str.equals("X--") || str.equals(("--X"))) {
                var_x--;
            }
        }
        System.out.println(var_x);
    }
}
