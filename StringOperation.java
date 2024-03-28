import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class StringOperation extends JFrame {
    private JLabel inputLabel, outputLabel;
    private JTextField inputTextField, outputTextField;
    private JButton upperButton, lowerButton, countButton, vowelButton;

    public StringOperation() {
        setTitle("String Operation");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(313, 347);
        getContentPane().setLayout(new FlowLayout());

        inputLabel = new JLabel("Input String:");
        getContentPane().add(inputLabel);

        inputTextField = new JTextField(20);
        getContentPane().add(inputTextField);
        
                outputLabel = new JLabel("Output String:");
                getContentPane().add(outputLabel);
        
                outputTextField = new JTextField(20);
                outputTextField.setEditable(false);
                getContentPane().add(outputTextField);
                
                        upperButton = new JButton("Upper");
                        getContentPane().add(upperButton);
                        
                                upperButton.addActionListener(new ActionListener() {
                                    @Override
                                    public void actionPerformed(ActionEvent e) {
                                        String input = inputTextField.getText();
                                        String output = input.toUpperCase();
                                        outputTextField.setText(output);
                                    }
                                });
        
                lowerButton = new JButton("Lower");
                getContentPane().add(lowerButton);
                
                        lowerButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String input = inputTextField.getText();
                                String output = input.toLowerCase();
                                outputTextField.setText(output);
                            }
                        });
        
                countButton = new JButton("Count");
                getContentPane().add(countButton);
                
                        countButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                String input = inputTextField.getText();
                                int count = input.length();
                                String output = String.valueOf(count);
                                outputTextField.setText(output);
                            }
                        });

        vowelButton = new JButton("Vowel");
        getContentPane().add(vowelButton);

        vowelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = inputTextField.getText();
                int count = countVowels(input);
                String output = String.valueOf(count);
                outputTextField.setText(output);
            }
        });
    }

    private int countVowels(String input) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            char c = Character.toLowerCase(input.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StringOperation().setVisible(true);
            }
        });
    }
}

