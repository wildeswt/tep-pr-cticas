package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public class Reina extends Pieza implements MovimientoDiagonal{
    
    public Reina(){
        super();
    }
    
    public Reina(String color, int fila, int columna){
        super(color,"Reina",fila,columna);
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
        System.out.println("Esta pieza se mueve de manera horizontal, vertical y diagonal");
    }

    @Override
    public void mover(int fila, int columna) {
        System.out.println("La reina se ha movido a "+ this.getFila()+","+this.getColumna());
    }
    
}
