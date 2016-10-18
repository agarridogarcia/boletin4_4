
package boletin4_4;


public class Clientes {
    private int numClientes,cantPulpo, cantPatatas;
    

public Clientes(int nC, int cPu, int cPa){
      numClientes=nC;
      cantPulpo=cPu;
      cantPatatas=cPa;
}
public Clientes (){
      numClientes=0;
      cantPulpo=0;
      cantPatatas=0;
}
//metodos

public int getnumClientes(){
    return numClientes;
}
public void setcantPulpo(int cPu){
    cantPulpo=cPu;
}
public double getcantPulpo(){
    return cantPulpo;
}
public void setcantPatatas(int cPa){
    cantPatatas=cPa;
}
public double getcantPatatas(){
    return cantPatatas;
}
public int calcular_numClientesPulpo(){
    int numClientesPulpo=3*cantPulpo/2;//regla de 3
    return numClientesPulpo;   
}
public int calcular_numClientesPatatas(){
     int numClientesPatatas=3*cantPatatas/1;//regla de 3
     return numClientesPatatas;
}

   
public void engadirPulpo( int engadir ) {
       cantPulpo=cantPulpo+engadir;
   }
   public void engadirPatatas(int engadir){
       cantPatatas=cantPatatas+engadir;
   }
   public void amosar(){
       System.out.println("Nova cantidade patatas = " + cantPatatas );
   }
   public void amosar1(){
       System.out.println("Nova cantidade pulpo = " + cantPulpo);
   }

}
