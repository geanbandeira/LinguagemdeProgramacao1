package com.ifsp;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Atv1{
	public static void main(String[] args) {
        JFrame frame = new JFrame("Ordenação de Números");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 350);
        frame.setLayout(null);
        
        JTextField num1Field = new JTextField();
        JTextField num2Field = new JTextField();
        JTextField num3Field = new JTextField();
        
        JLabel label1 = new JLabel("1° número");
        JLabel label2 = new JLabel("2° número");
        JLabel label3 = new JLabel("3° número");
        
        JButton calcularButton = new JButton("Ordenar");
        
        JTextArea resultadoArea = new JTextArea();
        resultadoArea.setEditable(false);
        
        label1.setBounds(20, 20, 150, 25);
        num1Field.setBounds(160, 20, 100, 25);
        
        label2.setBounds(20, 60, 150, 25);
        num2Field.setBounds(160, 60, 100, 25);
        
        label3.setBounds(20, 100, 150, 25);
        num3Field.setBounds(160, 100, 100, 25);
        
        calcularButton.setBounds(20, 140, 240, 60);
        
        resultadoArea.setBounds(20, 220, 240, 70);
        
        frame.add(label1);
        frame.add(num1Field);
        frame.add(label2);
        frame.add(num2Field);
        frame.add(label3);
        frame.add(num3Field);
        frame.add(calcularButton);
        frame.add(resultadoArea);
        
        calcularButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                try{
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int num3 = Integer.parseInt(num3Field.getText());
                    
                    int[] nums = {num1, num2, num3};
                    java.util.Arrays.sort(nums);
                    
                    resultadoArea.setText("Números ordenados\n" + nums[0] + "\n" + nums[1] + "\n" + nums[2]);
                } catch(NumberFormatException ex){
                    resultadoArea.setText("Por favor insira os númerosz\n");
                }
            }
        });
        
        frame.setVisible(true);    
    
	}
}







