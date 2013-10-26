/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author Gotcha
 */
public class CuentaAhorro extends CuentaBancaria {
    private double tasa;
    
    public CuentaAhorro(int c, String n, double t){
        super(c,n);
        tasa = t;
    }
}
