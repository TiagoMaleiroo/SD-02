
package sd;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.util.ArrayList;




public class Servidor_2 extends Thread{
   
        Interface in = new Interface();

	private Socket cliente;
	private Interface Campos;
        private int opc;
	public Servidor_2(Socket cliente, Interface ini, int opc) {
		this.cliente = cliente;
                this.Campos = ini;
                this.opc = opc;
	}
  
	public void run() {
		// Informa o IP do cliente que se conectou
		System.out.println("IP: " +     
	            cliente.getInetAddress().getHostAddress() +
	            " Conectado"	
                        
	        );
                this.Campos.setIP(cliente.getInetAddress().getHostAddress(), opc);
		InputStream is;
		try {
			//Criando o objeto para receber o Arraylist do cliente
			is = cliente.getInputStream();
			try {
				ObjectInputStream ois = new ObjectInputStream(is);
                             
				while(true) {
				//Fica verificando se hÃ¡ alguma informaÃ§Ã£o mandada pelo cliente
				ArrayList<String> al = (ArrayList)ois.readObject();
                                this.Campos.setValue(al.get(0), opc);


				}
			} catch (IOException e1) {
				// Caso o cliente se desconecte ele informa
				System.out.println("IP: " +     
	    	            cliente.getInetAddress().getHostAddress() +
	    	            " Desconectado"	            
	    	        );
                                this.Campos.desconectIP(opc);
				//Fecha o Socket Aberto
				this.cliente.close();
				//Encerra a Thread
				Thread.currentThread().interrupt();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

    private String al(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


 
}



