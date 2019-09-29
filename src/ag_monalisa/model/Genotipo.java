package ag_monalisa.model;

public class Genotipo {
    private Configuracion conf;
    private Poblacion inicio;

    public Genotipo(Configuracion conf){
        this.conf = conf;
        this.inicio = new Poblacion(conf);
    }
    
    public void init(){
        this.inicio.rand();
        for(int x=0; x<this.conf.sizeOperators(); x++){
            this.conf.getOperator(x).setConfiguracion(this.conf);
            this.conf.getOperator(x).setPoblacion(this.inicio);
        }
    }
    
    public Configuracion getConf() {
        return conf;
        
    }

    public void setConf(Configuracion conf) {
        this.conf = conf;
    }
    
    
}
