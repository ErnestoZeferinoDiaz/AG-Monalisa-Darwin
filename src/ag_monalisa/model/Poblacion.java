package ag_monalisa.model;

import java.util.LinkedList;

public class Poblacion {
    private Configuracion conf;
    private LinkedList<ImgCromosoma> poblacion;
    private int indexBest;
    private boolean calcIndexBest;
    
    public Poblacion(Configuracion conf){
        this.poblacion = new LinkedList();
        this.calcIndexBest = false;
        this.conf = conf;
    }
    
    public void rand(){
        ImgCromosoma tmp;
        for (int i = 0; i < this.conf.getNoPoblacion(); i++) {
            tmp = new ImgCromosoma(this.conf);
            tmp.rand();
            this.add(tmp);
        }
    }
    
    public ImgCromosoma getBest(){
        int n=0;
        if(!this.calcIndexBest){
            for (int i = 1; i < this.size(); i++) {
                if(this.conf.getCompare().compare(this.get(i),this.get(n))==-1){
                    n=i;
                }
            }
            this.indexBest=n;
            this.calcIndexBest=true;
        }
        return this.get(this.indexBest);
    }
    
    public void add(ImgCromosoma img){
        this.poblacion.add(img);
        this.calcIndexBest = false;
    }
    
    public void set(int index,ImgCromosoma img){
        this.poblacion.set(index,img);
        this.calcIndexBest = false;
    }
    
    public ImgCromosoma get(int index){
        return this.poblacion.get(index);
    }
    
    public int size(){
        return this.poblacion.size();
    }
}
