package animales;
/**
 * @author mlmc
 * 
 */
public class Perro extends Mamifero {

	protected Perro(String nombre, int peso) {
		super(4, nombre, peso);//invoco a Mamifero(4, nombre, peso);
	}

	void ladrar() {
		System.out.println("Guau");
	}
	

}
