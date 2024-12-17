package control;

import java.security.SecureRandom;

public class Dados {
    
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
        
        int punto = 0;
        resultado nivelJuego;
        
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
                punto = suma;
                System.out.printf("El resultado de la lanzada es %d%n",suma);
                break;
        }
        
        while(nivelJuego == resultado.EMPATO) {
            
            suma = lanzarDados();
            
            if(suma == punto) {
                
                nivelJuego = resultado.GANO;
            } else if (suma == YO_LEVEN) {
                
                nivelJuego = resultado.PERDIO;
            }
        }
        
        if(nivelJuego == resultado.GANO) {
            
            System.out.println("Felicidades, ganó");
        } else {
            
            System.out.println("Lo sentimos, perdió");
        }
    }
}
