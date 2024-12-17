import java.util.Scanner;

public class StringTask118A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        str = str.toLowerCase();

        StringBuilder sb = new StringBuilder();

        for(char ch : str.toCharArray()){
            if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u' && ch!='y'){
                sb.append(".").append(ch);
            }
        }
        System.out.println(sb.toString());
    }
}
