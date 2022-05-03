import javax.swing.*;
import java.awt.*;

public class Calculator extends JFrame {

    private void setBasic() {
        setTitle("계산기");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(300,370);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        setVisible(true);
    }
    private JTextField setInputSpace() {
        JTextField inputSpace;

        inputSpace = new JTextField();
        inputSpace.setEditable(false);
        inputSpace.setBackground(Color.WHITE);
        inputSpace.setHorizontalAlignment(JTextField.RIGHT);
        inputSpace.setFont(new Font("Arial", Font.BOLD, 50));
        inputSpace.setBounds(8,10,270,70);

        return inputSpace;
    }

    private JPanel setBtn() {
        JPanel btnPanel = new JPanel();
        btnPanel.setLayout(new GridLayout(4,4,10,10));
        btnPanel.setBounds(8,90,270,235);

        String[] btnNames = {"C", "/", "*", "=", "1", "2", "3", "+", "4", "5", "6", "-", "7", "8", "9", "0"};
        JButton[] buttons = new JButton[btnNames.length];

        for (int i = 0; i < btnNames.length; i++) {
            buttons[i] = new JButton(btnNames[i]);
            buttons[i].setFont(new Font("Arial", Font.BOLD, 20));
            buttons[i].setForeground(Color.WHITE);
            buttons[i].setBorderPainted(false);
            if(i == 0) {
                buttons[i].setBackground(Color.RED);
            } else if( (i >= 4) && (i%4 != 3)) {
                buttons[i].setBackground(Color.BLACK);
            } else {
                buttons[i].setBackground(Color.GRAY);
            }
            btnPanel.add(buttons[i]);
        }

        return btnPanel;
    }
    public Calculator() {
        add(setInputSpace());
        add(setBtn());

        setBasic();
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
