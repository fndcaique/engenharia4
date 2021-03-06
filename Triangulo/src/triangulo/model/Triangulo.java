/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangulo.model;

/**
 *
 * @author fndcaique
 */
public class Triangulo {

    public enum Tipo {
        /**
         * Todos os lados são iguais
         */
        EQUILATERO,
        /**
         * Todos os lados são diferentes
         */
        ESCALENO,
        /**
         * Dois lados são iguais
         */
        ISOSCELES;
    }
    private int l1, l2, l3;

    public Triangulo(int l1, int l2, int l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    public String getType() {
        if (l1 == l2 && l1 == l3) {
            return Tipo.EQUILATERO.name();
        } else if (l1 != l2 && l1 != l3 && l2 != l3) {
            return Tipo.ESCALENO.name();
        }
        return Tipo.ISOSCELES.name();
    }

    public boolean checkSum() {
        return (l1 + l2 >= l3 && l1 + l3 >= l2 && l2 + l3 >= l1);
    }

    public boolean checkValues() {
        return (l1 > 0 && l2 > 0 && l3 > 0);
    }

    public int getL1() {
        return l1;
    }

    public void setL1(int l1) {
        this.l1 = l1;
    }

    public int getL2() {
        return l2;
    }

    public void setL2(int l2) {
        this.l2 = l2;
    }

    public int getL3() {
        return l3;
    }

    public void setL3(int l3) {
        this.l3 = l3;
    }

}
