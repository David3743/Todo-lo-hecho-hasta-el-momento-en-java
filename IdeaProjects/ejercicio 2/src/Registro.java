
import java.util.ArrayList;
import java.util.Scanner;
public class Registro {
    public static void main(String[] args ){
        Registro coleccion = new Registro();
        coleccion.procesarComandos();
    }
    public ArrayList<Object> listaEstudiantes = new ArrayList<>();
    public void agregarEstudiante(String[] line) {
        String nombre = line[2];
        int edad = Integer.parseInt(line[3]);
        String programa = line[4];
        String tipo_etnia = line[5];
        if (line[1].equals("Pregrado")) {
            int Cantidad_creditos = Integer.parseInt(line[6]);
            Pregrado pregrado = new Pregrado (nombre, edad, programa, tipo_etnia, Cantidad_creditos);
            listaEstudiantes.add(pregrado);
        } else if (line[1].equals("Posgrado")) {
            String Modalidad = line[6];
            Posgrado posgrado = new Posgrado(nombre, edad, programa, tipo_etnia, Modalidad);
            listaEstudiantes.add(posgrado);
        }
    }

    public void listarEstudiantes() {
        System.out.println("***Listado de estudiantes***");
        for (Object tripulante : listaEstudiantes) {
            System.out.println(tripulante);
        }
    }

    public void procesarComandos() {
        Scanner sc = new Scanner(System.in);
        String [] line;
        do {
            String a = sc.nextLine();
            line = a.split("&");
            if (line[0].equals("1")) {
                agregarEstudiante(line);
            } else if (line[0].equals("2")){
                listarEstudiantes();
            }
        }
        while (!line[0].equals("3"));

    }

}
