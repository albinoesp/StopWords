import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.*;
public class stopWords {
    public static void main(String[] args) throws IOException {
        Set<String> set = new HashSet<>();


        try {
            set = obtenerStopWords(set);
        } catch (IOException e) {
            System.out.println("Ha ocurrido un error: " + e);
        }




    }

    public static Set<String> obtenerStopWords(Set<String> set) throws IOException {
        BufferedReader inputStream = null;
        try {
            inputStream = new BufferedReader(new FileReader("stopwords-es.txt"));

            String l;
            while ((l = inputStream.readLine()) != null) {
                set.add(l);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        return set;
    }

    public static String oracion() {
        Scanner s = new Scanner(System.in);
        String cadena;

        System.out.println("Escriba la cadena: \n");
        cadena = s.nextLine();


        return cadena;
    }
}
