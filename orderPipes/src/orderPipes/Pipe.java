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
    protected double length, diameter;
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
    
    public abstract boolean verify();
    
}
