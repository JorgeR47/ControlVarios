package control;

import javax.swing.*;

public class Cindy {
    public static void main(String[] args) {
        boolean continuar = true;

        while (continuar) {
            String opcion = JOptionPane.showInputDialog(null,
                    "Seleccione una opción:\n" +
                            "1. Iniciar\n" +
                            "2. Revisar\n" +
                            "3. Escribir\n" +
                            "4. Redactar\n" +
                            "5. Salir");

            try {
                switch (opcion) {
                    case "1":
                        iniciar();
                        break;
                    case "2":
                        revisar();
                        break;
                    case "3":
                        escribir();
                        break;
                    case "4":
                        redactar();
                        break;
                    case "5":
                        continuar = false;
                        JOptionPane.showMessageDialog(null, "¡Hasta luego!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opción no válida. Por favor seleccione una opción del 1 al 5.");
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido");
            }
        }
    }

    private static void iniciar() {
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        try {
            int numeroDecimal = Integer.parseInt(numeroStr);
            String mensaje = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
            mensaje += "\nnumero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
            mensaje += "\nnumero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
            JOptionPane.showMessageDialog(null, mensaje);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número entero válido");
        }
    }

    private static void revisar() {
        JOptionPane.showMessageDialog(null, "Función de revisión\nEsta función está en desarrollo");
    }

    private static void escribir() {
        JOptionPane.showMessageDialog(null, "Función de escritura\nEsta función está en desarrollo");
    }

    private static void redactar() {
        JOptionPane.showMessageDialog(null, "Función de redacción\nEsta función está en desarrollo");
    }

    /*
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        System.out.println(resultadoBinario);

        int numeroBinario = 0b11110;
        System.out.println("numeroBinario = " + numeroBinario);

        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        System.out.println(resultadoOctal);
        int numeroOctal = 036;
        System.out.println("numeroOctal = " + numeroOctal);

        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);
        System.out.println(resultadoHex);
        int numeroHex = 0x1e;
        System.out.println("numeroHex = " + numeroHex);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        JOptionPane.showMessageDialog(null, mensaje);

     */

}
/*
import java.util.InputMismatchException;
import java.util.Scanner;

public class Cindy {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvenido al Sistema de Revision Vehicular:");
        System.out.println("Por favor digite el numero de opcion de su preferencia:");
        System.out.println("1. Identificarme como revisor");
        System.out.println("2. Iniciar revision");
        System.out.println("3. Finalizar programa:");
        // String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();// Integer.parseInt(numeroStr);
        } catch (InputMismatchException e){
            System.out.println("Error debe ingresar un número entero!");
            main(args);
            System.exit(0);
        }

        System.out.println("numeroDecimal = " + numeroDecimal);

        String resultadoBinario = "numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "numero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String resultadoHex = "numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        String mensaje = resultadoBinario;
        mensaje += "\n" + resultadoOctal;
        mensaje += "\n" + resultadoHex;

        System.out.println(mensaje);
    }
}*/