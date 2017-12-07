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
    protected int grade, intColor, quantity;
    protected boolean insu, rein, chem;
    
    public Pipe(double len, double dia, int plGrade, int col, boolean in, boolean re, boolean chemRe, int qnt) {
        length = len;
        diameter = dia;
        grade = plGrade;
        intColor = col;
        insu = in;
        rein = re;
        chem = chemRe;
        quantity = qnt;
    }   
    
    public double getLength() {
        return this.length;
    }
    
    public double getDiameter() {
        return this.diameter;
    }
    
    public String getType() {
        return getClass().getName();
    }
    
    public int getGrade() {
        return this.grade;
    }
    
    public int getColour() {
        return this.intColor;
    }
    
    public boolean getInsu() {
        return this.insu;
    }
    
    public boolean getRein() {
        return this.rein;
    }
    
    public int getQuant() {
        return this.quantity;
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
    
    public double fullCost() {
        double basic = basicCost();
        double total = basicCost();
        if (intColor == 1) {
            total += basic * 1.12; }
        else if (intColor == 2) {
            total += basic * 1.17; }
        if (insu == true) {
            total += basic * 1.14; }
        if (rein == true) {
            total += basic * 1.15; }
        if (chem == true) {
            total += basic * 1.12; }
        return total * quantity;
    }
    
    public abstract boolean verify();
    
}
