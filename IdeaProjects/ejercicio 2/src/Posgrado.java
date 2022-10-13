public class Posgrado extends Estudiante {
    public String Modalidad;

    public Posgrado(String nombre, int edad, String programa, String tipo_etnia, String Modalidad) {
        super(nombre, edad, programa, tipo_etnia);
        this.Modalidad = Modalidad;
    }

    @Override
    public String toString() {
        String mensaje =
                "\tEstudiante Posgrado\n" +
                        super.toString() + "\tModalidad: " + Modalidad;
        return mensaje;
    }
}