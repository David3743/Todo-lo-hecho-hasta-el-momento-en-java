public class  Estudiante {
    public String nombre;
    public int edad;
    public String programa;
    public String tipo_etnia;
    public Estudiante(String nombre, int edad, String programa, String tipo_etnia){
        this.nombre=nombre;
        this.edad=edad;
        this.programa=programa;
        this.tipo_etnia=tipo_etnia;
    }
    @Override
    public String toString( ){
        String mensaje=
                "\tNombre: "+ nombre + "\n" +
                        "\tEdad: "+edad+ " " + "anios"+"\n" +
                        "\tPrograma: "+programa+"\n" +
                        "\tEtnia: "+tipo_etnia+"\n";

    return mensaje;
    }
}
