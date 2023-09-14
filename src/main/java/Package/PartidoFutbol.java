package Package;

public class PartidoFutbol extends Partido {

	private String tipocancha;
	private int LocalOvisitante;

	public PartidoFutbol(String equipoOponente, String resultado, String fecha, String lugarPartido) {
		super(equipoOponente, resultado, fecha, lugarPartido);
	}
}