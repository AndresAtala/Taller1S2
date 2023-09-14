package Package;

public class Entrenador extends Deportista {

	EquipoBaloncesto entrenador;
	private String experencia;
	private String Especialidad;

	public Entrenador(String nombre, String apellido, String direccionDeCorreo, String numeroDeContacto, String deporteQuePractica) {
		super(nombre, apellido, direccionDeCorreo, numeroDeContacto, deporteQuePractica);
	}

	public String getExperencia() {
		return this.experencia;
	}

	/**
	 * 
	 * @param experencia
	 */
	public void setExperencia(String experencia) {
		this.experencia = experencia;
	}

	public String getEspecialidad() {
		// TODO - implement Entrenador.getEspecialidad
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param Especialidad
	 */
	public void setEspecialidad(String Especialidad) {
		// TODO - implement Entrenador.setEspecialidad
		throw new UnsupportedOperationException();
	}

}