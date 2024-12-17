package control;
import java.util.IllegalFormatConversionException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class newTryC {

    public static void main(String[] args) {
/*
        //todo programa para distintas excepciones
        int a =0;
        Scanner sc = new Scanner(System.in);

        try{
            Double pnum = sc.nextDouble(); //defino como objeto Doublw
            sc.nextLine();
            a = pnum.intValue();
            int cuad = a*a;
            System.out.printf("El cuadrado de %.1f es %d%n",pnum,cuad);
        }catch(InputMismatchException e){
            System.out.println("Colocar numero con decimales");
        }catch (IllegalFormatConversionException e){ //conversion real a entero
            System.out.println("Favor comenzar con double, no entero");
        }catch (NumberFormatException e){ //los numeros que trato de defnit no son los adecuados
            System.out.println("Ingrese un double por favor");
        }catch (Exception e){
            System.out.println(e);
            System.out.println("Error no anticipado");
        }finally{
            a++;
            System.out.printf("valor minimo ejecutado fue %d",cuad);
            sc.close();
        }
*/

//        try {
//            //forma que cuando se genere, me vuelva a preguntar
//            //solo se termine cuando acabe ejecucion o por excepcion
//            while(salida){
//                System.out.println("Digite un numero: ");
//                int a = sc.nextInt();
//                sc.nextLine();
//                System.out.printf("ingresado fue %d",a);
//                if(a <=10){
//                    salida = false;
//                }else{
//                    continue;
//                }
//            }
//        }catch (Exception e){
//            System.out.println(e.toString());
//        }

    }
}
