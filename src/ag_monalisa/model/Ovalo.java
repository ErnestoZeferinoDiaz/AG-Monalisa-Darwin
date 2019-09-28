package ag_monalisa.model;

import java.awt.Color;
import java.awt.geom.Ellipse2D;

public class Ovalo {
    private double radiusHorizontal;
    private double radiusVertical;
    private int red,green,blue,alpha;
    private int x,y;
    
    public Ellipse2D getOvalo(){
        return new Ellipse2D.Double(this.getX(),this.getY(),this.getRadiusHorizontal(),this.getRadiusVertical());
    }
    public void randPosition(){
        this.setX((int) (Math.random()*(200)));
        this.setY((int) (Math.random()*(125)));
    }
    
    public void randColor(){
        this.setRed((int) (Math.random()*(256)));
        this.setGreen((int) (Math.random()*(256)));
        this.setBlue((int) (Math.random()*(256)));
        this.setAlpha((int) (Math.random()*(256)));
    }
    
    public void randRadius(){
        this.setRadiusHorizontal((int) (Math.random()*(200/2)));
        this.setRadiusVertical((int) (Math.random()*(125/2)));
    }
    
    public Color getColor(){
        return new Color(this.getRed(), this.getGreen(), this.getBlue(), this.getAlpha());
    }
    
    public void setColor(int rgba){
        Color tmp = new Color(rgba,true);
        this.setRed(tmp.getRed());
        this.setGreen(tmp.getGreen());
        this.setBlue(tmp.getBlue());
        this.setAlpha(tmp.getAlpha());
    }
    
    public double getRadiusHorizontal() {
        return radiusHorizontal;
    }

    public void setRadiusHorizontal(double radiusHorizontal) {
        this.radiusHorizontal = radiusHorizontal;
    }

    public double getRadiusVertical() {
        return radiusVertical;
    }

    public void setRadiusVertical(double radiusVertical) {
        this.radiusVertical = radiusVertical;
    }

    public int getRed() {
        return red;
    }

    public void setRed(int red) {
        this.red = red;
    }

    public int getGreen() {
        return green;
    }

    public void setGreen(int green) {
        this.green = green;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public int getAlpha() {
        return alpha;
    }

    public void setAlpha(int alpha) {
        this.alpha = alpha;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    
}
