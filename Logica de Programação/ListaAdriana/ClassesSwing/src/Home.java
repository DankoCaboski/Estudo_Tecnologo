import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame {

    public Home() {
        super("Home");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crie os botões
        JButton botao1 = new JButton("Lugar");
        JButton botao2 = new JButton("Veículo");
        JButton botao3 = new JButton("Viagem");

        botao1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crie uma nova janela e mostre-a
                FormLugar tela1 = new FormLugar();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tela1.setVisible(true);
            }
        });

        botao2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crie uma nova janela e mostre-a
                FormVeiculo tela2 = new FormVeiculo();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tela2.setVisible(true);
            }
        });

        botao3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Crie uma nova janela e mostre-a
                FormViagem tela3 = new FormViagem();
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                tela3.setVisible(true);
            }
        });

        // Adicione os botões ao painel
        JPanel painel = new JPanel(new GridLayout(8, 8));
        setSize(300, 300);
        painel.add(botao1);
        painel.add(botao2);
        painel.add(botao3);

        // Adicione o painel à janela e mostre a janela
        getContentPane().add(painel);
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Home();
    }
}
