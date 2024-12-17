package control;

public class Tiempo {
    private int segundo;
    private int hora;
    private int minuto;

    //public Tiempo() {} constructor sobreentendido, puede estar o no, puedo ejecutar
    //todo no pertenece a Tiempo, sino a una clase superior denominada OBJECT
    /*
    cada clase genera una referencia de memoria,
    cada objeto siempre puede ser instanciado. todo No se debe usar
     */

    /*
    se hace uso de un else
     */

    public void setTiempo(int hora, int minuto, int segundo) {
        if(hora>=0 && hora<24 && minuto>=0 && minuto<60 && segundo>=0 && segundo<60) {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }else {
            throw new IllegalArgumentException("algun valor ingresado no es valido");
        }

    }

    /*
    con rpta negativa (cunado todo sale mal) evitando un else
     */
    public void setTiempo2(int hora, int minuto, int segundo) {
        if(hora<0 || hora>=24 || minuto<0 || minuto>=60 || segundo<0 || segundo>=60) {
            throw new IllegalArgumentException("algun valor ingresado no es valido");
        }
        /*
        //todo no me interesa si es true, ya que eso es lo que busco
        todo con esto el programa es mas ligero
        else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }*/

    }

    public String tUniversal(){
        return String.format("%02d:%02d:%02d",this.hora,this.minuto,this.segundo);
        /*
        %02d, 2 digitos de un numero y siempre inicia por cero
         */
    }

    public String tGringo(){
        /*
       todo  validacion automatica
         */

        return String.format("%02d:%02d:%02d %s",(this.hora==0 || this.hora==12)?12:this.hora%12,
                this.minuto,
                this.segundo,(this.hora<12)?"AM":"PM");
    }
}
