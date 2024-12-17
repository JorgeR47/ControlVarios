package control;

public class BucleEtiquetas {
    
    public static void main(String[] args) {
        
        
        // La etiqueta1 menciona al lazo for primero, pero el break, al salir al mismo lazo, no hacer ninguna diferencia
        etiqueta1:
        for(int i = 0; i <= 10; i++) {
            
            if(i==8) {
                
                System.out.println("Hola");
                break etiqueta1;
            }
            System.out.println(i);
        }

        System.out.println();

        // sucede lo mismo que en el ejercicio anterior
        etiqueta2:
        for(int i = 0; i <= 10; i++) {

            if(i == 8) {

                System.out.println("Hola");
                continue etiqueta2;
            }
        }

        System.out.println();

        for(int i = 0; i <= 10; i++) {

            etiqueta3:
            if(i == 8) {
                
                System.out.println("Hola");
                break etiqueta3;
            }
            System.out.println(i);
        }

        // Ejercicio completo de conceptos de etiquetas

        char letra;
        int vocal = 0;
        int consonante = 0;
        int espacios = 0;
        String frase = "Con este ejercicio aprenderemos como se ven las etiquetas en java";

        lb1: for(int i = 0; i < frase.length(); i++) {

            letra = frase.toLowerCase().charAt(i);

            lb2: if(letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

                if(letra == 'a') {

                    System.out.println("A la letra a no la vamos a contar");
                    continue lb1;
                }
                
                vocal++;
            } else if(letra == ' ') {

                espacios++;
            } else {

                consonante++;
            }
        }
        System.out.printf("En total hay %d vocales, %d consonantes y %d espacios", vocal, consonante, espacios);
    }
}
