package Package;

public class JugadorTenis extends Deportista {

	private boolean saque;
	private boolean red;
	private boolean volea;

	// Constructor
	public JugadorTenis(String nombre, int edad, boolean saque, boolean red, boolean volea) {
		super(nombre, edad);
		this.saque = saque;
		this.red = red;
		this.volea = volea;
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
}
