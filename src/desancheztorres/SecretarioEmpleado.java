package desancheztorres;

public class SecretarioEmpleado implements Empleados {
	
	// Creacion de campo tipo CreacionInforme (interfaz)
	private CreacionInformes informeNuevo;
		
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}	
	
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: " + informeNuevo.getInforme();
	}
	
	private String nombreEmpresa;
	private String email;

}
