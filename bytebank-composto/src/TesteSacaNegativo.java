
public class TesteSacaNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(50);
		System.out.println(conta.saca(75));
		
		//proibido:
		//conta.saldo -= 51;
		
		System.out.println(conta.getSaldo());
		conta.numero = -1349;
		

	}

}
