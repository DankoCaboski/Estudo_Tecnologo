import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormLugar extends JFrame {
    private JLabel enderecoLabel, nomeLugarLabel, tipoLabel;
    private JTextField enderecoTextField, nomeLugarTextField, tipoTextField;
    private JButton salvarButton;

    public FormLugar() {
        super("Lugar");

        enderecoLabel = new JLabel("Endereço:");
        nomeLugarLabel = new JLabel("Nome do lugar:");
        tipoLabel = new JLabel("Tipo do lugar:");

        enderecoTextField = new JTextField("endereço".length());
        nomeLugarTextField = new JTextField("Nome completo".length());
        tipoTextField = new JTextField("Complemento".length());

        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obter as informações inseridas
                String endereco = enderecoTextField.getText();
                String nomeLugar = nomeLugarTextField.getText();
                String tipo = tipoTextField.getText();

                // Alimentar as variáveis no código original
                System.out.println("Endereço do lugar: " + endereco);
                System.out.println("Nome do lugar: " + nomeLugar);
                System.out.println("Tipo do lugar: " + tipo);
                Lugar lugar = new Lugar(endereco, nomeLugar, tipo);
            }
        });

        JPanel panel = new JPanel(new GridLayout(8, 2));
        panel.add(enderecoLabel);
        panel.add(enderecoTextField);
        panel.add(nomeLugarLabel);
        panel.add(nomeLugarTextField);
        panel.add(tipoLabel);
        panel.add(tipoTextField);
        panel.add(new JLabel());
        panel.add(salvarButton);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FormLugar form = new FormLugar();
        form.setSize(300, 300);
    }
}
