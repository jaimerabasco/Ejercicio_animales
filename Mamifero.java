package animales;
/**
 * @author mlmc
 * 
 */
public class Mamifero {
	private int patas = 2;
	private String nombre = "";
	private int peso = 1;

	/**
	 * @param patas
	 * @param nombre
	 */
	protected Mamifero(int patas, String nombre, int peso) {
		super(); //constructor de Object
		this.patas = patas;
		this.nombre = nombre;
		this.peso = peso;
	}

	protected void comer(int cantidad) {
		System.out.println("Mamífero comiendo y engordando");
		peso += 1.1*cantidad;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Mamifero [patas=" + patas + ", nombre=" + nombre + ", peso="
				+ peso + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	/**
	 * @return the nombre
	 */
	protected String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}
	

}

