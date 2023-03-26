import structure5.Structure;

public class Association<K, V> {
   

    public String traduccionEs(String[] palabras, String idioma, arbolbinario arbolIdioma){
        String traduccion = "";
        if (idioma.equalsIgnoreCase("ingles")) {
            for (String palabra : palabras) {
                if(arbolIdioma.getNode(palabra).contains("*")){
                    traduccion = traduccion + arbolIdioma.getNode(palabra) + " "; 
                } else {
                    String word = arbolIdioma.getNode(palabra);
                    String[] words = word.split(",");

                    traduccion = traduccion + words[1] + " ";
                }

            }
        } else if (idioma.equalsIgnoreCase("frances")){
            for (String palabra : palabras) {
                if(arbolIdioma.getNode(palabra).contains("*")){
                    traduccion = traduccion + arbolIdioma.getNode(palabra) + " "; 
                } else {
                    String word = arbolIdioma.getNode(palabra);
                    String[] words = word.split(",");

                    traduccion = traduccion + words[2] + " ";
                }
            }
        }
        return traduccion;
    }

    public String traduccionEn(String[] palabras, String idioma, arbolbinario arbolIdioma){
        String traduccion = "";
        if (idioma.equalsIgnoreCase("español")) {
            for (String palabra : palabras) {
                if(arbolIdioma.getNode(palabra).contains("*")){
                    traduccion = traduccion + arbolIdioma.getNode(palabra) + " "; 
                } else {
                    String word = arbolIdioma.getNode(palabra);
                    String[] words = word.split(",");

                    traduccion = traduccion + words[1] + " ";
                }

            }
        } else if (idioma.equalsIgnoreCase("frances")){
            for (String palabra : palabras) {
                if(arbolIdioma.getNode(palabra).contains("*")){
                    traduccion = traduccion + arbolIdioma.getNode(palabra) + " "; 
                } else {
                    String word = arbolIdioma.getNode(palabra);
                    String[] words = word.split(",");

                    traduccion = traduccion + words[1] + " ";
                }
            }
        }
        return traduccion;
    }

    public String traduccionFr(String[] palabras, String idioma, arbolbinario arbolIdioma){
        String traduccion = "";
        if (idioma.equalsIgnoreCase("ingles")) {
            for (String palabra : palabras) {
                if(arbolIdioma.getNode(palabra).contains("*")){
                    traduccion = traduccion + arbolIdioma.getNode(palabra) + " "; 
                } else {
                    String word = arbolIdioma.getNode(palabra);
                    String[] words = word.split(",");

                    traduccion = traduccion + words[2] + " ";
                }
            }
        } else if (idioma.equalsIgnoreCase("español")){
            for (String palabra : palabras) {
                if(arbolIdioma.getNode(palabra).contains("*")){
                    traduccion = traduccion + arbolIdioma.getNode(palabra) + " "; 
                } else {
                    String word = arbolIdioma.getNode(palabra);
                    String[] words = word.split(",");

                    traduccion = traduccion + words[2] + " ";
                }
            }
        }
        return traduccion;
    }

    

}