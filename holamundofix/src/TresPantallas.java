import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TresPantallas extends JFrame implements ActionListener {
    private final JButton btn;
    private final JTextField txtNombre;

    public TresPantallas() {
        // Configuración de la primera pantalla
        super("Pantalla 1");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new FlowLayout());
        JLabel label = new JLabel("Hola Mundo");
        btn = new JButton("Haz clic aquí");
        btn.addActionListener(this);

        panel.add(label);
        panel.add(btn);
        add(panel);

        // Configuración de la segunda pantalla
        JFrame pantalla2 = new JFrame("Pantalla 2");
        pantalla2.setSize(300, 200);
        pantalla2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pantalla2.setLocationRelativeTo(null);

        JPanel panel2 = new JPanel(new FlowLayout());
        JLabel label2 = new JLabel("Ingresa tu nombre:");
        txtNombre = new JTextField(10);
        JButton btn2 = new JButton("Aceptar");
        btn2.addActionListener(this);

        panel2.add(label2);
        panel2.add(txtNombre);
        panel2.add(btn2);
        pantalla2.add(panel2);

        // Mostrar la primera pantalla
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btn) {
            // Mostrar la segunda pantalla
            setVisible(false);
            JFrame pantalla2 = new JFrame("Pantalla 2");
            pantalla2.setVisible(true);
        } else {
            // Mostrar la tercera pantalla con el mensaje de bienvenida personalizado
            String nombre = txtNombre.getText();
            setVisible(false);
            JFrame pantalla3 = new JFrame("Pantalla 3");
            pantalla3.setSize(300, 200);
            pantalla3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            pantalla3.setLocationRelativeTo(null);

            JPanel panel3 = new JPanel(new FlowLayout());
            JLabel label3 = new JLabel("¡Bienvenido " + nombre + "!");
            panel3.add(label3);
            pantalla3.add(panel3);

            pantalla3.setVisible(true);
        }
    }

    public static void main(String[] args) {
        new TresPantallas();
    }
}
