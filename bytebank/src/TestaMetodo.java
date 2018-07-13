
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJerimun = new Conta();
		contaDoJerimun.saldo = 100;
		contaDoJerimun.deposita(222);
		System.out.println(contaDoJerimun.saldo);

	}

}
