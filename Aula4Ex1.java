package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AulaEx1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Números Ímpares de 1 a 100");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900, 300);
        frame.setLayout(null);

        JButton gerarButton = new JButton("Mostrar Números Ímpares");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        gerarButton.setBounds(20, 20, 250, 30);
        resultadoArea.setBounds(20, 60, 850, 60);
        
        frame.add(gerarButton);
        frame.add(resultadoArea);

        gerarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder numerosImpares = new StringBuilder("Números Ímpares de 1 a 100:\n");
                for (int i = 1; i <= 100; i++) {
                    if (i % 2 != 0) {
                        numerosImpares.append(i).append(" ");
                    }
                }
                resultadoArea.setText(numerosImpares.toString());
            }
        });

        frame.setVisible(true);
    }
}
