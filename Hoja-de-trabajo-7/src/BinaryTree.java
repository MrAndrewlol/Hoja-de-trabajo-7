import structure5.BinarySearchTree;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class BinaryTree
{

    protected BinarySearchTree<String> arbolingrish;
    protected BinarySearchTree<String> arbolspanish;
    protected BinarySearchTree<String> arbolfrance;
    private String[] listatarget;


    public BinaryTree() {
    }



    
    public BinaryTree(BinarySearchTree<String> arbolingrish, BinarySearchTree<String> arbolspanish, BinarySearchTree<String> arbolfrance, String[] listatarget) {
        this.arbolingrish = arbolingrish;
        this.arbolspanish = arbolspanish;
        this.arbolfrance = arbolfrance;
        this.listatarget = listatarget;
    }


    public String[] getListatarget() {
        return this.listatarget;
    }

    public void setListatarget(String[] listatarget) {
        this.listatarget = listatarget;
    }


    public BinarySearchTree<String> getArbolingrish() {
        return this.arbolingrish;
    }

    public void setArbolingrish(BinarySearchTree<String> arbolingrish) {
        this.arbolingrish = arbolingrish;
    }

    public BinarySearchTree<String> getArbolspanish() {
        return this.arbolspanish;
    }

    public void setArbolspanish(BinarySearchTree<String> arbolspanish) {
        this.arbolspanish = arbolspanish;
    }

    public BinarySearchTree<String> getArbolfrance() {
        return this.arbolfrance;
    }

    public void setArbolfrance(BinarySearchTree<String> arbolfrance) {
        this.arbolfrance = arbolfrance;
    }



    public void filldic(String[] listapalabra){
        int k = 0;
        while( k < listapalabra.length ){
            arbolingrish.add(listapalabra[k].trim()); 
            k = k + 1;
            arbolspanish.add(listapalabra[k].trim());
            k = k + 1;
            arbolfrance.add(listapalabra[k].trim());
            k = k + 1;
        }

    }

//locate  = localizar 
    public void leerautomatico(){
    System.out.println("Ingrese la ruta del archivo ej C:\\ejemplos\\example1.txt");
	Scanner in = new Scanner(System.in);
	String fpath = in.nextLine();
	  
    try {
      File myObj = new File(fpath);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        listatarget = data.split("*");
        setListatarget(listatarget);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }
}

  
