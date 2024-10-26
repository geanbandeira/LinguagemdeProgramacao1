package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atv3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cálculo de Notas e Frequência");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(null);

        JLabel nota1Label = new JLabel("Nota da 1° avaliação:");
        JTextField nota1Field = new JTextField();
        
        JLabel nota2Label = new JLabel("Nota da 2° avaliação:");
        JTextField nota2Field = new JTextField();
        
        JLabel projetoLabel = new JLabel("Nota do projeto:");
        JTextField projetoField = new JTextField();
        
        JLabel aulasLabel = new JLabel("Total de aulas do bimestre:");
        JTextField aulasField = new JTextField();
        
        JLabel frequenciaLabel = new JLabel("Aulas frequentadas:");
        JTextField frequenciaField = new JTextField();
        
        JButton calcularButton = new JButton("Calcular");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        nota1Label.setBounds(20, 20, 180, 25);
        nota1Field.setBounds(200, 20, 150, 25);
        
        nota2Label.setBounds(20, 60, 180, 25);
        nota2Field.setBounds(200, 60, 150, 25);
        
        projetoLabel.setBounds(20, 100, 180, 25);
        projetoField.setBounds(200, 100, 150, 25);
        
        aulasLabel.setBounds(20, 140, 180, 25);
        aulasField.setBounds(200, 140, 150, 25);
        
        frequenciaLabel.setBounds(20, 180, 180, 25);
        frequenciaField.setBounds(200, 180, 150, 25);
        
        calcularButton.setBounds(20, 220, 330, 30);
        
        resultadoArea.setBounds(20, 260, 330, 80);
        
        frame.add(nota1Label);
        frame.add(nota1Field);
        frame.add(nota2Label);
        frame.add(nota2Field);
        frame.add(projetoLabel);
        frame.add(projetoField);
        frame.add(aulasLabel);
        frame.add(aulasField);
        frame.add(frequenciaLabel);
        frame.add(frequenciaField);
        frame.add(calcularButton);
        frame.add(resultadoArea);

        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double prova1 = Double.parseDouble(nota1Field.getText());
                    double prova2 = Double.parseDouble(nota2Field.getText());
                    double projeto = Double.parseDouble(projetoField.getText());
                    int aulas = Integer.parseInt(aulasField.getText());
                    double frequencia = Double.parseDouble(frequenciaField.getText());

                    double notaFinal = (prova1 * 0.35) + (prova2 * 0.35) + (projeto * 0.30);
                    double aulasMinimo = aulas * 0.75;

                    String resultado;

                    if (frequencia < aulasMinimo) {
                        resultado = "Aluno Reprovado por faltas.";
                    } else if (notaFinal > 6) {
                        resultado = "Parabéns! Aluno Aprovado!";
                    } else if (notaFinal > 4) {
                        resultado = "Aluno em Exame!";
                    } else {
                        resultado = "Aluno Reprovado por nota.";
                    }

                    resultadoArea.setText(resultado + "\nNota Final: " + String.format("%.2f", notaFinal));
                } catch (NumberFormatException ex) {
                    resultadoArea.setText("Por favor insira valores válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}