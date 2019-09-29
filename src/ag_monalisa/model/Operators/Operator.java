package ag_monalisa.model.Operators;

import ag_monalisa.model.Configuracion;
import ag_monalisa.model.Poblacion;

public interface Operator {
    public void execute();
    public void setConfiguracion(Configuracion conf);
    public void setPoblacion(Poblacion p);
    public Poblacion getResultPoblacion();
    
}
