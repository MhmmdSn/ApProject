package Characters;


import javax.swing.*;
import java.awt.*;

public abstract class Card {
    private int usingMana;
    private String Name;
    private int rarity; //1: common , 2:rare , 3:epic , 4:legendary
    private int classid; //1:mage , 2:rogue , 3:warlock , 4:neutral
    private int AttackPower ;
    private String Description;
    private String imagePath;
    private Image image = new ImageIcon(imagePath).getImage();
    public void setusingMana(int usingManas) {
        usingMana = usingManas;
    }

    public int getusingMana() {
        return usingMana;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAttackPower() {
        return AttackPower;
    }

    public void setAttackPower(int attackPower) {
        AttackPower = attackPower;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Image getImage() {
        return image;
    }

    public int getRarity() {
        return rarity;
    }

    public void setRarity(int rarity) {
        this.rarity = rarity;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }
}
