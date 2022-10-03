package ar.edu.unlp.taller.de.lenguajes.II;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    
	// Es la cadena que proporciona mysql para poder conectarse a la base de datos.
	private static final String CONECTOR = "com.mysql.cj.jdbc.Driver";

	// Es la cadena de
	// conexion:(API:GestorDeBaseDeDatos://IPDeServer:puerto/NombreDeLaBaseDeDatosCreada).
	private static final String URL = "jdbc:mysql://localhost:3306/mundial_futbol_2022";

	private static final String USUARIO = "root";

	private static final String CLAVE = "administrador";

	/*
	 * Creamos el metodo static para que cargue el conector una unica vez, al cargar
	 * la aplicacion.
	 */
	static {
		try {
			Class.forName(CONECTOR); // Cargamos el conector para cargar en memoria todas las clase de la libreria
										// del conector de mysql.
		} catch (ClassNotFoundException e) {
			System.out.println("Error al cargar el conector"); // Si no se logra cargar el conector, se atrapa la
																// excepcion en el bloque catch e imprime el mensaje de
																// error.
			e.printStackTrace(); // Muestra el rastreo de pila, para saber, en el caso que haya un error, el
									// origen de éste.
		}
	}

	public Connection conectar() {
		Connection conexion = null; // Creamos el objeto Connection, que va a tener la referencia a la conexion
									// establece entre java y mysql.

		try {
			conexion = DriverManager.getConnection(URL, USUARIO, CLAVE); // Establecemos la conexion y lo asignamos al
																			// objeto conexion.
			System.out.println("Conexión OK"); // Imprime el mensaje si se logra conectar.

		} catch (SQLException e) {
			System.out.println("Error en la conexión"); // Si no se logra conectar, se atrapa la excepcion en el bloque
														// catch y se imprime mensaje de error.
			e.printStackTrace(); // Muestra el rastreo de pila, para saber, en el caso que haya un error, el
									// origen de éste.
		}
		return conexion; // retorna el objeto conexion.
	}
}
