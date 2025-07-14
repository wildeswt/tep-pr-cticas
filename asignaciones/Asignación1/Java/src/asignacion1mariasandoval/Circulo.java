/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion1mariasandoval;

/**
 *
 * @author labbd-1
 */
public class Circulo extends Figura {
    //Atributos
    public float radio;
    
    //Constructor
    public Circulo() {
        super();
        this.radio = radio;
    }

    public Circulo(float radio) {
        super();
        this.radio = radio;
    }
    
    //SET/GET
    public void setRadio(float radio) {
        this.radio = radio;
    }

    public float getRadio() {
        return radio;
    }
    
    //Métodos
    @Override
    public double calcularPerimetro() {
        double perimetro=2*3.14*radio;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area=3.14*(radio*radio);
        return area;
    }
}
