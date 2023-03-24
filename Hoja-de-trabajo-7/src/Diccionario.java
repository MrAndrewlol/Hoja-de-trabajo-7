
// Java Program to Print Colored Text in Console
  
// Importing input output classes
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.lang.Thread; 
 

// Main class
public class Diccionario {

    public static void esperando(int segundo){
        String loading = "Esperando.";
       
        
        try {
            for (int i = 0; i < 10; i++) {
                
               
                // it will sleep the main thread for 1 sec
                // ,each time the for loop runs
                Thread.sleep(segundo);
                loading = loading + ".";

                if ( i%2 == 0){
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();  
                    System.out.print(decoration.YELLOW_BRIGHT + loading + "\n" + decoration.RESET);
                }
                else{
                    System.out.print("\033[H\033[2J");  
                    System.out.flush();  
                    System.out.print(decoration.CYAN_BRIGHT + loading + "\n" + decoration.RESET);
                }
               
                // This Thread.sleep() method will sleep the
                // thread 0.
                // printing the value of the variable
                
                
                
            }
        }
        catch (Exception e) {
           
            // catching the exception
            System.out.println(e);
        }
    }
    
    public static void main(String[] args){ 
        BinaryTree arbolbi = new BinaryTree();
        // Printing the text on console prior adding
        // the desired color
        System.out.println(decoration.YELLOW_BRIGHT + "Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt" + decoration.RESET);
        
        
        Scanner in = new Scanner(System.in);
        String fpath = in.nextLine();
        Diccionario.esperando(200);
        
        
        
      try {
        File myObj = new File(fpath);
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
          String data = myReader.nextLine();
          String[] listaString = data.split(",");
          arbolbi.filldic(listaString);
          System.out.println(decoration.WHITE_BACKGROUND + "    " + decoration.RESET + " Se llenaron las palabaras del diccionario " +  decoration.WHITE_BACKGROUND + "    " + decoration.RESET);
          

          














        }
        myReader.close();
      } catch (FileNotFoundException e) {
        System.out.println("An error occurred.");
        e.printStackTrace();
      }

        
    }
}
