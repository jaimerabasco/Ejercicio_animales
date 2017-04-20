package animales;
/**
 * @author mlmc
 * 
 */
public class TestAnimalitos {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Mamifero mamifero1 = new Mamifero(2, "Manolo", 80);
		Gato gato1 = new Gato("Garfield", 10);
		Perro perro1 = new Perro("Milú", 15);

		// invoco a todos los métodos de mamífero
		mamifero1.comer(10);

		// invoco a todos los métodos de gato
		gato1.maullar();
		gato1.comer(1);

		// invoco a todos los métodos de perro
		perro1.ladrar();
		perro1.comer(2);
		
		// debo redefinir toString de mamífero, para
		// que perro y gato lo hereden redefinido
		System.out.println(perro1);
		System.out.println(gato1);
		
		//System.out.println(perro1.nombre); //ERROR. visibilidad
		System.out.println(perro1.getNombre()); 
		

	}

}
