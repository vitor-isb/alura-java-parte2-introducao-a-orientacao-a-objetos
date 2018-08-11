
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoJerimun = new Conta();
		Conta contadaMarcela = new Conta();
		
		
		contaDoJerimun.saldo = 100;
		contaDoJerimun.deposita(222);
		contaDoJerimun.saca(125);
		System.out.println(contaDoJerimun.saldo);
		
		boolean sucessoTransferencia = contaDoJerimun.transfere(contadaMarcela, 100);
		
		if(sucessoTransferencia)
			System.out.println("Transferencia realizada com sucesso");
		else
			System.out.println("Saldo insuficiente");
		
		System.out.println(contadaMarcela.saldo);
		System.out.println(contaDoJerimun.saldo);
		
		contaDoJerimun.titular = "Jerimun";
		System.out.println(contaDoJerimun.titular);
	}

}
