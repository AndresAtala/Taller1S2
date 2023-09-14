package Package;

public class PartidoTenis extends Partido {

	private String TipoCancha;
	private int TipoPartidos;

	public PartidoTenis(String equipoOponente, String resultado, String fecha, String lugarPartido) {
		super(equipoOponente, resultado, fecha, lugarPartido);
	}

	// Getter para TipoCancha
	public String getTipoCancha() {
		return TipoCancha;
	}

	// Setter para TipoCancha
	public void setTipoCancha(String tipoCancha) {
		TipoCancha = tipoCancha;
	}

	// Getter para TipoPartidos
	public int getTipoPartidos() {
		return TipoPartidos;
	}

	// Setter para TipoPartidos
	public void setTipoPartidos(int tipoPartidos) {
		TipoPartidos = tipoPartidos;
	}

	public static void main(String[] args) {
		PartidoTenis partido = new PartidoTenis("EquipoOponente", "Resultado", "Fecha", "Lugar");
		partido.setTipoCancha("Cancha de tierra");
		partido.setTipoPartidos(3);

		String tipoCancha = partido.getTipoCancha();
		int tipoPartidos = partido.getTipoPartidos();


	}
}
