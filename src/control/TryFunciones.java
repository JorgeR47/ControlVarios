package control;

/*
para mantenimiento, si tengo funciones y no puedo modificarlas
 */
public class TryFunciones {
    //Funciones que van a lanzar excepcion

    public static void cadena1() throws Exception {//no es plural, es la tercera persona en ingles
        try{
            cadena2();
        }catch(Exception e){
            System.out.println("el error de 2 capturado en 1"+e);
        }
    }

    public static void cadena2() throws Exception {//no es plural, es la tercera persona en ingles
        try{

            cadena3(); //va a capturar la excepcion de cadena 3
        }catch(Exception e){
            System.out.println("Erro de 3 que se captura en 2: "+e);
        }
    }

    public static void cadena3() throws Exception {//no es plural, es la tercera persona en ingles
        throw new Exception("Este es el error original");
        //si se da una excepcion, hago otra funcion que la capture

    }

    public static void main(String[] args) {
        try {
            cadena2();
            //cadena1();
            //cadena3(); aw pone rojo xq no tengo nada
        }catch(Exception e){
            e.printStackTrace();//
        }
    }
}
