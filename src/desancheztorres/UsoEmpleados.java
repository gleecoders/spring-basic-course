package desancheztorres;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoEmpleados {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creacion de objetos de tipo Empleado
		
//		Empleados Empleado1 = new DirectorEmpleado();
//		
//		// Uso de los objetos creados
//		System.out.println(Empleado1.getTareas());
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		DirectorEmpleado Juan = context.getBean("miEmpleado", DirectorEmpleado.class);
		
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());
		System.out.println(Juan.getEmail());
		System.out.println(Juan.getNombreEmpresa());

		
//		SecretarioEmpleado Maria = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
//		SecretarioEmpleado Pablo = context.getBean("miSecretarioEmpleado", SecretarioEmpleado.class);
//
//		System.out.println(Maria.getTareas());
//		System.out.println(Maria.getInforme());
//		System.out.println("Email: " + Maria.getEmail());
//		System.out.println("Email Pablo: " + Pablo.getEmail());

		
		context.close();

	}

}
