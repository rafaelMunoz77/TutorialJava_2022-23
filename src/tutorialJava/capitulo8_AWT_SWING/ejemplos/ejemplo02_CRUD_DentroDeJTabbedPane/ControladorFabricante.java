package tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo02_CRUD_DentroDeJTabbedPane;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import tutorialJava.capitulo8_AWT_SWING.ejemplos.ejemplo01_CRUD_Fabricante.ConnectionManager;

public class ControladorFabricante {

	
	/**
	 * 
	 */
	public static List<Fabricante> obtenerTodosLosFabricantes() {
		List<Fabricante> lista = new ArrayList<Fabricante>();
		
		try {
			// Para poder ejecutar una consulta necesitamos utilizar un objeto de tipo Statement
			Statement s = (Statement) ConnectionManager.getConexion().createStatement(); 
			
			// La ejecución de la consulta se realiza a través del objeto Statement y se recibe en forma de objeto
			// de tipo ResultSet, que puede ser navegado para descubrir todos los registros obtenidos por la consulta
			ResultSet rs = s.executeQuery ("select * from fabricante");
		   
			// Navegación del objeto ResultSet
			while (rs.next()) { 
				Fabricante f = new Fabricante(rs.getInt("id"), rs.getString("cif"), rs.getString("nombre"));
				lista.add(f);
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

	
	
	
	public void eliminarFabricante (int id) {
		
	}
	
	
	
}
