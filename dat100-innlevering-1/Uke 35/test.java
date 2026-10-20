import javax.swing.JOptionPane;

public class test {
    public static void main(String[] args) {
        String navn = JOptionPane.showInputDialog("Skriv inn ditt navn: ");
        JOptionPane.showMessageDialog(null, "Hei, " + navn + "!");
        
        String alder = JOptionPane.showInputDialog("Alder: ");
        JOptionPane.showMessageDialog(null, "Alder: " + alder);
    }
}