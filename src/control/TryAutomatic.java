package control;
import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.Scanner;
import java.util.Locale;
public class TryAutomatic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        //programa para validar edad de una persona
        int edad=0;
        do{
            try {
                System.out.println("Ingrese su edad: ");
                edad =Integer.parseInt(sc.nextLine());
                sc.nextLine(); //cerrar el buffer

            }catch (NumberFormatException e) {
                System.out.println("Excepcion no relacionada al funcionamiento del programa "+e);
            }
        }while(edad==0);
        System.out.println("La edad es: "+edad);

        if(edad<21){ //contexto europeo
            try {
                System.out.println("Ingrese su edad: ");
                throw new ArithmeticException("Impisible, es menor de edad"); //si la validacion se da, lanza una excepcion
            }catch (ArithmeticException e){
                System.err.println("El problema es: : "+e); //con err le digo al program que es un error
                System.out.println("Ai se lanza excepcion a proposito");
            }
        }else {
            System.out.println("bienvenido");
        }
    }
}
