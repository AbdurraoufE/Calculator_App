import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame frame;
    JTextField textField;
    // holds 10 buttons (1-9 && 0)
    JButton[] numberButtons = new JButton[10];
    // function buttons, holds 8 (Subtract, add, etc)
    JButton[] funcButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;

    //font we use
    Font font = new Font("Times New Roman", Font.BOLD, 30);

    // the beginning numbers
    double num1 = 0, num2 = 0, result = 0;

    //holds an operator
    char operator;
    //constructor
    Calculator(){
        // title for our calculator
        frame = new JFrame("Calculator");
        // allows us to close the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // x-y cords for GUI size
        frame.setSize(420, 550);
        frame.setLayout(null);


        frame.setVisible(true);
    }
    public static void main(String[] args){
        //instance
        Calculator calc = new Calculator();
    }

    public void actionPerformed(java.awt.event.ActionEvent e) {
        ;
    }
}

