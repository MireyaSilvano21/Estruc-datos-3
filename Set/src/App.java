
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) throws Exception {
        Set <String> set = new HashSet<>();
                //HashSet,LinkedHasSet,TreeSet
        set.add("verde");
        set.add("rojo");
        set.add("azul");
        set.add("verde");//ignora duplicados

        System.out.println(set);//print, logra imprimir los datos debido a lla interfaz
        boolean existeVerde = set.contains("verde");//verifica si existe x objeto dentro de 
        set.remove("azul");

        int tam = set.size();//tamaño del set de datos
        for (String data : set) { //Recorridomanual, puede ser tambien con fori
            System.out.println("dato en row es: "+ data);
        }
        System.out.println("Existe el verde? "+existeVerde);
        System.out.println("El tamaño final es de " +tam);
    }
}
