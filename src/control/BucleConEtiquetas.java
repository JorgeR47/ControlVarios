package control;

public class BucleConEtiquetas {

    public static void main(String[] args) {
        /*
        etiqueta1 menciona lazo for primero,
        pero el break al salir al mismo lazo,
        no hace ninguna diferencia
        lo mismo para etiqueta2
         */
        etiqueta1:
        for (int i = 0; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Hola " + i);
                break etiqueta1;
                /*
                un break dentro del lazo
                al quitar la etiqueta,

                 */
            }
            System.out.println(i);
        }
        System.out.println(); //salto de linea en terminal, vadcio
        etiqueta2:
        for (int i = 0; i <= 10; i++) {
            if (i == 8) {
                System.out.println("Hola " + i);
                continue etiqueta2; //es distinto del break, respecto de donde termina
            }
        }
        System.out.println();


        for (int i = 0; i <= 10; i++) {
            etiqueta3:
            /*
            en este caso, continua hasta el 10
             */
            if (i == 8) {
                System.out.println("Hola " + i);
                break etiqueta3;
            }
            System.out.println(i);
        }

        /*
        Ejercicio completo de conceptos de etiqueta
        saber cual es vocal, consonante
         */


       char letra;
       int vocal =0;
       int consonante =0;
       int espacios =0;
       String frase ="Con este ejercicio aprenderemos como se ven las etiquetas en java";

       lb1:for(int i=0;i<frase.length();i++){
           letra = frase.toLowerCase().charAt(i); //lowerCase del caracter en i
            lb2: if(letra =='a'||letra =='e'||letra =='i'||letra =='o'||letra =='u'){
            if(letra== 'a'){
                System.out.println("no se considera A ");
                continue lb1; //"rompe" el if, pero no se puede, asi que rompe lb2

                /*
                en este caso, continue lb1 = break lb2
                es similar al go-to
                 */
                }
            vocal++;
           }else if(letra==' '){
               espacios++;
           }else {
               consonante++;
           }


       }
        System.out.printf("En total hay %d vocal, %d consonante, %d espacio",vocal,consonante,espacios);

    }
}
