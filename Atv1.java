package com.ifsp;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Atv1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ordenação de Números");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setLayout(null);

        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JTextField num3Field = new JTextField();
        
        JLabel label1 = new JLabel("Primeiro Número:");
        JLabel label2 = new JLabel("Segundo Número:");
        JLabel label3 = new JLabel("Terceiro Número:");
        
        JButton calculateButton = new JButton("Ordenar");
        
        JTextArea resultArea = new JTextArea();
        resultArea.setEditable(false);
        
        label1.setBounds(20, 20, 150, 25);
        num1Field.setBounds(160, 20, 100, 25);
        
        label2.setBounds(20, 60, 150, 25);
        num2Field.setBounds(160, 60, 100, 25);
        
        label3.setBounds(20, 100, 150, 25);
        num3Field.setBounds(160, 100, 100, 25);
        
        calculateButton.setBounds(20, 140, 240, 30);
        
        resultArea.setBounds(20, 180, 240, 60);
        
        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(label3);
        frame.add(num3Field);
        frame.add(calculateButton);
        frame.add(resultArea);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int num3 = Integer.parseInt(num3Field.getText());

                    int[] nums = {num1, num2, num3};
                    java.util.Arrays.sort(nums);

                    resultArea.setText("Números Ordenados:\n" + nums[0] + "\n" + nums[1] + "\n" + nums[2]);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Por favor insira números válidos.");
                }
            }
        });

        frame.setVisible(true);
    }
}