import javax.swing.*;

class operaciones {
    public static void main(String[] args) {
        String Y = JOptionPane.showInputDialog("Ingerese un numero entero ");
        String X = JOptionPane.showInputDialog("Ingrese un numero entero");
        String N = JOptionPane.showInputDialog("Ingrese un numero decimal");
        String M = JOptionPane.showInputDialog("Ingrese un numero decimal");
        int x = Integer.parseInt(X);
        int y = Integer.parseInt(Y);
        Double n = Double.parseDouble(N);
        Double m = Double.parseDouble(M);
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        int x4 = 0;
        int x5 = 0;
        double n1 = 0;
        double n2 = 0;
        double n3 = 0;
        double n4 = 0;
        double n5 = 0;
        double y1 = 0.0;
        double y2 = 0.0;
        double y3 = 0.0;
        double m1 = 0.0;
        double m2 = 0.0;
        double m3 = 0.0;
        double m4 = 0.0;
        double suma = 0.0;
        double produto = 0.0;
        x1 = x + y;
        x2 = x - y;
        x3 = x * y;
        x4 = x / y;
        x5 = x % y;
        n1 = n + m;
        n2 = n - m;
        n3 = n * m;
        n4 = n / m;
        n5 = n % m;
        y1 = x + n;
        y2 = y / m;
        y3 = y % m;
        m1 = x * 2;
        m2 = y * 2;
        m3 = n * 2;
        m4 = m * 2;
        suma = x + y + n + m;
        produto = x * y * n * m;
        JOptionPane.showMessageDialog(null, "La suma entre X y Y es: " + x1);
        JOptionPane.showMessageDialog(null, "La diferencia entre X y Y es : " + x2);
        JOptionPane.showMessageDialog(null, " El producto entre X y Y es: " + x3);
        JOptionPane.showMessageDialog(null, "El cociente entre X y Y es: " + x4);
        JOptionPane.showMessageDialog(null, "El residuo entre X y Y es; " + x5);
        JOptionPane.showMessageDialog(null, "La suma entre N y M es: " + n1);
        JOptionPane.showMessageDialog(null,"La diferencia entre N y M es : " + n2);
        JOptionPane.showMessageDialog(null," El producto entre N y M es: " + n3);
        JOptionPane.showMessageDialog(null, "El cociente entre N y M es: " + n4);
        JOptionPane.showMessageDialog(null,"El residuo entre N y M es: " + n5 );
        JOptionPane.showMessageDialog(null, "La suma entre X y N es: " + y1 );
        JOptionPane.showMessageDialog(null,"El cociente entre Y y M es : " + y2);
        JOptionPane.showMessageDialog(null,"El residuo  entre Y y M es : " + y3);
        JOptionPane.showMessageDialog(null,"El doble de la variable X es: " + m1);
        JOptionPane.showMessageDialog(null,"El doble de la variable Y es: " + m2);
        JOptionPane.showMessageDialog(null,"El doble de la variable N es: " + m3);
        JOptionPane.showMessageDialog(null,"El doble de la variable M es: " + m4);
        JOptionPane.showMessageDialog(null,"La suma de las variables X,Y,N,M es: " + suma);
        JOptionPane.showMessageDialog(null,"El producto entre las variables X,Y,N,M es: " + produto);
    }
}