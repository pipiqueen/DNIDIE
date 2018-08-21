package utn.com.vista;




import static java.nio.file.StandardOpenOption.*;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JOptionPane;

public class Test3 {

	public static void main(String[] args) {
System.out.println("funciona");
		
Path batata = Paths.get("C:\\Users\\Java\\Desktop\\nuevo documento de texto.txt");
try {
	ObjectOutputStream out = new ObjectOutputStream(Files.newOutputStream(batata, CREATE, APPEND));
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

boolean stahp = true;

		Map<Integer, Persona> personas = new TreeMap<>();
		
		String[] opcionesPane = { "Ingresar Persona", "Chequear estado" };

		
		
		while (stahp) {
			
		
			int opcionPanel = JOptionPane.showOptionDialog(null, "que opcion desea realizar", "DNI", 0, 0, null,
					opcionesPane, 1);

			switch (opcionPanel) {
			case 0:
				personas.put(Integer.parseInt(JOptionPane.showInputDialog("Ingrese su dni")),
						new Persona(JOptionPane.showInputDialog("Ingrese su nombre"),
								JOptionPane.showInputDialog("Ingrese su apellido")));
				System.out.println("persona recibida");
				break;
			case 1 :
			Integer dniABuscar = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dni de la persona"));
			if(!personas.isEmpty() && personas.containsKey(dniABuscar)) {
				JOptionPane.showMessageDialog(null, "La persona existe");
				
			}else {
				JOptionPane.showMessageDialog(null, "Error en la busqueda");
				}
				break;
				default: 
					 JOptionPane.showMessageDialog(null, "Ingrese una opcion valida");
					 
					
				}
			}

		}
}

