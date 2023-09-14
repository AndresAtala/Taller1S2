package Package;

public class JugadorBaloncesto extends Deportista {

	private boolean base;
	private boolean escolta;
	private boolean pivot;

	public boolean getBase() {
		return this.base;
	}

	/**
	 * 
	 * @param base
	 */
	public void setBase(boolean base) {
		this.base = base;
	}

	public boolean getEscolta() {
		return this.escolta;
	}

	/**
	 * 
	 * @param escolta
	 */
	public void setEscolta(boolean escolta) {
		this.escolta = escolta;
	}

	public boolean getPivot() {
		return this.pivot;
	}

	/**
	 * 
	 * @param pivot
	 */
	public void setPivot(boolean pivot) {
		this.pivot = pivot;
	}

}