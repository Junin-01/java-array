import java.util.ArrayList;
import java.util.Iterator;


public class TestaArrayList2 {

	public static void main(String[] args) {
		
		
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("java");
		nomes.add("Ruby");
		nomes.add("scala");
		
		Iterator<String> it = nomes.iterator();
		
		while(it.hasNext()) {
			String atual = it.next();
			System.out.println(atual);
			it.remove();
		}
		System.out.println(nomes.size());
		
		for(String nome : nomes) {
			System.out.println(nome);
		}
		
		
		Cliente Jr = new Cliente();
		Jr.nome = "Júnior";
		
		ArrayList<Cliente> clientes = new ArrayList();
		
		clientes.add(Jr);
		
		System.out.println(Jr.nome);
		System.out.println(clientes.get(0).nome);
		
		
		Jr.nome = "Costa";
		System.out.println(Jr.nome);
		System.out.println(clientes.get(0).nome);
		
	}
}
