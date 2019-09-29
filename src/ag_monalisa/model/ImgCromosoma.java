package ag_monalisa.model;

import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.LinkedList;

public class ImgCromosoma {
    private Configuracion conf;
    private LinkedList<Ovalo> ovalos;
    private Graphics2D gTmp;
    private BufferedImage img;
    private boolean createImg;
    private double fitness;
    private boolean calcFitness;
    
    public ImgCromosoma(Configuracion conf){
        this.setConf(conf);
        this.ovalos = new LinkedList();
        this.setCalcFitness(false);
        this.setCreateImg(false);
    }
    
    public void rand(){
        Ovalo tmp;
        for (int i = 0; i < this.conf.getNoGenes(); i++) {
            tmp = new Ovalo(this.conf);
            tmp.randColor();
            tmp.randPosition();
            tmp.randRadius();
            this.add(tmp);
        }
    }
    
    public void add(Ovalo o){
        this.ovalos.add(o);
        this.setCalcFitness(false);
        this.setCreateImg(false);
    }
    
    public void set(int index,Ovalo o){
        this.ovalos.set(index,o);
        this.setCalcFitness(false);
        this.setCreateImg(false);
    }
    
    public Ovalo get(int index){
        return this.ovalos.get(index);
    }
    
    public int size(){
        return this.ovalos.size();
    }
    
    public Configuracion getConf() {
        return conf;
    }

    public void setConf(Configuracion conf) {
        this.conf = conf;
    }

    public LinkedList<Ovalo> getOvalos() {
        return ovalos;
    }

    public void setOvalos(LinkedList<Ovalo> ovalos) {
        this.ovalos = ovalos;
    }

    public BufferedImage getImg() {
        if(!this.isCreateImg()){
            this.img = new BufferedImage(this.conf.getWidth(),this.conf.getHeight(),BufferedImage.TYPE_INT_ARGB);
            this.gTmp = (Graphics2D) this.img.getGraphics();
            for (int i = 0; i < this.size(); i++) {
                this.gTmp.setColor(this.get(i).getColor());
                this.gTmp.draw(this.get(i).getOvalo());
            }
            this.setCreateImg(true);
        }
        return this.img;
    }

    public void setImg(BufferedImage img) {
        this.img = img;
        this.setCreateImg(true);
    }

    public boolean isCreateImg() {
        return createImg;
    }

    public void setCreateImg(boolean createImg) {
        this.createImg = createImg;
    }

    public double getFitness() {
        if(!this.isCalcFitness()){
            this.setFitness(this.conf.getFitness().evaluate(this));
            this.setCalcFitness(true);
        }
        return fitness;
    }

    public void setFitness(double fitness) {
        this.fitness = fitness;
    }

    public boolean isCalcFitness() {
        return calcFitness;
    }

    public void setCalcFitness(boolean calcFitness) {
        this.calcFitness = calcFitness;
    }
    
    
}
