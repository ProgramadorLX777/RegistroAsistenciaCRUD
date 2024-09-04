package Test;

import javax.swing.*;
import java.awt.event.*;

public class AsistenciaTest {

    public static void main(String[] args) {

        // Crear el marco
        JFrame frame = new JFrame("Ejemplo de Botones");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Crear el label
        JLabel label = new JLabel();
        label.setBounds(50, 50, 300, 30);
        label.setVisible(false); // Inicialmente oculto
        frame.add(label);

        // Crear el botón verde
        JButton greenButton = new JButton("Botón Verde");
        greenButton.setBounds(50, 100, 120, 30);
        greenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setText("Texto personalizado para el botón verde");
                label.setVisible(true); // Mostrar el label
            }
        });
        frame.add(greenButton);

        // Crear el botón rojo
        JButton redButton = new JButton("Botón Rojo");
        redButton.setBounds(200, 100, 120, 30);
        redButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Aquí puedes agregar otra acción para el botón rojo
                JOptionPane.showMessageDialog(frame, "Botón rojo presionado");
            }
        });
        frame.add(redButton);

        // Mostrar el marco
        frame.setVisible(true);

    }

}
