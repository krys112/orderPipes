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
public class Type5 extends Pipe{
    
    public Type5(double len, double dia, int plGrade, int col, boolean in, boolean re, boolean chemRe) {
        super(len, dia, plGrade, col, in, re, chemRe);
    }
    
    @Override
    public boolean verify() {
        if (grade > 2 & intColor == 2 & insu == false & rein == false) {
            return true;
        }
        else { return false; }
    }
}