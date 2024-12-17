package control;

import java.io.IOException;

public class TryLanzado {
    public static void lanzarExcepcion()throws Exception {
        try {
            System.out.println("Aqui se creo excepcion");
            throw new Exception(); //es un objeto, por ende debo crearlo
        }catch (Exception e) {
            System.out.println("Evento capturado adecuadamente");
            throw e;
        }finally {
            System.out.println("Ejecucion fue adecuada");
        }
    }
    public static void noLanzarExcepcion() {
        try {
            System.out.println("Se contiene la excepcion, pero se oculta");
            int a=3/0;
        }catch (Exception e) {
            System.err.println("se imprime "+e); //aqui, esto nunca se imprime, no hay nada que permita que se lanzce esa e
        }finally {
            System.err.println("Cosas suceden no se muestran");
        }
        System.out.println("La funcion finaliza");
    }

    public static void main(String[] args) {
        try{
            lanzarExcepcion();
        }catch (Exception e) {
            System.out.println("Aqui se ejecuta");
        }
        noLanzarExcepcion();
    }
}
