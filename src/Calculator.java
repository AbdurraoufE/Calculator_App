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
    //constructor below
    Calculator(){
        // title for our calculator
        frame = new JFrame("Calculator");
        // allows us to close the GUI
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // x-y cords for GUI size
        frame.setSize(420, 550);
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
        delButton = new JButton("DEL");
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
        for (int j =0; j<10; j++){
            numberButtons[j] = new JButton(String.valueOf(j));
            numberButtons[j].addActionListener(this);
            numberButtons[j].setFont(font);
            numberButtons[j].setFocusable(false);
        }

        // location of buttons
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        // number of rows and columns in the panel of numbers && space between
        panel.setLayout(new GridLayout(4,4, 10, 10));
//        panel.setBackground(Color.CYAN);

        // adding pannel numbers/functions/operations to the calculator frame:
        panel.add(numberButtons[1]); // "#1"
        panel.add(numberButtons[2]); // "#2"
        panel.add(numberButtons[3]); // "#3"
        panel.add(addButton); // "+"
        panel.add(numberButtons[4]); // "#4"

        panel.add(numberButtons[5]); // "#5"
        panel.add(numberButtons[6]); // "#6"
        panel.add(subButton); // "-"
        panel.add(numberButtons[7]); // "#7"
        panel.add(numberButtons[8]); // "#8"

        panel.add(numberButtons[9]); // "#9"
        panel.add(mulButton); // "*"
        panel.add(decButton);
        panel.add(numberButtons[0]); // "#0"

        panel.add(equButton); // "="

        panel.add(divButton);
        panel.add(delButton);



        // adding the buttons above to the frame:
        frame.add(panel);
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
        // checks if someone clicks a button
        for(int i = 0; i<10; i++){
            // if the click is at the current button clicked
            if(e.getSource() == numberButtons[i]){
                // gets the text of the numbers to show on the screen when clicked
                textField.setText(textField.getText().concat(String.valueOf(i)));
            }
        }
        if(e.getSource() == decButton){
            textField.setText(textField.getText().concat("."));
        }
    }
}

