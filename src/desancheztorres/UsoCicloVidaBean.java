package desancheztorres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoCicloVidaBean {

	public static void main(String[] args) {
		// carga de xml de configuracion
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext3.xml");
		
		// Obtencion del bean
		Empleados Cristian = context.getBean("miEmpleado", Empleados.class);
		
		System.out.println(Cristian.getInforme());
		
		// Cerrar el contexto
		context.close();

	}

}
