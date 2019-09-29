package ag_monalisa.model.Operators;

import ag_monalisa.model.Configuracion;
import ag_monalisa.model.Poblacion;

public class ImgMutacionColor implements Operator{
    private Configuracion conf;
    private Poblacion init;
    
    
    @Override
    public void execute() {
        int n = (int) (this.conf.getPorcentajeMutacion()*this.init.size());
        int indexCromosoma,indexOval;
        for (int i = 0; i < n; i++) {
            indexCromosoma = Configuracion.intRand(0, n);
            indexOval = Configuracion.intRand(0, this.conf.getNoGenes());
            this.init.get(indexCromosoma).get(indexOval).randColor();
            this.init.get(indexCromosoma).setCalcFitness(false);
            this.init.get(indexCromosoma).setCreateImg(false);
        }
        this.init.setCalcIndexBest(false);
    }

    @Override
    public void setConfiguracion(Configuracion conf) {
        this.conf=conf;
    }

    @Override
    public void setPoblacion(Poblacion p) {
        this.init=p;
    }

    @Override
    public Poblacion getResultPoblacion() {
        return this.init;
    }
    
}
