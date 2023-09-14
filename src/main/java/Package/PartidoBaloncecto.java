package Package;

public class PartidoBaloncecto extends Partido {

	private int tipoCancha;
	private String TiemposJugados;

	public PartidoBaloncecto(String equipoOponente, String resultado, String fecha, String lugarPartido) {
		super(equipoOponente, resultado, fecha, lugarPartido);
	}
}