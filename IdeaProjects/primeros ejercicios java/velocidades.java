import javax.swing.*;

class velocidades {
    public static void main(String[] args) {
        String Velocidad = JOptionPane.showInputDialog("Ingrese la velocidad que quiere convertir");
        Double velocidad = Double.parseDouble(Velocidad);
        velocidad = velocidad * 5 / 18;
        JOptionPane.showMessageDialog(null, "La velocidad de k/h a m/s es de: " + velocidad + " m/s");
    }
}