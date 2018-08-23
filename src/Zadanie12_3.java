import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Zadanie12_3 {

    public static void main(String[] args) throws FileNotFoundException {

        int duplicate = 0;

        File file = new File("Plik.csv");
        Scanner read = new Scanner(file);

        ArrayList<Integer> liczby = new ArrayList<>();
        TreeSet<Integer> set = new TreeSet<>();
        Map<Integer, Integer> repeats = new HashMap<>();

        while (read.hasNextInt()) {
            liczby.add(read.nextInt());
        }

        liczby.sort(Integer::compareTo);

        for (int i = 0; i < liczby.size() - 1; i++) {
            if (liczby.get(i).equals(liczby.get(i + 1))) {
                set.add(liczby.get(i));
                repeats.put(liczby.get(i), ++duplicate + 1);
            } else {
                set.add(liczby.get(i));
                repeats.put(liczby.get(i), ++duplicate);
                duplicate = 0;
            }
        }
        for (int numerySort : liczby) {
            System.out.print(numerySort + " ");
        }
        System.out.println("\n");

        for (int sety : set) {
            System.out.println(sety + " - liczba wystąpień: " + repeats.get(sety));
        }

        read.close();
    }
}