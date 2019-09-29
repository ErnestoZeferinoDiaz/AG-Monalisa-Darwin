package ag_monalisa.model.Fitness;

import ag_monalisa.model.Configuracion;
import ag_monalisa.model.ImgCromosoma;

public interface FitnessBasic {
    public double evaluate(ImgCromosoma img);
    public void setConf(Configuracion conf);
    public Configuracion getConf();
}
