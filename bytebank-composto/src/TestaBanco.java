
public class TestaBanco {
	public static void main(String[] args) {
		Cliente vitor = new Cliente();
		vitor.nome = "Vitor Iuri";
		vitor.cpf = "44344343443";
		vitor.profissao = "Estudante";
		
		Conta contadoVitor = new Conta();
		contadoVitor.deposita(454);
		//Associa o cliente a conta
		contadoVitor.titular = vitor;
		
		System.out.println(contadoVitor.titular.nome);
		
	}

}
