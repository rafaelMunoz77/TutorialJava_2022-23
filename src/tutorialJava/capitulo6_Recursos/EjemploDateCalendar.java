package tutorialJava.capitulo6_Recursos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class EjemploDateCalendar {

	/**
	 * 
	 */
	private static void ejemploCreacionNormalDate () {
		// El constructor por defecto de java.util.Date nos permite crear un objeto con la fecha actual
		Date fechaActual = new Date();
		System.out.println("Fecha actual: " + fechaActual.toString());
		// getTime() nos permite acceder a los millis que representan al objeto Date, muy importante conocer esto
		System.out.println("Milisegundos actuales: " + fechaActual.getTime());
	}
	
	/**
	 * 
	 */
	private static void ejemploFormateoFecha () {
		Date ahora = new Date();
		
		// El formateo de fechas se puede realizar a trav�s de SimpleDateFormat, de una forma sencilla.
		// Consulta Javadoc SimpleDateFormat para más detalles
		SimpleDateFormat sdf = new SimpleDateFormat ("EEE, MMM d, ''yy 'at' hh:mm:ss a z");
		System.out.println("Fecha actual: " + sdf.format(ahora));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss");
		System.out.println("Fecha actual: " + sdf2.format(ahora));
			
		Date fechaParseada = null;
		// El parseo de fechas debe obligatoriamente ser inspeccionado con un bloque de manejo de excepciones
		try {
			fechaParseada = sdf2.parse("19/03/1977 15:33:00");
		} catch (ParseException e) {
			System.out.println ("Error en el parseo de la fecha");
			e.printStackTrace();
		}
		System.out.println("Fecha parseada: " + sdf.format(fechaParseada));
	}
	
	
	/**
	 * 
	 */
	private static void ejemploCalendarBasico () {
		// Otra forma muy habitual de manejar fechas es a través de los objetos de tipo Calendar
		Calendar fechaCalendar = new GregorianCalendar(1918, Calendar.APRIL, 01, 22, 05, 23);
		System.out.println("Millis: " + fechaCalendar.getTimeInMillis());
		// Es f�cil y muy habitual convertir un Calendar en Date
		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		System.out.println("Fecha a partir de Calendar : " + fechaAPartirDeCalendar);
	}
	
	
	
	private static void ejemploCalendarConCamposIndividualizados () {
		Calendar fechaCalendar = Calendar.getInstance(); // Instanciación por patrón Factory (Recuerda como funciona)

		fechaCalendar.set(Calendar.YEAR, 2018);
		// Sobre el mes, recuerda que Enero corresponde al valor int 0 y Diciembre al int 11. Mejor usa las variables estáticas
		fechaCalendar.set(Calendar.MONTH, Calendar.APRIL);
		fechaCalendar.set(Calendar.DAY_OF_MONTH, 01);

		// Ejemplo de manejo de horas en formato AM/PM
		fechaCalendar.set(Calendar.HOUR, 10);
		fechaCalendar.set(Calendar.AM_PM, Calendar.PM);
		// Puedes preferir el formato 24 horas
		fechaCalendar.set(Calendar.HOUR_OF_DAY, 22);

		fechaCalendar.set(Calendar.MINUTE, 05);
		fechaCalendar.set(Calendar.SECOND, 23);
		fechaCalendar.set(Calendar.MILLISECOND, 123);

		// Conversión a date y formateo
		Date fechaAPartirDeCalendar = new Date(fechaCalendar.getTimeInMillis());
		System.out.println("Fecha a partir de Calendar con campos individualizados: " + 
				new SimpleDateFormat ("dd/MM/yyyy HH:mm:ss").format(fechaAPartirDeCalendar));
		
	}
	
	
	/**
	 * 
	 */
	private static void ejemploLecturaCamposIndividualizadosYLocaleEnImpresion () {
		//Locale locale = Locale.getDefault();
		Locale locale = Locale.ITALIAN;
		Calendar ahora = Calendar.getInstance();

		System.out.println("Año: " + ahora.get(Calendar.YEAR));
		System.out.println("Mes (0 es Enero): " + ahora.get(Calendar.MONTH));
		ahora.set(Calendar.MONTH, Calendar.JANUARY);
		System.out.println("Month (String): " + ahora.getDisplayName(Calendar.MONTH, Calendar.SHORT, locale));
		System.out.println("D�a del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
		System.out.println("D�a de la semana (0 es Domingo): " + ahora.get(Calendar.DAY_OF_WEEK));
		System.out.println("D�a de la semana (String): "
		            + ahora.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, locale));
		System.out.println("Semana del año: " + ahora.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Semana del mes: " + ahora.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));
		System.out.println("Hora en formato 24H: " + ahora.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en formato 12H: " + ahora.get(Calendar.HOUR));
		System.out.println("AM/PM: " + ahora.get(Calendar.AM_PM));
		System.out.println("AM/PM: " + ahora.getDisplayName(Calendar.AM_PM, Calendar.LONG, locale));
		System.out.println("Minutos: " + ahora.get(Calendar.MINUTE));
		System.out.println("Segundos: " + ahora.get(Calendar.SECOND));
		System.out.println("MiliSegundos: " + ahora.get(Calendar.MILLISECOND));
		
		// DST_Offset 
		System.out.println("DST_OFFSET: " + ahora.get(Calendar.DST_OFFSET));
	}
	
	
	
	/**
	 * 
	 */
	private static void ejemploSumaRestaFechas () {
		Calendar ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println("Ahora más 20 días : " + ahora.getTime());

		ahora = Calendar.getInstance();
		ahora.add(Calendar.DAY_OF_MONTH, -20);
		System.out.println("Ahora menos 20 días : " + ahora.getTime());
	}
	
	
	/**
	 * 
	 */
	private static void ejemploComparacionFechas () {
		Calendar ahora = Calendar.getInstance();
		Calendar despues = Calendar.getInstance();
		despues.add(Calendar.HOUR_OF_DAY, 2);

		Calendar antes = Calendar.getInstance();
		antes.add(Calendar.HOUR_OF_DAY, -5);

		System.out.println("Ahora es después que después: " + ahora.after(despues));
		System.out.println("Ahora es antes que después: " + ahora.before(despues));
		System.out.println("Ahora es después que antes: " + ahora.after(antes));
		System.out.println("Ahora es antes que antes: " + ahora.before(antes));
	}
	
	
	
	/**
	 * 
	 */
	private static void ejemploDiasEntreDosFechas () {
		Calendar unDiaDeMarzo = Calendar.getInstance();
		unDiaDeMarzo.set(Calendar.MONTH, Calendar.MARCH);

		Calendar unDiaDeFebrero = Calendar.getInstance();
		unDiaDeFebrero.set(Calendar.MONTH, Calendar.FEBRUARY);
		      
		long milis = unDiaDeMarzo.getTimeInMillis()-unDiaDeFebrero.getTimeInMillis();
		long diasEntreFechas = milis/1000/60/60/24;
		System.out.println("Days : " + diasEntreFechas);
	}
	
	
	
	/**
	 * 
	 */
	private static void ejemploZonasHorarias () {
		Calendar ahoraEnEspania = Calendar.getInstance(TimeZone.getDefault());
		Calendar ahoraEnCanada = Calendar.getInstance(TimeZone.getTimeZone("Canada/Central"));
		Calendar ahoraEnNewYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println("Hora espa�ola: " + ahoraEnEspania.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora canadiense: " + ahoraEnCanada.get(Calendar.HOUR_OF_DAY));
		System.out.println("Hora en New York: " + ahoraEnNewYork.get(Calendar.HOUR_OF_DAY));
		
		// Podemos obtener todos las zonas horarias disponibles
		String zonasHorarias[] = TimeZone.getAvailableIDs();
		for (String str : zonasHorarias)
			System.out.println("Zona horaria: " + str);
//		System.out.println("Zona horaria disponible: " + Arrays.toString(zonasHorarias));
		
		// También podemos fabricarnos una zona horaria determinada, si no hallamos la que buscamos
		// Cuidado con los horarios de verano!!!
		Calendar unaZona= Calendar.getInstance(TimeZone.getTimeZone("GMT+8:00"));
		Calendar otraZona= Calendar.getInstance(TimeZone.getTimeZone("GMT-4:00"));
		System.out.println("GMT+8:00: " + unaZona.get(Calendar.HOUR_OF_DAY));
		System.out.println("GMT-4:00: " + otraZona.get(Calendar.HOUR_OF_DAY));
	}
	
	
	public static void main(String[] args) {
		ejemploCreacionNormalDate();
		//ejemploFormateoFecha();
		//ejemploCalendarBasico();
		//ejemploCalendarConCamposIndividualizados();
		//ejemploLecturaCamposIndividualizadosYLocaleEnImpresion();
		//ejemploSumaRestaFechas();
		//ejemploComparacionFechas();
		//ejemploDiasEntreDosFechas();
		ejemploZonasHorarias();
	}

}
