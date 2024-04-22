/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author usuario
 */
public class Calc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
     //metodos para multiplicar
     public void multiplica(float n1, float n2) {
        System.out.println("La multiplicaci�n de " + n1 + " por " + n2 + "es " + (n1 * n2));

    }

    public double multiplica(double n1, double n2) {
        System.out.println("La multiplicaci�n de " + n1 + " por " + n2 + "es " + (n1 * n2));
        return (n1 * n2);

    }
    
    //metodos para dividir
     public void divide(float n1, float n2) {
        System.out.println("La divisi�n de " + n1 + " entre " + n2 + " es "
                + (n1 / n2));
    }

    public double divide(double n1, double n2) {
        System.out.println("La divisi�n de " + n1 + " entre " + n2 + " es "
                + (n1 / n2));
        return (n1 / n2);
    }

    public void datos() {
        System.out.println("La marca es " + this.marca + " el modelo es " + this.modelo + " y el numero de serie es " + this.nserie);
    }
    
}
