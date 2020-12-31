package desancheztorres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoDemoSingletonPrototype {

	public static void main(String[] args) {
		
		// carga de xml de configuracion
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		
		//peticion de beans al contenedor Spring
		
		SecretarioEmpleado Cristian = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		SecretarioEmpleado Oscar = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
		
		System.out.println(Cristian);
		System.out.println(Oscar);
		
		if(Cristian==Oscar) System.out.println("Apunta al mismo objeto");
		else System.out.println("No apunta al mismo objeto");
		
		

	}

}
