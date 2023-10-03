
public class TestaArray2 {

	public static void main(String[] args) {
		
		Cliente[] clientes = new Cliente[10];
		
		for(int i = 0; i< clientes.length; i++) {
		clientes[i] = new Cliente();
		clientes[i].nome = "Júnior";
		}
	
	for(Cliente c : clientes) {
		System.out.println(c.nome);
	}
	
	Cliente clientes2[] = new Cliente[5];
	clientes2[0] = new Cliente();
	clientes2[1] = new ClienteEspecial();
	
	Cliente Júnior = new Cliente();
	Júnior.nome = "Júnior";
	
	clientes2[0] = Júnior;
	
	System.out.println(Júnior.nome);
	System.out.println(clientes2[0].nome);
	
	Júnior.nome = "Costa";
	
	System.out.println(Júnior.nome);
	System.out.println(clientes2[0].nome);
	
	
	int[] valores = new int [10];
	//long numeros[] = (long[]) valores;
	
	String [] nomes = {"Júnior, Costa"};
	Object[] objetos;
	
	objetos = nomes;
	
}
}


	
class ClienteEspecial extends Cliente{}