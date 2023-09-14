package Package;
import java.util.ArrayList;
import java.util.List;
public class JugadorTenis extends Deportista {

	private boolean saque;
	private boolean red;
	private boolean volea;
	public JugadorTenis(String nombre1, String apellido1, String mail, String number, String tenis, boolean b, boolean b1, boolean b2) {
		super();
	}

	public boolean getSaque() {
		return this.saque;
	}

	public void setSaque(boolean saque) {
		this.saque = saque;
	}

	public boolean getRed() {
		return this.red;
	}

	public void setRed(boolean red) {
		this.red = red;
	}

	public boolean getVolea() {
		return this.volea;
	}

	public void setVolea(boolean volea) {
		this.volea = volea;
	}
	public static void main(String[] args) {
		List<JugadorTenis> jugadoresTenis = new ArrayList<>();
		JugadorTenis jugador1 = new JugadorTenis("pepito1", "perez1", "correo1@example.com", "8712733746", "Tenis", true, true, true);
		JugadorTenis jugador2 = new JugadorTenis("pepito2", "perez2", "correo2@example.com", "3839174731", "Tenis", false, false, false);
		jugadoresTenis.add(jugador1);
		jugadoresTenis.add(jugador2);
		for (JugadorTenis jugador : jugadoresTenis) {
			System.out.println("Nombre: " + jugador.getNombre());
			System.out.println("Apellido: " + jugador.getApellido());
			System.out.println("Correo: " + jugador.getDireccionDeCorreo());
			System.out.println("Número de Contacto: " + jugador.getNumeroDeContacto());
			System.out.println("Deporte que Practica: " + jugador.getDeporteQuePractica());
			System.out.println("Saque: " + jugador.getSaque());
			System.out.println("Red: " + jugador.getRed());
			System.out.println("Volea: " + jugador.getVolea());
			System.out.println();
		}
	}
}