package annotation;

import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface ITabelaPagamento {
	
	String nome();
	long valor();
	String vencimento();
	String status();
}
