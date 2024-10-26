package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atv2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de Consumo de Água");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        JLabel mesLabel = new JLabel("Mês: (Jan/.../Dez)");
        JTextField mesField = new JTextField();
        
        JLabel consumoLabel = new JLabel("Consumo (m³):");
        JTextField consumoField = new JTextField();
        
        JButton calcularButton = new JButton("Calcular");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        mesLabel.setBounds(20, 20, 100, 25);
        mesField.setBounds(120, 20, 150, 25);
        
        consumoLabel.setBounds(20, 60, 100, 25);
        consumoField.setBounds(120, 60, 150, 25);
        
        calcularButton.setBounds(20, 100, 250, 30);
        
        resultadoArea.setBounds(20, 140, 250, 80);
        
        frame.add(mesLabel);
        frame.add(mesField);
        frame.add(consumoLabel);
        frame.add(consumoField);
        frame.add(calcularButton);
        frame.add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String mes = mesField.getText();
                    double consumo = Double.parseDouble(consumoField.getText());

                    String resultado;
                    if (consumo < 10) {
                        resultado = "Total para o mês " + mes + ": R$ 5,00.";
                    } else if (consumo < 15) {
                        resultado = "Total para o mês " + mes + ": R$ 8,00.";
                    } else {
                        resultado = "Total para o mês " + mes + ": R$ 15,00.";
                    }

                    resultadoArea.setText(resultado);
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor insira um número válido para o consumo.");
                }
            }
        });

        frame.setVisible(true);
    }
}