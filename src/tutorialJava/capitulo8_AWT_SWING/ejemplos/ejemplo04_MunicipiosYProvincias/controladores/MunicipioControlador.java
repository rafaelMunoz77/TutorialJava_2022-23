package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.controladores;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.ConnectionManager;
import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo04_MunicipiosYProvincias.modelo.Municipio;


public class MunicipioControlador {

	
	/**
	 * 
	 */
	public static List<Municipio> filterByNombre (String filtro) {
		List<Municipio> lista = new ArrayList<Municipio>();
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from municipio where nombre like '%" + filtro + "%'");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) {
				Municipio m = new Municipio(rs.getInt("id"), rs.getInt("idProvincia"), rs.getString("nombre"));
				lista.add(m);
			}
			// Cierre de los elementos
			rs.close();
			s.close();
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
			ex.printStackTrace();
		}
		return lista;
	}

	
	
	/**
	 * 
	 */
	public static int modificar (Municipio m) {		
		int registrosAfectados = 0;
		try {
			PreparedStatement ps = ConnectionManager.getConexion().prepareStatement(
					"update municipio set nombre = ?, idProvincia = ? where id = ?");
			ps.setString(1, m.getNombre());
			ps.setInt(2, m.getIdProvincia());
			ps.setInt(3, m.getId());
			registrosAfectados = ps.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return registrosAfectados;		
	}

}
