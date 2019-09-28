package ag_monalisa.view;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Lienzo extends JPanel{
    private BufferedImage img;
    private boolean insertImg;
    
    public Lienzo(){
        this.setBackground(Color.WHITE);
        this.insertImg=false;
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); //To change body of generated methods, choose Tools | Templates.
        if(this.insertImg){
            g.drawImage(img, 0, 0, null);
        }
        
    }

    public BufferedImage getImg() {
        return img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
        this.setSize(this.img.getWidth(),this.img.getHeight());
        this.insertImg=true;
        this.repaint();
    }
    
    
    
}
