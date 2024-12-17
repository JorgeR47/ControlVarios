package control;
import java.util.Scanner;
import java.util.Locale;
public class StringBuilderPractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);


        String a = "caracter";
        String b = new String("caracter");

        StringBuilder c = new StringBuilder(a); // es mutable/modificable, String es inmutable
        /*
        el StringBuilder define el tamaño del objeto, copia el contenido del objeto al que fue referenciado
        se cambia contenido del espacio de memoria, escrito en digital


        En cambio:
        String x = "hola"
        String x = "chao"
        String x = "holachao"
        System.out.printf("%s, %s, %s%n",x,y,x);
        se modifica el espacio de memoria, se crea un nuevo objeto, escrito en piedra

         */
        System.out.printf("%s, %s, %s%n",a,b,c);
        StringBuilder d = new StringBuilder("cadena");
        d=c;
        System.out.println(c);
        d=c;
        System.out.println(d);

        String cadenota = "caracter;unacadena";
        String cadenota2= separar(cadenota);
        System.out.println(cadenota2);

        System.out.println("Operaciones muestran tiempo StringBuilder vs String");

        long inicioSB = System.currentTimeMillis();
        String cad1 = cadenaGrande1();
        long finSB = System.currentTimeMillis();
        long tiempo1 = finSB - inicioSB;
        System.out.println("el tiempo es "+tiempo1);


        long inicioS = System.currentTimeMillis();
        String cad2 = cadenaGrande2();
        long finS = System.currentTimeMillis();
        long tiempo2 = finS - inicioS;
        System.out.println("el tiempo es "+tiempo2);

        System.out.println();

        String cadena ="EPN";
        int veces = 10000;

        System.out.println("Inicio 1");
        long conSInicio = System.currentTimeMillis();
        String con1 = concatBasic(cadena, veces);
        long conSFin = System.currentTimeMillis();
        long conS = conSFin - conSInicio;
        System.out.println("el tiempo es "+conS);

        System.out.println("Inicio 2");
        long conSBInicio = System.currentTimeMillis();
        String con2 = concatBasic(cadena, veces);
        long conSBFin = System.currentTimeMillis();
        long conSB = conSBFin - conSBInicio;
        System.out.println("el tiempo es "+conSB);

        System.out.println("Inicio 3");
        long conSB2Inicio = System.currentTimeMillis();
        String con3 = concatBasic(cadena, veces);
        long conSB2Fin = System.currentTimeMillis();
        long conSB2 = conSB2Fin - conSB2Inicio;
        System.out.println("el tiempo es "+conSB2);

    }

    /*
    funcion modificar SB a partyir de String, y return resultado
     */
    public static String separar(String s){
        StringBuilder sb = new StringBuilder(s);
        sb.reverse(); // reverso de la secuencia. Intercambio i-0 a i-n-1
        System.out.printf("La longitud total de la cadena es de %d caracterres%n",sb.length());

        int posicion =3;

        while(posicion<sb.length()){
            sb.insert(posicion,' ');
            posicion=posicion+4;
        }
        sb.reverse();
        return sb.toString();
    }

    /*
    //todo funcion que genera String masivo, return String a partir StringBuilder
     */


    public static String cadenaGrande1() {
        StringBuilder cad1 = new StringBuilder();
        for (int i=0;i<100000;i++){ //debe ser  valores altos para ver diferencia
            cad1.append("hola"); //append añade al final algo, lo del parentesis
        }
        return cad1.toString();
    }
      /*
    //todo funcion que genera String masivo, return String a partir String
     */
    public static String cadenaGrande2() {
        String cad2 = "";
        for (int i=0;i<100000;i++){
            cad2=cad2+"hola";
        }
        return cad2.toString();
    }
    /*
    todo funcion concatena cadena definida un numero n-veces
     */
    public static String concatBasic(String cadena, int veces){
        String resultado = cadena;
        for(int i=0;i<veces;i++){
            resultado=resultado+cadena;
        }
        return resultado;
    }
    /*
    todo funcion concatena cadena definida un numero n-veces usando SB y append()
     */
    public static String concatBasicSB(String cadena, int veces){
        StringBuilder resultado = new StringBuilder(cadena); //ya viene con data y tamaño.
        for(int i=0;i<veces;i++){
            resultado.append(cadena);
        }
        return resultado.toString(); //por ser tipo SB

    }

    /*
    todo funcion concatena cadena definida un numero n-veces usando SB y append()
    todo tamaño SB definido
     */
    public static String concatBasicSB2(String cadena, int veces){
        StringBuilder resultado = new StringBuilder(veces*cadena.length());
        for(int i=0;i<veces;i++){
            resultado.append(cadena);
        }
        return resultado.toString();
        //aqui hay una concatenacion menos que los dos metodos anteriores,
        //este lo cree vacio, recien se añade. por eso son las n-veces y no las n+1-veces


    }
}
/*
actua como un programador senior y modela un restaurante, las clases: Pedido, Plato, Mesero, Comensal
Definir relaciones de:asociacion, composicion, agregacion.
El comensal pide al mesero.
Comensal consume el plato, el plato se almacena en Pedido.

- crear menu imprimible, definir e imprimir a todos los objetos, sin Arrays usando las funciones
como el uso de Etiquetas, Lazos,  String, StringBuilder, append().
cuidar que el codigo sea optimo en el uso de recursos del ordenar donde se ejecuta

Consulta marco teorico:

-las funciones principales de String, (de envoltorio?), StringBuilder y su descripcion

- crear menu imprimible, definir todos los objetos e imprimirlos todos, sin Arrays usando las funciones que ocupamos

 */