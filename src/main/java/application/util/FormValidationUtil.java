package application.util;

import java.util.Scanner;

public class FormValidationUtil {

    private static final Scanner sc = new Scanner(System.in);


    public static int readInt(String prompt) {
        int value;

        while (true) {
            System.out.print(prompt);
            try {
                value = Integer.parseInt(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: ingrese un número válido");
            }
        }
    }


    public static double readDouble(String prompt) {
        double value;

        while (true) {
            System.out.print(prompt);
            try {
                value = Double.parseDouble(sc.nextLine());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: ingrese un número decimal válido");
            }
        }
    }


    public static String readText(String prompt) {
        String value;

        while (true) {
            System.out.print(prompt);
            value = sc.nextLine().trim();

            if (!value.isEmpty()) {
                return value;
            }

            System.out.println("❌ Error: el campo no puede estar vacío");
        }
    }


    public static String readEmail(String prompt) {
        String email;

        while (true) {
            System.out.print(prompt);
            email = sc.nextLine().trim();

            if (email.contains("@") && email.contains(".")) {
                return email;
            }

            System.out.println("❌ Error: correo inválido");
        }
    }


    public static int readOption(String prompt, int min, int max) {
        int option;

        while (true) {
            option = readInt(prompt);

            if (option >= min && option <= max) {
                return option;
            }

            System.out.println("❌ Opción fuera de rango");
        }
    }
}
