package Graphics;

import Mapper.Mapper;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CreateAccountPanel extends JPanel {
    CreateAccountPanel() {
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

        JButton createMyAccountButton = new JButton("createMyAccountButton");
        createMyAccountButton.setBounds(10, 210, 70, 70);
        createMyAccountButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Mapper.logButton("createMyAccountButton");
                if (Mapper.userNameChecker(userNameTextField.getText()) == -1) {
                    userNameTextField.setBackground(Color.GREEN);
                    passwordTextField.setBackground(Color.green);
                    setVisible(false);
                    Mapper.createPlayer(userNameTextField.getText() , passwordTextField.getText());
                    Mapper.updatePlayersFile();
                    Mapper.switchPanel(new LoginPanel());
                } else {
                    userNameTextField.setBackground(Color.red);
                    userNameTextField.setText("This UserName is Taken");
                }
            }
        });
        add(createMyAccountButton);
    }
}
