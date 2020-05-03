package Graphics;

import javax.swing.*;
import java.awt.*;

public class CollectionPanel extends JPanel {
    Image card = new ImageIcon("ImageLibrary/Card_Black.png").getImage();
    CollectionPanel(int playerIndex) {
        setLayout(null);
        JRadioButton[] cardsRadioButtons1 = choiseButtons(10 , 10 , 100 , new String[]{"All Cards" , "My Cards" , "Cards to Buy" });
        JRadioButton[] maniaRadioButtons2 =choiseButtons(480 , 10 , 40 , new String[]{"1" , "2" , "3" , "4" , "5" , "6" , "7"});
//        JButton
    }
    private JRadioButton[] choiseButtons(int firstx , int y , int width , String[] choises){
        JRadioButton[] jRadioButtons = new JRadioButton[choises.length];
        ButtonGroup buttonGroup = new ButtonGroup();
        for(int i = 0 ; i<choises.length ; i++){
            jRadioButtons[i] = new JRadioButton(choises[i]);
            jRadioButtons[i].setBounds(firstx + (width * i) , y  , width, 40);
            buttonGroup.add(jRadioButtons[i]);
            add(jRadioButtons[i]);
            repaint();
            revalidate();
        }
        return jRadioButtons;
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect( 5 , 5 , 310 , 50);
        g.drawRect(470 , 5 , 300 , 50);
        g.drawImage(card , 0 , 0 , null);
        repaint();
        revalidate();
    }
}