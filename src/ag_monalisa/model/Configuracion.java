package ag_monalisa.model;

import java.awt.image.BufferedImage;

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
    
    public static double doubleRand(double min, double max){
        return min+Math.random()*(max-min);
    }
    
    public static float floatRand(double min, double max){
        return (float) Configuracion.doubleRand(min, max);
    }
    
    public static int intRand(double min, double max){
        return (int) Configuracion.doubleRand(min, max);
    }

    public BufferedImage getObj() {
        return obj;
    }

    public void setObj(BufferedImage obj) {
        this.obj = obj;
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
    
    
    
}
