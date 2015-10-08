package lt.klpvm.j18_15.janonis_stanislovas.data;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Yiin on 2015.10.08.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader(new File("data/input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter(new File("data/output.txt")));

        LinkedList<String> list = new LinkedList<>();

        read(list, in);
        write(list, out);

        list.clear();
        out.close();

        out = new PrintWriter(new FileWriter(new File("data/output2.txt")));

        read2(list, in);
        write(list, out);

        in.close();
        out.close();
    }

    public static void read(LinkedList<String> list, Scanner in) {
        list.add(in.nextLine());
    }
    public static void read2(LinkedList<String> list, Scanner in) {
        while(in.hasNext()) {
            list.add(in.nextLine());
        }
    }
    public static void write(LinkedList<String> list, PrintWriter out) {
        list.forEach(out::println);
    }
}
