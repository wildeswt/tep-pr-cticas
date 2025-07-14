package lab4_maríasandoval_tep;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import java.util.Arrays;
/**
 *
 * @author Maria Fernanda
 */
public class IntrospectionClass {
    public static void inspeccionarClase(Class<?> clase) {
        System.out.println("Nombre de la clase: " + clase.getName());
        
        
        // Superclase
        System.out.println("\nSuperclase: " + clase.getSuperclass().getName());
        
        // Interfaces
        System.out.println("\nInterfaces implementadas:");
        Class<?>[] interfaces = clase.getInterfaces();
        for (Class<?> inter : interfaces)
            System.out.println(inter.getName());

        // Obtener campos de la clase
        System.out.print("\nAtributos:\n");
        Field[] campos = clase.getDeclaredFields();
        if (campos == null){
            System.out.println("No hay atributos en esta clase");
        }
        for (Field campo : campos) {
            System.out.println("Atributo: " + campo.getName() + 
                               " - Tipo: " + campo.getType().getName());
        }
        
        // Obtener constructores de la clase
        System.out.print("\nConstructores:\n");
        Constructor<?>[] constructores = clase.getDeclaredConstructors();
        for (Constructor<?> cons : constructores) {
            System.out.print("Constructor: "+clase.getSimpleName() + "(");
            Class<?>[] params = cons.getParameterTypes();
            for (int i = 0; i < params.length; i++) {
                System.out.print(params[i].getSimpleName());
                if (i < params.length - 1) 
                    System.out.print(", ");
            }
            System.out.println(")");
        }
        
        // Obtener metodos de la clase
        System.out.print("\nMetodos:\n");
        Method[] metodos = clase.getDeclaredMethods();
        for (Method metodo : metodos) {
            System.out.println(
                    "Metodo: " + metodo.getName() + 
                    " - Retorno: " + metodo.getReturnType().getName() + 
                    " - Parametros: " + Arrays.toString(metodo.getParameterTypes()));
        }
        
    }
}
