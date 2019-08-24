package example.jaxws.main;

import fromjava.server.client.AddNumbersException_Exception;
import fromjava.server.client.AddNumbers_Service;
import fromjava.server.client.IAddNumbers;

public class principal {

	public static void main(String[] args) throws AddNumbersException_Exception {
		
		/**
		 * comando para generar cliente
		 * wsimport -d E:\eclipse\workspaces\jaxws-ri -p fromjava.server.client http://localhost:8080/Example_JAX_WS/IAddNumbers?wsdl
		 */
		
		AddNumbers_Service clientService = new AddNumbers_Service();
		IAddNumbers addNumbers = clientService.getAddNumberPort();
		
		System.out.println(addNumbers.addNumbers(12, 7));

	}

}
