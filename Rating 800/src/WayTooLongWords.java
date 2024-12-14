import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int loopCount = input.nextInt();

        for(int i=0;i<=loopCount;i++){
            String str = input.nextLine();

            if(str.length()>10){
                StringBuilder sb = new StringBuilder();
                sb.append(str.charAt(0));
                sb.append(str.length()-2);
                sb.append(str.charAt(str.length()-1));

                System.out.println(sb.toString());
            }
            else{
                System.out.println(str);
            }
        }
    }
}
