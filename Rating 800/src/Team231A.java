import java.util.Scanner;

public class Team231A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int loopCount = scan.nextInt();
        int solvableQuestion = 0;

        for(int i=0;i<loopCount;i++){
            int sol = 0;
            for(int count = 0; count<3;count++){
                if(scan.nextInt() == 1){
                    sol++;
                }
                if(count == 2 && sol>1){
                    solvableQuestion++;
                }
            }
        }
        System.out.println(solvableQuestion);
    }
}
