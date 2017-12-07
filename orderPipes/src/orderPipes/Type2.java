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
public class Type2 extends Pipe{
    
    public Type2(double len, double dia, int plGrade, int col, boolean in, boolean re, boolean chemRe, int qnt) {
        super(len, dia, plGrade, col, in, re, chemRe, qnt);
    }
    
    @Override
    public boolean verify() {
        if (grade > 1 & grade < 5 & intColor == 1 & insu == false & rein == false) {
            return true;
        }
        else { return false; }
    }
}
