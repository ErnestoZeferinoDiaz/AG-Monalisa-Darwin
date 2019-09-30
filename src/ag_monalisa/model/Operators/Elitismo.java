package ag_monalisa.model.Operators;

import ag_monalisa.model.Configuracion;
import ag_monalisa.model.ImgCromosoma;
import ag_monalisa.model.Poblacion;
import java.util.Collections;
import java.util.Comparator;

public class Elitismo implements Operator{
    private Configuracion conf;
    private Poblacion init;
    private Poblacion result;
    
    
    @Override
    public void execute() {
        int noSelect = this.conf.getNoPoblacion();
        int index;
        Collections.sort(this.init.getPoblacion(),new Comparator<ImgCromosoma>(){
            @Override
            public int compare(ImgCromosoma o1, ImgCromosoma o2) {
                if(o1.getFitness()<o2.getFitness()){
                    return -1;
                }else{
                    return 1;
                }
            }
            
        });
        
        this.result = new Poblacion(this.conf);
        for (int i = 0; i < noSelect; i++) {
            index = Configuracion.intRand(0,this.conf.getNoPoblacion()/2);
            this.result.add(init.get(index));
        }
        this.init.clear();
        for (int i = 0; i < this.result.size(); i++) {
            this.init.add(this.result.get(i));
        }
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
        return this.result;
    }
    
}
