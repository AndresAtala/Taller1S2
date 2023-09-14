package Package;

public class PartidoBaloncesto extends Partido {

	private int tipoCancha;
	private String TiemposJugados;

	public PartidoBaloncesto(String equipoOponente, String resultado, String fecha, String lugarPartido) {
		super(equipoOponente, resultado, fecha, lugarPartido);
	}

	// Getter para tipoCancha
	public int getTipoCancha() {
		return tipoCancha;
	}

	// Setter para tipoCancha
	public void setTipoCancha(int tipoCancha) {
		this.tipoCancha = tipoCancha;
	}

	// Getter para TiemposJugados
	public String getTiemposJugados() {
		return TiemposJugados;
	}

	// Setter para TiemposJugados
	public void setTiemposJugados(String tiemposJugados) {
		TiemposJugados = tiemposJugados;
	}

	public static void main(String[] args) {
		PartidoBaloncesto partido = new PartidoBaloncesto("EquipoOponente", "Resultado", "Fecha", "Lugar");
		partido.setTipoCancha(1);
		partido.setTiemposJugados("2 tiempos");

		int tipoCancha = partido.getTipoCancha();
		String tiemposJugados = partido.getTiemposJugados();

	}
}
