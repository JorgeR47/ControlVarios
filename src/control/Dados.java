package control;

import java.security.SecureRandom;
public class Dados {
    private static final SecureRandom random= new SecureRandom();
    /*
    enum, tipo de dato sencilla, almacena CTEs.
    no varian, no modifica
    mas cerca del break que del arreglo

    el juego trata de casino
    combinaciones: 1,1(2) - 2,1 que da(3), (3)(4)=7
    leaven (11), caja/completo(12)

     */
    private enum resultado{GANO, PERDIO, EMPATO}
    private static final int SNAKE_EYES=2;
    private static final int TREY=3;
    private static final int SEVEN=7;
    private static final int YO_LEVEN=11;
    private static final int BOX_CARS=12;
    /*
    TODO ojito que esto declarando como global, fuera del main
     */
    public static int lanzarDados(){
        int dado1=1+random.nextInt(6);//numeros hasta el 6
        int dado2=1+random.nextInt(6);
        int suma =dado1+dado2;
        //System.out.printf("El lanzamiento dio como resultado: %d\n",suma);
        System.out.printf("El lanzamiento dio como resultado: %d, proveniente de %d y %d%n",suma,dado1,dado2);
        return suma;
        //se trabajará con un switch
    }
    public static void main(String[] args) {
        /*
        el random es limitado en lso aleatorios que puede procudcir,
        se usa SecureRandom en su lugar, abarca para más objetos
         */

        int punto =0; //conocer el resultado que obtuve
        resultado nivelDeJuego; //es el enum
        int suma = lanzarDados();
        switch (suma){
            /*
            suponer debo conocer el valor que obtuve,
            pero no necesito saber que significa,
            amplia la perspectiva
             */
            case (YO_LEVEN): case (BOX_CARS):
                //case (YO_LEVEN & BOX_CARS): se genera un lazo y el programa se cuelga
                //seria como ejecutar el "if" y el "else" simultaneamente
                nivelDeJuego = resultado.GANO;
                break;
            case (SNAKE_EYES): case (TREY):case (SEVEN):
                nivelDeJuego = resultado.PERDIO;
                break;
            default:
                nivelDeJuego = resultado.EMPATO;
                punto=suma;
                System.out.println("El resultado de la lanzada es %d%n"+suma);
                //todo consultar para que sirve %d %n
                //todo cómo usar el debug y ver historial de ejecucion del codigo

                break;
        }
        while (nivelDeJuego == resultado.EMPATO){
            suma = lanzarDados();

            if(suma==punto){
                nivelDeJuego = resultado.GANO;
            }else if (suma==YO_LEVEN){
                nivelDeJuego = resultado.PERDIO;
            }
        }
        if(nivelDeJuego==resultado.GANO){
            /*
            el juego tambien se gana si se tiene
            el mismo resultado que el lanzamiento anterior,
            considerar que este nuevo lanzamiento no
            debe ser igual a 11
            es decir, si empato y sale 11, perdi

            si en una lanzado obtengo m y en la n-lanzada vuelvo a tener m. gano
             */
            System.out.println("GANO");
        }else if(nivelDeJuego==resultado.PERDIO){
            System.out.println("PERDIO");
        }
    }
}
