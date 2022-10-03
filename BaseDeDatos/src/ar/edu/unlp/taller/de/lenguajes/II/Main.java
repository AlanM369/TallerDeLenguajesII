package ar.edu.unlp.taller.de.lenguajes.II;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {

	public static void main(String[] args) {
		Conexion conexion = new Conexion();
		Connection cn = null; // Declaramos el objeto Connection, que va a tener la referencia a la conexion que se establece entre java y la  base de datos de mysql.
		PreparedStatement ps = null; // Declaramos un objeto que representa una instrucción SQL precompilada.
		
		try {
			cn = conexion.conectar(); // Creamos el objeto Connection.
			
			ps = cn.prepareStatement("SELECT * FROM pais;");
			
			Pais p = new Pais("Argentina", Lenguas.ESPANIOL);
			
			ps.setInt(1, 1);
			ps.setString(2, p.getNombre());
			ps.setString(3, p.getIdioma().name());
			ps.executeUpdate();
			ps.close();
			
			ps = cn.prepareStatement("SELECT * FROM futbolista;"); // creamos el objeto prepareStatement.
			
			
			Jugador j = new Jugador("Lionel", "Messi", 28456377, 221575345, "lm@gmail.com", p);
			
			ps.setInt(1, 1);
		    ps.setString(2, j.getNombre());
			ps.setString(3, j.getApellido());
			ps.setInt(4, j.getDocId());
			ps.setInt(5, j.getTelefono());
			ps.setString(6, j.getEmail());
			ps.setInt(7, 1);
			
			ps.executeUpdate();
			
			
		

		} catch (SQLException e) {
			e.printStackTrace(); // Muestra el rastreo de pila, para saber, en el caso que haya un error, el
									// origen de esté.
		} finally {
			// El bloque finally se ejecuta siempre y es utilizado para liberar recursos,
			// usando el metodo close().
			try {
				
				if (ps != null) {
					ps.close();
				}
				if (cn != null) {
					cn.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();// Muestra el rastreo de pila, para saber, en el caso que haya un error, el
										// origen de esté.
			}
		}

	}

}
