package ag_monalisa.model;

import ag_monalisa.model.Fitness.FitnessBasic;
import ag_monalisa.model.Operators.Operator;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.util.Comparator;
import java.util.LinkedList;

public class Configuracion {
    private BufferedImage obj;
    private int width,height;
    private int minRed, maxRed;
    private int minGreen, maxGreen;
    private int minBlue, maxBlue;
    private int minAlpha, maxAlpha;
    private double minRadiusHorizontal, maxRadiusHorizontal;
    private double minRadiusVertical, maxRadiusVertical;
    private int noGenes;    
    private int noPoblacion;
    private double porcentajeMutacion;
    
    private FitnessBasic fitness;
    private Comparator<ImgCromosoma> compare;
    private LinkedList<Operator> operators;
    public Configuracion(){
        minRed=255; maxRed=0;
        minGreen=255; maxGreen=0;
        minBlue=255; maxBlue=0;
        minAlpha=255; maxAlpha=0;
        
        this.operators = new LinkedList();
    }
    
    public static double doubleRand(double min, double max){
        return min+Math.random()*(max-min);
    }
    
    public static float floatRand(double min, double max){
        return (float) Configuracion.doubleRand(min, max);
    }
    
    public static int intRand(double min, double max){
        return (int) Configuracion.doubleRand(min, max);
    }
    
    public void addOperator(Operator op){
        this.operators.add(op);
    }
    
    public Operator getOperator(int index){
        return this.operators.get(index);
    }
    
    public int sizeOperators(){
        return this.operators.size();
    }

    public double getPorcentajeMutacion() {
        return porcentajeMutacion;
    }

    public void setPorcentajeMutacion(double porcentajeMutacion) {
        this.porcentajeMutacion = porcentajeMutacion;
    }
    
    
    public Comparator<ImgCromosoma> getCompare() {
        return compare;
    }

    public void setCompare(Comparator<ImgCromosoma> compare) {
        this.compare = compare;
    }

    
    
    
    public BufferedImage getObj() {
        return obj;
    }

    public void setObj(BufferedImage obj) {
        this.obj = obj;
        double min;
        Color tmp;
        
        this.setWidth(this.obj.getWidth());
        this.setHeight(this.obj.getHeight());
        min=this.getWidth()*this.getHeight();
        min=Math.sqrt(min);
        this.setNoGenes((int) min);
        this.setMinRadiusHorizontal(10);
        this.setMinRadiusVertical(10);
        this.setMaxRadiusHorizontal(min);
        this.setMaxRadiusVertical(min);
        
        for (int i = 0; i < this.getWidth(); i++) {
            for (int j = 0; j < this.getHeight(); j++) {
                tmp = new Color(this.obj.getRGB(i, j));
                if(tmp.getRed()<this.getMinRed()){
                    this.setMinRed(tmp.getRed());
                }
                if(tmp.getRed()>this.getMaxRed()){
                    this.setMaxRed(tmp.getRed());
                }
                if(tmp.getBlue()<this.getMinBlue()){
                    this.setMinBlue(tmp.getBlue());
                }
                if(tmp.getBlue()>this.getMaxBlue()){
                    this.setMaxBlue(tmp.getBlue());
                }
                if(tmp.getGreen()<this.getMinGreen()){
                    this.setMinGreen(tmp.getGreen());
                }
                if(tmp.getGreen()>this.getMaxGreen()){
                    this.setMaxGreen(tmp.getGreen());
                }
                if(tmp.getAlpha()<this.getMinAlpha()){
                    this.setMinAlpha(tmp.getAlpha());
                }
                if(tmp.getAlpha()>this.getMaxAlpha()){
                    this.setMaxAlpha(tmp.getAlpha());
                }                
            }
        }
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getMinRed() {
        return minRed;
    }

    public void setMinRed(int minRed) {
        this.minRed = minRed;
    }

    public int getMaxRed() {
        return maxRed;
    }

    public void setMaxRed(int maxRed) {
        this.maxRed = maxRed;
    }

    public int getMinGreen() {
        return minGreen;
    }

    public void setMinGreen(int minGreen) {
        this.minGreen = minGreen;
    }

    public int getMaxGreen() {
        return maxGreen;
    }

    public void setMaxGreen(int maxGreen) {
        this.maxGreen = maxGreen;
    }

    public int getMinBlue() {
        return minBlue;
    }

    public void setMinBlue(int minBlue) {
        this.minBlue = minBlue;
    }

    public int getMaxBlue() {
        return maxBlue;
    }

    public void setMaxBlue(int maxBlue) {
        this.maxBlue = maxBlue;
    }

    public int getMinAlpha() {
        return minAlpha;
    }

    public void setMinAlpha(int minAlpha) {
        this.minAlpha = minAlpha;
    }

    public int getMaxAlpha() {
        return maxAlpha;
    }

    public void setMaxAlpha(int maxAlpha) {
        this.maxAlpha = maxAlpha;
    }

    public double getMinRadiusHorizontal() {
        return minRadiusHorizontal;
    }

    public void setMinRadiusHorizontal(double minRadiusHorizontal) {
        this.minRadiusHorizontal = minRadiusHorizontal;
    }

    public double getMaxRadiusVertical() {
        return maxRadiusVertical;
    }

    public void setMaxRadiusVertical(double maxRadiusVertical) {
        this.maxRadiusVertical = maxRadiusVertical;
    }

    public double getMaxRadiusHorizontal() {
        return maxRadiusHorizontal;
    }

    public void setMaxRadiusHorizontal(double maxRadiusHorizontal) {
        this.maxRadiusHorizontal = maxRadiusHorizontal;
    }

    public double getMinRadiusVertical() {
        return minRadiusVertical;
    }

    public void setMinRadiusVertical(double minRadiusVertical) {
        this.minRadiusVertical = minRadiusVertical;
    }

    public int getNoGenes() {
        return noGenes;
    }

    public void setNoGenes(int noGenes) {
        this.noGenes = noGenes;
    }

    public FitnessBasic getFitness() {
        return fitness;
    }

    public void setFitness(FitnessBasic fitness) {
        this.fitness = fitness;
    }

    public int getNoPoblacion() {
        return noPoblacion;
    }

    public void setNoPoblacion(int noPoblacion) {
        this.noPoblacion = noPoblacion;
    }
    
    
    
}
