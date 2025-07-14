/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion1mariasandoval;

/**
 *
 * @author labbd-1
 */
public class Triangulo extends Figura {
    //Atributos
    public float base;
    public float lado1;
    public float lado2;
    public float altura;

    //Constructores
    public Triangulo() {
        super();
        this.base = 0;
        this.lado1 = 0;
        this.lado2 = 0;
        this.altura = 0;
    }

    public Triangulo(float base, float lado2, float lado3, float altura) {
        super();
        this.base = base;
        this.lado1 = lado2;
        this.lado2 = lado3;
        this.altura = altura;
    }
    
    //SET/GET

    public void setBase(float base) {
        this.base = base;
    }

    public void setLado1(float lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(float lado2) {
        this.lado2 = lado2;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getAltura() {
        return altura;
    }
    
    //Métodos
    @Override
    public double calcularPerimetro() {
        double perimetro= base+lado1+lado2;
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area=(base*altura)/2;
        return area;
    }   
}
