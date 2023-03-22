
public class amigo{
  private String owners;
  private String numero;
  private float dinero;

  public amigo(){
        owners = "";
        numero = "";
        dinero = 0;
  }



public amigo(String owners, String numero, float dinero){
  this.owners = owners;
  this.numero = numero;
  this.dinero = dinero;

}


public String getowners(){
  return this.owners;
}

public void setowners(String owners){
  this.owners = owners;
}
public String getnumero(){
  return this.numero;
}

public void setnumero(String numero){
  this.numero = numero;
}

public float getdinero(){
  return this.dinero;
}

public void setdinero(float dinero){
  this.dinero = dinero;
}


public String toString(){
  String cadena = "";
  cadena = "Por favor contactar a " + owners + "\nNumero de telefono: " + numero;
  return cadena;

}

}

  
