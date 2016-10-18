
package boletin4_4;

public class Boletin4_4 {

   
    public static void main(String[] args) {
      Clientes clientes1=new Clientes();
      clientes1.setcantPulpo(300);
      clientes1.setcantPatatas(400);
      int clientesPatatas=clientes1.calcular_numClientesPatatas();
      int clientesPulpo=clientes1.calcular_numClientesPulpo();
      System.out.println("Clientes pulpo = " + clientesPulpo + " Clientes patatas = " + clientesPatatas);
      
      clientes1.engadirPatatas(23);
      clientes1.engadirPulpo(4);
      clientes1.amosar();
      clientes1.amosar1();
    }
    
}
