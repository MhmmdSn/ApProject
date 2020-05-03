package Graphics;

import Mapper.Mapper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPanel extends JPanel {
    private int playerID;

    public MenuPanel(int playerIndex) {
//        setBounds(0, 0, 1000, 1000);
        setLayout(null);
        this.playerID = playerIndex;

        createButton("Play!", 10, 10, 100, 70);
        createButton("Shop", 10, 110, 100, 70);
        createButton("Status", 10, 210, 100, 70);
        createButton("Collections", 10, 310, 100, 70);
        createButton("Setting", 10, 410, 100, 70);
        createButton("Exit!", 510, 10, 100, 70);
        createButton("Log Out", 510, 110, 100, 70);
    }

    private void createButton(String text, int x, int y, int width, int heigth) {
        JButton jButton = new JButton(text);
        jButton.setBounds(x, y, width, heigth);
        jButton.setContentAreaFilled(false);
        jButton.setBorderPainted(false);
        jButton.addActionListener(new actionListener());
        add(jButton);
    }


    class actionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            JButton jButton = (JButton) e.getSource();
            String ButtonText = jButton.getText();
            Mapper.logButton(ButtonText);
            if (ButtonText.equals("Play!")) {
                //todo actionlistener for buttons
            } else if (ButtonText.equals("Shop")) {
                Mapper.switchPanel(new ShopPanel(playerID));
            } else if (ButtonText.equals("Status")) {

            } else if (ButtonText.equals("Collections")) {
                setVisible(false);
                Mapper.switchPanel(new CollectionPanel(playerID));

            } else if (ButtonText.equals("Setting")) {

            } else if (ButtonText.equals("Log Out")) {
            setVisible(false);
            Mapper.switchPanel(new LoginPanel());
            } else if (ButtonText.equals("Exit!")) {
                System.exit(2);
            } else {
                System.out.println("Not Working Well!");
            }
        }
    }
}
