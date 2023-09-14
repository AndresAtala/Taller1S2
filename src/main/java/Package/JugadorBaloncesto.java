package Package;
import java.util.ArrayList;
import java.util.List;

public class JugadorBaloncesto extends Deportista {

	private boolean base;
	private boolean escolta;
	private boolean pivot;

	public JugadorBaloncesto(String nombre1, String apellido1, String mail, String number, String tenis, boolean base, boolean b1, boolean b2) {
		super(nombre1 , apellido1, apellido1, number, "Baloncesto");
		this.base = base;
		this.escolta = escolta;
		this.pivot = pivot;
	}

	public boolean getBase() {
		return this.base;
	}

	public void setBase(boolean base) {
		this.base = base;
	}

	public boolean getEscolta() {
		return this.escolta;
	}

	public void setEscolta(boolean escolta) {
		this.escolta = escolta;
	}

	public boolean getPivot() {
		return this.pivot;
	}

	public void setPivot(boolean pivot) {
		this.pivot = pivot;
	}

	public static void main(String[] args) {
		List<JugadorBaloncesto> listaJugadores = new ArrayList<>();

		JugadorBaloncesto jugador1 = new JugadorBaloncesto("Nombre1", "Apellido1", "correo1@example.com", "123456789", "Baloncesto", false, false, true);
		JugadorBaloncesto jugador2 = new JugadorBaloncesto("Nombre2", "Apellido2", "correo2@example.com", "987654321", "Baloncesto", false, true, false);

		listaJugadores.add(jugador1);
		listaJugadores.add(jugador2);
		for (JugadorBaloncesto jugador : listaJugadores) {
			System.out.println("Nombre: " + jugador.getNombre());
			System.out.println("Apellido: " + jugador.getApellido());
			System.out.println("Correo: " + jugador.getDireccionDeCorreo());
			System.out.println("Contacto: " + jugador.getNumeroDeContacto());
			System.out.println("Deporte: " + jugador.getDeporteQuePractica());
			System.out.println("Base: " + jugador.getBase());
			System.out.println("Escolta: " + jugador.getEscolta());
			System.out.println("Pivot: " + jugador.getPivot());
			System.out.println("------------------------------");
		}
	}
}
