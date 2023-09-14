package Package;

public class Deportista {

	private string nombre;
	private string apellido;
	private string direccionDeCorreo;
	private string numeroDeContacto;
	private string deporteQuePractica;

	public string getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(string nombre) {
		this.nombre = nombre;
	}

	public string getApellido() {
		return this.apellido;
	}

	/**
	 * 
	 * @param apellido
	 */
	public void setApellido(string apellido) {
		this.apellido = apellido;
	}

	public string getDireccionDeCorreo() {
		return this.direccionDeCorreo;
	}

	/**
	 * 
	 * @param direccionDeCorreo
	 */
	public void setDireccionDeCorreo(string direccionDeCorreo) {
		this.direccionDeCorreo = direccionDeCorreo;
	}

	public string getNumeroDeContacto() {
		return this.numeroDeContacto;
	}

	/**
	 * 
	 * @param numeroDeContacto
	 */
	public void setNumeroDeContacto(string numeroDeContacto) {
		this.numeroDeContacto = numeroDeContacto;
	}

	public string getDeporteQuePractica() {
		return this.deporteQuePractica;
	}

	/**
	 * 
	 * @param deporteQuePractica
	 */
	public void setDeporteQuePractica(string deporteQuePractica) {
		this.deporteQuePractica = deporteQuePractica;
	}

}