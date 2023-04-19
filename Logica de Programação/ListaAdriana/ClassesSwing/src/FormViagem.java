import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormViagem extends JFrame {
    private JLabel enderecoLabel, nomeLugarLabel, tipoLabel, Horasaida;
    private JTextField enderecoTextField, nomeLugarTextField, tipoTextField, horasaida;
    private JButton salvarButton;

    public FormViagem() {
        super("Viagem");

        enderecoLabel = new JLabel("Partída: ");
        nomeLugarLabel = new JLabel("Destino: ");
        tipoLabel = new JLabel("Meio de transporte: ");
        Horasaida = new JLabel("Horário de saída: ");

        enderecoTextField = new JTextField(20);
        nomeLugarTextField = new JTextField(20);
        tipoTextField = new JTextField(20);
        horasaida = new JTextField(20);

        salvarButton = new JButton("Salvar");
        salvarButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obter as informações inseridas
                String endereco = enderecoTextField.getText();
                String nomeLugar = nomeLugarTextField.getText();
                String tipo = tipoTextField.getText();
                Integer hora = Integer.valueOf(tipoTextField.getText());

                // Alimentar as variáveis no código original
                System.out.println("Partida: " + endereco);
                System.out.println("Destino: " + nomeLugar);
                System.out.println("Meio de transporte: " + tipo);
                System.out.println("Horário de saída: " + hora);
                Viagem viagem = new Viagem(endereco, nomeLugar, tipo, hora);
            }
        });

        JPanel panel = new JPanel(new GridLayout(9, 2));
        panel.add(enderecoLabel);
        panel.add(enderecoTextField);
        panel.add(nomeLugarLabel);
        panel.add(nomeLugarTextField);
        panel.add(tipoLabel);
        panel.add(tipoTextField);
        panel.add(Horasaida);
        panel.add(horasaida);
        panel.add(new JLabel());
        panel.add(salvarButton);

        getContentPane().add(panel);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        FormViagem form = new FormViagem();
       form.setSize(300, 300);
    }
}
