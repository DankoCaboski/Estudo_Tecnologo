import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormVeiculo extends JFrame {
    private JLabel enderecoLabel, nomeLugarLabel, tipoLabel;
    private JTextField enderecoTextField, nomeLugarTextField, tipoTextField;
    private JButton salvarButton;

    public FormVeiculo() {
        super("Veículo");

        enderecoLabel = new JLabel("Marca: ");
        nomeLugarLabel = new JLabel("Modelo: ");
        tipoLabel = new JLabel("Ano de fabricacao: ");

        enderecoTextField = new JTextField(20);
        nomeLugarTextField = new JTextField(20);
        tipoTextField = new JTextField(20);

        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obter as informações inseridas
                String endereco = enderecoTextField.getText();
                String nomeLugar = nomeLugarTextField.getText();
                String tipo = tipoTextField.getText();

                // Alimentar as variáveis no código original
                System.out.println("Marca: " + endereco);
                System.out.println("Modelo: " + nomeLugar);
                System.out.println("Ano de fabricacao: " + tipo);
                Veiculo veiculo = new Veiculo(endereco, nomeLugar, Integer.parseInt(tipo));
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
        FormVeiculo form = new FormVeiculo();
        form.setSize(300, 300);
    }
}
