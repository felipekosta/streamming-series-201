package utils;

import java.util.Scanner;

public class Input {

    public static Scanner scan = new Scanner(System.in);

    public static int in(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine().trim();
                return Integer.parseInt(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido. Tente novamente.");
            }
        }
    }

    public static double db(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine().trim().replace(',', '.');
                return Double.parseDouble(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido. Tente novamente.");
            }
        }
    }

    public static float ft(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine().trim().replace(',', '.');
                return Float.parseFloat(s);
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido. Tente novamente.");
            }
        }
    }

    public static String st(String msg) {
        while (true) {
            try {
                System.out.println(msg);
                String s = scan.nextLine();
                return s;
            } catch (NumberFormatException e) {
                System.out.println("Valor Invalido. Tente novamente.");
            }
        }
    }

}