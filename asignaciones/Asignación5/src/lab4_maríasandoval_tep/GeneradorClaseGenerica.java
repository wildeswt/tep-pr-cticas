package lab4_maríasandoval_tep;

import java.lang.reflect.*;
/**
 *
 * @author Maria Fernanda
 */

public class GeneradorClaseGenerica  {
    public static void generadorClase(Class<?> clase)throws Exception{
        String nombreClaseOriginal = clase.getSimpleName();
        String nombreClaseGenerica = nombreClaseOriginal + "Generica";

        Field[] campos = clase.getDeclaredFields();
        Method[] metodos = clase.getDeclaredMethods();
        Constructor<?>[] constructores = clase.getDeclaredConstructors();

        // Supongamos máximo dos tipos genéricos: T1 y T2
        String[] genericos = {"T1", "T2"};
        int index = 0;

        StringBuilder contenido = new StringBuilder();
        contenido.append("public class ").append(nombreClaseGenerica).append("<T1, T2> {\n");

        // Atributos
        for (Field campo : campos) {
            String tipoGenerico = genericos[index++];
            contenido.append("    private ").append(tipoGenerico).append(" ").append(campo.getName()).append(";\n");
        }

        contenido.append("\n");

        // Constructor genérico
        contenido.append("    public ").append(nombreClaseGenerica).append("(");
        index = 0;
        for (int i = 0; i < campos.length; i++) {
            String tipoGenerico = genericos[i];
            contenido.append(tipoGenerico).append(" ").append(campos[i].getName());
            if (i < campos.length - 1) contenido.append(", ");
        }
        contenido.append(") {\n");
        for (Field campo : campos) {
            contenido.append("        this.").append(campo.getName()).append(" = ").append(campo.getName()).append(";\n");
        }
        contenido.append("    }\n\n");

        // Getters y Setters
        index = 0;
        for (Field campo : campos) {
            String tipoGenerico = genericos[index++];
            String nombreCampo = campo.getName();
            String nombreCapitalizado = Character.toUpperCase(nombreCampo.charAt(0)) + nombreCampo.substring(1);

            // Getter
            contenido.append("    public ").append(tipoGenerico).append(" get").append(nombreCapitalizado).append("() {\n");
            contenido.append("        return ").append(nombreCampo).append(";\n");
            contenido.append("    }\n\n");

            // Setter
            contenido.append("    public void set").append(nombreCapitalizado).append("(").append(tipoGenerico).append(" ").append(nombreCampo).append(") {\n");
            contenido.append("        this.").append(nombreCampo).append(" = ").append(nombreCampo).append(";\n");
            contenido.append("    }\n\n");
        }

        contenido.append("}");

        System.out.println(contenido.toString());
    }
}

