package Package;

public class PartidoTenis extends Partido {

	private String TipoCancha;
	private int TipoPartidos;

	public PartidoTenis(String equipoOponente, String resultado, String fecha, String lugarPartido) {
		super(equipoOponente, resultado, fecha, lugarPartido);
	}
}