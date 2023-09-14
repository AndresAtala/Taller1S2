package Package;
public class Deportista {

	private String Nombre;
	private String Apellido;
	private String DireccionDeCorreo;
	private String NumeroDeContacto;
	private String DeporteQuePractica;
	public Deportista(String nombre, String apellido, String direccionDeCorreo, String numeroDeContacto, String deporteQuePractica) {
		this.Nombre = nombre;
		this.Apellido = apellido;
		this.DireccionDeCorreo = direccionDeCorreo;
		this.NumeroDeContacto = numeroDeContacto;
		this.DeporteQuePractica = deporteQuePractica;}

	public Deportista() {

	}

	public String getNombre() {
		return this.Nombre;
	}

	/**
	 *
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.Nombre = nombre;
	}

	public String getApellido() {
		return this.Apellido;
	}

	/**
	 *
	 * @param apellido
	 */
	public void setApellido(String apellido) {
		this.Apellido = apellido;
	}

	public String getDireccionDeCorreo() {
		return this.DireccionDeCorreo;
	}

	/**
	 *
	 * @param direccionDeCorreo
	 */
	public void setDireccionDeCorreo(String direccionDeCorreo) {
		this.DireccionDeCorreo = direccionDeCorreo;
	}

	public String getNumeroDeContacto() {
		return this.NumeroDeContacto;
	}

	/**
	 *
	 * @param numeroDeContacto
	 */
	public void setNumeroDeContacto(String numeroDeContacto) {
		this.NumeroDeContacto = numeroDeContacto;
	}

	public String getDeporteQuePractica() {
		return this.DeporteQuePractica;
	}

	/**
	 *
	 * @param deporteQuePractica
	 */
	public void setDeporteQuePractica(String deporteQuePractica) {
		this.DeporteQuePractica = deporteQuePractica;
	}
}
