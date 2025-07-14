package lab4_maríasandoval_tep;

import static lab4_maríasandoval_tep.GeneradorClaseGenerica.generadorClase;


/**
 *
 * @author Maria Fernanda
 */
public class Lab4_MaríaSandoval_TEP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, Exception {
        Pieza pieza= new Alfil("Blanco",2,0);
        Pieza pieza2= new Torre("Blanco",2,7);
        Class<?> clasePieza = Class.forName("lab4_maríasandoval_tep.Alfil"); 
        IntrospectionClass inspeccionar = null;
        Pieza peon=new Peon("Blanco",6,0);
        Pieza rey=new Rey("Negro",0,4);
        Pieza torre=new Torre("Negro",0,0);
        AutoM autoM= new AutoM();
        
        String[] piezas = {
            "lab4_maríasandoval_tep.Alfil","lab4_maríasandoval_tep.Peon","lab4_maríasandoval_tep.Rey", 
            "lab4_maríasandoval_tep.Torre", "lab4_maríasandoval_tep.Reina"
        };
        
        inspeccionar.inspeccionarClase(clasePieza); 
        System.out.println();
        
        pieza.imprimir();
        System.out.println();
        pieza2.imprimir();
        
        System.out.println();
        peon.mover(7, 0);
        System.out.println();
        rey.mover(0, 2);
        System.out.println();
        torre.mover(0, 3);
        System.out.println();
        
        autoM.crearYmoverPiezas(piezas);
        generadorClase(Par.class);
    }
}
