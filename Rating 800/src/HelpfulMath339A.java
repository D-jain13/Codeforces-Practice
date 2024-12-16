import java.util.PriorityQueue;
import java.util.Scanner;

public class HelpfulMath339A {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        PriorityQueue<Integer> pq = new PriorityQueue();

        for(char ch : str.toCharArray()){
            switch (ch){
                case '1' : pq.offer(1);
                           break;
                case '2' : pq.offer(2);
                           break;
                case '3' : pq.offer(3);
                           break;
                default:    continue;
            }
        }
        StringBuilder sb = new StringBuilder();

        while(!pq.isEmpty()){
            sb.append(pq.poll());
            if(pq.size()>0){
                sb.append('+');
            }
        }
        System.out.println(sb.toString());
    }
}
