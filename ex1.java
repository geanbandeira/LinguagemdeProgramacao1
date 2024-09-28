package test;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class teste {
    public static void main(String[] args) {
        // Criando a janela
        JFrame frame = new JFrame("Exemplo Básico de JButton");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null); // Layout nulo para posicionamento manual

        // Criando o botão
        JButton button = new JButton("Clique Aqui");
        button.setBounds(100, 80, 100, 30); // Posição e tamanho do botão

        // Adicionando ActionListener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Botão clicado!");
            }
        });

        // Adicionando o botão à janela
        frame.add(button);

        // Tornando a janela visível
        frame.setVisible(true);
    }
}
