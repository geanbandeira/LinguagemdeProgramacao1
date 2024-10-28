package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Aula4Ex4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Progressão Geométrica");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(null);

        JLabel limiteInferiorLabel = new JLabel("Limite Inferior:");
        JTextField limiteInferiorField = new JTextField();
        
        JLabel limiteSuperiorLabel = new JLabel("Limite Superior:");
        JTextField limiteSuperiorField = new JTextField();
        
        JLabel razaoLabel = new JLabel("Razão da PG:");
        JTextField razaoField = new JTextField();
        
        JButton calcularButton = new JButton("Calcular PG");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        limiteInferiorLabel.setBounds(20, 20, 150, 25);
        limiteInferiorField.setBounds(180, 20, 150, 25);
        
        limiteSuperiorLabel.setBounds(20, 60, 150, 25);
        limiteSuperiorField.setBounds(180, 60, 150, 25);
        
        razaoLabel.setBounds(20, 100, 150, 25);
        razaoField.setBounds(180, 100, 150, 25);
        
        calcularButton.setBounds(20, 140, 310, 30);
        
        resultadoArea.setBounds(20, 180, 310, 70);
        
        frame.add(limiteInferiorLabel);
        frame.add(limiteInferiorField);
        frame.add(limiteSuperiorLabel);
        frame.add(limiteSuperiorField);
        frame.add(razaoLabel);
        frame.add(razaoField);
        frame.add(calcularButton);
        frame.add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double limiteInferior = Double.parseDouble(limiteInferiorField.getText());
                    double limiteSuperior = Double.parseDouble(limiteSuperiorField.getText());
                    double razao = Double.parseDouble(razaoField.getText());

                    StringBuilder termosPG = new StringBuilder("Os termos da PG são:\n");
                    double termo = limiteInferior;

                    while (termo <= limiteSuperior) {
                        termosPG.append(String.format("%.2f", termo)).append(" ");
                        termo *= razao;
                    }
                    
                    resultadoArea.setText(termosPG.toString());
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor insira valores válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}