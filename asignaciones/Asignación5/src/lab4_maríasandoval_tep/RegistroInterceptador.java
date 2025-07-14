package lab4_maríasandoval_tep;

/**
 *
 * @author Maria Fernanda
 */
public class RegistroInterceptador implements Movimiento{
    @Override
    public void ejecutar(Pieza pieza, String metodo, int fila, int columna) {
        if (pieza == null || metodo == null){
            System.out.println("Error: metodo o pieza invalida");
            return;
        }
        
        if(pieza instanceof Peon && fila==7){
            System.out.println("Interceptado: El peon alcanza la ultima fila. Activar promocion");
        }else if (pieza instanceof Rey && Math.abs(pieza.getColumna()-columna)==2){
            System.out.println("Interceptado: Enroque detectado");
        }
        
        pieza.setFila(fila);
        pieza.setColumna(columna);
        System.out.println(pieza.getNombre()+" se ha movido a "+ fila+","+columna);
    }
}
