package animales;
/**
 * @author mlmc
 * 
 */
public class Gato extends Mamifero {

	protected Gato(String nombre, int peso) {
		super(4, nombre, peso);// invoco a Mamifero(4, nombre, peso);
	}

	void maullar() {
		System.out.println("Miau");
	}

}
