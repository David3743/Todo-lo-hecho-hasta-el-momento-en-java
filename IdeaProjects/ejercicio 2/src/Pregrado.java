public class Pregrado extends Estudiante{
    public int Cantidad_creditos;
    public Pregrado (String nombre, int edad, String programa, String tipo_etnia, int Cantidad_creditos ){
        super(nombre,edad,programa,tipo_etnia);
        this.Cantidad_creditos = Cantidad_creditos;
    }
    @Override
    public String toString(){
        String mensaje=
                "\tEstudiante Pregrado\n"+
                super.toString() + "\tCreditos aprobados: " + Cantidad_creditos;
        return mensaje;
    }
}