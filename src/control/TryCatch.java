package control;
import org.w3c.dom.ls.LSOutput;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Locale;
public class TryCatch {

    //public static void main(String[] args) {
        /*
        public static int division(int a, int b){
            return a/b;
        }
        public static int resto(int a, int b){
            return a%b;
        }
        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Locale.ENGLISH);
        /*
        //todo AritmeticExceptiom not captures
        int a =0;
        int b =0;
        int c =0;
        System.out.println("Digite um valor dividendo: ");
        a=sc.nextInt();
        System.out.println("Digite um valor divisor: ");
        b=sc.nextInt();
        c=a/b; //puede geneera exception
        System.out.printf("Resultado division es %d.",c);
         */
        /*
        System.out.println("Digite dos valor entero para division: ");
        double a =0;
        int b =0;
        int c =0;
        try{
            a=sc.nextInt();
            //sc.nextLine(); //para limpiar el buffer, si dejamos aqui, la explosion no se ejecuta en esta linea
            //funciona mejoer si se le pasa al finally
        }catch (InputMismatchException e){
            System.out.println("Erro: "+e.toString());
        }finally {
            sc.nextLine();
        }

        try{
            b=sc.nextInt();
            //sc.nextLine(); //para limpiar el buffer, si dejamos aqui, la explosion no se ejecuta en esta linea
            //funciona mejoer si se le pasa al finally
        }catch (InputMismatchException e){
            System.out.println("Erro: "+e.toString());
        }finally {
            sc.nextLine();
        }

        try{
//            c=a/b;
//            int d =a%b;

            //sc.nextLine(); //para limpiar el buffer, si dejamos aqui, la explosion no se ejecuta en esta linea
            //funciona mejoer si se le pasa al finally
        }catch (InputMismatchException e){
            System.out.println("Erro: "+e.toString());
        }finally {
            sc.nextLine();
        }



    }
    */
//        System.out.println("Digite dos valor entero para division: ");
//    int a,b,c;
//        Scanner sc = new Scanner(System.in);
//    try{ //este try esta optimizado antes que los anteriores
//        //no necesito caprturar cada una, pueda pasar mas cosas
//
//        a = sc.nextInt();
//        sc.nextLine();
//        b = sc.nextInt();
//        sc.nextLine();
//
//        c = division(a,b);
//        System.out.printf("Resultado: %.d%n",c);
//    }catch (InputMismatchException e){
//        System.out.println("Un valor ingresado erroneamente");
//    }catch (ArithmeticException e){
//        System.out.println("No se puede hacer una divion by zero");
//    }catch (Exception e){
//        System.out.println("Ocurrio un error inesperado pero caprturado");
//    }finally {
//        sc.close();
//        System.out.println("Programa finalizado");
//    }
//    }
//    System.
    //}

    public static void main(String[] args) {
        //clase 11-dic
        Scanner sc = new Scanner(System.in);
        boolean error = false; //ccambio de posicion
        do{
            try {
                error = false;
                System.out.println("Ingrese numero cualquiera:");
                int numero = Integer.parseInt(sc.next());
                sc.nextLine();
                if(numero !=1 && numero !=2){
                    System.out.println("Numero invalido para ejecucion");
                    error = true;
                }else{
                    System.out.printf("Numero valido %d%n", numero);
                }
            }catch (InputMismatchException e){
                System.out.println("Error generado por: "+e); //ingreso letra, explota

            }catch (NumberFormatException f){//se me ocurre el f
                System.out.println("Error generado por: "+f);
                error = true; //con while(error) con que ingrese un numero, bien o mal, avanza.
            }
        }while(error);//mientras el error sea falso/verdadero
    }
}
/*
ni tunrtime ni eexcecetion al inicio, genericas a lultimo

2, para seguir funcionando, se dbene caprturar todas las excepciones
 */
