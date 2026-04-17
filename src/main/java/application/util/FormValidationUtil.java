package application.util;

import java.util.Scanner;

public class FormValidationUtil {

    private static final Scanner sc = new Scanner(System.in);


    public static int readInt(String message) {
        int value;

        while (true) {
            System.out.print(message);
            try {
                value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: ingrese un número válido");
            }
        }
    }


    public static double readDouble(String message) {
        double value;

        while (true) {
            System.out.print(message);
            try {
                value = Double.parseDouble(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: ingrese un número decimal válido");
            }
        }
    }


    public static String readText(String message) {
        String value;

        while (true) {
            System.out.print(message);
            value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("❌ Error: el campo no puede estar vacío");
        }
    }


    public static String readEmail(String message) {
        String email;

        while (true) {
            System.out.print(message);
            email = sc.nextLine().trim();

            if (email.contains("@") && email.contains(".")) {
                return email;
            }

            System.out.println("❌ Error: correo inválido");
        }
    }


    public static int readOption(String message, int min, int max) {
        int option;

        while (true) {
            option = readInt(message);

            if (option >= min && option <= max) {
                return option;
            }

            System.out.println("❌ Opción fuera de rango");
        }
    }
}
