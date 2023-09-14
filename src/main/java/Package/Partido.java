package Package;

public class Partido {

	private String equipoOponente;
	private String resultado;
	private String fecha;
	private String lugarPartido;
	
	public Partido(String equipoOponente, String resultado, String fecha, String lugarPartido) {
		this.equipoOponente = equipoOponente;
		this.resultado = resultado;
		this.fecha = fecha;
		this.lugarPartido = lugarPartido;
	}

	public String getEquipoOponente() {
		return equipoOponente;
	}

	public void setEquipoOponente(String equipoOponente) {
		this.equipoOponente = equipoOponente;
	}

	public String getResultado() {
		return resultado;
	}

	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getLugarPartido() {
		return lugarPartido;
	}

	public void setLugarPartido(String lugarPartido) {
		this.lugarPartido = lugarPartido;
	}
}

