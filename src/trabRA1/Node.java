package trabRA1;


public class Node {
	
	Elemento elemento;
	Node proximo;
	
	
	Node(Elemento elemento) {
		this.elemento = elemento;
		this.proximo = null;
	}
}