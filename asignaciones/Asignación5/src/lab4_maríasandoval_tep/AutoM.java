package lab4_maríasandoval_tep;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/**
 *
 * @author Maria Fernanda
 */
public class AutoM {
    public void crearYmoverPiezas(String[]clases) throws Exception{
        for(String nombreClase : clases){
            Class<?> clase= Class.forName(nombreClase);
            Constructor<?> constructor = clase.getConstructor(String.class, int.class, int.class);
            Object instancia = constructor.newInstance("Negro",0,0);
            Method mover= clase.getMethod("mover", int.class,int.class);
            mover.invoke(instancia,2, 0);
        }
    }
}
