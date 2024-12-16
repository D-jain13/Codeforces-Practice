import java.util.Scanner;

public class BeautifulMatrix263A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] matrix = new int[5][5];
        int x_pos = -1;
        int y_pos = -1;

        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                matrix[i][j] = scan.nextInt();
                if(matrix[i][j] == 1){
                    x_pos = i;
                    y_pos = j;
                }
            }
        }
        int count = Math.abs(x_pos-2) + Math.abs(2-y_pos);
        System.out.println(count);
    }
}
