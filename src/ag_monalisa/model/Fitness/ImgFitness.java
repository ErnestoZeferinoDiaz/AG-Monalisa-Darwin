package ag_monalisa.model.Fitness;

import ag_monalisa.model.Configuracion;
import ag_monalisa.model.ImgCromosoma;
import java.awt.Color;
import java.awt.image.BufferedImage;

public class ImgFitness implements FitnessBasic{
    private Configuracion conf;
    private BufferedImage img1,img2;
    private Color tmp1,tmp2;
    
    @Override
    public double evaluate(ImgCromosoma img) {
        double fit=0;
        double r=0,g=0,b=0,a=0;
        int w,h;
        w=this.conf.getWidth();
        h=this.conf.getHeight();
        this.img1=this.conf.getObj();
        this.img2=img.getImg();
        for (int i = 0; i < w; i++) {
            for (int j = 0; j < h; j++) {
                this.tmp1= new Color(this.img1.getRGB(i, j),true);
                this.tmp2= new Color(this.img2.getRGB(i, j),true);
                r=r+Math.pow(this.tmp1.getRed()-this.tmp2.getRed(), 2);
                g=g+Math.pow(this.tmp1.getGreen()-this.tmp2.getGreen(), 2);
                b=b+Math.pow(this.tmp1.getBlue()-this.tmp2.getBlue(), 2);
                a=a+Math.pow(this.tmp1.getAlpha()-this.tmp2.getAlpha(), 2);
            }
        }
        r=Math.sqrt(r);
        g=Math.sqrt(g);
        b=Math.sqrt(b);
        a=Math.sqrt(a);
        fit=r+g+b+a;
        return fit;
    }

    @Override
    public void setConf(Configuracion conf) {
        this.conf=conf;
    }

    @Override
    public Configuracion getConf() {
        return this.conf;
    }
    
    
    
}
