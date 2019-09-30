package ag_monalisa.view;

import ag_monalisa.model.Genotipo;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;

public class Lienzo extends JPanel implements Runnable{
    private Genotipo g;
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
        
    }

    public boolean isInsertImg() {
        return insertImg;
    }

    public void setInsertImg(boolean insertImg) {
        this.insertImg = insertImg;
    }

    
    @Override
    public void run() {
        this.repaint();
    }
    
    
    
}
