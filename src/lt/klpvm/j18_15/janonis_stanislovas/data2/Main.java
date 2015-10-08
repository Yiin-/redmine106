package lt.klpvm.j18_15.janonis_stanislovas.data2;

import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by Yiin on 2015.10.08.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new FileReader(new File("data2/input.txt")));
        PrintWriter out = new PrintWriter(new FileWriter(new File("data2/output.txt")));

        LinkedList<String> list = new LinkedList<>();

        read(list, in);
        write(list, out);

        list.clear();
        in.close();
        out.close();

        in = new Scanner(new FileReader(new File("data2/input2.txt")));
        out = new PrintWriter(new FileWriter(new File("data2/output2.txt")));

        read2(list, in);
        write2(list, out);

        in.close();
        out.close();

        in = new Scanner(new FileReader(new File("data2/input2.txt")));
        out = new PrintWriter(new FileWriter(new File("data2/output3.txt")));

        write3(read3(in), out);

        list.clear();
        in.close();
        out.close();

        in = new Scanner(new FileReader(new File("data2/input2.txt")));
        out = new PrintWriter(new FileWriter(new File("data2/output4.txt")));

        write3(read3(in), out);

        in.close();
        out.close();
    }

    public static void read(LinkedList<String> list, Scanner in) {
        while(in.hasNext()) {
            String[] parts = in.nextLine().split(", ");

            list.add(parts[2] + " " + parts[0] + " " + parts[1]);
        }
    }
    public static void write(LinkedList<String> list, PrintWriter out) {
        list.forEach(out::println);
    }

    public static void read2(LinkedList<String> list, Scanner in) {
        while(in.hasNext()) {
            String[] part1 = in.nextLine().split("- ");
            String[] part2 = part1[1].split("\\* ");


            list.add(part2[1] + "/ " + part1[0] + "+ " + part2[0]);
        }
    }
    public static void write2(LinkedList<String> list, PrintWriter out) {
        list.forEach(out::println);
    }

    public static LinkedList<Asmuo> read3(Scanner in) {
        LinkedList<Asmuo> list = new LinkedList<>();
        while(in.hasNext()) {
            String[] part1 = in.nextLine().split("- ");
            String[] part2 = part1[1].split("\\* ");

            list.add(new Asmuo(part1[0], part2[0], part2[1]));
        }

        return list;
    }
    public static void write3(LinkedList<Asmuo> list, PrintWriter out) {
        for(Asmuo asmuo : list) {
            out.println(asmuo.amzius + "/ " + asmuo.vardas + "+ " + asmuo.pavarde);
        }
    }
}
