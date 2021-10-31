import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
    double area;

    String raio = JOptionPane.showInputDialog(null, "Digite o valor do raio do circulo", "Raio", JOptionPane.QUESTION_MESSAGE);
    double raioS = Double.parseDouble(raio);
    area = Math.PI*(Math.pow(raioS,2));
    String msg = String.format( "%.2f", area);

    JOptionPane.showMessageDialog(null, "A area do circulo é de: " + msg, "Circulo", JOptionPane.INFORMATION_MESSAGE);
    }
}
