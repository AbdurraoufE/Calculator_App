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
        frame.setSize(400, 550);
        frame.setLayout(null);

        // information for the textfield of the program
        textField = new JTextField();
        textField.setBounds(50, 25, 300, 50);
        textField.setFont(font);
        // does not allow to write in the textbox that displays numbers
        textField.setEditable(false);

        // buttons (8)
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        decButton = new JButton(".");
        delButton = new JButton("DELETE");
        equButton = new JButton("=");
        clrButton = new JButton("CLEAR");

        //setting the buttons in an array funcButton uses JButton
        funcButtons[0] = addButton;
        funcButtons[1] = subButton;
        funcButtons[2] = mulButton;
        funcButtons[3] = divButton;
        funcButtons[4] = decButton;
        funcButtons[5] = delButton;
        funcButtons[6] = equButton;
        funcButtons[7] = clrButton;

        // this loops through all the arrays of buttons of functions
        for (int i =0; i<8; i++){
            funcButtons[i].addActionListener(this);
            funcButtons[i].setFont(font);
            funcButtons[i].setFocusable(false);
        }

        // this loops through the number buttons (1 to 10)
        for (int i =0; i<10; i++){
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(font);
            numberButtons[i].setFocusable(false);
        }

        // location of buttons
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        // adding the buttons above to the frame:
        frame.add(delButton);
        frame.add(clrButton);

        frame.add(textField);
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

