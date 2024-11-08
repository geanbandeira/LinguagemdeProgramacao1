package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Aula4Ex5 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Contador de Pares e Ímpares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JButton contarButton = new JButton("Contar Pares e Ímpares");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        contarButton.setBounds(20, 20, 240, 30);
        resultadoArea.setBounds(20, 60, 240, 80);
        
        frame.add(contarButton);
        frame.add(resultadoArea);

        contarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Random random = new Random();
                int quantidadePares = 0;
                int quantidadeImpares = 0;

                for (int i = 0; i < 100; i++) {
                    int numeroAleatorio = random.nextInt(10) + 1; 
                    if (numeroAleatorio % 2 == 0) {
                        quantidadePares++;
                    } else {
                        quantidadeImpares++;
                    }
                }

                resultadoArea.setText("Quantidade de números pares: " + quantidadePares + "\n" +
                                       "Quantidade de números ímpares: " + quantidadeImpares);
            }
        });

        frame.setVisible(true);
    }
}