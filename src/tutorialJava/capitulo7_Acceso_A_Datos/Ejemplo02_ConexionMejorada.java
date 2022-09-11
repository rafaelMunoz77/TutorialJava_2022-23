package tutorialJava.capitulo7_Acceso_A_Datos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;


public class Ejemplo02_ConexionMejorada {

	
	/**
	 * 
	 * @param conn
	 * @param tabla
	 * @throws SQLException
	 */
	private static void consultarTabla (Connection conn, String tabla) 
			throws SQLException{
		
		Statement s = (Statement) conn.createStatement(); 		
		ResultSet rs = s.executeQuery ("select * from " + tabla);
		
		// A través del objeto ResultSetMetaData obtenemos información sobre las características de los campos que 
		// posee el conjunto de registros que hemos obtenido con la consulta. Gracias a eso podemos hacer una visualización
		// enriquecida del contenido del objeto ResultSet
		ResultSetMetaData rsmd= rs.getMetaData();			

		// Impresión en pantalla de los tipos de las columnas que forman el resultado del ResultSet
		System.out.println("\n-------------------------------------------------------------");
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnTypeName(i) + "\t");
		}
		System.out.println("\n-------------------------------------------------------------");

		// Impresión en pantalla de las etiquetas de nombre de las columnas del objeto ResultSet
		System.out.println("\n-------------------------------------------------------------");
		for (int i = 1; i <= rsmd.getColumnCount(); i++) {
			System.out.print(rsmd.getColumnLabel(i) + "\t");
		} 
		System.out.println("\n-------------------------------------------------------------");
		
		// Recorrido del ResultSet, diferenciando entre los tipos de datos que pueden tener las columnas
		while (rs.next()) {
			for (int i = 1; i <= rsmd.getColumnCount(); i++) {
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("INT")) {
					System.out.print(rs.getInt(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("VARCHAR")) {
					System.out.print(rs.getString(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("DATETIME")) {
					System.out.print(rs.getDate(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("TINYINT")) {
					System.out.print(rs.getBoolean(rsmd.getColumnLabel(i)) + "\t");
				}
				if (rsmd.getColumnTypeName(i).equalsIgnoreCase("FLOAT")) {
					System.out.print(rs.getFloat(rsmd.getColumnLabel(i)) + "\t");
				}
				
			}
			System.out.println("\n");			
		}

		rs.close();
		s.close();
	}
		
	
	
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Connection conn = ConnectionManagerV1.getConexion();
		   
			consultarTabla (conn, "coche");
			
		}
		catch (SQLException ex) {
			System.out.println("Error en la ejecución SQL: " + ex.getMessage());
		}
	}

}
