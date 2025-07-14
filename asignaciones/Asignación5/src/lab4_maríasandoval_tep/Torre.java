package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public class Torre extends Pieza{
    private Movimiento interceptador;

    public Torre() {
        super();
        this.interceptador= new RegistroInterceptador();
    }

    public Torre(String color, int fila, int columna) {
        super(color, "Torre", fila, columna);
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
        System.out.println("Se mueve en linea recta horizontal o vertical.");
    }

    @Override
    public void mover(int fila, int columna) {
        interceptador.ejecutar(this, "mover", fila, columna);
    }
}
