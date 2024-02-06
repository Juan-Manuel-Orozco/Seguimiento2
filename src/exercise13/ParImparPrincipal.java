package exercise13;
    import exercise13.ParImpar;

    import javax.swing.*;

public class ParImparPrincipal {
    public static void main(String[] args) {
        ParImpar parimpar = new ParImpar();
        parimpar.number1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        JOptionPane.showConfirmDialog(null, parimpar.calc());
    }
}
