package control;

public class OtroTiempo {
    private int segundo;
    private int hora;
    private int minuto;

    public OtroTiempo() {
        this(0,0,0);
    }

    public OtroTiempo(int hora) {
        this(hora,0,0);
    }
    public OtroTiempo(int hora, int minuto) {
        this(hora,minuto,0);
    }

    public OtroTiempo(int hora, int minuto, int segundo) {
        //todo con excepciones
        // PARAMETRO INGRESADO DESDE TECLADO, NO DEFINIDO INTERAMENTE
        if(hora<0 || hora>=24) {
            throw new IllegalArgumentException("HORA no es valido 0-23");
        }

        if(minuto<0 || minuto>=60 ) {
            throw new IllegalArgumentException("MIN no es valido 0-59");
        }
        if(segundo<0 || segundo>=60) {
            throw new IllegalArgumentException("SEG no es valido 0-59");
        }
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public OtroTiempo(OtroTiempo tiempo){
        /*
        todo deber1
        crear funciones de tiempo, tiempo gringo
        añadir getters y setters
        los setters sacan excepciones si no estan en rango correcto
         */
        this(tiempo.hora, tiempo.minuto, tiempo.segundo);
    }

    public String tUniversal(){
        return String.format("%02d:%02d:%02d",this.hora,this.minuto,this.segundo);
        /*
        %02d, 2 digitos de un numero y siempre inicia por cero
         */
    }

}
