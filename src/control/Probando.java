package control;
import java.security.SecureRandom;

public class Probando {

    private static final SecureRandom random = new SecureRandom();
    private enum resultado{GANO, PERDIO, EMPATO};
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    public static int lanzarDados() {

        int dado1 = 1 + random.nextInt(6);
        int dado2 = 1 + random.nextInt(6);
        int suma = dado1+dado2;
        System.out.printf("El lanzamiento dio como resultado %d, proveniente de %d y %d%n",suma,dado1,dado2);
        return suma;
    }

    public static void main(String[] args) {
        resultado nivelJuego;

        do {
            int suma = lanzarDados();
            switch(suma) {

                case(YO_LEVEN): case(BOX_CARS):

                    nivelJuego = resultado.GANO;
                    break;
                case(SNAKE_EYES): case(TREY): case(SEVEN):

                    nivelJuego = resultado.PERDIO;
                    break;
                default:
                    nivelJuego = resultado.EMPATO;
                    System.out.printf("El resultado de la lanzada es %d%n",suma);
                    break;
            }

        }while (nivelJuego == resultado.EMPATO);

        if(nivelJuego == resultado.GANO) {

            System.out.println("Felicidades, ganó");
        } else {

            System.out.println("Lo sentimos, perdió");
        }
    }
}
