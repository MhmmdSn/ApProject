package Graphics;

import Mapper.Mapper;
import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame(){
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//        setExtendedState(MAXIMIZED_BOTH);
        setSize(800 , 450);
//        setUndecorated(true);
        setLocationRelativeTo(null);
        setResizable(false);
        //TODO Add WelcomePanel
        setContentPane(new CollectionPanel(0));
        repaint();
        setVisible(true);
    }
    public void switchPanel(JPanel addingPanel){
        setContentPane(addingPanel);
        //pack();
        repaint();
        revalidate();
    }
}
