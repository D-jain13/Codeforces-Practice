import java.util.Arrays;
import java.util.Scanner;

public class ChatRoom58A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        if(str.length()<5){
            System.out.println("NO");
            return;
        }
        int[] index = new int[5];
        Arrays.fill(index,-1);

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'h' && index[0] == -1){
                index[0] = i;
            }
            else if(ch == 'e' && index[1] == -1 && i > index[0] && index[0]!=-1){
                index[1] = i;
            }
            else if(ch =='l' && index[2] == -1 && i > index[1] && index[1]!=-1){
                index[2] = i;
            }
            else if(ch =='l' && index[3] == -1 && i > index[2] && index[2]!=-1){
                index[3] = i;
            } else if(ch =='o' && index[4] == -1 && i > index[3] && index[3]!=-1) {
                index[4] = i;
            }
        }

        for(int i=0;i<4;i++){
            if(index[i] > index[i+1]){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}