package control;

public class StringP {
    public static void main(String[] args) {
        String uno = "Correo Electronico";
        String dos = uno; // si modifico 1, no cambia 2. Asignacion directa de objeto a objeto
        String tres = "Correo Electronico";

//        uno ="ciencia";
//        dos = uno;
        System.out.printf("%s, %s, %s%n",uno, dos, tres);
        /*
        no imprimo el valor de 3,
        analogia quien eres? y entrego atomos

        Conversion de String, convertir en cadena de caracteres para identificar instancia de casa clase
        todo tres no vale correoElectronico, el objeto tres tiene como contenido interno correoEl
         lo que imprimo es la forma canonica del objeto

         todo el objeto es la memoria y datos almacenados
         a nivel de valor son iguales, a nivel objeto NO

         */
        System.out.println(uno == dos); // asumo imprime false, compruebo en ejecucion
        System.out.println(dos == tres);  // asumo imprime false, compruebo en ejecucion
        System.out.println(uno.equals(tres));  // asumo imprime false, compruebo en ejecucion
        System.out.println(tres.equals(dos)); // asumo imprime false, compruebo en ejecucion
        //en este caso se obtiene true por ser la misma cadena de String
        /*
        en documentacion, (tres.equals(dos)) ; el equals compara el CONTENIDO del objeto
         */

        String cuatro =new String("carta"); //el original, es un predeterminado
        System.out.println("---------------");
        String cinco ="carta";
        System.out.println(cuatro == cinco); //todo no salen lo mismo, uno es original y el otro no
        System.out.println(cinco == cuatro.intern()); //todo intern devuelve forma canonica de String
        System.out.println(cuatro.equals(cinco));
        System.out.println(uno.equals(cuatro));

        /*
        para comparar
         */

    }
}
