import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Uebung18 {

    public static void main(String[] args) throws FileNotFoundException {
        File f = new File("test.txt");

        Scanner s = new Scanner(f);
        ArrayList<String> a = new ArrayList<>();
        while (s.hasNextLine()) {
            a.add(s.nextLine());
        }

        a.forEach( (str) -> System.out.println(str));

        /*for (String str : a) {
            System.out.println(str);
        }*/
    }
}