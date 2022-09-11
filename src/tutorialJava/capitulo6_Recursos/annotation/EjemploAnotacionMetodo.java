package tutorialJava.capitulo6_Recursos.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
public @interface EjemploAnotacionMetodo {
	int ejemploValorEntero() default 1;
}
