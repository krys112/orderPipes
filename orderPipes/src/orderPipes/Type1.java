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
public class Type1 extends Pipe{
    
    public Type1(double len, double dia, int plGrade, int col, boolean in, boolean re, boolean chemRe, int qnt) {
        super(len, dia, plGrade, col, in, re, chemRe, qnt);
    }
    
    @Override
    public boolean verify() {
        if (grade < 4  & intColor == 0 & insu == false & rein == false) {
            return true;
        }
        else { return false; }
    }
}
