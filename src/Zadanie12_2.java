import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Zadanie12_2 {

    public static void main(String[] args) {

        int sum = 0;

        Queue<Integer> liczby = new LinkedList<>();

        Scanner scan = new Scanner(System.in);

        System.out.println("Podaj 10 liczb: ");
        for (int i = 0; i < 10; i++) {
            liczby.offer(scan.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            sum = sum + liczby.peek();
            if (i > 0) {
                System.out.print(" + ");
            }
            System.out.print(liczby.poll());
        }
        System.out.print(" = " + sum);
        scan.close();
    }
}