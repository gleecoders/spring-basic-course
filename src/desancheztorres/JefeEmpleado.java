package desancheztorres;

public class JefeEmpleado implements Empleados {
	
	// Creacion de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	
	public JefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	public String getTareas() {
		return "Gestiono las cuestiones realtivas a mis empleados de seccion";
	}

	@Override
	public String getInforme() {
		return "Informe presentado por el jefe con arreglos: " + informeNuevo.getInforme();
	}
}
