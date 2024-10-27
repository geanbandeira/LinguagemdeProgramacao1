package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula4Ex2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Verificação de Número Primo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(null);

        JLabel numeroLabel = new JLabel("Digite um número:");
        JTextField numeroField = new JTextField();
        
        JButton verificarButton = new JButton("Verificar");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        numeroLabel.setBounds(20, 20, 150, 25);
        numeroField.setBounds(150, 20, 100, 25);
        
        verificarButton.setBounds(20, 60, 230, 30);
        
        resultadoArea.setBounds(20, 100, 230, 50);
        
        frame.add(numeroLabel);
        frame.add(numeroField);
        frame.add(verificarButton);
        frame.add(resultadoArea);

        verificarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int numero = Integer.parseInt(numeroField.getText());
                    if (isPrimo(numero)) {
                        resultadoArea.setText(numero + " é um número primo.");
                    } else {
                        resultadoArea.setText(numero + " não é um número primo.");
                    }
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor insira um número válido.");
                }
            }
        });

        frame.setVisible(true);
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; 
            }
        }
        
        return true;
    }
}