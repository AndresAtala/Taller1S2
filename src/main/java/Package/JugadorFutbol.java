package Package;
import java.util.ArrayList;
import java.util.List;

public class JugadorFutbol extends Deportista {

	private boolean delantero;
	private boolean defensa;
	private boolean portero;
	public JugadorFutbol(String nombre, String apellido, String correo, String contacto, String deporte,
						 boolean delantero, boolean defensa, boolean portero) {
		super();
		this.delantero = delantero;
		this.defensa = defensa;
		this.portero = portero;}

	public boolean isDelantero() {
		return delantero;
	}

	public void setDelantero(boolean delantero) {
		this.delantero = delantero;
	}

	public boolean isDefensa() {
		return defensa;
	}

	public void setDefensa(boolean defensa) {
		this.defensa = defensa;
	}


	public boolean isPortero() {
		return portero;
	}

	public void setPortero(boolean portero) {
		this.portero = portero;
	}
	public static void main(String[] args) {
		List<JugadorFutbol> listaJugadoresFutbol = new ArrayList<>();
		JugadorFutbol jugador1 = new JugadorFutbol("juanito1", "Apellido1", "correo1@example.com", "3729573857", "Fútbol", true, false, false);
		listaJugadoresFutbol.add(jugador1);

		for (JugadorFutbol jugador : listaJugadoresFutbol) {
			System.out.println("Nombre: " + jugador.getNombre());
			System.out.println("Apellido: " + jugador.getApellido());
			System.out.println("Correo: " + jugador.getDireccionDeCorreo());
			System.out.println("Contacto: " + jugador.getNumeroDeContacto());
			System.out.println("Deporte: " + jugador.getDeporteQuePractica());
			System.out.println("Delantero: " + jugador.isDelantero());
			System.out.println("Defensa: " + jugador.isDefensa());
			System.out.println("Portero: " + jugador.isPortero());
			System.out.println();
		}
	}
}


