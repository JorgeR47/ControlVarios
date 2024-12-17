package control;

public class AppTiempo {
    public static void main(String[] args) {
        Tiempo tp1 = new Tiempo();

        try {
            tp1.setTiempo(23,4,9);
            //System.out.println(tp1.tUniversal());
        }catch (IllegalArgumentException e) {
            System.out.printf("Hubo mal ingreso de datos: %s%n",e.getMessage());
        }
        System.out.println(tp1.tUniversal());
        System.out.println(tp1.tGringo());

        OtroTiempo tp2= new OtroTiempo();
        System.out.println(tp2.tUniversal());



    }
}
