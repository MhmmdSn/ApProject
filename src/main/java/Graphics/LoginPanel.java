package Graphics;

import Mapper.Mapper;
import Run.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginPanel extends JPanel {
//    private Image background = new ImageIcon("").getImage();
//    private JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

    public LoginPanel() {
        setBounds(0, 0, 1000, 1000);
        setLayout(null);

        JLabel userNameLabel = new JLabel("UserName: ");
        userNameLabel.setBounds(10, 10, 70, 70);
        add(userNameLabel);

        JTextField userNameTextField = new JTextField();
        userNameTextField.setBounds(110, 10, 70, 70);
        add(userNameTextField);

        JLabel passwordLabel = new JLabel("Password: ");
        passwordLabel.setBounds(10, 110, 70, 70);
        add(passwordLabel);

        JTextField passwordTextField = new JTextField();
        passwordTextField.setBounds(110, 110, 70, 70);
        add(passwordTextField);

        JButton NextButton = new JButton("Next");
        NextButton.setBounds(10, 210, 70, 70);
        NextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mapper.logButton("NextButton");
                int userNameIndex = Mapper.userNameChecker(userNameTextField.getText());
                if (Mapper.userNameChecker(userNameTextField.getText()) != -1) {
                    userNameTextField.setBackground(Color.GREEN);
                    if (Mapper.correctPassword(userNameIndex, passwordTextField.getText())) {
                        passwordTextField.setBackground(Color.green);
                        setVisible(false);
                        Mapper.switchPanel(new MenuPanel(userNameIndex));

                    }else{
                        passwordTextField.setBackground(Color.red);
                    }
                } else {
                    userNameTextField.setBackground(Color.red);
                }
            }
        });
        add(NextButton);

        JButton createAccountButton = new JButton("Create Account!");
        createAccountButton.setBounds(110 , 210 , 70 , 70);
        createAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
                Mapper.switchPanel(new CreateAccountPanel());
            }
        });
        add(createAccountButton);
    }
}