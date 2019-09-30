package ag_monalisa.model.Fitness;

import ag_monalisa.model.ImgCromosoma;
import java.util.Comparator;

public class ImgComparador implements Comparator<ImgCromosoma>{

    @Override
    public int compare(ImgCromosoma o1, ImgCromosoma o2) {
        
        if(o1.getFitness()<o2.getFitness()){
            return -1;
        }else{
            return 1;
        }
    }
    
}
