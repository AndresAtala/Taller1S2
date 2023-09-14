package Package;

public class JugadorTenis extends Deportista {

	private boolean saque;
	private boolean red;
	private boolean volea;

	public boolean getSaque() {
		return this.saque;
	}

	/**
	 * 
	 * @param saque
	 */
	public void setSaque(boolean saque) {
		this.saque = saque;
	}

	public boolean getRed() {
		return this.red;
	}

	/**
	 * 
	 * @param red
	 */
	public void setRed(boolean red) {
		this.red = red;
	}

	public boolean getVolea() {
		return this.volea;
	}

	/**
	 * 
	 * @param volea
	 */
	public void setVolea(boolean volea) {
		this.volea = volea;
	}

}