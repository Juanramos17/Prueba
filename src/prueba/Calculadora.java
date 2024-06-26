package clasesAuxiliaresED;

import java.util.Scanner;

/**
 *
 * @author david
 */
public class Calculadora {

    // Atributos
    private String marca;
    private String modelo;
    private String nserie;
    private Scanner s = new Scanner(System.in);

    // Constructor
    public Calculadora(String marca, String modelo, String nserie) {
        this.marca = marca;
        this.modelo = modelo;
        this.nserie = nserie;

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNserie() {
        return nserie;
    }

    public void setNserie(String nserie) {
        this.nserie = nserie;
    }

    //Constructor2
    public Calculadora() {

    }

    // M�todos
    public double suma(double n1, double n2) {
        double x;
        x = n1 + n2;
        System.out.println("La suma de " + n1 + " m�s " + n2 + " es "
                + (n1 + n2));
        return x;
    }

    //Esto es una sobrecarga del metodo suma (una sobrecarga es una variacion de un metodo previamente creado)
    public void suma() {
        System.out.println("Introduce el primer numero");
        float n1 = s.nextFloat();
        System.out.println("Introduce el segundo numero");
        float n2 = s.nextFloat();
        System.out.println("La suma de " + n1 + " m�s " + n2 + " es "
                + (n1 + n2));
    }

    //sobrecarga del metodo suma por tipo de datos
    public void suma(int n1, int n2) {
        System.out.println("La suma de " + n1 + " m�s " + n2 + " es "
                + (n1 + n2));
    }

    public void resta(float n1, float n2) {
        System.out.println("La resta de " + n1 + " menos " + n2 + " es "
                + (n1 - n2));
    }

    public double resta(double n1, double n2) {
        System.out.println("La resta de " + n1 + " menos " + n2 + " es "
                + (n1 - n2));
        return n1 - n2;
    }
    //División añadida
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
    
    //Multiplicación añadida
    
     public void multiplica(float n1, float n2) {
        System.out.println("La multiplicaci�n de " + n1 + " por " + n2 + "es " + (n1 * n2));

    }

    public double multiplica(double n1, double n2) {
        System.out.println("La multiplicaci�n de " + n1 + " por " + n2 + "es " + (n1 * n2));
        return (n1 * n2);

    }
    
    public double modulo(double n1, double n2){
        System.out.println("El modulo de " + n1 + " por " + n2 + "es " + (n1 % n2));
        return (n1 % n2);
                
    }
    
    

   

}
