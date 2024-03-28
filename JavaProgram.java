import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class JavaProgram extends JFrame implements ActionListener 
{
    private JTextField input1TextField, input2TextField;
    private JTextField resultTextField;
    private JButton addButton, subButton, clearButton;

    public JavaProgram() 
    {
        setTitle("Java Program");
        setLayout(null);

        JLabel input1Label = new JLabel("Input 1:");
        input1Label.setBounds(20, 20, 80, 25);
        add(input1Label);

        input1TextField = new JTextField();
        input1TextField.setBounds(100, 20, 200, 25);
        add(input1TextField);

        JLabel input2Label = new JLabel("Input 2:");
        input2Label.setBounds(20, 60, 80, 25);
        add(input2Label);

        input2TextField = new JTextField();
        input2TextField.setBounds(100, 60, 200, 25);
        add(input2TextField);

        JLabel resultLabel = new JLabel("Result:");
        resultLabel.setBounds(20, 100, 80, 25);
        add(resultLabel);

        resultTextField = new JTextField();
        resultTextField.setBounds(100, 100, 200, 25);
        resultTextField.setEditable(false);
        add(resultTextField);

        addButton = new JButton("ADD");
        addButton.setBounds(20, 220, 80, 25);
        addButton.addActionListener(this);
        add(addButton);

        subButton = new JButton("SUB");
        subButton.setBounds(120, 220, 80, 25);
        subButton.addActionListener(this);
        add(subButton);

        clearButton = new JButton("CLEAR");
        clearButton.setBounds(220, 220, 80, 25);
        clearButton.addActionListener(this);
        add(clearButton);

        setSize(350, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) 
    {
        if (e.getSource() == addButton) 
        {
            int input1 = Integer.parseInt(input1TextField.getText());
            int input2 = Integer.parseInt(input2TextField.getText());
            int result = input1 + input2;
            resultTextField.setText(String.valueOf(result));
        } else if (e.getSource() == subButton) 
        {
            int input1 = Integer.parseInt(input1TextField.getText());
            int input2 = Integer.parseInt(input2TextField.getText());
            int result = input1 - input2;
            resultTextField.setText(String.valueOf(result));
        } 
        else if (e.getSource() == clearButton) 
        {
            input1TextField.setText("");
            input2TextField.setText("");
            resultTextField.setText("");
        }
    }

    public static void main(String[] args) 
    {
        new JavaProgram();
    }
}