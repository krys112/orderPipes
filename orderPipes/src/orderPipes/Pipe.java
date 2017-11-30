/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orderPipes;

/**
 *
 * @author Krys
 */
public abstract class Pipe {
    protected double length, diameter, cost;
    protected int grade, intColor;
    protected boolean insu, rein, chem;
    
    public Pipe(double len, double dia, int plGrade, int col, boolean in, boolean re, boolean chemRe) {
        length = len;
        diameter = dia;
        grade = plGrade;
        intColor = col;
        insu = in;
        rein = re;
        chem = chemRe;
    }   
    
    public String getType() {
        return this.getClass().getName();
    }
    
    public double basicCost() {
        double radius = diameter / 2;
        radius = radius / 10;
        double inLength = 39.37 * length;
        double area = radius * inLength;
        
        switch (grade) {
            case 1: cost = 0.3;
                        break;
            case 2: cost = 0.32;
                        break;
            case 3: cost = 0.35;
                        break;
            case 4: cost = 0.4;
                        break;
            case 5: cost = 0.46;
                        break;
        }
        
        return cost * area;
    }
    
    public abstract boolean verify();
    
}
