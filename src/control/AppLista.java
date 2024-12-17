package control;
import java.util.EnumSet;

public class AppLista {

    public static void main(String[] args) {
        System.out.println("Mis libros:");
        for (Lista libros: Lista.values()){
            System.out.printf("%-20s %-5s %-50s%n",libros.getAutor(),libros.getAnio(),libros.getResumen());
        }
//todo imprimir un solo autor
        System.out.println("Los libros de Homero:");
        for (Lista libros: EnumSet.range(Lista.ILIADA,Lista.ODISEA)){
            System.out.printf("%-20s %-5s %-50s%n",libros.getAutor(),libros.getAnio(),libros.getResumen());
        }
        /*
        TODo DEBER 2, CREAR OTRA LISTA
        todo consulktar que puedo hacer con Enum y ENUMsET
        TODO COMENTAR, ESTA FUNCION CON OTRA HACE ESTO

        libros de un informatico, gracias al EnumSet
        crear minimo 5 funciones
         */


    }
}
