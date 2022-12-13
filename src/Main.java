import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



        public class Main {
            public static void main(String[] args) {
                String  zatrzymanie = "/";

                String name;
                Set<String> names = new HashSet<>();
                Scanner scan = new Scanner(System.in);
                do {
                    System.out.println("podaj nazwe miasta");
                    name = scan.next();
                    if (!name.equals(zatrzymanie)) {
                        names.add(name);
                    }
                } while (!name.equals(zatrzymanie));

                System.out.println("wprowadziles " + (names.size()));
            }}

