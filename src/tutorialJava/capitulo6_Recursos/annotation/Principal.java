package tutorialJava.capitulo6_Recursos.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Principal {

	public static void main(String[] args) {
		
		ClaseAnotada claseAnotada = new ClaseAnotada();

        try {
            final Method[] methods = ClaseAnotada.class.getMethods();
            for (final Method method : methods) {
            	System.out.println("Método: " + method.getName());
                invokeMethod(method, claseAnotada);
            }
        } catch (final Exception e) {
            System.err.println("Hubo un error:" + e.getMessage());
        }
	
	}
	
	
	
    private static void invokeMethod(Method method, ClaseAnotada objetoInstanciado) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
 
    	Annotation annotations[] = method.getAnnotations();
    	for (Annotation a : annotations) {
    		System.out.println("\tAnotaci�n: " + a.annotationType().getName());
    	}
    	
/*        final EjemploAnotacionMetodo anotacionEnMetodo = method.getAnnotation(EjemploAnotacionMetodo.class);
        System.out.println("\tAnotacion: " + anotacionEnMetodo);
 
        if (anotacionEnMetodo != null) {
            final int ejemploValorEntero = anotacionEnMetodo.ejemploValorEntero();
            		
            method.invoke(objetoInstanciado, (Object[])null);
            
        } */
 
    }


}
