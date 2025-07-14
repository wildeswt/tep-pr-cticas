package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public class Alfil extends Pieza implements MovimientoDiagonal{

    public Alfil() {
        super();
    }
    
    public Alfil(String color, int fila, int columna) {
        super(color, "Alfil", fila, columna);
    }
    
    @Override
    public void imprimir() {
        System.out.println("------------ "+ this.getNombre() +" ------------");
        System.out.println("Color: "+ this.getColor());
        System.out.println("Fila Actual: "+ this.getFila());
        System.out.println("Columna Actual: "+ this.getColumna());
        System.out.print("Descripcion de Movimiento: ");
        describirMovimiento();
    }

    @Override
    public void describirMovimiento() {
        System.out.println("Esta pieza se mueve diagonalmente");
    }

    @Override
    public void mover(int fila, int columna) {
        System.out.println("El alfil se ha movido a "+ this.getFila()+","+this.getColumna());
    }
}
