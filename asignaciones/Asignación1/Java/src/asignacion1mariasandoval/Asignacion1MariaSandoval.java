/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asignacion1mariasandoval;

/**
 *
 * @author labbd-1
 */
public class Asignacion1MariaSandoval {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rect= new Rectangulo(5,2);
        Triangulo tri=new Triangulo(5,4,6,6);
        Circulo cir=new Circulo(5);
        
       System.out.println("Area del Rectangulo: "+ rect.calcularArea());
       System.out.println("Perimetro del Rectangulo: "+rect.calcularPerimetro());
       System.out.println("Area del Triangulo: "+tri.calcularArea());
       System.out.println("Perimetro del Triangulo: "+tri.calcularPerimetro());
       System.out.println("Area del Circulo: "+cir.calcularArea());
       System.out.println("Perimtro del Circulo: "+cir.calcularPerimetro());
    }
}
