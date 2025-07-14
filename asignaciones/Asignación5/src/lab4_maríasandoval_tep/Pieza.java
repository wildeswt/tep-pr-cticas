package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public abstract class Pieza {
    private String color;
    private String nombre;
    private int columna;
    private int fila;

    public Pieza() {
        color = "";
        nombre = "";
        fila=0;
        columna=0;
    }
    
    public Pieza(String color, String nombre, int fila, int columna) {
        this.color = color;
        this.nombre = nombre;
        this.fila= fila;
        this.columna=columna;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }
    
    public String getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public int getColumna() {
        return columna;
    }

    public int getFila() {
        return fila;
    }
    
    //Funciones
    public abstract void imprimir();
    public abstract void describirMovimiento();
    public abstract void mover(int fila, int columna);
}
