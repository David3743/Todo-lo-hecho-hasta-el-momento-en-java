import javax.swing.*;

class masacorporal {
    public static void main(String[] args) {
        String altura = JOptionPane.showInputDialog(" Ingrese su altura");
        String Peso = JOptionPane.showInputDialog("Ingrese su peso");
        Double altura1 = Double.parseDouble(altura);
        Double Peso1 = Double.parseDouble(Peso);
        Double masa_corporal = null;
        double altura2 = altura1*altura1;
        masa_corporal =Peso1/altura2;
        JOptionPane.showMessageDialog(null, masa_corporal);



    }
}