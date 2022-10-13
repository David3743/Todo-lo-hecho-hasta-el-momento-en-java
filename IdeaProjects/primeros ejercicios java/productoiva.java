import javax.swing.*;

class productoiva {
    public static void main(String[] args) {
        String iva = JOptionPane.showInputDialog("Ingrese el producto al cual se le quiere añadir el iva");
        Double iva1 = Double.parseDouble(iva);
        Double iva4 = 0.0;
        Double iva3 = 0.0;
        iva3= iva1 * 0.21 ;
        iva4 = iva1 + iva3;
        JOptionPane.showMessageDialog(null, "El  valor del producto con iva es de:" + iva4);


        
    }
}