package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula4Ex3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progressão Aritmética");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel primeiroTermoLabel = new JLabel("Primeiro termo da PA:");
        JTextField primeiroTermoField = new JTextField();
        
        JLabel razaoLabel = new JLabel("Razão da PA:");
        JTextField razaoField = new JTextField();
        
        JLabel numeroTermosLabel = new JLabel("Número de termos:");
        JTextField numeroTermosField = new JTextField();
        
        JButton calcularButton = new JButton("Calcular");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        primeiroTermoLabel.setBounds(20, 20, 150, 25);
        primeiroTermoField.setBounds(180, 20, 150, 25);
        
        razaoLabel.setBounds(20, 60, 150, 25);
        razaoField.setBounds(180, 60, 150, 25);
        
        numeroTermosLabel.setBounds(20, 100, 150, 25);
        numeroTermosField.setBounds(180, 100, 150, 25);
        
        calcularButton.setBounds(20, 140, 310, 30);
        
        resultadoArea.setBounds(20, 180, 310, 70);
        
        frame.add(primeiroTermoLabel);
        frame.add(primeiroTermoField);
        frame.add(razaoLabel);
        frame.add(razaoField);
        frame.add(numeroTermosLabel);
        frame.add(numeroTermosField);
        frame.add(calcularButton);
        frame.add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int primeiroTermo = Integer.parseInt(primeiroTermoField.getText());
                    int razao = Integer.parseInt(razaoField.getText());
                    int numeroTermos = Integer.parseInt(numeroTermosField.getText());

                    StringBuilder termosPA = new StringBuilder("Os termos da PA são:\n");
                    for (int i = 0; i < numeroTermos; i++) {
                        int termo = primeiroTermo + i * razao;
                        termosPA.append(termo).append(" ");
                    }
                    
                    resultadoArea.setText(termosPA.toString());
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor insira valores válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}