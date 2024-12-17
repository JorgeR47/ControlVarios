package control;

public enum Lista {
    /*
    Enum dependende de un nombre, y
    que sean referidos los contenidos
    internos del enum
     */
    ILIADA("Homero", "1965", "La guerra de Troya"),
    ODISEA("Homero", "1965", "Odiseo en el oceano"),
    DIVINACOMEDIA("Dante", "1980", "Dante en el infierno"),
    HARRYPOTTER("J.K.Rowling", "1997", "Aventuras magicas");

    /*
    los atributos de las Ctes no pueden ser modificados, van con final
     */

    private final String autor;
    private final String anio;
    private final String resumen;

    Lista(String autor, String anio, String resumen) {
        this.autor = autor;
        this.anio = anio;
        this.resumen = resumen;
    }

    public String getAutor() {
        return autor;
    }

    public String getAnio() {
        return anio;
    }

    public String getResumen() {
        return resumen;
    }
}
