import java.io.File;
import java.io.FileNotFoundException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Zadanie12_1 {
    public static void main(String[] args) throws FileNotFoundException {

        double avg;
        double sum = 0;

        File file = new File("File.csv");
        Scanner read = new Scanner(file);

        TreeSet<Integer> set = new TreeSet<>();
        while (read.hasNextInt()) {
            set.add(read.nextInt());
        }

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            sum = sum + next;
        }

        avg = sum / set.size();

        System.out.println("Najmniejsza liczba: " + set.first());
        System.out.println("Największa liczba: " + set.last());
        System.out.println("Srednia wszystkich liczb: " + avg);
        System.out.print("Liczby większe od średniej: ");
        for (Integer liczby : set) {
            if (liczby > avg) {
                System.out.print(" " + liczby);
            }
        }
    }
}

