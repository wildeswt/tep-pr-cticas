package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public class Peon extends Pieza{
    private Movimiento interceptador;

    public Peon() {
        super();
        this.interceptador= new RegistroInterceptador();
    }

    public Peon(String color, int fila, int columna) {
        super(color, "Peon", fila, columna);
        this.interceptador= new RegistroInterceptador();
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
        System.out.println("Avanza una casilla hacia adelante.");
    }

    @Override
    public void mover(int fila, int columna) {
        interceptador.ejecutar(this, "mover", fila, columna);
    }
}