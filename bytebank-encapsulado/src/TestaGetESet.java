
public class TestaGetESet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta conta = new Conta(343,1349);
		
		System.out.println(conta.getNumero());
		
		
		Cliente paulo = new Cliente();
		paulo.setNome("Paulo");
		
		
		conta.setTitular(paulo);
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");

	}

}
