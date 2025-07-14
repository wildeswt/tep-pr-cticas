/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package asignacion1mariasandoval;

/**
 *
 * @author labbd-1
 */
public class Rectangulo extends Figura {
    //Atributos
    public float base;
    public float altura;
    //Constructor
    public Rectangulo() {
        super();
        this.base = 0;
        this.altura = 0;
    }

    public Rectangulo(float base, float altura) {    
        super();
        this.base = base;
        this.altura = altura;
    }
    
    //SET/GET
    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {    
        this.altura = altura;
    }

    public float getBase() {
        return base;
    }

    public float getAltura() {
        return altura;
    }
    
    //Métodos
    @Override
    public double calcularPerimetro() {
        double perimetro=(base*2)+(altura*2);
        return perimetro;
    }

    @Override
    public double calcularArea() {
        double area=base*altura;
        return area;
    }
}
