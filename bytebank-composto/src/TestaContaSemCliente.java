
public class TestaContaSemCliente {
	public static void main(String[] args) {
		Conta contadaAna = new Conta();
		System.out.println(contadaAna.saldo);
		
		contadaAna.titular = new Cliente();
		System.out.println(contadaAna.titular);
		
		contadaAna.titular.nome = "Ana";
		System.out.println(contadaAna.titular.nome);
	}

}
