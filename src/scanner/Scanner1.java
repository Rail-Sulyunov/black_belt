package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Vvedite chislo!");
//        int i = scanner.nextInt();
//        System.out.println("Vvedennoe chislo: " + i);
//        System.out.println("Napishite dva chisla!");
//        int x = scanner.nextInt();
//        int y = scanner.nextInt();
//        System.out.println("Chastnoe = " + x / y);
//        System.out.println("Ostatok = " + x % y);
//        System.out.println("Slova!");
//        String s = scanner.next();
//        System.out.println("Napisali: " + s);

//        System.out.println("Vvedite drobnoe chislo!");
//        double i = scanner.nextDouble();
//        System.out.println("Vvedennoe chislo: " + i);

        Scanner scanner = new Scanner("Privet moy drug!\nKak pojivaesh?");
//        String  s = scanner.nextLine();
//        System.out.println(s);
//        System.out.println(scanner.nextLine());
//        while (scanner.hasNextLine()){
//            System.out.println(scanner.nextLine());
//        }

        System.out.println(scanner.next().charAt(2));
        scanner.close();


    }
}
