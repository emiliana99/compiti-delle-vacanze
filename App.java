public class App {
	public static void main(String[] args) { 
        Lista l = new Lista();
	    l.add( "Mario" );
	    l.addHead(new Nodo("Prima di Manu"));
	    l.addTail(new Nodo("Dopo di Manu"));
        
		System.out.println("Lunghezza lista: " + l.getLength());
		System.out.println("Contiene 'Manu'? " + l.exists("Manu"));
		System.out.println("Contiene 'Benni'? " + l.exists("Benni"));
		System.out.println(l);
		System.out.println("Rimuovo 'Manu': " + l.remove("Manu"));
		System.out.println(l);
	}
}
