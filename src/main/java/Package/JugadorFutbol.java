package Package;

public class JugadorFutbol extends Deportista {

	private boolean delantero;
	private boolean defensa;
	private boolean portero;


	public JugadorFutbol(String nombre, int edad, boolean delantero, boolean defensa, boolean portero) {
		super(nombre, edad);
		this.delantero = delantero;
		this.defensa = defensa;
		this.portero = portero;
	}


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
}


